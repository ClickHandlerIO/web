package react.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ComponentCallback {
    void run(Object error, Object component);
}
