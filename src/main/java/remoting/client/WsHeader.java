package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Wasabi Envelope
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class WsHeader {
    public double m;
    public double i;
    public double c;
    public String t;

    @JsOverlay
    public final double method() {
        return this.m;
    }

    @JsOverlay
    public final double id() {
        return this.i;
    }

    @JsOverlay
    public final double code() {
        return this.c;
    }

    @JsOverlay
    public final String type() {
        return this.t;
    }

    @JsOverlay
    public final WsHeader method(final double method) {
        this.m = method;
        return this;
    }

    @JsOverlay
    public final WsHeader id(final double id) {
        this.i = id;
        return this;
    }

    @JsOverlay
    public final WsHeader code(final double code) {
        this.c = code;
        return this;
    }

    @JsOverlay
    public final WsHeader type(final String type) {
        this.t = type;
        return this;
    }

    public static class Factory {
        public static WsHeader create(double method, double id, double code, String type) {
            return new WsHeader()
                .method(method)
                .id(id)
                .code(code)
                .type(type);
        }
    }

    public static class Constants {
        // Direction
        public static final int OUT = 0;
        public static final int IN = 1;
        public static final int SUB = 2;
        public static final int USUB = 3;
        public static final int PUSH = 4;
    }
}

