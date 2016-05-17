package ui.client.select;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public interface SelectComponent {
    void focus();

    void clearCache();
}
