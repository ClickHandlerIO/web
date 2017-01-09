package ui.client.select2.events;

import com.google.gwt.dom.client.NativeEvent;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ui.client.select2.Select2Data;

@JsType(isNative = true)
public interface Select2EventArgs {
    @JsProperty
    Select2Data getData();

    @JsProperty
    NativeEvent getOriginalEvent();
}
