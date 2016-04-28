package remoting.client;

import jsinterop.annotations.JsProperty;

/**
 * Provides insight into the capability of the other side of the wire.
 */
public class WsCapability {
    @JsProperty(name = "encodings")
    private int[] encodings;
    @JsProperty(name = "formats")
    private int[] formats;

    public WsCapability() {
    }

    public WsCapability(int[] encodings, int[] formats) {
        this.encodings = encodings;
        this.formats = formats;
    }

    @JsProperty(name = "encodings")
    public int[] getEncodings() {
        return encodings;
    }

    @JsProperty(name = "encodings")
    public void setEncodings(int[] encodings) {
        this.encodings = encodings;
    }

    @JsProperty(name = "formats")
    public int[] getFormats() {
        return formats;
    }

    @JsProperty(name = "formats")
    public void setFormats(int[] formats) {
        this.formats = formats;
    }
}
