package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FontIcon extends ExternalComponent<FontIcon.Props> {

    @Inject
    public FontIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.FontIcon;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className; // used to enter icon className, probably will work with our current icon enums
//        String color;
//        String hoverColor;
//        StyleProps style; // ?
//        MouseEventHandler onMouseEnter; // func
//        MouseEventHandler onMouseLeave; // func
//        MouseEventHandler onClick; // func - added in


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        String getHoverColor();

        @JsProperty
        void setHoverColor(String hoverColor);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props color(final String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props hoverColor(final String hoverColor) {
            setHoverColor(hoverColor);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onMouseEnter(final MouseEventHandler onMouseEnter) {
            setOnMouseEnter(onMouseEnter);
            return this;
        }

        @JsOverlay
        default Props onMouseLeave(final MouseEventHandler onMouseLeave) {
            setOnMouseLeave(onMouseLeave);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
