package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class IconMenu extends ExternalComponent<IconMenu.Props> {

    @Inject
    public IconMenu() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.IconMenu;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        Origin getAnchorOrigin();

        @JsProperty
        void setAnchorOrigin(Origin anchorOrigin);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isCloseOnItemTouchTap();

        @JsProperty
        void setCloseOnItemTouchTap(boolean closeOnItemTouchTap);

        @JsProperty
        ReactElement getIconButtonElement();

        @JsProperty
        void setIconButtonElement(ReactElement iconButtonElement);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        StyleProps getMenuStyle();

        @JsProperty
        void setMenuStyle(StyleProps menuStyle);

        @JsProperty
        TouchEventHandler getOnItemTouchTap();

        @JsProperty
        void setOnItemTouchTap(TouchEventHandler onItemTouchTap);

        @JsProperty
        KeyboardEventHandler getOnKeyboardFocus();

        @JsProperty
        void setOnKeyboardFocus(KeyboardEventHandler onKeyboardFocus);

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
        Func.Run getOnRequestChange();

        @JsProperty
        void setOnRequestChange(Func.Run onRequestChange);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        Origin getTargetOrigin();

        @JsProperty
        void setTargetOrigin(Origin targetOrigin);

        @JsProperty
        double getTouchTapCloseDelay();

        @JsProperty
        void setTouchTapCloseDelay(double touchTapCloseDelay);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props anchorOrigin(Origin anchorOrigin) {
            setAnchorOrigin(anchorOrigin);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props closeOnItemTouchTap(boolean closeOnItemTouchTap) {
            setCloseOnItemTouchTap(closeOnItemTouchTap);
            return this;
        }

        @JsOverlay
        default Props iconButtonElement(ReactElement iconButtonElement) {
            setIconButtonElement(iconButtonElement);
            return this;
        }

        @JsOverlay
        default Props iconStyle(StyleProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props menuStyle(StyleProps menuStyle) {
            setMenuStyle(menuStyle);
            return this;
        }

        @JsOverlay
        default Props onItemTouchTap(TouchEventHandler onItemTouchTap) {
            setOnItemTouchTap(onItemTouchTap);
            return this;
        }

        @JsOverlay
        default Props onKeyboardFocus(KeyboardEventHandler onKeyboardFocus) {
            setOnKeyboardFocus(onKeyboardFocus);
            return this;
        }

        @JsOverlay
        default Props onMouseDown(MouseEventHandler onMouseDown) {
            setOnMouseDown(onMouseDown);
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
        default Props onMouseUp(MouseEventHandler onMouseUp) {
            setOnMouseUp(onMouseUp);
            return this;
        }

        @JsOverlay
        default Props onRequestChange(Func.Run onRequestChange) {
            setOnRequestChange(onRequestChange);
            return this;
        }

        @JsOverlay
        default Props onTouchTap(TouchEventHandler onTouchTap) {
            setOnTouchTap(onTouchTap);
            return this;
        }

        @JsOverlay
        default Props open(boolean open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props targetOrigin(Origin targetOrigin) {
            setTargetOrigin(targetOrigin);
            return this;
        }

        @JsOverlay
        default Props touchTapCloseDelay(double touchTapCloseDelay) {
            setTouchTapCloseDelay(touchTapCloseDelay);
            return this;
        }


    }

    /**
     *
     */
    @JsType(isNative = true)
    public interface Origin {
        @JsProperty
        String getVertical();

        @JsProperty
        void setVertical(String vertical);

        @JsProperty
        String getHorizontal();

        @JsProperty
        void setHorizontal(String horizontal);

    }
}
