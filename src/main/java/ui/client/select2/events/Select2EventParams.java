package ui.client.select2.events;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Select2EventParams {
    @JsProperty
    String getName();

    @JsProperty
    boolean isPrevented();

    @JsProperty
    Select2EventArgs getArgs();
}
