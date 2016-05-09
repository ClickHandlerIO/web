package react.client;

import elemental.dom.Clipboard;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ClipboardEvent extends SyntheticEvent {
    public Clipboard dataTransfer;

    @JsProperty
    public final Clipboard getClipboardData() {
        return dataTransfer;
    }
}
