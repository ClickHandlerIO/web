package remoting.client;

import com.google.common.base.Strings;
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
    private final Bus bus;
    private final String url;
    private final Queue<Outgoing> pendingQueue = new LinkedList<>();
    private final LinkedHashMap<Double, Outgoing> calls = new LinkedHashMap<>();
    private final Map<String, AddressSubscription> subMap = new HashMap<>();
    private final Map<String, PresenceManager> presenceMap = new HashMap<>();
    private Ws webSocket;
    private int reaperMillis = 1_000;
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
        data(WsEncoding.encode(new WsMessage(new WsHeader()
            .method(WsHeader.Constants.PUSH)
            .type(address)
            .code(200), JSON.stringify(event))));
    }

    public void simulateData(String json) {
        data(json);
    }

    public void simulate(WsHeader envelope) {
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

        if (!calls.isEmpty()) {
            for (Outgoing outgoing : calls.values()) {
                pendingQueue.add(outgoing);
            }
            calls.clear();
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
        final WsMessage message = WsEncoding.decode(payload);

        if (message == null) {
            return;
        }

        // Publish a new WsMessageEvent to the Bus.
        bus.publish(new WsMessageEvent(this, message));

        switch ((int) message.header.method()) {
            case WsHeader.Constants.IN:
                // Incoming request.
                break;
            case WsHeader.Constants.OUT:
                // It's a response.
                final Outgoing call = calls.remove(message.header.id());
                if (call != null) {
                    Try.silent(call.callback, message);
                }
                break;
            case WsHeader.Constants.PUSH:
                // It's a push event.
                // Fire on main event bus.
                String type = message.header.type();
                if (type == null) type = "";
                else type = type.trim();

                String body = message.body;
                if (body == null) body = "";
                else body = body.trim();

                if (body.isEmpty()) body = "{}";

                final AddressSubscription addressSubscription = subMap.get(type);
                if (addressSubscription != null) {
                    addressSubscription.receive(body);
                }
                break;

            case WsHeader.Constants.PRESENCE_JOINED: {
                final String key = message.header.t == null ? "" : message.header.t.trim();
                PresenceManager manager = presenceMap.get(key);
                if (manager == null) {
                    send(new Outgoing(
                        null,
                        null,
                        new Date().getTime(),
                        5_000,
                        new WsMessage(WsHeader.Factory.create(
                            WsHeader.Constants.PRESENCE_LEAVE,
                            nextId(),
                            0,
                            key
                        ), null),
                        null,
                        null
                    ));

                    return;
                }

                final PresenceJoined joined = JSON.parse(message.body);
                manager.onJoined(joined);
            }
            break;

            case WsHeader.Constants.PRESENCE_CHANGED: {
                final String key = message.header.t == null ? "" : message.header.t.trim();
                PresenceManager manager = presenceMap.get(key);
                if (manager == null) {
                    manager = new PresenceManager(key);
                    presenceMap.put(key, manager);
                }

                final PresenceChange change = JSON.parse(message.body);
                manager.onChange(change);
            }
            break;

            case WsHeader.Constants.PRESENCE_REMOVED: {
                final String key = message.header.t == null ? "" : message.header.t.trim();
                PresenceManager manager = presenceMap.get(key);
                if (manager != null) {
                    manager.onLeave();
                    return;
                }
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
                calls.put(call.message.header.id(), call);
                try {
                    webSocket.send(WsEncoding.encode(call.message));
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
                        Func.Run1<WsMessage> callback,
                        Func.Run timeoutCallback) {
        final WsHeader header = WsHeader.Factory.create(
            WsHeader.Constants.IN,
            nextId(),
            0,
            type
        );
        final Outgoing call = new Outgoing(
            inType,
            outType,
            new Date().getTime(),
            timeoutMillis,
            new WsMessage(header, payload),
            callback,
            timeoutCallback
        );
        send(call);
    }

    public PresenceSubscription addPresenceListener(String key, PresenceListener listener) {
        PresenceManager manager = presenceMap.get(key);
        if (manager == null) {
            manager = new PresenceManager(key);
            presenceMap.put(key, manager);
        }
        return manager.add(listener);
    }

    /**
     *
     */
    private static final class Outgoing {
        private final Bus.TypeName inType;
        private final Bus.TypeName outType;
        private final long started;
        private final int timeoutMillis;
        private final WsMessage message;
        private final Func.Run1<WsMessage> callback;
        private final Func.Run timeoutCallback;
        private int tries = 0;

        public Outgoing(Bus.TypeName inType,
                        Bus.TypeName outType,
                        long started,
                        int timeoutMillis,
                        WsMessage message,
                        Func.Run1<WsMessage> callback,
                        Func.Run timeoutCallback) {
            this.inType = inType;
            this.outType = outType;
            this.started = started;
            this.timeoutMillis = timeoutMillis;
            this.message = message;
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
     */
    private class AddressSubscription<T> implements HandlerRegistration {
        private final String name;
        private ArrayList<PushSubscription> subs = new ArrayList<>();

        public AddressSubscription(String name) {
            this.name = name;
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
        }

        void receive(String json) {
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
        HandlerRegistration subscribe(PushSubscription subscription) {
            subs.add(subscription);
            subscription.dispatcherReg = () -> unsubscribe(subscription);
            subscription.subscribe(bus);
            return subscription;
        }

        /**
         * @param sub
         */
        void unsubscribe(PushSubscription sub) {
            subs.remove(sub);
            sub.removeHandler();

            if (subs.isEmpty())
                removeHandler();
        }
    }

    /**
     *
     */
    private class PresenceManager implements HandlerRegistration {
        private final String key;
        private final LinkedList<Subscription> subscriptions = new LinkedList<>();
        private Presence presence;
        private PresenceOccupant me;

        /**
         * @param key
         */
        public PresenceManager(String key) {
            this.key = key;
        }

        /**
         *
         */
        @Override
        public void removeHandler() {
            final PresenceManager addressSubscription = presenceMap.remove(key);
            if (addressSubscription == null) {
                return;
            }

            subscriptions.forEach(Subscription::removeHandler);
        }

        /**
         * @param joined
         */
        void onJoined(PresenceJoined joined) {
            this.presence = joined.presence;
            this.me = joined.me;

            bus.publish(new PresenceJoinedEvent(joined));

            subscriptions.forEach(subscription -> Try.later(() -> subscription.listener.onJoin(joined)));
        }

        /**
         * @param change
         */
        void onChange(PresenceChange change) {
            bus.publish(new PresenceChangedEvent(change, presence));

            if (presence == null) {
                onOutOfSync();
            } else {
                if (Strings.nullToEmpty(change.mod).equals(presence.mod)) {
                    if (change.seq < presence.seq
                        || change.seq > presence.seq + 1) {
                        onOutOfSync();
                    } else {
                        merge(change);
                    }
                } else {
                    onOutOfSync();
                }
            }
        }

        void onOutOfSync() {
            sendLeave();
        }

        void merge(PresenceChange change) {
            if (change == null)
                return;

            // Update Seq on Presence.
            presence.seq = change.seq;

            List<PresenceOccupant> newOccupants = null;
            if (change.joined != null && change.joined.length > 0) {
                newOccupants = presence.occupants == null ?
                    new ArrayList<>() :
                    Arrays.asList(presence.occupants);
                newOccupants.addAll(Arrays.asList(change.joined));
            }

            if (change.left != null && change.left.length > 0) {
                if (newOccupants == null)
                    newOccupants = presence.occupants == null ?
                        new ArrayList<>() :
                        Arrays.asList(presence.occupants);

                final List<PresenceOccupant> removeList = new ArrayList<>();

                for (PresenceOccupant occupant : newOccupants) {
                    boolean found = false;
                    final String id = occupant.id == null ? "" : occupant.id;
                    for (PresenceLeave leave : change.left) {
                        if (id.equals(leave.id)) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        removeList.add(occupant);
                    }
                }

                final List<PresenceOccupant> occupants = newOccupants;
                removeList.forEach(occupants::remove);
            }

            if (newOccupants != null) {
                presence.occupants = newOccupants.toArray(
                    new PresenceOccupant[newOccupants.size()]
                );
            }

            if (change.changed != null && change.changed.length > 0) {
                for (PresenceStateChanged stateChanged : change.changed) {
                    final String id = stateChanged.id == null ? "" : stateChanged.id;

                    for (PresenceOccupant occupant : presence.occupants) {
                        if (id.equals(occupant.id)) {
                            // Update occupant's state.
                            occupant.state(stateChanged.state);
                            break;
                        }
                    }
                }
            }
        }

        /**
         *
         */
        void onLeave() {
            bus.publish(new PresenceLeaveEvent(key, presence, me));

            try {
                if (subscriptions.isEmpty()) {
                    presenceMap.remove(key);
                } else {
                    subscriptions.forEach(s -> s.listener.onLeave(presence, me));
                }
            } finally {
                presence = null;
                me = null;
            }
        }

        /**
         * @param listener
         * @return
         */
        Subscription add(PresenceListener listener) {
            final Subscription subscription = new Subscription(listener);
            subscriptions.add(subscription);

            if (presence != null) {
                Try.later(() -> listener.onJoin(new PresenceJoined()
                    .presence(presence)
                    .me(me)));
            }

            return subscription;
        }

        /**
         * @param subscription
         */
        void remove(Subscription subscription) {
            subscriptions.remove(subscription);

            // Remove PresenceManager if necessary.
            if (subscriptions.isEmpty() && presence == null) {
                presenceMap.remove(key);
                sendLeave();
            }
        }

        /**
         *
         */
        void sendLeave() {
            if (presence == null) {
                return;
            }
            // Tell server to leave presence.
            final Outgoing call = new Outgoing(
                null,
                null,
                new Date().getTime(),
                5_000,
                new WsMessage(WsHeader.Factory.create(
                    WsHeader.Constants.PRESENCE_LEAVE,
                    nextId(),
                    0,
                    key
                ), null),
                null,
                null
            );
            send(call);
        }

        /**
         *
         */
        private class Subscription implements PresenceSubscription {
            private final PresenceListener listener;

            public Subscription(PresenceListener listener) {
                this.listener = listener;
            }

            @Override
            public void removeHandler() {
                remove(this);
            }

            @Override
            public Presence presence() {
                return presence;
            }

            @Override
            public PresenceOccupant me() {
                return me;
            }

            @Override
            public PresenceListener listener() {
                return listener;
            }

            @Override
            public void leave() {
                // Tell server to leave presence.
                sendLeave();
            }
        }
    }
}
