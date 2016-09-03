package remoting.client;

import jsinterop.annotations.JsType;

/**
 *
 */
@JsType
public class PresenceLeaveEvent {
    public final String key;
    public final Presence presence;
    public final PresenceOccupant me;

    public PresenceLeaveEvent(String key, Presence presence, PresenceOccupant me) {
        this.key = key;
        this.presence = presence;
        this.me = me;
    }
}
