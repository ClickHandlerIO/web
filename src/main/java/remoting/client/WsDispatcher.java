package remoting.client;

import com.google.gwt.user.client.Timer;
import com.google.web.bindery.event.shared.HandlerRegistration;
import common.client.Bus;
import common.client.Func;
import common.client.JSON;
import common.client.Try;

import java.util.*;

/**
 * Remoting Dispatcher.
 *
 * @author Clay Molocznik
 */
public class WsDispatcher {
    private final static int DEFAULT_SUB_TIMEOUT = 5_000;
    private final Bus bus;
    private final String url;
    private final Queue<Outgoing> pendingQueue = new LinkedList<>();
    private final LinkedHashMap<Double, Outgoing> calls = new LinkedHashMap<>();
    private final Map<String, AddressSubscription> subMap = new HashMap<>();
    private Ws webSocket;
    private int reaperMillis = 500;
    private Timer reaperTimer;
    private int id = 0;
    private Func.Run1<Func.Run1<Boolean>> connectedCallback;

    public WsDispatcher(Bus bus, String url) {
        this(bus, url, null);
    }

    public WsDispatcher(Bus bus, String url, Func.Run1<Func.Run1<Boolean>> connectedCallback) {
        this.bus = bus;
        this.url = url;
        this.connectedCallback = connectedCallback;
    }

    public Bus getBus() {
        return bus;
    }

    public String getUrl() {
        return url;
    }

    public Ws getWebSocket() {
        return webSocket;
    }

    public Func.Run1<Func.Run1<Boolean>> getConnectedCallback() {
        return connectedCallback;
    }

    public void setConnectedCallback(Func.Run1<Func.Run1<Boolean>> connectedCallback) {
        this.connectedCallback = connectedCallback;
    }

    /**
     * @param subscription
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> HandlerRegistration subscribe(PushSubscription<T> subscription) {
        if (subscription == null)
            return null;

        final String addr = subscription.getAddress();
        if (addr == null || addr.isEmpty()) {
            return null;
        }

        AddressSubscription addressSubscription = subMap.get(addr);
        if (addressSubscription == null) {
            addressSubscription = new AddressSubscription<>(addr);
            subMap.put(addr, addressSubscription);
        }

        return addressSubscription.subscribe(subscription);
    }

    public <T> void simulatePush(String address, T event) {
        final WsEnvelope envelope = WsEnvelope.Factory.create()
            .method(WsEnvelope.Constants.PUSH)
            .type(address)
            .body(JSON.stringify(event))
            .code(200);

        data(JSON.stringify(envelope));
    }

    public void simulateData(String json) {
        data(json);
    }

    public void simulate(WsEnvelope envelope) {
        if (envelope != null) data(JSON.stringify(envelope));
    }

    /**
     * @return
     */
    private boolean isEmpty() {
        return calls.isEmpty() && pendingQueue.isEmpty();
    }

    /**
     *
     */
    public void start() {
        if (webSocket != null) {
            return;
        }

        webSocket = new Ws(bus, url, this::connected, this::closed, this::error, this::data);
        webSocket.connect();
    }

    /**
     *
     */
    private void drainQueue() {
        if (!webSocket.isConnected()) {
            return;
        }

        int count = 0;
        while (!pendingQueue.isEmpty()) {
            if (count > 50) {
                break;
            }
            send(pendingQueue.remove());
            count++;
        }

        // Give a little break.
        if (!pendingQueue.isEmpty()) {
            Try.later(this::drainQueue);
        }
    }

    /**
     *
     */
    private void connected() {
        Try.run(() -> bus.publish(new WsConnectedEvent(this)));

        for (AddressSubscription sub : subMap.values()) {
            sub.state = SubState.NOT_REGISTERED;
            sub.subscribeToServer();
        }

        // Try draining the queue.
        if (connectedCallback != null) {
            connectedCallback.run((success) -> {
                if (success)
                    drainQueue();
            });
        } else {
            drainQueue();
        }
    }

    /**
     *
     */
    private void closed() {
        Try.run(() -> bus.publish(new WsClosedEvent(this)));

        pendingQueue.addAll(calls.values());
        calls.clear();

        for (AddressSubscription sub : subMap.values()) {
            sub.state = SubState.NOT_REGISTERED;
        }
    }

    /**
     *
     */
    private void error() {
        // Yikes!!!
    }

