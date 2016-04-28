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
 *
 */
@Singleton
public class Toolbar extends ExternalComponent<Toolbar.Props> {

    @Inject
    public Toolbar() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Toolbar;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        StyleProps style;
//        boolean noGutter; // spacing of toolbar
        // leaving out on click in favor of components that make this up


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        boolean isNoGutter();

        @JsProperty
        void setNoGutter(boolean noGutter);


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

        @JsOverlay
        default Props noGutter(final boolean noGutter) {
            setNoGutter(noGutter);
            return this;
        }


    }
}
