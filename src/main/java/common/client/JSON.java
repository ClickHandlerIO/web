package common.client;

/**
 *
 */
public class JSON {
    public static native <T> T parse(String json, T into) /*-{
        Object.assign(into, $wnd.JSON.parse(json));
        return into;
    }-*/;

    public static native <T> T parse(String json) /*-{
        return $wnd.JSON.parse(json);
    }-*/;

    public static native <T> String stringify(T object) /*-{
        return $wnd.JSON.stringify(object);
    }-*/;
}
