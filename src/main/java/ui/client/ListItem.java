package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ListItem extends ExternalComponent<ListItem.Props> {

    @Inject
    public ListItem() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.ListItem;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isAutoGenerateNestedIndicator();

        @JsProperty
        void setAutoGenerateNestedIndicator(boolean autoGenerateNestedIndicator);

        @JsProperty
        boolean isDisableKeyboardFocus();

        @JsProperty
        void setDisableKeyboardFocus(boolean disableKeyboardFocus);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        boolean isInitiallyOpen();

        @JsProperty
        void setInitiallyOpen(boolean initiallyOpen);

        @JsProperty
        Object getInnerDivStyle();

        @JsProperty
        void setInnerDivStyle(Object innerDivStyle);

        @JsProperty
        boolean isInsetChildren();

        @JsProperty
        void setInsetChildren(boolean insetChildren);

        @JsProperty
        ReactElement getLeftAvatar();

        @JsProperty
        void setLeftAvatar(ReactElement leftAvatar);

        @JsProperty
        ReactElement getLeftCheckbox();

        @JsProperty
        void setLeftCheckbox(ReactElement leftCheckbox);

        @JsProperty
        ReactElement getLeftIcon();

        @JsProperty
        void setLeftIcon(ReactElement leftIcon);

        @JsProperty
        ReactElement[] getNestedItems();

        @JsProperty
        void setNestedItems(ReactElement[] nestedItems);

        @JsProperty
        double getNestedLevel();

        @JsProperty
        void setNestedLevel(double nestedLevel);

        @JsProperty
        Object getNestedListStyle();

        @JsProperty
        void setNestedListStyle(Object nestedListStyle);

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

        @JsProperty
        Func.Run getOnNestedListToggle();

        @JsProperty
        void setOnNestedListToggle(Func.Run onNestedListToggle);

        @JsProperty
        TouchEventHandler getOnTouchStart();

        @JsProperty
        void setOnTouchStart(TouchEventHandler onTouchStart);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        ReactElement getPrimaryText();

        @JsProperty
        void setPrimaryText(ReactElement primaryText);

        @JsProperty
        boolean isPrimaryTogglesNestedList();

        @JsProperty
        void setPrimaryTogglesNestedList(boolean primaryTogglesNestedList);

        @JsProperty
        ReactElement getRightAvatar();

        @JsProperty
        void setRightAvatar(ReactElement rightAvatar);

        @JsProperty
        ReactElement getRightIcon();

        @JsProperty
        void setRightIcon(ReactElement rightIcon);

        @JsProperty
        ReactElement getRightButton();

        @JsProperty
        void setRightButton(ReactElement rightButton);

        @JsProperty
        ReactElement getRightToggle();

        @JsProperty
        void setRightToggle(ReactElement rightToggle);

        @JsProperty
        ReactElement getSecondaryText();

        @JsProperty
        void setSecondaryText(ReactElement secondaryText);

        @JsProperty
        double getSecondaryTextLines();

        @JsProperty
        void setSecondaryTextLines(double secondaryTextLines);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props autoGenerateNestedIndicator(boolean autoGenerateNestedIndicator) {
            setAutoGenerateNestedIndicator(autoGenerateNestedIndicator);
            return this;
        }

        @JsOverlay
        default Props disableKeyboardFocus(boolean disableKeyboardFocus) {
            setDisableKeyboardFocus(disableKeyboardFocus);
            return this;
        }

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props initiallyOpen(boolean initiallyOpen) {
            setInitiallyOpen(initiallyOpen);
            return this;
        }

        @JsOverlay
        default Props innerDivStyle(Object innerDivStyle) {
            setInnerDivStyle(innerDivStyle);
            return this;
        }

        @JsOverlay
        default Props insetChildren(boolean insetChildren) {
            setInsetChildren(insetChildren);
            return this;
        }

        @JsOverlay
        default Props leftAvatar(ReactElement leftAvatar) {
            setLeftAvatar(leftAvatar);
            return this;
        }

        @JsOverlay
        default Props leftCheckbox(ReactElement leftCheckbox) {
            setLeftCheckbox(leftCheckbox);
            return this;
        }

        @JsOverlay
        default Props leftIcon(ReactElement leftIcon) {
            setLeftIcon(leftIcon);
            return this;
        }

        @JsOverlay
        default Props nestedItems(ReactElement[] nestedItems) {
            setNestedItems(nestedItems);
            return this;
        }

        @JsOverlay
        default Props nestedLevel(double nestedLevel) {
            setNestedLevel(nestedLevel);
            return this;
        }

        @JsOverlay
        default Props nestedListStyle(Object nestedListStyle) {
            setNestedListStyle(nestedListStyle);
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

        @JsOverlay
        default Props onNestedListToggle(Func.Run onNestedListToggle) {
            setOnNestedListToggle(onNestedListToggle);
            return this;
        }

        @JsOverlay
        default Props onTouchStart(TouchEventHandler onTouchStart) {
            setOnTouchStart(onTouchStart);
            return this;
        }

        @JsOverlay
        default Props onTouchTap(TouchEventHandler onTouchTap) {
            setOnTouchTap(onTouchTap);
            return this;
        }

        @JsOverlay
        default Props primaryText(ReactElement primaryText) {
            setPrimaryText(primaryText);
            return this;
        }

        @JsOverlay
        default Props primaryTogglesNestedList(boolean primaryTogglesNestedList) {
            setPrimaryTogglesNestedList(primaryTogglesNestedList);
            return this;
        }

        @JsOverlay
        default Props rightAvatar(ReactElement rightAvatar) {
            setRightAvatar(rightAvatar);
            return this;
        }

        @JsOverlay
        default Props rightIcon(ReactElement rightIcon) {
            setRightIcon(rightIcon);
            return this;
        }

        @JsOverlay
        default Props rightButton(ReactElement rightButton) {
            setRightButton(rightButton);
            return this;
        }

        @JsOverlay
        default Props rightToggle(ReactElement rightToggle) {
            setRightToggle(rightToggle);
            return this;
        }

        @JsOverlay
        default Props secondaryText(ReactElement secondaryText) {
            setSecondaryText(secondaryText);
            return this;
        }

        @JsOverlay
        default Props secondaryTextLines(double secondaryTextLines) {
            setSecondaryTextLines(secondaryTextLines);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