    /**
     * @param payload
     */
    private void data(String payload) {
        // Parse envelope.
        final WsEnvelope envelope = WsEnvelope.Factory.parse(payload);

        if (envelope == null) {
            return;
        }

        // Publish a new WsEnvelopeEvent to the Bus.
        bus.publish(new WsEnvelopeEvent(this, envelope));

        switch ((int) envelope.method()) {
            case WsEnvelope.Constants.IN:
                // Incoming request.
                break;
            case WsEnvelope.Constants.OUT:
                // It's a response.
                final Outgoing call = calls.remove(envelope.id());
                if (call != null) {
                    Try.silent(call.callback, envelope);
                }
                break;
            case WsEnvelope.Constants.PUSH:
                // It's a push event.
                // Fire on main event bus.
                String type = envelope.type();
                if (type == null) type = "";
                else type = type.trim();

                String body = envelope.body();
                if (body == null) body = "";
                else body = body.trim();

                if (body.isEmpty()) body = "{}";

                final AddressSubscription addressSubscription = subMap.get(type);
                if (addressSubscription != null) {
                    addressSubscription.receive(body);
                }
                break;
        }
    }

    /**
     * @param call
     */
    private void send(Outgoing call) {
        call.tries++;
        if (!webSocket.isConnected()) {
            pendingQueue.add(call);
        } else {
            try {
                calls.put(call.envelope.id(), call);

                try {
                    webSocket.send(JSON.stringify(call.envelope));
                } catch (Throwable e) {
                    pendingQueue.add(call);
                }
            } finally {
                ensureReaper();
            }
        }
    }

    /**
     * @return
     */
    private int nextId() {
        // Increment.
        id++;

        // Handle overflow.
        if (id < 0)
            id = 1;

        // Return.
        return id;
    }

    /**
     *
     */
    private void ensureReaper() {
        if (calls.isEmpty()) {
            stopReaper();
            return;
        }
        if (reaperTimer != null) {
            return;
        }
        reaperTimer = new Timer() {
            @Override
            public void run() {
                Try.silent(() -> reap());
            }
        };
        reaperTimer.scheduleRepeating(reaperMillis);
    }

    /**
     *
     */
    private void stopReaper() {
        if (reaperTimer != null) {
            try {
                reaperTimer.cancel();
            } finally {
                reaperTimer = null;
            }
        }
    }

    /**
     *
     */
    private void reap() {
        if (isEmpty()) {
            stopReaper();
            return;
        }

        if (!calls.isEmpty()) {
            reap(calls.values().iterator());
        }

        if (!pendingQueue.isEmpty()) {
            reap(pendingQueue.iterator());
        }
    }

    /**
     * @param iterator
     */
    private void reap(Iterator<Outgoing> iterator) {
        final long time = new Date().getTime();
        List<Outgoing> timeoutList = null;

        // Check current calls.
        while (iterator.hasNext()) {
            final Outgoing outgoing = iterator.next();

            if (outgoing.isTimedOut(time)) {
                if (timeoutList == null) {
                    timeoutList = new LinkedList<>();
                }
                timeoutList.add(outgoing);
                iterator.remove();
            }
        }

        if (timeoutList != null && !timeoutList.isEmpty()) {
            for (Outgoing call : timeoutList) {
                Try.silent(call.timeoutCallback);
            }
        }
    }


    /**
     * @param timeoutMillis
     * @param type
     * @param payload
     * @param callback
     * @param timeoutCallback
     */
    public void request(Bus.TypeName inType,
                        Bus.TypeName outType,
                        int timeoutMillis,
                        String type,
                        String payload,
                        Func.Run1<WsEnvelope> callback,
                        Func.Run timeoutCallback) {
        final WsEnvelope envelope = WsEnvelope.Factory.create(
            WsEnvelope.Constants.IN,
            nextId(),
            0,
            type,
            payload
        );
        final Outgoing call = new Outgoing(
            inType,
            outType,
            new Date().getTime(),
            timeoutMillis,
            envelope,
            callback,
            timeoutCallback
        );
        send(call);
    }

    public enum SubState {
        INVALID,
        NOT_REGISTERED,
        REGISTERING,
        REGISTERED,;
    }

