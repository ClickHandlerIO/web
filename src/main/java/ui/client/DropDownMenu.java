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
public class DropDownMenu extends ExternalComponent<DropDownMenu.Props> {

    @Inject
    public DropDownMenu() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.DropDownMenu;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isAutoWidth();

        @JsProperty
        void setAutoWidth(boolean autoWidth);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        StyleProps getLabelStyle();

        @JsProperty
        void setLabelStyle(StyleProps labelStyle);

        @JsProperty
        double getMaxHeight();

        @JsProperty
        void setMaxHeight(double maxHeight);

        @JsProperty
        StyleProps getMenuStyle();

        @JsProperty
        void setMenuStyle(StyleProps menuStyle);

        @JsProperty
        boolean isOpenImmediately();

        @JsProperty
        void setOpenImmediately(boolean openImmediately);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        StyleProps getUnderlineStyle();

        @JsProperty
        void setUnderlineStyle(StyleProps underlineStyle);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnCLick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props autoWidth(final boolean autoWidth) {
            setAutoWidth(autoWidth);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final StyleProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final StyleProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props maxHeight(final double maxHeight) {
            setMaxHeight(maxHeight);
            return this;
        }

        @JsOverlay
        default Props menuStyle(final StyleProps menuStyle) {
            setMenuStyle(menuStyle);
            return this;
        }

        @JsOverlay
        default Props openImmediately(final boolean openImmediately) {
            setOpenImmediately(openImmediately);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props underlineStyle(final StyleProps underlineStyle) {
            setUnderlineStyle(underlineStyle);
            return this;
        }

        @JsOverlay
        default Props value(final Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnCLick(onClick);
            return this;
        }


    }
}
