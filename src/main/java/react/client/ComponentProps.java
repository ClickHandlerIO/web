package react.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ComponentProps {
    public Object children;
    public String key;
    public Object ref;

    @JsOverlay
    public final ReactElement children() {
        return (ReactElement)children;
    }

    @JsOverlay
    public final <T> ComponentProps ref(Ref<T> ref) {
        this.ref = ref.getName();
        return this;
    }
}
