package react.client;

import elemental.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface MouseEvent extends SyntheticEvent {
    @JsProperty
    boolean isAltKey();

    @JsProperty
    Number getButton();

    @JsProperty
    Number getButtons();

    @JsProperty
    Number getClientX();

    @JsProperty
    Number getClientY();

    @JsProperty
    boolean isCtrlKey();

    @JsMethod
    boolean getModifierState(String key);

    @JsProperty
    boolean isMetaKey();

    @JsProperty
    Number getPageX();

    @JsProperty
    Number getPageY();

    @JsProperty
    EventTarget getRelatedTarget();

    @JsProperty
    Number getScreenX();

    @JsProperty
    Number getScreenY();

    @JsProperty
    boolean isShiftKey();
}
