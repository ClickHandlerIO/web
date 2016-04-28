package logging.client;

public class Loggly {

    public static void push(String logLevel, String message, Object... data) {
        pushNative(logLevel, message, data);
    }

    private static native void pushNative(String logLevel, String message, Object... data) /*-{
        _LTracker.push({
            logLevel: logLevel,
            message: message,
            data: data
        });
    }-*/;
}