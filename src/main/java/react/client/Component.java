package react.client;

import action.client.*;
import com.google.gwt.dom.client.InputElement;
import com.google.web.bindery.event.shared.HandlerRegistration;
import common.client.*;
import elemental.client.Browser;
import elemental.dom.Document;
import elemental.html.Console;
import elemental.html.Window;
import jsinterop.annotations.*;
import logging.client.Logger;
import react.client.router.RouteHook;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.ArrayDeque;
import java.util.List;

public abstract class Component<P, S> implements Jso {
    private static ReactComponent<?, ?> CURRENT = null;

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
    /*
     * Context
     */
    @JsProperty
    public Func.Call getChildContext = this::getChildContext;
    @JsProperty
    public ContextTypes contextTypes = new ContextTypes();
    @JsProperty
    public ContextTypes childContextTypes = new ContextTypes();
    protected ReactComponent<P, S> $this;
    @Inject
    protected Bus bus;
    protected P props;
    protected S state;
    protected Object refs;
    protected BusDelegate busDelegate;
    @JsProperty
    public Func.Run2<P, S> componentDidUpdate = Func.bind(this::componentDidUpdateInternal);
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
    public Func.Run componentWillUnmount = Func.bind(this::componentWillUnmountInternal);
    @JsProperty
    public Func.Run componentWillMount = Func.bind(this::componentWillMountInternal);

    private ReactClass reactClass;
    private Logger logger;

    public Component() {
        displayName = getClass().getSimpleName();
        // todo context stuff needed?
        addContextTypes(contextTypes);
        addChildContextTypes(childContextTypes);
    }

