package react.client;

import elemental.dom.Clipboard;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface DragEvent extends SyntheticEvent {
    @JsProperty
    Clipboard getDataTransfer();
}
