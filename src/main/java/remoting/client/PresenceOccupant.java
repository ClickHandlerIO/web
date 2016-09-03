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
    public PresenceOccupant id(final String id) {
        this.id = id;
        return this;
    }

    @JsOverlay
    public PresenceOccupant userId(final String userId) {
        this.userId = userId;
        return this;
    }

    @JsOverlay
    public PresenceOccupant nodeId(final String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    @JsOverlay
    public PresenceOccupant name(final String name) {
        this.name = name;
        return this;
    }

    @JsOverlay
    public PresenceOccupant imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @JsOverlay
    public PresenceOccupant joined(final long joined) {
        this.joined = joined;
        return this;
    }

    @JsOverlay
    public PresenceOccupant device(final String device) {
        this.device = device;
        return this;
    }

    @JsOverlay
    public PresenceOccupant state(final String state) {
        this.state = state;
        return this;
    }
}
