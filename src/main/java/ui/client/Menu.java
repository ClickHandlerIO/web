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
public class Menu extends ExternalComponent<Menu.Props> {
    @Inject
    public Menu() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Menu;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isAnimated();

        @JsProperty
        void setAnimated(boolean animated);

        @JsProperty
        boolean isAutoWidth();

        @JsProperty
        void setAutoWidth(boolean autoWidth);

        @JsProperty
        boolean isDesktop();

        @JsProperty
        void setDesktop(boolean desktop);

        @JsProperty
        boolean isInitiallyKeyboardFocused();

        @JsProperty
        void setInitiallyKeyboardFocused(boolean initiallyKeyboardFocused);

        @JsProperty
        StyleProps getListStyle();

        @JsProperty
        void setListStyle(StyleProps listStyle);

        @JsProperty
        Integer getMaxHeight();

        @JsProperty
        void setMaxHeight(Integer maxHeight);

        @JsProperty
        boolean isMultiple();

        @JsProperty
        void setMultiple(boolean multiple);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        KeyboardEventHandler getOnEscKeyDown();

        @JsProperty
        void setOnEscKeyDown(KeyboardEventHandler onEscKeyDown);

        @JsProperty
        TouchEventHandler getOnItemTouchTap();

        @JsProperty
        void setOnItemTouchTap(TouchEventHandler onItemTouchTap);

        @JsProperty
        KeyboardEventHandler getOnKeyDown();

        @JsProperty
        void setOnKeyDown(KeyboardEventHandler onKeyDown);

        @JsProperty
        String getOpenDirection();

        @JsProperty
        void setOpenDirection(String openDirection);

        @JsProperty
        StyleProps getSelectedMenuItemStyle();

        @JsProperty
        void setSelectedMenuItemStyle(StyleProps selectedMenuItemStyle);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        Object getValueLink();

        @JsProperty
        void setValueLink(Object valueLink);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getZDepth();

        @JsProperty
        void setZDepth(double zDepth);

//        @JsProperty
//        MouseEventHandler getOnClick();
//
//        @JsProperty
//        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props animated(boolean animated) {
            setAnimated(animated);
            return this;
        }

        @JsOverlay
        default Props autoWidth(boolean autoWidth) {
            setAutoWidth(autoWidth);
            return this;
        }

        @JsOverlay
        default Props desktop(boolean desktop) {
            setDesktop(desktop);
            return this;
        }

        @JsOverlay
        default Props initiallyKeyboardFocused(boolean initiallyKeyboardFocused) {
            setInitiallyKeyboardFocused(initiallyKeyboardFocused);
            return this;
        }

        @JsOverlay
        default Props listStyle(StyleProps listStyle) {
            setListStyle(listStyle);
            return this;
        }

        @JsOverlay
        default Props maxHeight(Integer maxHeight) {
            setMaxHeight(maxHeight);
            return this;
        }

        @JsOverlay
        default Props multiple(boolean multiple) {
            setMultiple(multiple);
            return this;
        }

        @JsOverlay
        default Props onChange(Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onEscKeyDown(KeyboardEventHandler onEscKeyDown) {
            setOnEscKeyDown(onEscKeyDown);
            return this;
        }

        @JsOverlay
        default Props onItemTouchTap(TouchEventHandler onItemTouchTap) {
            setOnItemTouchTap(onItemTouchTap);
            return this;
        }

        @JsOverlay
        default Props onKeyDown(KeyboardEventHandler onKeyDown) {
            setOnKeyDown(onKeyDown);
            return this;
        }

        @JsOverlay
        default Props openDirection(String openDirection) {
            setOpenDirection(openDirection);
            return this;
        }

        @JsOverlay
        default Props selectedMenuItemStyle(StyleProps selectedMenuItemStyle) {
            setSelectedMenuItemStyle(selectedMenuItemStyle);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props valueLink(Object valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props width(double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props zDepth(double zDepth) {
            setZDepth(zDepth);
            return this;
        }

//        @JsOverlay
//        default Props onClick(MouseEventHandler onClick) {
//            setOnClick(onClick);
//            return this;
//        }
    }
}
