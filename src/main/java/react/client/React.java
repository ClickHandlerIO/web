package react.client;

import common.client.Func;
import jsinterop.annotations.JsMethod;

/**
 * TODO clean up JsInterop
 */
public class React {
    /**
     * @param object
     * @return
     */
    @JsMethod(namespace = "React", name = "createClass")
    public static native <T> ReactClass createClass(Object object);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props, String text);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props, Object... children);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props, ReactElement... children);

    public static native void setState(ReactComponent obj, Object state, Func.Run callback) /*-{
        obj.setState(state, callback);
    }-*/;

    public static native void replaceState(ReactComponent obj, Object state, Func.Run callback) /*-{
        obj.replaceState(state, callback);
    }-*/;

    public static class PropTypes {
        public static native Object object(boolean required) /*-{
            return required ? $wnd.React.PropTypes.object.isRequired : $wnd.React.PropTypes.object;
        }-*/;

        public static native Object string(boolean required) /*-{
            return required ? $wnd.React.PropTypes.string.isRequired : $wnd.React.PropTypes.string;
        }-*/;
    }
}
