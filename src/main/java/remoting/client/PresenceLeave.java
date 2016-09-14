package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceLeave {
    public String id;
    public String userId;

    @JsOverlay
    public final PresenceLeave id(final String sessionId) {
        this.id = sessionId;
        return this;
    }

    @JsOverlay
    public final PresenceLeave userId(final String userId) {
        this.userId = userId;
        return this;
    }
}
