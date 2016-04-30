package react.client;

import common.client.Bus;
import common.client.BusDelegate;
import common.client.Func;
import common.client.Jso;
import elemental.client.Browser;
import elemental.dom.Document;
import elemental.html.Console;
import elemental.html.Window;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import logging.client.Logger;

import javax.inject.Inject;


@JsType
public abstract class Component<P, S> {
    @JsIgnore
    protected final Console console = Browser.getWindow().getConsole();
    @JsIgnore
    protected final Document document = Browser.getDocument();
    @JsIgnore
    protected final Window window = Browser.getWindow();
    @JsIgnore
    protected final Logger log = Logger.get(getClass());
    public String displayName;
    /**
     * Lifecycle
     */
    public Func.Call<P> getDefaultProps = Func.bind(this::getDefaultProps);
    public Func.Call<S> getInitialState = Func.bind(this::getInitialState);
    public Func.Run componentDidMount = Func.bind(this::componentDidMountInternal);
    public Func.Run1<P> componentWillReceiveProps = Func.bind(this::componentWillReceivePropsInternal);
    public Func.Call2<Boolean, P, S> shouldComponentUpdate = Func.bind(this::shouldComponentUpdateInternal);
    public Func.Run2<P, S> componentWillUpdate = Func.bind(this::componentWillUpdateInternal);
    //    @JsProperty(name = "render") // todo test if we need the property name declaration
    public Func.Call<ReactElement> render = Func.bind(this::renderInternal);
    //    @JsProperty(name = "componentDidUpdate") // todo test if we need the property name declaration
    public Func.Run2<P, S> componentDidUpdate = Func.bind(this::componentDidUpdateInternal);
    public Func.Run componentWillUnmount = Func.bind(this::componentWillUnmountInternal);
    /*
     * Context
     */
    public Func.Call getChildContext = this::getChildContext;
    public ContextTypes contextTypes = new ContextTypes();
    public ContextTypes childContextTypes = new ContextTypes();
    @JsIgnore
    @Inject
    protected Bus bus;
    public Func.Run componentWillMount = Func.bind(this::componentWillMountInternal);

    // Shorthand syntax
    @JsIgnore
    private ReactClass<P> reactClass;
    @JsIgnore
    private Logger logger;

    public Component() {
        displayName = getClass().getSimpleName();
        // todo context stuff needed?
        addContextTypes(contextTypes);
        addChildContextTypes(childContextTypes);
    }

    @JsIgnore
    public ReactClass<P> getReactClass() {
        if (reactClass == null) {
            reactClass = (ReactClass<P>) React.createClass(this);
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
    public ReactElement createElement(Func.Run2<P, DOM.ChildList> callback) {
        log.trace("createElement(Run2<props, children>)");
        final P props = Jso.create();
        final DOM.ChildList childList = new DOM.ChildList();
        if (callback != null) {
            callback.run(props, childList);
        }
        return React.createElement(getReactClass(), props, childList.toArray());
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
    public ReactElement $(Func.Run2<P, DOM.ChildList> callback) {
        return createElement(callback);
    }

    @JsIgnore
    private void componentWillMountInternal(final ReactComponent<P, S> $this) {
        log.trace("componentWillMount");
        Jso.set($this, React.BUS, new BusDelegate(bus));
        componentWillMount($this);
    }

    @JsIgnore
    private void componentDidMountInternal(final ReactComponent<P, S> $this) {
        log.trace("componentDidMount");
        try {
            componentDidMount($this);
        } finally {
            intakeProps($this, $this.getProps());
        }
    }

    @JsIgnore
    private void componentWillReceivePropsInternal(final ReactComponent<P, S> $this, P nextProps) {
        log.trace("componentWillReceiveProps");
        try {
            componentWillReceiveProps($this, nextProps);
        } finally {
            intakeProps($this, nextProps);
        }
    }

    @JsIgnore
    private boolean shouldComponentUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        log.trace("shouldComponentUpdateInternal");
        return shouldComponentUpdate($this, nextProps, nextState);
    }

    @JsIgnore
    private void componentWillUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        log.trace("componentWillUpdate");
        componentWillUpdate($this, nextProps, nextState);
    }

    // Methods for subclasses to override

    @JsIgnore
    private ReactElement renderInternal(final ReactComponent<P, S> $this) {
        log.trace("render");
        return render($this);
    }

    @JsIgnore
    private void componentDidUpdateInternal(final ReactComponent<P, S> $this, P prevProps, S prevState) {
        log.trace("componentDidUpdate");
        componentDidUpdate($this, prevProps, prevState);
    }

    @JsIgnore
    private void componentWillUnmountInternal(final ReactComponent<P, S> $this) {
        log.trace("componentWillUnmount");
        try {
            $this.eventRegistrationCleanup();
        } finally {
            componentWillUnmount($this);
        }
    }

    @JsIgnore
    public P getDefaultProps(ReactComponent<P, S> $this) {
        return Jso.create();
    }

    @JsIgnore
    public S getInitialState(ReactComponent<P, S> $this) {
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
        return true;
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

    protected native Object getChildContext() /*-{
        return {};
    }-*/;

    @JsIgnore
    protected void addContextTypes(ContextTypes contextTypes) {
    }

    @JsIgnore
    protected void addChildContextTypes(ContextTypes contextTypes) {
    }

    @JsType
    public static class ContextTypes {
        @JsIgnore
        public <T> T get(String name) {
            return Jso.get(this, name);
        }

        @JsIgnore
        public <T> void set(String name, T value) {
            Jso.set(this, name, value);
        }
    }
}

