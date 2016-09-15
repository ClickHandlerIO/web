package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceOccupant {
    public String id;
    public String userId;
    public String nodeId;
    public String name;
    public String imageUrl;
    public long joined;
    public String device;
    public String state;

    @JsOverlay
    public final PresenceOccupant id(final String id) {
        this.id = id;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant userId(final String userId) {
        this.userId = userId;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant nodeId(final String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant name(final String name) {
        this.name = name;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant joined(final long joined) {
        this.joined = joined;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant device(final String device) {
        this.device = device;
        return this;
    }

    @JsOverlay
    public final PresenceOccupant state(final String state) {
        this.state = state;
        return this;
    }
}
