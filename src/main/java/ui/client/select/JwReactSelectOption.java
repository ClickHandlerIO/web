package ui.client.select;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface JwReactSelectOption<V> {
    @JsProperty
    String getValue();

    @JsProperty
    void setValue(String value);

    @JsProperty
    V getValueObject();

    @JsProperty
    void setValueObject(V valueObject);

    @JsProperty
    String getLabel();

    @JsProperty
    void setLabel(String label);

    @JsProperty
    boolean isClearableValue();

    @JsProperty
    void setClearableValue(boolean clearableValue);
}
