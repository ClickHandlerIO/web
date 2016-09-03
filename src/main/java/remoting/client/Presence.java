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
    public long seq;
    public PresenceOccupant[] occupants;

    @JsOverlay
    public Presence key(final String key) {
        this.key = key;
        return this;
    }

    @JsOverlay
    public Presence mod(final String mod) {
        this.mod = mod;
        return this;
    }

    @JsOverlay
    public Presence seq(final long seq) {
        this.seq = seq;
        return this;
    }

    @JsOverlay
    public Presence occupants(final PresenceOccupant[] occupants) {
        this.occupants = occupants;
        return this;
    }
}
