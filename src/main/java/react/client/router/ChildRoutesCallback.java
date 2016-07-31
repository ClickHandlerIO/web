package react.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ChildRoutesCallback {
    void call(PartialNextState partialNextState, RoutesCallback callback);
}
