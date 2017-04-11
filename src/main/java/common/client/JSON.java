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

    public static native <T> String stringify(T object, int spaces) /*-{
        return $wnd.JSON.stringify(object, undefined, spaces);
    }-*/;

    public static native <T> String pretty(T object) /*-{
        return $wnd.JSON.stringify(object, undefined, 2);
    }-*/;
}