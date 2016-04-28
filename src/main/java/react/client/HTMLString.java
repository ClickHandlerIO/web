package react.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType
public class HTMLString {
    @JsProperty
    public String __html;

    public static HTMLString create(String html) {
        final HTMLString val = new HTMLString();
        val.__html = html;
        return val;
    }
}
