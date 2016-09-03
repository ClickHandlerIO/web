package remoting.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceChange {
    public String key;
    public String mod;
    public long seq;
    public PresenceOccupant[] joined;
    public PresenceLeave[] left;
    public PresenceStateChanged[] changed;

    public PresenceChange key(final String key) {
        this.key = key;
        return this;
    }

    public PresenceChange mod(final String mod) {
        this.mod = mod;
        return this;
    }

    public PresenceChange seq(final long seq) {
        this.seq = seq;
        return this;
    }

    public PresenceChange joined(final PresenceOccupant[] joined) {
        this.joined = joined;
        return this;
    }

    public PresenceChange left(final PresenceLeave[] left) {
        this.left = left;
        return this;
    }

    public PresenceChange changed(final PresenceStateChanged[] changed) {
        this.changed = changed;
        return this;
    }
}
