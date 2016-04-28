package react.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface WheelEvent extends SyntheticEvent {
    @JsProperty
    Number getDeltaMode();

    @JsProperty
    Number getDeltaX();

    @JsProperty
    Number getDeltaY();

    @JsProperty
    Number getDeltaZ();
}
