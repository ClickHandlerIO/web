package react.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ComponentsCallback {
    void run(Object error, Object components);
}
