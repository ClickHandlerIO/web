package remoting.client;

/**
 *
 */
public class ResponseEvent<IN, OUT> {
    private final IN in;
    private final OUT out;

    public ResponseEvent(IN in, OUT out) {
        this.in = in;
        this.out = out;
    }

    public IN getIn() {
        return in;
    }

    public OUT getOut() {
        return out;
    }
}
