package react.client.router;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 *
 */
@JsType(isNative = true, name = "Object", namespace = GLOBAL)
public class RouterProps {
    public Object history;
    public Route routes;

    @JsOverlay
    public final RouterProps history(Object history) {
        this.history = history;
        return this;
    }

    @JsOverlay
    public final RouterProps routes(Route routes) {
        this.routes = routes;
        return this;
    }
}
