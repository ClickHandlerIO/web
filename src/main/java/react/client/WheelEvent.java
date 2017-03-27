package react.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class WheelEvent extends SyntheticEvent {
    public double deltaMode;
    public double deltaX;
    public double deltaY;
    public double deltaZ;
}
