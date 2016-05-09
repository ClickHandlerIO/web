package react.client;

import elemental.events.EventTarget;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class FocusEvent extends SyntheticEvent {
    public EventTarget relatedTarget;

    @JsOverlay
    public final EventTarget getRelatedTarget() {
        return relatedTarget;
    }
}
