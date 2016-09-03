package remoting.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PresenceLeave {
    public String id;
    public String userId;

    public PresenceLeave id(final String sessionId) {
        this.id = sessionId;
        return this;
    }

    public PresenceLeave userId(final String userId) {
        this.userId = userId;
        return this;
    }
}
