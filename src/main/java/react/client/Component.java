package react.client;

import com.google.gwt.dom.client.InputElement;
import common.client.*;
import elemental.client.Browser;
import elemental.dom.Document;
import elemental.html.Console;
import elemental.html.Window;
import jsinterop.annotations.*;
import logging.client.Logger;

import javax.inject.Inject;
import java.util.List;


public abstract class Component<P, S> implements Jso {
    @JsIgnore
    protected final Console console = Browser.getWindow().getConsole();
    @JsIgnore
    protected final Document document = Browser.getDocument();
    @JsIgnore
    protected final Window window = Browser.getWindow();
    @JsIgnore
    protected final Logger log = Logger.get(getClass());

    @JsProperty
    public String displayName;

    /**
     * Lifecycle
     */

    @JsProperty
    public Func.Call getDefaultProps = Func.bind(this::getDefaultPropsInternal);
    @JsProperty
    public Func.Call getInitialState = Func.bind(this::getInitialStateInternal);
    @JsProperty
    public Func.Run componentDidMount = Func.bind(this::componentDidMountInternal);
    @JsProperty
    public Func.Run1<P> componentWillReceiveProps = Func.bind(this::componentWillReceivePropsInternal);
    @JsProperty
    public Func.Call2<Boolean, P, S> shouldComponentUpdate = Func.bind(this::shouldComponentUpdateInternal);
    @JsProperty
    public Func.Run2<P, S> componentWillUpdate = Func.bind(this::componentWillUpdateInternal);
    @JsProperty
    public Func.Call<ReactElement> render = Func.bind(this::renderInternal);
    @JsProperty
    public Func.Run2<P, S> componentDidUpdate = Func.bind(this::componentDidUpdateInternal);
    @JsProperty
    public Func.Run componentWillUnmount = Func.bind(this::componentWillUnmountInternal);

    /*
     * Context
     */

    @JsProperty
    public Func.Call getChildContext = this::getChildContext;
    @JsProperty
    public ContextTypes contextTypes = new ContextTypes();
    @JsProperty
    public ContextTypes childContextTypes = new ContextTypes();
    @JsIgnore
    @Inject
    protected Bus bus;
    @JsProperty
    public Func.Run componentWillMount = Func.bind(this::componentWillMountInternal);

    // Shorthand syntax
    @JsIgnore
    private ReactClass reactClass;
    @JsIgnore
    private Logger logger;

    public Component() {
        displayName = getClass().getSimpleName();
        // todo context stuff needed?
        addContextTypes(contextTypes);
        addChildContextTypes(childContextTypes);
    }

    @JsIgnore
    protected static native boolean shallowEqual(Object objA, Object objB) /*-{
        if (objA === objB) {
            return true;
        }

        var keysA = Object.keys(objA);
        var keysB = Object.keys(objB);

        if (keysA.length !== keysB.length) {
            return false;
        }

        // Test for A's keys different from B.
        var hasOwn = Object.prototype.hasOwnProperty;
        for (var i = 0; i < keysA.length; ++i) {
            if (!hasOwn.call(objB, keysA[i]) ||
                objA[keysA[i]] !== objB[keysA[i]]) {
                return false;
            }

            var valA = objA[keysA[i]];
            var valB = objB[keysA[i]];

            if (valA !== valB) {
                return false;
            }
        }

        return true;
    }-*/;

    @JsIgnore
    public ReactClass getReactClass() {
        if (reactClass == null) {
            reactClass = React.createClass(this);
        }
        return reactClass;
    }

    /*
     * Factory Methods
     */

    @JsIgnore
    public ReactElement createElement() {
        log.trace("createElement()");
        return React.createElement(getReactClass(), Jso.create());
    }

    @JsIgnore
    public ReactElement createElement(String key) {
        log.trace("createElement(key)", key);
        return React.createElement(getReactClass(), createPropsWithKey(key));
    }

    @JsIgnore
    public ReactElement createElement(Object... children) {
        log.trace("createElement(children)", children);
        return React.createElement(getReactClass(), Jso.create(), children);
    }

