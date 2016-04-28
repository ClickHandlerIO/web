package react.client.router;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = "ReactRouter")
public interface Router extends History {

    @JsMethod
    void setRouteLeaveHook(Route route, RouteHook hook);

    @JsMethod
    void replace(String path);
}
