package react.client;

import elemental.events.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface FocusEvent extends SyntheticEvent {
    @JsProperty
    EventTarget getRelatedTarget();
}
