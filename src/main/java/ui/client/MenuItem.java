package ui.client;

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
public class MenuItem extends ExternalComponent<MenuItem.Props> {
    @Inject
    public MenuItem() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.MenuItem;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isChecked();

        @JsProperty
        void setChecked(boolean checked);

        @JsProperty
        boolean isDesktop();

        @JsProperty
        void setDesktop(boolean desktop);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getFocusState();

        @JsProperty
        void setFocusState(String focusState);

        @JsProperty
        StyleProps getInnerDivStyle();

        @JsProperty
        void setInnerDivStyle(StyleProps innerDivStyle);

        @JsProperty
        boolean isInsetChildren();

        @JsProperty
        void setInsetChildren(boolean insetChildren);

        @JsProperty
        ReactElement getLeftIcon();

        @JsProperty
        void setLeftIcon(ReactElement leftIcon);

        @JsProperty
        ReactElement getMenuItems();

        @JsProperty
        void setMenuItems(ReactElement menuItems);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        ReactElement getRightIcon();

        @JsProperty
        void setRightIcon(ReactElement rightIcon);

        @JsProperty
        ReactElement getPrimaryText();

        @JsProperty
        void setPrimaryText(ReactElement PrimaryText);

        @JsProperty
        ReactElement getSecondaryText();

        @JsProperty
        void setSecondaryText(ReactElement secondaryText);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props checked(boolean checked) {
            setChecked(checked);
            return this;
        }

        @JsOverlay
        default Props desktop(boolean desktop) {
            setDesktop(desktop);
            return this;
        }

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props focusState(String focusState) {
            setFocusState(focusState);
            return this;
        }

        @JsOverlay
        default Props innerDivStyle(StyleProps innerDivStyle) {
            setInnerDivStyle(innerDivStyle);
            return this;
        }

        @JsOverlay
        default Props insetChildren(boolean insetChildren) {
            setInsetChildren(insetChildren);
            return this;
        }

        @JsOverlay
        default Props leftIcon(ReactElement leftIcon) {
            setLeftIcon(leftIcon);
            return this;
        }

        @JsOverlay
        default Props menuItems(ReactElement menuItems) {
            setMenuItems(menuItems);
            return this;
        }

        @JsOverlay
        default Props onTouchTap(TouchEventHandler onTouchTap) {
            setOnTouchTap(onTouchTap);
            return this;
        }

        @JsOverlay
        default Props rightIcon(ReactElement rightIcon) {
            setRightIcon(rightIcon);
            return this;
        }

        @JsOverlay
        default Props secondaryText(ReactElement secondaryText) {
            setSecondaryText(secondaryText);
            return this;
        }

        @JsOverlay
        default Props primaryText(ReactElement primaryText) {
            setPrimaryText(primaryText);
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
        default Props onClick(MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
