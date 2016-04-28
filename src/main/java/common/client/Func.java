package common.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
public class Func {
    public static native <R, A1> Call<R> bind(Call1<R, A1> proxy) /*-{
        return function () {
            return proxy(this);
        };
    }-*/;

    public static native <R, T, A1> Call1<R, A1> bind(Call2<R, T, A1> proxy) /*-{
        return function () {
            return proxy(this, arguments[0]);
        };
    }-*/;

    public static native <R, T, A1, A2> Call2<R, A1, A2> bind(Call3<R, T, A1, A2> proxy) /*-{
        return function () {
            return proxy(this, arguments[0], arguments[1]);
        };
    }-*/;

    public static native <R, T, A1, A2, A3> Call3<R, A1, A2, A3> bind(Call4<R, T, A1, A2, A3> proxy) /*-{
        return function () {
            return proxy(this, arguments[0], arguments[1], arguments[2]);
        };
    }-*/;

    public static native <T> Run bind(Run1<T> proxy) /*-{
        return function () {
            proxy(this);
        };
    }-*/;

    public static native <T, A1> Run1<A1> bind(Run2<T, A1> proxy) /*-{
        return function () {
            proxy(this, arguments[0]);
        };
    }-*/;

    public static native <T, A1, A2> Run2<A1, A2> bind(Run3<T, A1, A2> proxy) /*-{
        return function () {
            proxy(this, arguments[0], arguments[1]);
        };
    }-*/;

    /**
     *
     */
    @JsFunction
    public interface Call<T> {
        T call();
    }

    /**
     *
     */
    @JsFunction
    public interface Call1<T, A1> {
        T call(A1 value);
    }

    /**
     *
     */
    @JsFunction
    public interface Call2<T, A1, A2> {
        T call(A1 a1, A2 a2);
    }

    /**
     *
     */
    @JsFunction
    public interface Call3<T, A1, A2, A3> {
        T call(A1 arg1, A2 arg2, A3 arg3);
    }

    /**
     *
     */
    @JsFunction
    public interface Call4<T, A1, A2, A3, A4> {
        T call(A1 arg1, A2 arg2, A3 arg3, A4 arg4);
    }

    /**
     *
     */
    @JsFunction
    public interface Run {
        void run();
    }

    /**
     *
     */
    @JsFunction
    public interface Run1<A1> {
        void run(A1 value);
    }

    /**
     *
     */
    @JsFunction
    public interface Run2<A1, A2> {
        void run(A1 arg1, A2 arg2);
    }

    /**
     *
     */
    @JsFunction
    public interface Run3<A1, A2, A3> {
        void run(A1 arg1, A2 arg2, A3 arg3);
    }

    /**
     *
     */
    @JsFunction
    public interface Run4<A1, A2, A3, A4> {
        void run(A1 arg1, A2 arg2, A3 arg3, A4 arg4);
    }
}
