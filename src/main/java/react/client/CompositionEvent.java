package react.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CompositionEvent extends SyntheticEvent {
    public String data;

    @JsProperty
    public final String getData() {
        return data;
    }
}
