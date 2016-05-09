package react.client;


import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class UIEvent extends SyntheticEvent {
    public double detail;
    public Object view;

    @JsOverlay
    public final double getDetail() {
        return detail;
    }

    @JsOverlay
    public final Object getView() {
        return view;
    }
}
