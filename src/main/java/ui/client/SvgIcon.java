package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SvgIcon extends ExternalComponent<SvgIcon.Props> {

    @Inject
    public SvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.SvgIcon;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        String getHoverColor();

        @JsProperty
        void setHoverColor(String hoverColor);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getViewBox();

        @JsProperty
        void setViewBox(String viewBox);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler viewBox);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props color(String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props hoverColor(String hoverColor) {
            setHoverColor(hoverColor);
            return this;
        }

        @JsOverlay
        default Props onMouseEnter(MouseEventHandler onMouseEnter) {
            setOnMouseEnter(onMouseEnter);
            return this;
        }

        @JsOverlay
        default Props onMouseLeave(MouseEventHandler onMouseLeave) {
            setOnMouseLeave(onMouseLeave);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props viewBox(String viewBox) {
            setViewBox(viewBox);
            return this;
        }

        @JsOverlay
        default Props onClick(MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
