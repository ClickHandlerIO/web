package react.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface BaseProps {
    @JsProperty
    Object getChildren();

    @JsProperty
    void setChildren(Object children);

    @JsProperty
    String getKey();

    @JsProperty
    void setKey(String key);

    @JsProperty
    Object getRef();

    @JsProperty
    void setRef(Object value);

    @JsOverlay
    default <T> BaseProps ref(Ref<T> ref) {
        setRef(ref.getName());
        return this;
    }

    @JsOverlay
    default ReactElement $() {
        return build();
    }

    @JsOverlay
    default ReactElement build() {
        final ReactClass spec = Jso.get(this, "__cls");
        Jso.delete(this, "__cls");

        if (getChildren() == null) {
            return React.createElement(spec, this);
        } else {
            return React.createElement(spec, this, getChildren());
        }
    }

    @JsOverlay
    default ReactElement $(ReactElement element) {
        return build(element);
    }

    @JsOverlay
    default ReactElement build(ReactElement element) {
        final ReactClass spec = Jso.get(this, "__cls");
        Jso.delete(this, "__cls");

        if (element == null) {
            return React.createElement(spec, this);
        } else {
            return React.createElement(spec, this, element);
        }
    }

    @JsOverlay
    default ReactElement $(ReactElement... elements) {
        return build(elements);
    }

    @JsOverlay
    default ReactElement build(ReactElement... elements) {
        final ReactClass spec = Jso.get(this, "__cls");
        Jso.delete(this, "__cls");

        if (elements == null || elements.length == 0) {
            return React.createElement(spec, this);
        } else {
            return React.createElement(spec, this, elements);
        }
    }

    @JsOverlay
    default ReactElement $(Func.Run1<Children> callback) {
        return build(callback);
    }

    @JsOverlay
    default ReactElement build(Func.Run1<Children> callback) {
        if (callback == null) {
            return build();
        }

        Children children = new Children();
        callback.run(children);

        setChildren(children.toArray());
        return build();
    }
}
