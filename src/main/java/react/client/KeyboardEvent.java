package react.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class KeyboardEvent extends SyntheticEvent {
    public boolean altKey;
    public double charCode;
    public boolean ctrlKey;
    public String key;
    public double keyCode;
    public String locale;
    public double location;
    public boolean metaKey;
    public boolean repeat;
    public boolean shiftKey;
    public double which;

    @JsOverlay
    public final boolean getAltKey() {
        return altKey;
    }

    @JsOverlay
    public final Number getCharCode() {
        return charCode;
    }

    @JsOverlay
    public final boolean isCtrlKey() {
        return ctrlKey;
    }

    @JsMethod
    public final native boolean getModifierState(String key);

    @JsOverlay
    public final String getKey() {
        return key;
    }

    @JsOverlay
    public final double getKeyCode() {
        return keyCode;
    }

    @JsOverlay
    public final String getLocale() {
        return locale;
    }

    @JsOverlay
    public final double getLocation() {
        return location;
    }

    @JsOverlay
    public final boolean isMetaKey() {
        return metaKey;
    }

    @JsOverlay
    public final boolean isRepeat() {
        return repeat;
    }

    @JsOverlay
    public final boolean isShiftKey() {
        return shiftKey;
    }

    @JsOverlay
    public final double getWhich() {
        return which;
    }
}
