package react.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ReplaceStateFunction {
    void call(ReplaceState state, String path);
}
