package action.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface RequestCallback<T> {
    void run(T request);
}
