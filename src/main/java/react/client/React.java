package react.client;

import jsinterop.annotations.JsMethod;

/**
 * TODO clean up JsInterop
 */
public class React {
    public static final String BUS = "$bus$";

    /**
     * @param object
     * @return
     */
    @JsMethod(namespace = "React", name = "createClass")
    public static native <T> ReactClass<T> createClass(Object object);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props, String text);

    @JsMethod(namespace = "React", name = "createElement")
    public static native ReactElement createElement(Object component, Object props, Object... children);

//    {
//        if (children == null) {
//            return React.createElement(component, props);
//        }
//        switch (children.length) {
//            case 0:
//                return React.createElement(component, props);
//            case 1:
//                return React.createElement(component, props, children[0]);
//            default:
//                return React.createElement(component, props, children);
//        }
//    }


    public static native <T> T getProps(Object component) /*-{
        return component && component.props ? component.props : {};
    }-*/;

    public static native <T> T getState(Object component) /*-{
        return component && component.state ? component.state : {};
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
