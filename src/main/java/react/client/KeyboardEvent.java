package react.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface KeyboardEvent extends SyntheticEvent {
    @JsProperty
    boolean getAltKey();

    @JsProperty
    Number getCharCode();

    @JsProperty
    boolean isCtrlKey();

    @JsMethod
    boolean getModifierState(String key);

    @JsProperty
    String getKey();

    @JsProperty
    Number getKeyCode();

    @JsProperty
    String getLocale();

    @JsProperty
    Number getLocation();

    @JsProperty
    boolean isMetaKey();

    @JsProperty
    boolean isRepeat();

    @JsProperty
    boolean isShiftKey();

    @JsProperty
    Number getWhich();
}
