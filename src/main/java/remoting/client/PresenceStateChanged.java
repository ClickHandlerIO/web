package remoting.client;

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

    public PresenceStateChanged id(final String id) {
        this.id = id;
        return this;
    }

    public PresenceStateChanged userId(final String userId) {
        this.userId = userId;
        return this;
    }

    public PresenceStateChanged state(final String state) {
        this.state = state;
        return this;
    }
}