    @JsIgnore
    public ReactElement createElement(String key, Object... children) {
        log.trace("createElement(key, children)", key, children);
        return React.createElement(getReactClass(), createPropsWithKey(key), children);
    }

    @JsIgnore
    public ReactElement createElement(P props) {
        log.trace("createElement(props)", props);
        if (props == null) {
            props = Jso.create();
        }
        return React.createElement(getReactClass(), props);
    }

    @JsIgnore
    public ReactElement createElement(Func.Run1<P> propsCallback) {
        log.trace("createElement(propsCallback)");
        final P props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props);
    }

    @JsIgnore
    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        log.trace("createElement(propsCallback, children)", children);
        final P props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props, children);
    }

    @JsIgnore
    public ReactElement createElement(Func.Run2<P, Children> callback) {
        log.trace("createElement(Run2<props, children>)");
        final P props = Jso.create();
        final Children children = new Children();
        if (callback != null) {
            callback.run(props, children);
        }
        return React.createElement(getReactClass(), props, children.toArray());
    }

    @JsIgnore
    private P createPropsWithKey(String key) {
        log.trace("createPropsWithKey(key)", key);
        final P props = Jso.create();
        if (key != null) {
            Jso.set(props, "key", key);
        }
        return props;
    }

    @JsIgnore
    public StyleProps styleProps() {
        return new StyleProps();
    }

    @JsIgnore
    public StyleProps css() {
        return new StyleProps();
    }

    @JsIgnore
    public P props() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    @JsIgnore
    public P $$() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    @JsIgnore
    public P builder() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    @JsIgnore
    public ReactElement $() {
        return createElement();
    }

    @JsIgnore
    public ReactElement $(String key) {
        return createElement(key);
    }

    @JsIgnore
    public ReactElement $(Object... children) {
        return createElement(children);
    }

    @JsIgnore
    public ReactElement $(String key, Object... children) {
        return createElement(key, children);
    }

    @JsIgnore
    public ReactElement $(P props) {
        return createElement(props);
    }

    // Internal pass through

    @JsIgnore
    public ReactElement $(Func.Run1<P> propsCallback) {
        return createElement(propsCallback);
    }

    @JsIgnore
    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        return createElement(propsCallback, children);
    }

    @JsIgnore
    public ReactElement $(Func.Run2<P, Children> callback) {
        return createElement(callback);
    }

    @JsIgnore
    private void componentWillMountInternal(final ReactComponent<P, S> $this) {
//        log.trace("componentWillMount");
        if ($this.bus != null) {
            Try.run(() -> $this.bus.clear());
        } else {
            $this.bus = new BusDelegate(bus);
        }
        componentWillMount($this);
    }

    @JsIgnore
    protected void componentDidMountInternal(final ReactComponent<P, S> $this) {
//        log.trace("componentDidMount");
        try {
            componentDidMount($this);
        } finally {
            intakeProps($this, $this.props);
//            $this.ignoreNextIntakePropsCall = true;
        }
    }

    @JsIgnore
    protected void componentWillReceivePropsInternal(final ReactComponent<P, S> $this, P nextProps) {
        try {
            componentWillReceiveProps($this, nextProps);
        } finally {
//            if ($this.ignoreNextIntakePropsCall) {
//                $this.ignoreNextIntakePropsCall = false;
//            } else {
                intakeProps($this, nextProps);
//            }
        }
    }

    @JsIgnore
    private boolean shouldComponentUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
//        log.trace("shouldComponentUpdateInternal");
        return shouldComponentUpdate($this, nextProps, nextState);
    }

    @JsIgnore
    private void componentWillUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
