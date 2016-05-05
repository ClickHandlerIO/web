package remoting.client;

/**
 *
 */
public class WsMessageEvent {
    public final WsDispatcher dispatcher;
    public final WsMessage message;

    public WsMessageEvent(WsDispatcher dispatcher, WsMessage message) {
        this.dispatcher = dispatcher;
        this.message = message;
    }
}
