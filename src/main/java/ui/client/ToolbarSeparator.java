package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;
import react.client.StyleProps;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * vertical bar used to separate groups of components
 */
@Singleton
public class ToolbarSeparator extends ExternalComponent<ToolbarSeparator.Props> {

    @Inject
    public ToolbarSeparator() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.ToolbarSeparator;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        StyleProps style;
//        // no onClick here either


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }


    }
}
