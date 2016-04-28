package react.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentsCallback {
    void call(Location location, ComponentsCallback callback);
}
