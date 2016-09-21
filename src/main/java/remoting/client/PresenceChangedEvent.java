package remoting.client;

import jsinterop.annotations.JsType;

/**
 *
 */
@JsType
public class PresenceChangedEvent {
    public final PresenceChange message;
    public final Presence presence;

    public PresenceChangedEvent(PresenceChange message, Presence presence) {
        this.message = message;
        this.presence = presence;
    }
}
