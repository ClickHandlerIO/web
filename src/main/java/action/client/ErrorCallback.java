package action.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ErrorCallback {
    void run(Throwable e);
}
