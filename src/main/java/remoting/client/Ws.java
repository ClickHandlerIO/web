package remoting.client;

import com.google.gwt.user.client.Timer;
import common.client.Bus;
import common.client.Func;
import common.client.Try;
import elemental.client.Browser;
import elemental.events.Event;
import elemental.html.WebSocket;

/**
 *
 */
public class Ws {
    private final Bus bus;
    private final String url;
    private final Func.Run connectedCallback;
    private final Func.Run closedCallback;
    private final Func.Run errorCallback;
    private final Func.Run1<String> dataCallback;
    private WebSocket webSocket;
    private boolean connected;
    private boolean connecting;
    private boolean closing;
    private boolean autoConnect = true;
    private boolean forceClosed = false;
    private int connectRetryMillis = 2500;
    private Timer connectTimer;

    public Ws(Bus bus,
              String url,
              Func.Run connectedCallback,
              Func.Run closedCallback,
              Func.Run errorCallback,
              Func.Run1<String> dataCallback) {
        this.bus = bus;
        this.url = url;
        this.connectedCallback = connectedCallback;
        this.closedCallback = closedCallback;
        this.errorCallback = errorCallback;
        this.dataCallback = dataCallback;
    }

    public boolean isConnected() {
        return connected;
    }

    public void close() {
        close(true);
    }

    public void close(boolean forceClosed) {
        if (webSocket == null || closing) {
            return;
        }
        webSocket.close();
    }

    public boolean isAutoConnect() {
        return autoConnect;
    }

    public void setAutoConnect(boolean autoConnect) {
        this.autoConnect = autoConnect;
    }

    public void connect() {
        if (connected || connecting || !autoConnect) {
            return;
        }

        connecting = true;
        webSocket = Browser.getWindow().newWebSocket(url);

        wireOnOpen(webSocket, (event) -> {
            onOpen();
        });

        wireOnClose(webSocket, event -> {
            onClose();
        });

        wireOnError(webSocket, event -> {
            connected = false;
            close(false);
            Try.silent(errorCallback);
        });

        wireOnMessage(webSocket, event -> {
            final String payload = getData(event);
            Try.silent(dataCallback, payload);
        });
    }

    private void onOpen() {
        connected = true;
        connecting = false;
        closing = false;

        Try.silent(this::cancelConnectTimer);
        Try.silent(connectedCallback);
    }

    private void onClose() {
        connected = false;
        connecting = false;
        closing = false;
        Try.silent(closedCallback);

        if (!autoConnect) {
            cancelConnectTimer();
            return;
        }

        if (forceClosed) {
            forceClosed = false;
            Try.run(() -> connect());
        } else {
            ensureConnectTimer();
        }
    }

    private void ensureConnectTimer() {
        if (connectTimer != null) {
            return;
        }

        connectTimer = new Timer() {
            @Override
            public void run() {
                connect();
            }
        };
        connectTimer.scheduleRepeating(connectRetryMillis);
    }

    private void cancelConnectTimer() {
        if (connectTimer != null) {
            connectTimer.cancel();
            connectTimer = null;
        }
    }

    private native String getData(Event event) /*-{
        return event.data;
    }-*/;

    private native void wireEventHandler(WebSocket ws, String name, Func.Run1<Event> callback) /*-{
        ws[name] = function (event) {
            callback(event);
        };
    }-*/;

    private native void wireOnOpen(WebSocket ws, Func.Run1<Event> callback) /*-{
        ws.onopen = function (event) {
            callback(event);
        };
    }-*/;

    private native void wireOnClose(WebSocket ws, Func.Run1<Event> callback) /*-{
        ws.onclose = function (event) {
            callback(event);
        };
    }-*/;

    private native void wireOnError(WebSocket ws, Func.Run1<Event> callback) /*-{
        ws.onerror = function (event) {
            callback(event);
        };
    }-*/;

    private native void wireOnMessage(WebSocket ws, Func.Run1<Event> callback) /*-{
        ws.onmessage = function (event) {
            callback(event);
        };
    }-*/;


    public boolean send(String payload) {
        return webSocket.send(payload);
    }
}
