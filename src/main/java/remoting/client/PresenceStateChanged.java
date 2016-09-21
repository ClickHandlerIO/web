package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceStateChanged {
    public String id;
    public String userId;
    public String state;

    @JsOverlay
    public final PresenceStateChanged id(final String id) {
        this.id = id;
        return this;
    }

    @JsOverlay
    public final PresenceStateChanged userId(final String userId) {
        this.userId = userId;
        return this;
    }

    @JsOverlay
    public final PresenceStateChanged state(final String state) {
        this.state = state;
        return this;
    }
}
