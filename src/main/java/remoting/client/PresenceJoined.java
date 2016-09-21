package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceJoined {
    public Presence presence;
    public PresenceOccupant me;

    @JsOverlay
    public final PresenceJoined presence(final Presence presence) {
        this.presence = presence;
        return this;
    }

    @JsOverlay
    public final PresenceJoined me(final PresenceOccupant me) {
        this.me = me;
        return this;
    }
}
