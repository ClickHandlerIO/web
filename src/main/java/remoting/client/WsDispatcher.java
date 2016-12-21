package remoting.client;

import com.google.gwt.user.client.Timer;
import com.google.web.bindery.event.shared.HandlerRegistration;
import common.client.Bus;
import common.client.Func;
import common.client.JSON;
import common.client.Try;
import elemental.client.Browser;
import logging.client.Logger;

import java.util.*;
import java.util.function.Function;

/**
 * Remoting Dispatcher.
 *
 * @author Clay Molocznik
 */
public class WsDispatcher {
    public static final int MAX_PRESENCE_BACKLOG = 100;
    /**
     * The time in milliseconds to determine if a Change message
     * is missing and may not show up. This will trigger the "Out of Sync"
     * protocol.
     */
    public static final int PRESENCE_FRAGMENTATION_WINDOW_MILLIS = 5 * 1000; // 5 seconds.
    private static final Logger LOG = Logger.get(WsDispatcher.class);

    private final Bus bus;
    private final String url;
    private final Queue<ExpectingResponse> pendingQueue = new LinkedList<>();
    private final LinkedHashMap<Double, ExpectingResponse> calls = new LinkedHashMap<>();
    private final Map<String, PushManager<?>> pushMap = new HashMap<>();
    private final Map<String, PresenceManager> presenceMap = new HashMap<>();
    private Ws webSocket;
    private int reaperMillis = 1_000;
    private int pingMillis = 30_000;
    private int fragmentationMillis = PRESENCE_FRAGMENTATION_WINDOW_MILLIS;
    private Timer reaperTimer;
    private Timer pingTimer;
    private Timer fragmentationTimer;
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

        ensurePinger();
        ensureFragmentationTimer();

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

        stopPinger();
        stopFragmentationTimer();

