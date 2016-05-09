package react.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
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

    @JsProperty
    public final double getDeltaMode() {
        return deltaMode;
    }

    @JsProperty
    public final double getDeltaX() {
        return deltaX;
    }

    @JsProperty
    public final double getDeltaY() {
        return deltaY;
    }

    @JsProperty
    public final double getDeltaZ() {
        return deltaZ;
    }
}
