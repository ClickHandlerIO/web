package react.client;

import action.client.AbstractAction;
import action.client.ActionCall;
import com.google.gwt.dom.client.InputElement;
import com.google.web.bindery.event.shared.HandlerRegistration;
import common.client.*;
import elemental.client.Browser;
import elemental.dom.Document;
import elemental.html.Console;
import elemental.html.Window;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import logging.client.Logger;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

@SuppressWarnings("all")
public abstract class Component<P, S> implements Jso {
    private static ReactComponent<?, ?> CURRENT = null;

    protected final Console console = Browser.getWindow().getConsole();
    protected final Document document = Browser.getDocument();
    protected final Window window = Browser.getWindow();
    protected final Logger log = Logger.get(getClass());

    /**
     * Display name used by React.
     */
    @JsProperty
    public String displayName;

    /**
     * Context
     */
    @JsProperty
    public Func.Call getChildContext = this::getChildContext;
    @JsProperty
    public ContextTypes contextTypes = new ContextTypes();
    @JsProperty
    public ContextTypes childContextTypes = new ContextTypes();
    @Inject
    protected Bus bus;

    // Scoped variables.
    // These are used for convenience for autobind.
    protected ReactComponent<P, S> $this;
    protected P props;
    protected S state;
    protected BusDelegate busDelegate;

    /**
     * React Lifecycle methods. React binds "this" keyword to the ReactComponent instance.
     * Since Java does not allow that feature we pass "this" as the first argument.
     */
    @JsProperty
    private Func.Call getDefaultProps = Func.unbind(this::getDefaultPropsInternal);
    @JsProperty
    private Func.Call getInitialState = Func.unbind(this::getInitialStateInternal);
    @JsProperty
    private Func.Run2<P, S> componentDidUpdate = Func.unbind(this::componentDidUpdateInternal);
    @JsProperty
    private Func.Run componentDidMount = Func.unbind(this::componentDidMountInternal);
    @JsProperty
    private Func.Run1<P> componentWillReceiveProps = Func.unbind(this::componentWillReceivePropsInternal);
    @JsProperty
    private Func.Call2<Boolean, P, S> shouldComponentUpdate = Func.unbind(this::shouldComponentUpdateInternal);
    @JsProperty
    private Func.Run2<P, S> componentWillUpdate = Func.unbind(this::componentWillUpdateInternal);
    @JsProperty
    private Func.Call<ReactElement> render = Func.unbind(this::renderInternal);
    @JsProperty
    private Func.Run componentWillUnmount = Func.unbind(this::componentWillUnmountInternal);
    @JsProperty
    private Func.Run componentWillMount = Func.unbind(this::componentWillMountInternal);

    private ReactClass reactClass;
    private Logger logger;

    /**
     *
     */
    public Component() {
        // Default React's display name to be the simple name of this class.
        // Component Specs are GWT java objects so we can use the java class name.
        displayName = getClass().getSimpleName();

        // Setup context types.
        addContextTypes(contextTypes);
        addChildContextTypes(childContextTypes);
    }

    /**
     * @param func
     * @param <T>
     * @return
     */
    public static <T> T bind(T func) {
        // Return if null.
        if (func == null) {
            return null;
        }

        // Ensure it's a function.
        if (!Jso.isFunction(func)) {
            bindProps(func);
            return func;
        }

        // Scope ReactComponent.
        final ReactComponent<?, ?> _$this = CURRENT;
        Func.Call before = () -> _$this.spec.set$This(_$this);
        Func.Run1<ReactComponent<?, ?>> after = (a1) -> _$this.spec.set$This(a1);

        // Intercept function.
        return (T) Func.bind(before, func, after);
    }

    /**
     * @return
     */
    public static ReactComponent<?, ?> get() {
        return CURRENT;
    }

