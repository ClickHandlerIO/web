package react.client;

import action.client.AbstractAction;
import action.client.ActionCall;
import com.google.web.bindery.event.shared.HandlerRegistration;
import common.client.*;
import jsinterop.annotations.*;

import javax.inject.Provider;

/**
 *
 * @param <P>
 * @param <S>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ReactComponent<P, S> {
    @JsProperty
    public BusDelegate bus;
    @JsProperty
    public P props;
    @JsProperty
    public S state;
    @JsProperty
    public boolean ignoreNextIntakePropsCall;

    private ReactComponent() {}

    @JsOverlay
    public final BusDelegate getBus() {
        return bus;
    }

    /**
     * @return
     */
    @JsOverlay
    public final P getProps() {
        return props;
    }

    @JsOverlay
    public final P props() {
        return getProps();
    }

    /**
     * @return
     */
    @JsOverlay
    public final S getState() {
        return state;
    }

    /**
     * @param stateCallback
     */
    @JsOverlay
    public final void setState(Func.Run1<S> stateCallback) {
        setState(stateCallback, null);
    }

    /**
     * @param state
     */
    @JsMethod
    public final native void setState(S state);

    @JsOverlay
    public final S state() {
        return state;
    }

    /**
     * @param name
     * @param <T>
     * @return
     */
    @JsOverlay
    public final <T> T getProperty(String name) {
        return Jso.get(this, name);
    }

    /**
     * @param state
     * @param callback
     */
    @JsMethod
    public final native void setState(S state, Func.Run callback);

    /**
     * @param stateCallback
     * @param callback
     */
    @JsOverlay
    public final void setState(Func.Run1<S> stateCallback, Func.Run callback) {
        final S state = Jso.create();
        if (stateCallback != null) {
            stateCallback.run(state);
        }
        if (callback != null) {
            setState(state, callback);
        } else {
            setState(state);
        }
    }

    /**
     * @param state
     */
    @JsMethod
    public final native void replaceState(S state);

    /**
     * @param state
     * @param callback
     */
    @JsMethod
    public final native void replaceState(S state, Func.Run callback);

    /**
     * @param stateCallback
     */
    @JsOverlay
    public final void replaceState(Func.Run1<S> stateCallback) {
        replaceState(stateCallback, null);
    }

    /**
     * @param stateCallback
     * @param callback
     */
    @JsOverlay
    public final void replaceState(Func.Run1<S> stateCallback, Func.Run callback) {
        final S state = Jso.create();
        if (stateCallback != null) {
            stateCallback.run(state);
        }

        if (callback != null) {
            replaceState(state, callback);
        } else {
            replaceState(state);
        }
    }

    /**
     *
     */
    @JsMethod
    public final native void forceUpdate();

    /**
     * @param callback
     */
    @JsMethod
    public final native void forceUpdate(Func.Run callback);

    /**
     * Ref
     */
//    // todo use this at all?
//    @JsOverlay
//    public final <T> T ref(Ref<T> ref) {
//        return ref.get(this);
//    }
//
//    // todo use this at all?
//    @JsOverlay
//    public final <T> void setRef(Ref<T> ref, T value) {
//        ref.set(this, value);
//    }

    /**
     * Event subscribe / publish
     */
    @JsOverlay
    public final void eventRegistrationCleanup() {
        if (bus != null) {
            bus.clear();
        }
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @return
     */
    @JsOverlay
    public final <T> HandlerRegistration subscribe(Class<T> eventClass, EventCallback<T> callback) {
        return bus.subscribe(eventClass, callback);
    }

    /**
     * @param named
     * @param callback
     * @param <T>
     * @return
     */
    @JsOverlay
    public final <T> HandlerRegistration subscribe(Bus.TypeName<T> named, EventCallback<T> callback) {
        return bus.subscribe(named, callback);
    }

    /**
     *
     * @param eventClass
     * @param callback
     * @param <T>
     * @param <M>
     * @return
     */
    @JsOverlay
    public final <T extends MessageProvider<M>, M> HandlerRegistration listen(Class<T> eventClass, EventCallback<M> callback) {
        return bus.listen(eventClass, callback);
    }

    /**
     * @param name
     * @param callback
     * @param <T>
     * @return
     */
    @JsOverlay
    public final <T> HandlerRegistration subscribe(String name, EventCallback<T> callback) {
        return bus.subscribe(name, callback);
    }

    /**
     * @param registration
     * @return
     */
    @JsOverlay
    public final HandlerRegistration register(HandlerRegistration registration) {
        return bus.register(registration);
    }

    /**
     * @param event
     * @param <T>
     */
    @JsOverlay
    public final <T> void publish(T event) {
        bus.publish(event);
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    @JsOverlay
    public final <T> void publish(Bus.TypeName<T> name, T event) {
        bus.publish(name, event);
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    @JsOverlay
    public final <T> void publish(String name, T event) {
        bus.publish(name, event);
    }

    /**
     * @param action
     * @param <H>
     * @param <IN>
     * @param <OUT>
     * @return
     */
    @JsOverlay
    public final <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> dispatch(Provider<H> action) {
        return ActionCall.create(bus, action);
    }

    /**
     * @param action
     * @param <H>
     * @param <IN>
     * @param <OUT>
     * @return
     */
    @JsOverlay
    public final <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> ask(Provider<H> action) {
        return ActionCall.create(bus, action);
    }
}
