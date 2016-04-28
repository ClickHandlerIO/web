package react.client;

import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface ReactElement<T, P extends BaseProps> {
    @JsProperty
    T getType();

    @JsProperty
    P getProps();

    @JsProperty
    Object getKey();

    @JsProperty
    Object getRef(); // todo ?

    void setRef(Func.Call1<Object, Object> callback); // todo is this needed?
}
