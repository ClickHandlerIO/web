package action.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface AlwaysCallback {
    void run(boolean wasDispatched);
}
