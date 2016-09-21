package remoting.client;

import jsinterop.annotations.JsType;

/**
 *
 */
@JsType
public class PresenceJoinedEvent {
    public final PresenceJoined message;

    public PresenceJoinedEvent(PresenceJoined message) {
        this.message = message;
    }
}