        if (!calls.isEmpty()) {
            for (ExpectingResponse outgoing : calls.values()) {
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

            case WsHeader.Constants.PING:
                break;

            case WsHeader.Constants.OUT:
            case WsHeader.Constants.PONG: {
                // It's a response.
                final ExpectingResponse call = calls.remove(message.header.id());
                if (call != null) {
                    if (call.callback != null) {
                        Try.silent(call.callback, message);
                    }
                } else {
                    // Phantom response.
                    LOG.error("Phantom response", message);
                }
            }
            break;

            case WsHeader.Constants.PUSH: {
                // It's a push event.
                // Fire on main event bus.
                String type = message.header.type();
                if (type == null) type = "";
                else type = type.trim();

                String body = message.body;
                if (body == null) body = "";
                else body = body.trim();

                if (body.isEmpty()) body = "{}";

                final PushManager<?> pushManager = pushMap.get(type);
                if (pushManager != null) {
                    try {
                        bus.publish(pushManager.typeName, pushManager.supplier.apply(body));
                    } catch (Throwable e) {
                        // Ignore.
                        Browser.getWindow().getConsole().log(e);
                    }
                }
            }
            break;

            case WsHeader.Constants.PRESENCE_JOINED: {
                final String key = message.header.t == null ? "" : message.header.t.trim();
                final PresenceManager manager = presenceMap.get(key);

                // If the manager is null then leave immediately.
                if (manager == null) {
                    send(new ExpectingResponse(
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
    private void send(ExpectingResponse call) {
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
    private void ensureFragmentationTimer() {
        if (fragmentationTimer != null) {
            return;
        }
        fragmentationTimer = new Timer() {
            @Override
            public void run() {
                Try.silent(() -> checkForFragmentation());
            }
        };
        fragmentationTimer.scheduleRepeating(fragmentationMillis);
    }

    private void checkForFragmentation() {
        if (presenceMap.isEmpty()) {
            return;
        }

        presenceMap.values().forEach($ -> Try.run($::checkForFragmentation));
    }

    /**
     *
     */
    private void stopFragmentationTimer() {
        if (fragmentationTimer == null) {
            return;
        }

        fragmentationTimer.cancel();
        fragmentationTimer = null;
    }

    /**
     *
     */
    private void ensurePinger() {
        if (pingTimer != null) {
            return;
        }
        pingTimer = new Timer() {
            @Override
            public void run() {
                Try.silent(() -> ping());
            }
        };
        pingTimer.scheduleRepeating(pingMillis);
    }

    /**
     *
     */
    private void stopPinger() {
        if (pingTimer == null) {
            return;
        }

        pingTimer.cancel();
        pingTimer = null;
    }

    /**
     *
     */
    private void ping() {
        if (presenceMap.isEmpty()) {
            // Get latest presence.
            send(new ExpectingResponse(
                null,
                null,
                new Date().getTime(),
                5_000,
                new WsMessage(WsHeader.Factory.create(
                    WsHeader.Constants.PING,
                    nextId(),
                    0,
                    null
                ), null),
                message -> {
                    if (message.header.c != 200) {
                        LOG.error("Ping returned error code " + message.header.c);
                    }
                },
                () -> LOG.error("Ping timed out")
            ));
            return;
        }

        presenceMap.values().forEach($ -> Try.run($::sendPing));
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
    private void reap(Iterator<ExpectingResponse> iterator) {
        final long time = new Date().getTime();
        List<ExpectingResponse> timeoutList = null;

        // Check current calls.
        while (iterator.hasNext()) {
            final ExpectingResponse outgoing = iterator.next();

            if (outgoing.isTimedOut(time)) {
                if (timeoutList == null) {
                    timeoutList = new LinkedList<>();
                }
                timeoutList.add(outgoing);
                iterator.remove();
            }
        }

        if (timeoutList != null && !timeoutList.isEmpty()) {
            for (ExpectingResponse call : timeoutList) {
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
        final ExpectingResponse call = new ExpectingResponse(
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

    public <T> void registerPush(String name, Class<T> cls, Function<String, T> supplier) {
        pushMap.put(name, new PushManager<>(cls, supplier));
    }

    /**
     * @param key
     * @param listener
     * @return
     */
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
    private static final class ExpectingResponse {
        private final Bus.TypeName inType;
        private final Bus.TypeName outType;
        private final long started;
        private final int timeoutMillis;
        private final WsMessage message;
        private final Func.Run1<WsMessage> callback;
        private final Func.Run timeoutCallback;
        private int tries = 0;

        public ExpectingResponse(Bus.TypeName inType,
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

    private class PushManager<T> {
        private final Class<T> eventClass;
        private final String typeName;
        private final Function<String, T> supplier;

        public PushManager(Class<T> eventClass, Function<String, T> supplier) {
            this.eventClass = eventClass;
            this.supplier = supplier;
            this.typeName = eventClass.getName();
        }
    }

    /**
     *
     */
    private class PresenceManager implements HandlerRegistration {
        private final String key;
        private final LinkedList<Subscription> subscriptions = new LinkedList<>();
        private final List<PresenceChange> backlog = new LinkedList<>();
        private Presence presence;
        private PresenceOccupant me;
        private boolean outOfSync = false;
        private double lastPing;
        private double lastChange;
        private double lastMerge;

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
            presenceMap.remove(key);
            subscriptions.forEach(Subscription::removeHandler);
        }

        /**
         * @param joined
         */
        void onJoined(PresenceJoined joined) {
            this.outOfSync = false;
            this.presence = joined.presence;
            this.me = joined.me;

            bus.publish(new PresenceJoinedEvent(joined));

            subscriptions.forEach(subscription -> Try.later(() -> subscription.listener.onJoin(joined)));
        }

        /**
         * @param change
         */
        void onChange(PresenceChange change) {
            if (presence == null) {
                LOG.error(
                    "Received a PresenceChange for key '" +
                        key +
                        "' that was not expected."
                );
                onOutOfSync();
            } else {
                LOG.info("Presence onChange", change);

                if (change.mod == null || !change.mod.equals(presence.mod)) {
                    backlog.add(change);
                    onOutOfSync();
                    return;
                }

                double nextSeq = change.seq;
                lastChange = new Date().getTime();

                // Was this a duplicate message?
                if (nextSeq < presence.seq) {
                    return;
                }

                // Is this a future message?
                if (change.seq > presence.seq + 1) {
                    backlog.add(change);
                    backlog.sort(Comparator.comparingDouble(o -> o.seq));

                    if (backlog.size() > MAX_PRESENCE_BACKLOG) {
                        LOG.error(
                            "Presence Backlog for key '" +
                                key +
                                "' reached the max size of " +
                                MAX_PRESENCE_BACKLOG +
                                ". Leaving presence."
                        );
                        leave();
                    }
                    return;
                }

                // Merge change.
                merge(change);

                // Clear backlog.
                clearBacklog();
            }
        }

        void onOutOfSync() {
            if (outOfSync) {
                return;
            }

            LOG.info("Presence onOutOfSync", presence);

            // Flag out of sync.
            outOfSync = true;

            // Get latest presence.
            send(new ExpectingResponse(
                null,
                null,
                new Date().getTime(),
                5_000,
                new WsMessage(WsHeader.Factory.create(
                    WsHeader.Constants.PRESENCE_GET,
                    nextId(),
                    0,
                    key
                ), null),
                message -> {
                    outOfSync = false;

                    if (message.header.c != 200) {
                        LOG.error(
                            "PRESENCE_GET returned error code " + message.header.c
                        );
                        leave();
                        return;
                    }

                    presence = JSON.parse(message.body);

                    if (presence == null || presence.mod == null) {
                        leave();
                        return;
                    }

                    if (me == null) {
                        onJoined(new PresenceJoined().presence(presence).me(presence.me));
                    }

                    clearBacklog();
                },
                this::leave
            ));
        }

        void clearBacklog() {
            if (backlog.isEmpty()) {
                return;
            }

            final Presence presence = this.presence;
            if (presence == null) {
                return;
            }

            final String mod = presence.mod == null ? "" : presence.mod;

            // Remove changes for a different Presence.
            final Iterator<PresenceChange> iterator = backlog.iterator();
            while (iterator.hasNext()) {
                final PresenceChange change = iterator.next();
                if (!mod.equals(change.mod)) {
                    iterator.remove();
                    continue;
                }
            }

            if (backlog.isEmpty()) {
                return;
            }

            // Sort based on seq from lowest to highest.
            backlog.sort(Comparator.comparingDouble($ -> $.seq));

            double nextSeq = presence.seq + 1;
            while (!backlog.isEmpty()) {
                final PresenceChange next = backlog.get(0);
                if (next.seq == nextSeq) {
                    nextSeq++;
                    merge(next);
                    backlog.remove(0);
                } else {
                    break;
                }
            }
        }

        /**
         *
         */
        void sendPing() {
            if (presence == null) {
                return;
            }

            lastPing = new Date().getTime();

            // Send presence ping.
            send(new ExpectingResponse(
                null,
                null,
                new Date().getTime(),
                5_000,
                new WsMessage(WsHeader.Factory.create(
                    WsHeader.Constants.PING,
                    nextId(),
                    0,
                    key
                ), null),
                message -> {
                    if (message.header.c != 200) {
                        leave();
                    }
                },
                this::leave
            ));
        }

        /**
         *
         */
        void checkForFragmentation() {
            if (outOfSync) {
                return;
            }

            final double lastMerge = this.lastMerge;
            if (lastMerge == 0L) {
                return;
            }

            if (backlog.isEmpty()) {
                return;
            }

            final double timestamp = new Date().getTime();

            if ((timestamp - lastMerge) > PRESENCE_FRAGMENTATION_WINDOW_MILLIS) {
                onOutOfSync();
            }
        }

        /**
         * @param change
         */
        void merge(PresenceChange change) {
            LOG.info("PresenceChange", change);

            if (change == null)
                return;

            // Set last merge.
            lastMerge = new Date().getTime();

            // Update Seq on Presence.
            presence.seq = change.seq;

            // New Occupant list.
            List<PresenceOccupant> newOccupants = null;

            // Add joins to the list.
            if (change.joined != null && change.joined.length > 0) {
                newOccupants = presence.occupants == null || presence.occupants.length == 0 ?
                    new ArrayList<>() :
                    new ArrayList<>(Arrays.asList(presence.occupants));
                newOccupants.addAll(Arrays.asList(change.joined));
            }

            // Remove occupants that left.
            if (change.left != null && change.left.length > 0) {
                if (newOccupants == null)
                    newOccupants = presence.occupants == null ?
                        new ArrayList<>() :
                        new ArrayList<>(Arrays.asList(presence.occupants));

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

            // Update to the new Occupant list.
            if (newOccupants != null) {
                presence.occupants = newOccupants.toArray(
                    new PresenceOccupant[newOccupants.size()]
                );
            }

            // Update Occupant's state.
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

            // Notify change.
            Try.run(() -> bus.publish(new PresenceChangedEvent(change, presence)));
            Try.run(() -> subscriptions.forEach(s -> Try.run(() -> s.listener.onChange(change, presence))));
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
            if (subscriptions.isEmpty()) {
                presenceMap.remove(key);
                leave();
            }
        }

        /**
         *
         */
        void leave() {
            if (presence == null) {
                return;
            }

            try {
                if (subscriptions.isEmpty()) {
                    presenceMap.remove(key);
                } else {
                    subscriptions.forEach($ -> Try.run(() -> $.listener.onLeave(presence, me)));
                }
            } finally {
                presence = null;
                me = null;

                // Tell server to leave presence.
                send(new ExpectingResponse(
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
            }
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
                PresenceManager.this.leave();
            }
        }
    }
}
