package react.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ChildRouteCallback {
    void run(Location location, RouteCallback callback);
}