    public static Func.Run bind(Func.Run run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return () -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.run();
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static <A1> Func.Run1<A1> bind(Func.Run1<A1> run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.run(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static <A1, A2> Func.Run2<A1, A2> bind(Func.Run2<A1, A2> run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1, a2) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.run(a1, a2);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static <RETURN, A1> Func.Call1<RETURN, A1> bind(Func.Call1<RETURN, A1> run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                return run.call(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static RouteHook bind(RouteHook run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                return run.call(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static <A1> RequestCallback<A1> bind(RequestCallback<A1> run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.run(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static <A1> ResponseCallback<A1> bind(ResponseCallback<A1> run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.call(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static ErrorCallback bind(ErrorCallback run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.run(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static AlwaysCallback bind(AlwaysCallback run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.run(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static MouseEventHandler bind(MouseEventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static FocusEventHandler bind(FocusEventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static FormEventHandler bind(FormEventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static KeyboardEventHandler bind(KeyboardEventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static TouchEventHandler bind(TouchEventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static ValueChangeHandler bind(ValueChangeHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.call(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static WheelEventHandler bind(WheelEventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    public static EventHandler bind(EventHandler run) {
        if (run == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        return (a1) -> {
            final ReactComponent<?, ?> old = _$this.spec.set$This(_$this);
            try {
                run.handle(a1);
            } finally {
                _$this.spec.set$This(old);
            }
        };
    }

    private static Object bind0(Object func) {
        if (func == null) {
            return null;
        }
        final ReactComponent<?, ?> _$this = CURRENT;

        Func.Call before = () -> _$this.spec.set$This(_$this);
        Func.Run1<ReactComponent<?, ?>> after = (a1) -> _$this.spec.set$This(a1);

        return Func.invoke(before, func, after);
    }

    public static ReactComponent<?, ?> get() {
        return CURRENT;
    }

    public static void main(String[] args) {
        final ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("ONE");
        deque.add("TWO");

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
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

    public static void bind(ComponentProps props) {
        Jso.iterate(props, (name, value) -> {
            if (Jso.isFunction(value)) {
//                Browser.getWindow().getConsole().log(props.getClass().getName() + "." + name + " bound");
                Jso.set(props, name, bind0(value));
            }
        });
    }

    public static void bind(BaseProps props) {
        Jso.iterate(props, (name, value) -> {
            if (Jso.isFunction(value)) {
//                Browser.getWindow().getConsole().log(props.getClass().getName() + "." + name + " bound");
                Jso.set(props, name, bind0(value));
            }
        });
    }

    private static void bind(Object props) {
        Jso.iterate(props, (name, value) -> {
            if (Jso.isFunction(value)) {
//                Browser.getWindow().getConsole().log(props.getClass().getName() + "." + name + " bound");
                Jso.set(props, name, bind0(value));
            }
        });
    }

    @SuppressWarnings("all")
    private ReactComponent<?, ?> set$This(ReactComponent<?, ?> $this) {
        final ReactComponent<?, ?> current = CURRENT;
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
        return current;
    }

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
    public ReactElement createElement() {
        log.trace("createElement()");
        return React.createElement(getReactClass(), Jso.create());
    }

    public ReactElement createElement(String key) {
        return React.createElement(getReactClass(), createPropsWithKey(key));
    }

    public ReactElement createElement(Object... children) {
        return React.createElement(getReactClass(), Jso.create(), children);
    }

    public ReactElement createElement(String key, Object... children) {
        return React.createElement(getReactClass(), createPropsWithKey(key), children);
    }

    public ReactElement createElement(P props) {
        if (props == null) {
            props = Jso.create();
        }
        bind(props);
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback) {
        final P props = Jso.create();
        if (propsCallback != null) {
            bind(propsCallback).run(props);
        }
        bind(props);
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        final P props = Jso.create();
        if (propsCallback != null) {
            bind(propsCallback).run(props);
        }
        bind(props);
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(Func.Run2<P, Children> callback) {
        final P props = Jso.create();
        final Children children = new Children();
        if (callback != null) {
            bind(callback).run(props, children);
        }
        bind(props);
        return React.createElement(getReactClass(), props, children.toArray());
    }

    private P createPropsWithKey(String key) {
        final P props = Jso.create();
        if (key != null) {
            Jso.set(props, "key", key);
        }
        return props;
    }

    public StyleProps css() {
        return new StyleProps();
    }

    public P props() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
//        Jso.set(props, "__s", this);
        return props;
    }

    public P $$() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
    }

    public P builder() {
        P props = getDefaultProps();
        if (props == null) {
            props = Jso.create();
        }
        Jso.set(props, "__cls", getReactClass());
        return props;
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

    // Internal pass through


    public ReactElement $(Func.Run1<P> propsCallback) {
        return createElement(propsCallback);
    }


    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        return createElement(propsCallback, children);
    }


    public ReactElement $(Func.Run2<P, Children> callback) {
        return createElement(callback);
    }


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

    private boolean shouldComponentUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            return shouldComponentUpdate(nextProps, nextState);
        } finally {
            set$This(old);
        }
    }

    private void componentWillUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            componentWillUpdate(nextProps, nextState);
        } finally {
            set$This(old);
            $this.ignoreNextIntakePropsCall = false;
        }
    }

    private ReactElement renderInternal(final ReactComponent<P, S> $this) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            return render();
        } finally {
            set$This(old);
        }
    }

    private void componentDidUpdateInternal(final ReactComponent<P, S> $this, P prevProps, S prevState) {
        final ReactComponent<?, ?> old = set$This($this);
        try {
            componentDidUpdate(prevProps, prevState);
        } finally {
            set$This(old);
        }
    }

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

    private P getDefaultPropsInternal(Object $this) {
        return getDefaultProps();
    }

    public P getDefaultProps() {
        return Jso.create();
    }

    private S getInitialStateInternal(Object $this) {
        return getInitialState();
    }

    public S getInitialState() {
        return Jso.create();
    }

    protected void componentWillMount() {
        componentWillMount($this);
    }

    @Deprecated
    protected void componentWillMount(final ReactComponent<P, S> $this) {
    }

    protected void componentDidMount() {
        componentDidMount($this);
    }

    @Deprecated
    protected void componentDidMount(final ReactComponent<P, S> $this) {
    }

    protected void componentWillReceiveProps(P nextProps) {
        componentWillReceiveProps($this, nextProps);
    }

    @Deprecated
    protected void componentWillReceiveProps(final ReactComponent<P, S> $this, P nextProps) {
    }

    protected void intakeProps(P nextProps) {
        intakeProps($this, nextProps);
    }

    protected void intakeProps(ReactComponent<P, S> $this, P nextProps) {
    }

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

    protected void componentWillUpdate(P nextProps, S nextState) {
        componentWillUpdate($this, nextProps, nextState);
    }

    @Deprecated
    protected void componentWillUpdate(ReactComponent<P, S> $this, P nextProps, S nextState) {
    }

    protected ReactElement render() {
        return render($this);
    }

    @Deprecated
    protected ReactElement render(final ReactComponent<P, S> $this) {
        return null;
    }

    protected void componentDidUpdate(P prevProps, S prevState) {
        componentDidUpdate($this, prevProps, prevState);
    }

    @Deprecated
    protected void componentDidUpdate(final ReactComponent<P, S> $this, P prevProps, S prevState) {
    }

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
