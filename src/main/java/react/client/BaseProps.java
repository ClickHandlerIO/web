package react.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface BaseProps {
    @JsProperty
    Object getChildren();

    @JsProperty
    void setChildren(Object children);

    @JsProperty
    String getKey();

    @JsProperty
    void setKey(String key);

    @JsProperty
    Object getRef();

    @JsProperty
    void setRef(Object value);
}