    /**
     * @param props
     */
    public static void bindProps(Object props) {
        Jso.Native.iterate(props, (name, value) -> {
            switch (Jso.Native.typeOf(value)) {
                case "function":
                    Jso.set(props, name, bind(value));
                    break;
                case "object":
                    bindProps(value);
                    break;
            }
        });
    }

    /**
     * @return
     */
    public ReactComponent<?, ?> get$This() {
        return $this;
    }

    /**
     * @param $this
     * @return
     */
    private ReactComponent<?, ?> set$This(ReactComponent<?, ?> $this) {
        final ReactComponent<?, ?> previous = CURRENT;
        CURRENT = $this;
        if ($this != null) {
            this.props = (P) $this.props;
            this.state = (S) $this.state;
            this.busDelegate = $this.bus;
        } else {
            this.props = null;
            this.state = null;
            this.busDelegate = null;
        }
        this.$this = (ReactComponent<P, S>) $this;
        return previous;
    }

    /**
     * @return
     */
    public ReactClass getReactClass() {
        // Lazily set reactClass.
        if (reactClass == null) {
            reactClass = React.createClass(this);
        }
        return reactClass;
    }

    /*
     * Factory Methods
     */
    public ReactElement createElement() {
        return React.createElement(getReactClass(), Jso.create());
    }

    /**
     * @param key
     * @return
     */
    public ReactElement createElement(String key) {
        return React.createElement(getReactClass(), createPropsWithKey(key));
    }

    /**
     * @param children
     * @return
     */
    public ReactElement createElement(Object... children) {
        return React.createElement(getReactClass(), Jso.create(), children);
    }

    /**
     * @param key
     * @param children
     * @return
     */
    public ReactElement createElement(String key, Object... children) {
        return React.createElement(getReactClass(), createPropsWithKey(key), children);
    }

    /**
     * @param props
     * @return
     */
    public ReactElement createElement(P props) {
        if (props == null) {
            props = Jso.create();
        } else {
            bindProps(props);
        }
        return React.createElement(getReactClass(), props);
    }

    /**
     * @param propsCallback
     * @return
     */
    public ReactElement createElement(Func.Run1<P> propsCallback) {
        final P props = getDefaultProps();
        if (propsCallback != null) {
            bind(propsCallback).run(props);
        }
        bindProps(props);
        return React.createElement(getReactClass(), props);
    }

    /**
     * @param propsCallback
     * @param children
     * @return
     */
    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        final P props = getDefaultProps();
        if (propsCallback != null) {
            bind(propsCallback).run(props);
        }
        bindProps(props);
        return React.createElement(getReactClass(), props, children);
    }

    /**
     * @param callback
     * @return
     */
    public ReactElement createElement(Func.Run2<P, Children> callback) {
        final P props = getDefaultProps();
        final Children children = new Children();
        if (callback != null) {
            bind(callback).run(props, children);
        }
        bindProps(props);
        return React.createElement(getReactClass(), props, children.toArray());
    }

    /**
     * @param key
     * @return
     */
    public P createPropsWithKey(String key) {
        final P props = getDefaultProps();
        if (key != null) {
            Jso.set(props, "key", key);
        }
        return props;
    }

    /**
     * @return
     */
    public StyleProps css() {
        return new StyleProps();
    }

    /**
     * @return
     */
    public P props() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
