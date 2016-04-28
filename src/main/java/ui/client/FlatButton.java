package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FlatButton extends ExternalComponent<FlatButton.Props> {

    @Inject
    public FlatButton() {
    }

    @Override
    protected native ReactClass<FlatButton.Props> getReactClass() /*-{
        return $wnd.MaterialUi.FlatButton;
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
        String getHoverColor();

        @JsProperty
        void setHoverColor(String hoverColor);

        @JsProperty
        String getHref();

        @JsProperty
        void setHref(String href);

        @JsProperty
        ReactElement getIcon();

        @JsProperty
        void setIcon(ReactElement icon);

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        StyleProps getLabelStyle();

        @JsProperty
        void setLabelStyle(StyleProps labelStyle);

        @JsProperty
        boolean isLinkButton();

        @JsProperty
        void setLinkButton(boolean linkButton);

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
        boolean isKeyboardFocused();

        @JsProperty
        void setKeyboardFocused(boolean keyboardFocused);

        @JsProperty
        boolean isFocused();

        @JsProperty
        void setFocused(boolean focused);

        @JsProperty
        TouchEventHandler getOnTouchStart();

        @JsProperty
        void setOnTouchStart(TouchEventHandler onTouchStart);

        @JsProperty
        boolean isPrimary();

        @JsProperty
        void setPrimary(boolean primary);

        @JsProperty
        String getRippleColor();

        @JsProperty
        void setRippleColor(String rippleColor);

        @JsProperty
        boolean isSecondary();

        @JsProperty
        void setSecondary(boolean secondary);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

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
        default Props backgroundColor(String backgroundColor) {
            setBackgroundColor(backgroundColor);
            return this;
        }

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props hoverColor(String hoverColor) {
            setHoverColor(hoverColor);
            return this;
        }

        @JsOverlay
        default Props href(String href) {
            setHref(href);
            return this;
        }

        @JsOverlay
        default Props icon(ReactElement icon) {
            setIcon(icon);
            return this;
        }

        @JsOverlay
        default Props label(String label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props labelPosition(String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(StyleProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props linkButton(boolean linkButton) {
            setLinkButton(linkButton);
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
        default Props keyboardFocused(boolean keyboardFocused) {
            setKeyboardFocused(keyboardFocused);
            return this;
        }

        @JsOverlay
        default Props focused(boolean focused) {
            setFocused(focused);
            return this;
        }

        @JsOverlay
        default Props touchStart(TouchEventHandler onTouchStart) {
            setOnTouchStart(onTouchStart);
            return this;
        }

        @JsOverlay
        default Props primary(boolean primary) {
            setPrimary(primary);
            return this;
        }

        @JsOverlay
        default Props rippleColor(String rippleColor) {
            setRippleColor(rippleColor);
            return this;
        }

        @JsOverlay
        default Props secondary(boolean secondary) {
            setSecondary(secondary);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }
    }
}
