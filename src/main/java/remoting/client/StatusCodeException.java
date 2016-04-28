package remoting.client;

/**
 *
 */
public class StatusCodeException extends Throwable {
    public final int code;

    public StatusCodeException() {
        code = 0;
    }

    public StatusCodeException(int code) {
        this.code = code;
    }
}
