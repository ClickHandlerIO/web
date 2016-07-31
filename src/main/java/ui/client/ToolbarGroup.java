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
public class ToolbarGroup extends ExternalComponent<ToolbarGroup.Props> {

    @Inject
    public ToolbarGroup() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.ToolbarGroup;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        boolean firstChild; // for first child left gap
//        // invalid Variable name 'float' changed below
//        String floatGroup; // enum 'left' 'right'
//        boolean lastChild; // for last child right gap
//        StyleProps style;
//        // not sure we want on onClick for the whole group


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isFirstChild();

        @JsProperty
        void setFirstChild(boolean firstChild);

        @JsProperty
        String getFloatGroup();

        @JsProperty
        void setFloatGroup(String floatGroup);

        @JsProperty
        boolean isLastChild();

        @JsProperty
        void setLastChild(boolean lastChild);

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
        default Props firstChild(final boolean firstChild) {
            setFirstChild(firstChild);
            return this;
        }

        @JsOverlay
        default Props floatGroup(final String floatGroup) {
            setFloatGroup(floatGroup);
            return this;
        }

        @JsOverlay
        default Props lastChild(final boolean lastChild) {
            setLastChild(lastChild);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }


    }
}
