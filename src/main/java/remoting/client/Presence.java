package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Presence {
    public String key;
    public String mod;
    public double seq;
    public PresenceOccupant[] occupants;
    public PresenceOccupant me;

    @JsOverlay
    public final Presence key(final String key) {
        this.key = key;
        return this;
    }

    @JsOverlay
    public final Presence mod(final String mod) {
        this.mod = mod;
        return this;
    }

    @JsOverlay
    public final Presence seq(final double seq) {
        this.seq = seq;
        return this;
    }

    @JsOverlay
    public final Presence occupants(final PresenceOccupant[] occupants) {
        this.occupants = occupants;
        return this;
    }
}