//        Jso.set(props, "__s", this);
        return props;
    }

    /**
     * @return
     */
    public P $$() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    /**
     * @return
     */
    public P builder() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    /**
     * @return
     */
    public ReactElement $() {
        return createElement();
    }

    /**
     * @param key
     * @return
     */
    public ReactElement $(String key) {
        return createElement(key);
    }

    /**
     * @param children
     * @return
     */
    public ReactElement $(Object... children) {
        return createElement(children);
    }

    /**
     * @param key
     * @param children
     * @return
     */
    public ReactElement $(String key, Object... children) {
        return createElement(key, children);
    }

    /**
     * @param props
     * @return
     */
    public ReactElement $(P props) {
        return createElement(props);
    }

    /**
     * @param propsCallback
     * @return
     */
    public ReactElement $(Func.Run1<P> propsCallback) {
        return createElement(propsCallback);
    }

    /**
     * @param propsCallback
     * @param children
     * @return
     */
    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        return createElement(propsCallback, children);
    }

    /**
     * @param callback
     * @return
     */
    public ReactElement $(Func.Run2<P, Children> callback) {
        return createElement(callback);
    }

    /**
     * @param $this
     */
    private void componentWillMountInternal(final ReactComponent<P, S> $this) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            if ($this.bus != null) {
                Try.run(() -> $this.bus.clear());
            } else {
                $this.bus = new BusDelegate(bus);
                $this.spec = this;
            }
            componentWillMount();
        } finally {
            set$This(old);
        }
    }

    /**
     * @param $this
     */
    private void componentDidMountInternal(final ReactComponent<P, S> $this) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            try {
                componentDidMount();
            } finally {
                try {
                    intakeProps($this, $this.props);
                } finally {
                    $this.ignoreNextIntakePropsCall = true;
                }
            }
        } finally {
            set$This(old);
        }
    }

    /**
     * @param $this
     * @param nextProps
     */
    private void componentWillReceivePropsInternal(final ReactComponent<P, S> $this, P nextProps) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            componentWillReceiveProps(nextProps);
        } finally {
            try {
                if ($this.ignoreNextIntakePropsCall) {
                    $this.ignoreNextIntakePropsCall = false;
                } else {
                    intakeProps($this, nextProps);
                }
            } finally {
                set$This(old);
            }
        }
    }

    /**
     * @param $this
     * @param nextProps
     * @param nextState
     * @return
     */
    private boolean shouldComponentUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            return shouldComponentUpdate(nextProps, nextState);
        } finally {
            set$This(old);
        }
    }

    /**
     * @param $this
     * @param nextProps
     * @param nextState
     */
    private void componentWillUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            componentWillUpdate(nextProps, nextState);
        } finally {
            set$This(old);
            $this.ignoreNextIntakePropsCall = false;
        }
    }

    /**
     * @param $this
     * @return
     */
    private ReactElement renderInternal(final ReactComponent<P, S> $this) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            return render();
        } finally {
            set$This(old);
        }
    }

    /**
     * @param $this
     * @param prevProps
     * @param prevState
     */
    private void componentDidUpdateInternal(final ReactComponent<P, S> $this, P prevProps, S prevState) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            componentDidUpdate(prevProps, prevState);
        } finally {
            set$This(old);
        }
    }

    /**
     * @param $this
     */
    private void componentWillUnmountInternal(final ReactComponent<P, S> $this) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            try {
                $this.eventRegistrationCleanup();
            } finally {
                componentWillUnmount();
            }
        } finally {
            set$This(old);
        }
    }

    /**
     * @param $this
     * @return
     */
    private P getDefaultPropsInternal(Object $this) {
        return getDefaultProps();
    }

    /**
     * @return
     */
    public P getDefaultProps() {
        return Jso.create();
    }

    /**
     * @param $this
     * @return
     */
    private S getInitialStateInternal(Object $this) {
        return getInitialState();
    }

    /**
     * @return
     */
    public S getInitialState() {
        return Jso.create();
    }

    /**
     *
     */
    protected void componentWillMount() {
        componentWillMount($this);
    }

    @Deprecated
    protected void componentWillMount(final ReactComponent<P, S> $this) {
    }

    /**
     *
     */
    protected void componentDidMount() {
        componentDidMount($this);
    }

    @Deprecated
    protected void componentDidMount(final ReactComponent<P, S> $this) {
    }

    /**
     * @param nextProps
     */
    protected void componentWillReceiveProps(P nextProps) {
        componentWillReceiveProps($this, nextProps);
    }

    @Deprecated
    protected void componentWillReceiveProps(final ReactComponent<P, S> $this, P nextProps) {
    }

    /**
     * @param nextProps
     */
    protected void intakeProps(P nextProps) {
        intakeProps($this, nextProps);
    }

    protected void intakeProps(ReactComponent<P, S> $this, P nextProps) {
    }

    /**
     * @param nextProps
     * @param nextState
     * @return
     */
    protected boolean shouldComponentUpdate(P nextProps, S nextState) {
        return shouldComponentUpdate($this, nextProps, nextState);
    }

    @Deprecated
    protected boolean shouldComponentUpdate(ReactComponent<P, S> $this, P nextProps, S nextState) {
        return propsOrStateNotEqual($this, nextProps, nextState);
    }

    @Deprecated
    protected boolean propsOrStateNotEqual(ReactComponent<P, S> $this, P nextProps, S nextState) {
        return !Lodash.isEqual($this.props, nextProps) || !Lodash.isEqual($this.state, nextState);
    }

    /**
     * @param nextProps
     * @param nextState
     */
    protected void componentWillUpdate(P nextProps, S nextState) {
        componentWillUpdate($this, nextProps, nextState);
    }

    @Deprecated
    protected void componentWillUpdate(ReactComponent<P, S> $this, P nextProps, S nextState) {
    }

    /**
     * @return
     */
    protected ReactElement render() {
        return render($this);
    }

    @Deprecated
    protected ReactElement render(final ReactComponent<P, S> $this) {
        return null;
    }

    /**
     * @param prevProps
     * @param prevState
     */
    protected void componentDidUpdate(P prevProps, S prevState) {
        componentDidUpdate($this, prevProps, prevState);
    }

    @Deprecated
    protected void componentDidUpdate(final ReactComponent<P, S> $this, P prevProps, S prevState) {
    }

    /**
     *
     */
    protected void componentWillUnmount() {
        componentWillUnmount($this);
    }

    @Deprecated
    protected void componentWillUnmount(final ReactComponent<P, S> $this) {
    }


    protected native Object getChildContext() /*-{
        return {};
    }-*/;


    protected void addContextTypes(ContextTypes contextTypes) {
    }


    protected void addChildContextTypes(ContextTypes contextTypes) {
    }

    /**
     * @param elements
     * @return
     */

    protected ReactElement[] array(ReactElement... elements) {
        return elements;
    }

    /**
     * @param elements
     * @return
     */

    protected String[] array(String... elements) {
        return elements;
    }

    /**
     * @param elements
     * @return
     */

    protected ReactElement[] array(List<ReactElement> elements) {
        if (elements == null) {
            return null;
        }

        return elements.toArray(new ReactElement[elements.size()]);
    }

    /**
     * @param event
     * @return
     */
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

    protected HTMLProps style(StyleProps style) {
        final HTMLProps props = new HTMLProps();
        return props.style(style);
    }

    /**
     * @param className
     * @return
     */

    protected HTMLProps className(String className) {
        final HTMLProps props = new HTMLProps();
        return props.className(className);
    }

    /**
     * @param key
     * @return
     */

    protected HTMLProps key(String key) {
        final HTMLProps props = new HTMLProps();
        return props.key(key);
    }

    /**
     * @param ref
     * @param <T>
     * @return
     */

    protected <T> HTMLProps ref(Ref<T> ref) {
        final HTMLProps props = new HTMLProps();
        return props.ref(ref);
    }

    /**
     * @return
     */

    protected StyleProps style() {
        return new StyleProps();
    }

    /**
     * Event subscribe / publish
     */
    private void eventRegistrationCleanup() {
        if ($this != null) {
            $this.eventRegistrationCleanup();
        }
    }

    /**
     * @param <T>
     * @return
     */
    protected <T> T refs() {
        return $this.refs();
    }

    /**
     * @param state
     */
    protected void setState(S state) {
        $this.setState(state);
    }

    /**
     * @param stateCallback
     */
    protected void setState(Func.Run1<S> stateCallback) {
        setState(stateCallback, null);
    }

    /**
     * @param state
     * @param callback
     */
    protected void setState(S state, Func.Run callback) {
        $this.setState(state, callback);
    }

    /**
     * @param stateCallback
     * @param callback
     */
    protected void setState(Func.Run1<S> stateCallback, Func.Run callback) {
        final S state = Jso.create();
        if (stateCallback != null) {
            Component.bind(stateCallback).run(state);
        }
        if (callback != null) {
            setState(state, bind(callback));
        } else {
            setState(state);
        }
    }

    /**
     * @param state
     */
    protected void replaceState(S state) {
        $this.replaceState(state);
    }

    /**
     * @param state
     * @param callback
     */
    protected void replaceState(S state, Func.Run callback) {
        React.replaceState($this, state, bind(callback));
    }

    /**
     * @param stateCallback
     */
    protected void replaceState(Func.Run1<S> stateCallback) {
        replaceState(stateCallback, null);
    }

    /**
     * @param stateCallback
     * @param callback
     */
    protected void replaceState(Func.Run1<S> stateCallback, Func.Run callback) {
        final S state = Jso.create();
        if (stateCallback != null) {
            bind(stateCallback).run(state);
        }

        if (callback != null) {
            replaceState(state, bind(callback));
        } else {
            replaceState(state);
        }
    }

    /**
     *
     */
    protected void forceUpdate() {
        $this.forceUpdate();
    }

    /**
     * @param callback
     */
    protected void forceUpdate(Func.Run callback) {
        $this.forceUpdate(bind(callback));
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @return
     */
    protected <T> HandlerRegistration subscribe(Class<T> eventClass, EventCallback<T> callback) {
        if (busDelegate != null) {
            return busDelegate.subscribe(eventClass, callback);
        } else {
            return bus.subscribe(eventClass, callback);
        }
    }

    /**
     * @param named
     * @param callback
     * @param <T>
     * @return
     */
    protected <T> HandlerRegistration subscribe(Bus.TypeName<T> named, EventCallback<T> callback) {
        if (busDelegate != null) {
            return busDelegate.subscribe(named, callback);
        } else {
            return bus.subscribe(named, callback);
        }
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @param <M>
     * @return
     */
    protected <T extends MessageProvider<M>, M> HandlerRegistration listen(Class<T> eventClass, EventCallback<M> callback) {
        if (busDelegate != null) {
            return busDelegate.listen(eventClass, callback);
        } else {
            return bus.listen(eventClass, callback);
        }
    }

    /**
     * @param name
     * @param callback
     * @param <T>
     * @return
     */
    public final <T> HandlerRegistration subscribe(String name, EventCallback<T> callback) {
        if (busDelegate != null) {
            return busDelegate.subscribe(name, callback);
        } else {
            return bus.subscribe(name, callback);
        }
    }

    /**
     * @param registration
     * @return
     */
    protected HandlerRegistration register(HandlerRegistration registration) {
        if (busDelegate != null) {
            return busDelegate.register(registration);
        }
        return registration;
    }

    /**
     * @param event
     * @param <T>
     */
    protected <T> void publish(T event) {
        if (busDelegate != null) {
            busDelegate.publish(event);
        } else {
            bus.publish(event);
        }
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    protected <T> void publish(Bus.TypeName<T> name, T event) {
        if (busDelegate != null) {
            busDelegate.publish(name, event);
        } else {
            bus.publish(name, event);
        }
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    protected <T> void publish(String name, T event) {
        if (busDelegate != null) {
            busDelegate.publish(name, event);
        } else {
            bus.publish(name, event);
        }
    }

    /**
     * @param action
     * @param <H>
     * @param <IN>
     * @param <OUT>
     * @return
     */
    protected <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> dispatch(Provider<H> action) {
        return ActionCall.create(busDelegate, action);
    }

    /**
     * @param action
     * @param <H>
     * @param <IN>
     * @param <OUT>
     * @return
     */
    protected <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> ask(Provider<H> action) {
        return ActionCall.create(busDelegate, action);
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
