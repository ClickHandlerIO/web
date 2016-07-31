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
public class SelectField extends ExternalComponent<SelectField.Props> {

    @Inject
    public SelectField() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.SelectField;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isAutoWidth();

        @JsProperty
        void setAutoWidth(boolean autoWidth);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        StyleProps getErrorStyle();

        @JsProperty
        void setErrorStyle(StyleProps errorStyle);

        @JsProperty
        ReactElement getErrorText();

        @JsProperty
        void setErrorText(ReactElement errorText);

        @JsProperty
        StyleProps getFloatingLabelStyle();

        @JsProperty
        void setFloatingLabelStyle(StyleProps floatingLabelStyle);

        @JsProperty
        ReactElement getFloatingLabelText();

        @JsProperty
        void setFloatingLabelText(ReactElement floatingLabelText);

        @JsProperty
        boolean isFullWidth();

        @JsProperty
        void setFullWidth(boolean fullWidth);

        @JsProperty
        StyleProps getHintStyle();

        @JsProperty
        void setHintStyle(StyleProps hintStyle);

        @JsProperty
        ReactElement getHintText();

        @JsProperty
        void setHintText(ReactElement hintText);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        StyleProps getLabelStyle();

        @JsProperty
        void setLabelStyle(StyleProps labelStyle);

        @JsProperty
        String getSelectFieldRoot();

        @JsProperty
        void setSelectFieldRoot(String selectFieldRoot);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getUnderlineDisabledStyle();

        @JsProperty
        void setUnderlineDisabledStyle(String underlineDisabledStyle);

        @JsProperty
        String getUnderlineFocusStyle();

        @JsProperty
        void setUnderlineFocusStyle(String underlineFocusStyle);

        @JsProperty
        String getUnderlineStyle();

        @JsProperty
        void setUnderlineStyle(String underlineStyle);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        FocusEventHandler getOnBlur();

        @JsProperty
        void setOnBlur(FocusEventHandler onBlur);

        @JsProperty
        Func.Run3<SyntheticEvent, Integer, Object> getOnChange();

        @JsProperty
        void setOnChange(Func.Run3<SyntheticEvent, Integer, Object> onChange);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props autoWidth(final boolean autoWidth) {
            setAutoWidth(autoWidth);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props errorStyle(final StyleProps errorStyle) {
            setErrorStyle(errorStyle);
            return this;
        }

        @JsOverlay
        default Props errorText(final ReactElement errorText) {
            setErrorText(errorText);
            return this;
        }

        @JsOverlay
        default Props floatingLabelStyle(final StyleProps floatingLabelStyle) {
            setFloatingLabelStyle(floatingLabelStyle);
            return this;
        }

        @JsOverlay
        default Props floatingLabelText(final ReactElement floatingLabelText) {
            setFloatingLabelText(floatingLabelText);
            return this;
        }

        @JsOverlay
        default Props fullWidth(final boolean fullWidth) {
            setFullWidth(fullWidth);
            return this;
        }

        @JsOverlay
        default Props hintStyle(final StyleProps hintStyle) {
            setHintStyle(hintStyle);
            return this;
        }

        @JsOverlay
        default Props hintText(final ReactElement hintText) {
            setHintText(hintText);
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
        default Props selectFieldRoot(final String selectFieldRoot) {
            setSelectFieldRoot(selectFieldRoot);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props underlineDisabledStyle(final String underlineDisabledStyle) {
            setUnderlineDisabledStyle(underlineDisabledStyle);
            return this;
        }

        @JsOverlay
        default Props underlineFocusStyle(final String underlineFocusStyle) {
            setUnderlineFocusStyle(underlineFocusStyle);
            return this;
        }

        @JsOverlay
        default Props underlineStyle(final String underlineStyle) {
            setUnderlineStyle(underlineStyle);
            return this;
        }

        @JsOverlay
        default Props value(final Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props onBlur(final FocusEventHandler onBlur) {
            setOnBlur(onBlur);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run3<SyntheticEvent, Integer, Object> onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onFocus(final FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