    /**
     *
     */
    private static final class Outgoing {
        private final Bus.TypeName inType;
        private final Bus.TypeName outType;
        private final long started;
        private final int timeoutMillis;
        private final WsEnvelope envelope;
        private final Func.Run1<WsEnvelope> callback;
        private final Func.Run timeoutCallback;
        private int tries = 0;

        public Outgoing(Bus.TypeName inType,
                        Bus.TypeName outType,
                        long started,
                        int timeoutMillis,
                        WsEnvelope envelope,
                        Func.Run1<WsEnvelope> callback,
                        Func.Run timeoutCallback) {
            this.inType = inType;
            this.outType = outType;
            this.started = started;
            this.timeoutMillis = timeoutMillis;
            this.envelope = envelope;
            this.callback = callback;
            this.timeoutCallback = timeoutCallback;
        }

        public boolean isTimedOut(long time) {
            return (time - started) > timeoutMillis;
        }
    }

    /**
     * Manages the lifecycle of a single subscription to a single address.
     * Multiple local listeners may be registered.
     * It automatically subscribes with the server upon the first local listener and un-subscribes when
     * the last local listener is removed.
     */
    private class AddressSubscription<T> implements HandlerRegistration {
        private final String name;
        private SubState state = SubState.NOT_REGISTERED;
        private ArrayList<PushSubscription> subs = new ArrayList<>();

        public AddressSubscription(String name) {
            this.name = name;
            subscribeToServer();
        }

        /**
         *
         */
        @Override
        public void removeHandler() {
            final AddressSubscription addressSubscription = subMap.remove(name);
            if (addressSubscription == null) {
                return;
            }

            for (PushSubscription sub : subs) {
                sub.removeHandler();
            }

            if (state == SubState.INVALID)
                return;

            send(
                new Outgoing(
                    null,
                    null,
                    new Date().getTime(),
                    DEFAULT_SUB_TIMEOUT,
                    WsEnvelope.Factory.create(WsEnvelope.Constants.USUB, nextId(), 0, name, null),
                    envelope -> setState(envelope.code() == 200 ? SubState.REGISTERED : SubState.NOT_REGISTERED),
                    () -> setState(SubState.NOT_REGISTERED)
                )
            );
        }

        /**
         * @param state
         */
        public void setState(SubState state) {
            this.state = state;
            if (state == SubState.NOT_REGISTERED) {
                subscribeToServer();
            }
        }

        /**
         *
         */
        public void subscribeToServer() {
            if (state == SubState.REGISTERED || state == SubState.REGISTERING) {
                return;
            }
            setState(SubState.REGISTERING);
            send(
                new Outgoing(
                    null,
                    null,
                    new Date().getTime(),
                    DEFAULT_SUB_TIMEOUT,
                    WsEnvelope.Factory.create(WsEnvelope.Constants.SUB, nextId(), 0, name, null),
                    envelope -> {
                        // Was it a valid subscription.
                        if (envelope.code() == 404) {
                            removeHandler();
                            return;
                        }
                        setState(envelope.code() == 200 ? SubState.REGISTERED : SubState.NOT_REGISTERED);
                    },
                    () -> setState(SubState.NOT_REGISTERED)
                )
            );
        }

        public void receive(String json) {
            final T event = JSON.parse(json);

            final HashSet<Bus.TypeName<T>> typeNameSet = new HashSet<>();
            for (PushSubscription subscription : subs) {
                final Bus.TypeName<T> typeName = subscription.getTypeName();
                final Bus.TypeName<T> scopedTypeName = subscription.getScopedTypeName();

                if (typeName != null && !typeNameSet.contains(typeName)) {
                    typeNameSet.add(typeName);
                    bus.publish(typeName, event);
                }
                if (scopedTypeName != null && !typeNameSet.contains(scopedTypeName)) {
                    typeNameSet.add(scopedTypeName);
                    bus.publish(scopedTypeName, event);
                }
            }
        }

        /**
         * @param subscription
         * @return
         */
        public HandlerRegistration subscribe(PushSubscription subscription) {
            subs.add(subscription);
            subscription.dispatcherReg = () -> unsubscribe(subscription);
            subscription.subscribe(bus);
            return subscription;
        }

        /**
         * @param sub
         */
        private void unsubscribe(PushSubscription sub) {
            subs.remove(sub);
            sub.removeHandler();

            if (subs.isEmpty())
                removeHandler();
        }
    }
}
