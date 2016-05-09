package react.client;

import elemental.dom.Document;
import elemental.html.StyleMedia;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AbstractView {
    public StyleMedia styleMedia;
    public Document document;
}
