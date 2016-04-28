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
public class Toggle extends ExternalComponent<Toggle.Props> {

    @Inject
    public Toggle() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Toggle;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean defaultToggled;
//        boolean disabled;
//        StyleProps elementStyle;
//        StyleProps iconStyle;
//        String labelPosition; // enum 'left' 'right' default left
//        StyleProps labelStyle;
//        StyleProps rippleStyle;
//        StyleProps style;
//        String thumbStyle;
//        boolean toggled; // toggled if set to true
//        StyleProps trackStyle;
//        String valueLink;
//        Func.Run onToggle; // func
//        MouseEventHandler onClick; // func added


        @JsProperty
        boolean isDefaultToggled();

        @JsProperty
        void setDefaultToggled(boolean defaultToggled);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        StyleProps getElementStyle();

        @JsProperty
        void setElementStyle(StyleProps elementStyle);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        StyleProps getLabelStyle();

        @JsProperty
        void setLabelStyle(StyleProps labelStyle);

        @JsProperty
        StyleProps getRippleStyle();

        @JsProperty
        void setRippleStyle(StyleProps rippleStyle);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getThumbStyle();

        @JsProperty
        void setThumbStyle(String thumbStyle);

        @JsProperty
        boolean isToggled();

        @JsProperty
        void setToggled(boolean toggled);

        @JsProperty
        StyleProps getTrackStyle();

        @JsProperty
        void setTrackStyle(StyleProps trackStyle);

        @JsProperty
        String getValueLink();

        @JsProperty
        void setValueLink(String valueLink);

        @JsProperty
        Func.Run getOnToggle();

        @JsProperty
        void setOnToggle(Func.Run onToggle);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props defaultToggled(final boolean defaultToggled) {
            setDefaultToggled(defaultToggled);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props elementStyle(final StyleProps elementStyle) {
            setElementStyle(elementStyle);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final StyleProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final StyleProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props rippleStyle(final StyleProps rippleStyle) {
            setRippleStyle(rippleStyle);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props thumbStyle(final String thumbStyle) {
            setThumbStyle(thumbStyle);
            return this;
        }

        @JsOverlay
        default Props toggled(final boolean toggled) {
            setToggled(toggled);
            return this;
        }

        @JsOverlay
        default Props trackStyle(final StyleProps trackStyle) {
            setTrackStyle(trackStyle);
            return this;
        }

        @JsOverlay
        default Props valueLink(final String valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props onToggle(final Func.Run onToggle) {
            setOnToggle(onToggle);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
