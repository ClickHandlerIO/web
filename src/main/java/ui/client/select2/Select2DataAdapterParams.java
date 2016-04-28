package ui.client.select2;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Select2DataAdapterParams {
    @JsProperty
    String getTerm();

    @JsProperty
    void setTerm(String term);

    @JsOverlay
    default Select2DataAdapterParams term(String term) {
        setTerm(term);
        return this;
    }
}
