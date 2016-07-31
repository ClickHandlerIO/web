package react.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsIgnore;
import logging.client.Logger;

/**
 * @param <P>
 */
public abstract class ExternalComponent<P> {

    protected final Logger log = Logger.get(getClass());

    public ExternalComponent() {
    }

    protected abstract ReactClass<P> getReactClass();

    /*
     * Props
     */

    private P createProps() {
        P props = Jso.create();
        if (Jso.get(getReactClass(), "getDefaultProps") != null) {
//            Jso.assign(props, getReactClass().getDefaultProps());
        }
        applyDefaults(props);
        return props;
    }

    private native Object createProps0() /*-{
    return {};
    }-*/;


    protected void applyDefaults(P props) {
        log.trace("applyDefaults(props)", props);
        // Allows a place for subclasses to set defaults
    }

    /*
     * Factory Methods
     */

    public ReactElement createElement() {
        log.trace("createElement()");
        return React.createElement(getReactClass(), createProps0());
    }

    public ReactElement createElement(String key) {
        log.trace("createElement(key)", key);
        P props = createProps();
        if (key != null) {
            Jso.set(props, "key", key);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Object... children) {
        log.trace("createElement(children)", children);
        return React.createElement(getReactClass(), createProps(), children);
    }

    public ReactElement createElement(String key, Object... children) {
        log.trace("createElement(key, children)", key, children);
        P props = createProps();
        if (key != null) {
            Jso.set(props, "key", key);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(P props) {
        log.trace("createElement(props)", props);
        if (props == null) {
            props = Jso.create();
        }
        Jso.assign(props, createProps());
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback) {
        log.trace("createElement(propsCallback)");
        final P props = createProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        log.trace("createElement(propsCallback, children)", children);
        final P props = createProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(Func.Run2<P, Children> callback) {
        log.trace("createElement(Run2<props, children>)");
        final P props = createProps();
        final Children children = new Children();
        if (callback != null) {
            callback.run(props, children);
        }
        return React.createElement(getReactClass(), props, children.toArray());
    }

    // Shorthand syntax

    @JsIgnore
    public P props() {
        return $$();
    }

    @JsIgnore
    public P $$() {
        P props = createProps();
        if (props == null)
            props = Jso.create();
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    @JsIgnore
    public P builder() {
        return $$();
    }

    public ReactElement $() {
        return createElement();
    }

    public ReactElement $(String key) {
        return createElement(key);
    }

    public ReactElement $(Object... children) {
        return createElement(children);
    }

    public ReactElement $(String key, Object... children) {
        return createElement(key, children);
    }

    public ReactElement $(P props) {
        return createElement(props);
    }

    public ReactElement $(Func.Run1<P> propsCallback) {
        return createElement(propsCallback);
    }

    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        return createElement(propsCallback, children);
    }

    public ReactElement $(Func.Run2<P, Children> callback) {
        return createElement(callback);
    }
}
