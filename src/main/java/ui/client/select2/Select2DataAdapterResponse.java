package ui.client.select2;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Select2DataAdapterResponse {

    @JsProperty
    Select2Data[] getResults();

    @JsProperty
    void setResults(Select2Data[] results);

    @JsOverlay
    default Select2DataAdapterResponse results(Select2Data[] results) {
        setResults(results);
        return this;
    }
}
