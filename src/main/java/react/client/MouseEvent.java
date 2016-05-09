package react.client;

import elemental.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class MouseEvent extends SyntheticEvent {
    public boolean altKey;
    public double button;
    public double buttons;
    public double clientX;
    public double clientY;
    public boolean ctrlKey;
    public boolean metaKey;
    public double pageX;
    public double pageY;
    public EventTarget relatedTarget;
    public double screenX;
    public double screenY;
    public boolean shiftKey;
    
    @JsOverlay
    public final boolean isAltKey() {
        return altKey;
    }

    @JsOverlay
    public final double getButton() {
        return button;
    }

    @JsOverlay
    public final double getButtons() {
        return buttons;
    }

    @JsOverlay
    public final double getClientX() {
        return clientX;
    }

    @JsOverlay
    public final double getClientY() {
        return clientY;
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
    public final double getPageX() {
        return pageX;
    }

    @JsOverlay
    public final double getPageY() {
        return pageY;
    }

    @JsOverlay
    public final EventTarget getRelatedTarget() {
        return relatedTarget;
    }

    @JsOverlay
    public final double getScreenX() {
        return screenX;
    }

    @JsOverlay
    public final double getScreenY() {
        return screenY;
    }

    @JsOverlay
    public final boolean isShiftKey() {
        return shiftKey;
    }
}
