package react.client;

import elemental.dom.Element;
import jsinterop.annotations.JsMethod;


public class ReactDOM {
    @JsMethod(namespace = "ReactDOM")
    public static native ReactElement render(ReactElement obj, Element element);

    @JsMethod(namespace = "ReactDOM")
    public static native Element findDOMNode(Object obj);
}
