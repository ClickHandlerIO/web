package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceChange {
    public String key;
    public String mod;
    public double seq;
    public PresenceOccupant[] joined;
    public PresenceLeave[] left;
    public PresenceStateChanged[] changed;

    @JsOverlay
    public final PresenceChange key(final String key) {
        this.key = key;
        return this;
    }

    @JsOverlay
    public final PresenceChange mod(final String mod) {
        this.mod = mod;
        return this;
    }

    @JsOverlay
    public final PresenceChange seq(final double seq) {
        this.seq = seq;
        return this;
    }

    @JsOverlay
    public final PresenceChange joined(final PresenceOccupant[] joined) {
        this.joined = joined;
        return this;
    }

    @JsOverlay
    public final PresenceChange left(final PresenceLeave[] left) {
        this.left = left;
        return this;
    }

    @JsOverlay
    public final PresenceChange changed(final PresenceStateChanged[] changed) {
        this.changed = changed;
        return this;
    }
}
