package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class IconButton extends ExternalComponent<IconButton.Props> {

    @Inject
    public IconButton() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.IconButton;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getIconClassName();

        @JsProperty
        void setIconClassName(String iconClassName);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        FocusEventHandler getOnBlur();

        @JsProperty
        void setOnBlur(FocusEventHandler onBlur);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);

        @JsProperty
        KeyboardEventHandler getOnKeyboardFocus();

        @JsProperty
        void setOnKeyboardFocus(KeyboardEventHandler onKeyboardFocus);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @Deprecated
        @JsProperty
        MouseEventHandler getOnClick();

        @Deprecated
        @JsProperty
        void setOnClick(MouseEventHandler onClick);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getTooltip();

        @JsProperty
        void setTooltip(String tooltip);

        @JsProperty
        String getTooltipPosition();

        @JsProperty
        void setTooltipPosition(String tooltipPosition);

        @JsProperty
        StyleProps getTooltipStyles();

        @JsProperty
        void setTooltipStyles(StyleProps tooltipStyles);

        @JsProperty
        boolean isTouch();

        @JsProperty
        void setTouch(boolean touch);

        @JsProperty
        Func.Run getOnTouchTap();

        @JsProperty
        void setOnTouchTap(Func.Run touchTap);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props onTouchTap(Func.Run onTouchTap) {
            setOnTouchTap(onTouchTap);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props iconClassName(String iconClassName) {
            setIconClassName(iconClassName);
            return this;
        }

        @JsOverlay
        default Props iconStyle(StyleProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props onBlur(FocusEventHandler onBlur) {
            setOnBlur(onBlur);
            return this;
        }

        @JsOverlay
        default Props onFocus(FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }

        @JsOverlay
        default Props onKeyboardFocus(KeyboardEventHandler onKeyboardFocus) {
            setOnKeyboardFocus(onKeyboardFocus);
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

        @Deprecated
        @JsOverlay
        default Props onClick(MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props tooltip(String tooltip) {
            setTooltip(tooltip);
            return this;
        }

        @JsOverlay
        default Props tooltipPosition(String tooltipPosition) {
            setTooltipPosition(tooltipPosition);
            return this;
        }

        @JsOverlay
        default Props tooltipStyles(StyleProps tooltipStyles) {
            setTooltipStyles(tooltipStyles);
            return this;
        }

        @JsOverlay
        default Props touch(boolean touch) {
            setTouch(touch);
            return this;
        }
    }
}
