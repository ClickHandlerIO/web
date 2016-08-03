package ui.client;

import common.client.Func;
import common.client.Jso;
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
public class RadioButton extends ExternalComponent<RadioButton.Props> {

    @Inject
    public RadioButton() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.RadioButton;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isChecked();

        @JsProperty
        void setChecked(boolean checked);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

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
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getValue();

        @JsProperty
        void setValue(String value);

        @JsProperty
        Func.Run getOnCheck();

        @JsProperty
        void setOnCheck(Func.Run onCheck);


        ///////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props checked(final boolean checked) {
            setChecked(checked);
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
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(final String value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run onCheck) {
            setOnCheck(onCheck);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run2<SyntheticEvent, Boolean> onChange) {
            Jso.set(this, "onCheck", onChange);
            return this;
        }
    }
}
