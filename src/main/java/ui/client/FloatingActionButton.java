package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FloatingActionButton extends ExternalComponent<FloatingActionButton.Props> {

    @Inject
    public FloatingActionButton() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.FloatingActionButton;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getBackgroundColor();

        @JsProperty
        void setBackgroundColor(String backgroundColor);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getDisabledColor();

        @JsProperty
        void setDisabledColor(String disabledColor);

        @JsProperty
        String getHref();

        @JsProperty
        void setHref(String href);

        @JsProperty
        String getIconClassName();

        @JsProperty
        void setIconClassName(String iconClassName);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        boolean isLinkButton();

        @JsProperty
        void setLinkButton(boolean linkButton);

        @JsProperty
        boolean isMini();

        @JsProperty
        void setMini(boolean mini);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);

        @JsProperty
        MouseEventHandler getOnMouseDown();

        @JsProperty
        void setOnMouseDown(MouseEventHandler onMouseDown);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @JsProperty
        MouseEventHandler getOnMouseUp();

        @JsProperty
        void setOnMouseUp(MouseEventHandler onMouseUp);

        @JsProperty
        TouchEventHandler getOnTouchEnd();

        @JsProperty
        void setOnTouchEnd(TouchEventHandler onTouchEnd);

        @JsProperty
        TouchEventHandler getOnTouchStart();

        @JsProperty
        void setOnTouchStart(TouchEventHandler onTouchStart);

        @JsProperty
        boolean isSecondary();

        @JsProperty
        void setSecondary(boolean secondary);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props backgroundColor(final String backgroundColor) {
            setBackgroundColor(backgroundColor);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props disabledColor(final String disabledColor) {
            setDisabledColor(disabledColor);
            return this;
        }

        @JsOverlay
        default Props href(final String href) {
            setHref(href);
            return this;
        }

        @JsOverlay
        default Props iconClassName(final String iconClassName) {
            setIconClassName(iconClassName);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final StyleProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props linkButton(final boolean linkButton) {
            setLinkButton(linkButton);
            return this;
        }

        @JsOverlay
        default Props mini(final boolean mini) {
            setMini(mini);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

        @JsOverlay
        default Props onMouseDown(final MouseEventHandler onMouseDown) {
            setOnMouseDown(onMouseDown);
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
        default Props onMouseUp(final MouseEventHandler onMouseUp) {
            setOnMouseUp(onMouseUp);
            return this;
        }

        @JsOverlay
        default Props onTouchEnd(final TouchEventHandler onTouchEnd) {
            setOnTouchEnd(onTouchEnd);
            return this;
        }

        @JsOverlay
        default Props onTouchStart(final TouchEventHandler onTouchStart) {
            setOnTouchStart(onTouchStart);
            return this;
        }

        @JsOverlay
        default Props secondary(final boolean secondary) {
            setSecondary(secondary);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }
    }
}
