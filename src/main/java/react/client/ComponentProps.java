package react.client;

import common.client.Func;
import common.client.Jso;
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
    ReactClass __cls;

    @JsOverlay
    public final ReactElement children() {
        return (ReactElement) children;
    }

    @JsOverlay
    public final <T> ComponentProps ref(Ref<T> ref) {
        this.ref = ref.getName();
        return this;
    }

    @JsOverlay
    public final ReactElement $() {
        return build();
    }

    @JsOverlay
    public final ReactElement build() {
        final ReactClass spec = __cls;
        Jso.delete(this, "__cls");

        Object obj = Jso.copy(this);

        if (children == null) {
            return React.createElement(spec, obj);
        } else {
            return React.createElement(spec, obj, children);
        }
    }

    @JsOverlay
    public final ReactElement $(ReactElement element) {
        return build(element);
    }

    @JsOverlay
    public final ReactElement build(ReactElement element) {
        final ReactClass spec = __cls;
        Jso.delete(this, "__cls");

        Object obj = Jso.copy(this);

        if (element == null) {
            return React.createElement(spec, obj);
        } else {
            return React.createElement(spec, obj, element);
        }
    }

    @JsOverlay
    public final ReactElement $(ReactElement... elements) {
        return build(elements);
    }

    @JsOverlay
    public final ReactElement build(ReactElement... elements) {
        final ReactClass spec = __cls;
        Jso.delete(this, "__cls");

        Object obj = Jso.copy(this);

        if (elements == null || elements.length == 0) {
            return React.createElement(spec, obj);
        } else {
            return React.createElement(spec, obj, elements);
        }
    }

    @JsOverlay
    public final ReactElement $(Func.Run1<Children> callback) {
        return build(callback);
    }

    @JsOverlay
    public final ReactElement build(Func.Run1<Children> callback) {
        if (callback == null) {
            return build();
        }

        Children children = new Children();
        callback.run(children);

        this.children = children.toArray();
        return build();
    }
}
