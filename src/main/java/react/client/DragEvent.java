package react.client;

import elemental.dom.Clipboard;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DragEvent extends SyntheticEvent {
    public Clipboard dataTransfer;

    @JsOverlay
    public final Clipboard getDataTransfer() {
        return dataTransfer;
    }
}
