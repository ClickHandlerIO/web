package react.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ReactClass<P> {
    @JsMethod
    P getDefaultProps();
}
