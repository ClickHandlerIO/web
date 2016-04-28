package ui.client.select2;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Select2Data {

    @JsProperty
    String getId();

    @JsProperty
    void setId(String id);

    @JsProperty
    String getText();

    @JsProperty
    void setText(String text);

    @JsProperty
    boolean isSelected();

    @JsProperty
    void setSelected(boolean selected);

    @JsProperty
    Select2Data[] getChildren();

    @JsProperty
    void setChildren(Select2Data[] children);
}
