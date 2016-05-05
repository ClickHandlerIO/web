package remoting.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Wasabi Envelope
 */
@JsType(isNative = true)
public interface WsHeader {
    @JsProperty(name = "m")
    double getM();

    @JsProperty(name = "m")
    void setM(double m);

    @JsProperty(name = "i")
    double getI();

    @JsProperty(name = "i")
    void setI(double i);

    @JsProperty(name = "c")
    double getC();

    @JsProperty(name = "c")
    void setC(double c);

    @JsProperty(name = "t")
    String getT();

    @JsProperty(name = "t")
    void setT(String t);

    @JsOverlay
    default double method() {
        return this.getM();
    }

    @JsOverlay
    default double id() {
        return this.getI();
    }

    @JsOverlay
    default double code() {
        return this.getC();
    }

    @JsOverlay
    default String type() {
        return this.getT();
    }

    @JsOverlay
    default WsHeader method(final double method) {
        this.setM(method);
        return this;
    }

    @JsOverlay
    default WsHeader id(final double id) {
        this.setI(id);
        return this;
    }

    @JsOverlay
    default WsHeader code(final double code) {
        this.setC(code);
        return this;
    }

    @JsOverlay
    default WsHeader type(final String type) {
        this.setT(type);
        return this;
    }

    class Factory {
        public static native WsHeader create() /*-{
            return {};
        }-*/;

        public static native WsHeader parse(String json) /*-{
            return $wnd.JSON.parse(json);
        }-*/;

        public static WsHeader create(double method, double id, double code, String type) {
            return create()
                .method(method)
                .id(id)
                .code(code)
                .type(type);
        }
    }

    class Constants {
        // Direction
        public static final int OUT = 0;
        public static final int IN = 1;
        public static final int SUB = 2;
        public static final int USUB = 3;
        public static final int PUSH = 4;
    }
}

