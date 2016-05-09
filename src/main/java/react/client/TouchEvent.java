package react.client;

import elemental.events.TouchList;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TouchEvent extends SyntheticEvent {
    public boolean altKey;
    public TouchList changedTouches;
    public boolean ctrlKey;
    public boolean metaKey;
    public boolean shiftKey;
    public TouchList targetTouches;
    public TouchList touches;

    @JsOverlay
    public final boolean isAltKey() {
        return altKey;
    }

    @JsOverlay
    public final TouchList getChangedTouches() {
        return changedTouches;
    }

    @JsOverlay
    public final boolean isCtrlKey() {
        return ctrlKey;
    }

    @JsMethod
    public final native boolean getModifierState(String key);

    @JsOverlay
    public final boolean isMetaKey() {
        return metaKey;
    }

    @JsOverlay
    public final boolean isShiftKey() {
        return shiftKey;
    }

    @JsOverlay
    public final TouchList getTargetTouches() {
        return targetTouches;
    }

    @JsOverlay
    public final TouchList getTouches() {
        return touches;
    }
}