//        log.trace("componentWillUpdate");
        componentWillUpdate($this, nextProps, nextState);
    }

    // Methods for subclasses to override

    @JsIgnore
    private ReactElement renderInternal(final ReactComponent<P, S> $this) {
//        log.trace("render");
        return render($this);
    }

    @JsIgnore
    protected void componentDidUpdateInternal(final ReactComponent<P, S> $this, P prevProps, S prevState) {
//        log.trace("componentDidUpdate");
        componentDidUpdate($this, prevProps, prevState);
    }

    @JsIgnore
    private void componentWillUnmountInternal(final ReactComponent<P, S> $this) {
//        log.trace("componentWillUnmount");
        try {
            $this.eventRegistrationCleanup();
        } finally {
            componentWillUnmount($this);
        }
    }

    @JsIgnore
    private P getDefaultPropsInternal(Object $this) {
        return getDefaultProps();
    }

    @JsIgnore
    public P getDefaultProps() {
        return Jso.create();
    }

    @JsIgnore
    private S getInitialStateInternal(Object $this) {
        return getInitialState();
    }

    @JsIgnore
    public S getInitialState() {
        return Jso.create();
    }

    @JsIgnore
    protected void componentWillMount(final ReactComponent<P, S> $this) {
    }

    @JsIgnore
    protected void componentDidMount(final ReactComponent<P, S> $this) {
    }

    @JsIgnore
    protected void componentWillReceiveProps(final ReactComponent<P, S> $this, P nextProps) {
    }

    @JsIgnore
    protected void intakeProps(ReactComponent<P, S> $this, P nextProps) {
    }

    @JsIgnore
    protected boolean shouldComponentUpdate(ReactComponent<P, S> $this, P nextProps, S nextState) {
        return propsOrStateNotEqual($this, nextProps, nextState);
    }

    protected boolean propsOrStateNotEqual(ReactComponent<P, S> $this, P nextProps, S nextState) {
        return !Lodash.isEqual($this.props, nextProps) || !Lodash.isEqual($this.state, nextState);
    }

    @JsIgnore
    protected void componentWillUpdate(ReactComponent<P, S> $this, P nextProps, S nextState) {
    }

    @JsIgnore
    protected abstract ReactElement render(final ReactComponent<P, S> $this);

    @JsIgnore
    protected void componentDidUpdate(final ReactComponent<P, S> $this, P prevProps, S prevState) {
    }

    @JsIgnore
    protected void componentWillUnmount(final ReactComponent<P, S> $this) {
    }

    @JsIgnore
    protected native Object getChildContext() /*-{
        return {};
    }-*/;

    @JsIgnore
    protected void addContextTypes(ContextTypes contextTypes) {
    }

    @JsIgnore
    protected void addChildContextTypes(ContextTypes contextTypes) {
    }

    /**
     * @param elements
     * @return
     */
    @JsIgnore
    protected ReactElement[] array(ReactElement... elements) {
        return elements;
    }

    /**
     * @param elements
     * @return
     */
    @JsIgnore
    protected String[] array(String... elements) {
        return elements;
    }

    /**
     * @param elements
     * @return
     */
    @JsIgnore
    protected ReactElement[] array(List<ReactElement> elements) {
        if (elements == null) {
            return null;
        }

        return elements.toArray(new ReactElement[elements.size()]);
    }

    @JsIgnore
    public String getInputValue(SyntheticEvent event) {
        try {
            return ((InputElement) event.getTarget()).getValue();
        } catch (Throwable e) {
            return null;
        }
    }

    /**
     * @param style
     * @return
     */
    @JsIgnore
    protected HTMLProps style(StyleProps style) {
        final HTMLProps props = new HTMLProps();
        return props.style(style);
    }

    /**
     * @param className
     * @return
     */
    @JsIgnore
    protected HTMLProps className(String className) {
        final HTMLProps props = new HTMLProps();
        return props.className(className);
    }

    /**
     * @param key
     * @return
     */
    @JsIgnore
    protected HTMLProps key(String key) {
        final HTMLProps props = new HTMLProps();
        return props.key(key);
    }

    /**
     * @param ref
     * @param <T>
     * @return
     */
    @JsIgnore
    protected <T> HTMLProps ref(Ref<T> ref) {
        final HTMLProps props = new HTMLProps();
        return props.ref(ref);
    }

    /**
     * @return
     */
    @JsIgnore
    protected StyleProps style() {
        return new StyleProps();
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class ContextTypes {
        @JsOverlay
        public final <T> T get(String name) {
            return Jso.get(this, name);
        }

        @JsOverlay
        public final <T> ContextTypes set(String name, T value) {
            Jso.set(this, name, value);
            return this;
        }
    }
}
