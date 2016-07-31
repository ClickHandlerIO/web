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
public class TextField extends ExternalComponent<TextField.Props> {

    @Inject
    public TextField() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.TextField;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        Object getDefaultValue();

        @JsProperty
        void setDefaultValue(Object defaultValue);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        StyleProps getErrorStyle();

        @JsProperty
        void setErrorStyle(StyleProps errorStyle);

        @JsProperty
        String getErrorText();

        @JsProperty
        void setErrorText(String errorText);

        @JsProperty
        StyleProps getFloatingLabelStyle();

        @JsProperty
        void setFloatingLabelStyle(StyleProps floatingLabelStyle);

        @JsProperty
        String getFloatingLabelText();

        @JsProperty
        void setFloatingLabelText(String floatingLabelText);

        @JsProperty
        boolean isFullWidth();

        @JsProperty
        void setFullWidth(boolean fullWidth);

        @JsProperty
        StyleProps getHintStyle();

        @JsProperty
        void setHintStyle(StyleProps hintStyle);

        @JsProperty
        String getHintText();

        @JsProperty
        void setHintText(String hintText);

        @JsProperty
        String getId();

        @JsProperty
        void setId(String id);

        @JsProperty
        StyleProps getInputStyle();

        @JsProperty
        void setInputStyle(StyleProps inputStyle);

        @JsProperty
        boolean isMultiLine();

        @JsProperty
        void setMultiLine(boolean multiLine);

        @JsProperty
        FocusEventHandler getOnBlur();

        @JsProperty
        void setOnBlur(FocusEventHandler onBlur);

        @JsProperty
        Func.Run1<FormEvent> getOnChange();

        @JsProperty
        void setOnChange(Func.Run1<FormEvent> onChange);

        @JsProperty
        KeyboardEventHandler getOnEnterKeyDown();

        @JsProperty
        void setOnEnterKeyDown(KeyboardEventHandler onEnterKeyDown);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);

        @JsProperty
        KeyboardEventHandler getOnKeyDown();

        @JsProperty
        void setOnKeyDown(KeyboardEventHandler onKeyDown);

        @JsProperty
        double getRows();

        @JsProperty
        void setRows(double rows);

        @JsProperty
        double getRowsMax();

        @JsProperty
        void setRowsMax(double rowsMax);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getType();

        @JsProperty
        void setType(String type);

        @JsProperty
        StyleProps getUnderlineDisabledStyle();

        @JsProperty
        void setUnderlineDisabledStyle(StyleProps underlineDisabledStyle);

        @JsProperty
        StyleProps getUnderlineFocusStyle();

        @JsProperty
        void setUnderlineFocusStyle(StyleProps underlineFocusStyle);

        @JsProperty
        boolean isUnderlineShow();

        @JsProperty
        void setUnderlineShow(boolean underlineShow);

        @JsProperty
        StyleProps getUnderlineStyle();

        @JsProperty
        void setUnderlineStyle(StyleProps underlineStyle);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props defaultValue(Object defaultValue) {
            setDefaultValue(defaultValue);
            return this;
        }

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props errorStyle(StyleProps errorStyle) {
            setErrorStyle(errorStyle);
            return this;
        }

        @JsOverlay
        default Props errorText(String errorText) {
            setErrorText(errorText);
            return this;
        }

        @JsOverlay
        default Props floatingLabelStyle(StyleProps floatingLabelStyle) {
            setFloatingLabelStyle(floatingLabelStyle);
            return this;
        }

        @JsOverlay
        default Props floatingLabelText(String floatingLabelText) {
            setFloatingLabelText(floatingLabelText);
            return this;
        }

        @JsOverlay
        default Props fullWidth(boolean fullWidth) {
            setFullWidth(fullWidth);
            return this;
        }

        @JsOverlay
        default Props hintStyle(StyleProps hintStyle) {
            setHintStyle(hintStyle);
            return this;
        }

        @JsOverlay
        default Props hintText(String hintText) {
            setHintText(hintText);
            return this;
        }

        @JsOverlay
        default Props id(String id) {
            setId(id);
            return this;
        }

        @JsOverlay
        default Props inputStyle(StyleProps inputStyle) {
            setInputStyle(inputStyle);
            return this;
        }

        @JsOverlay
        default Props multiLine(boolean multiLine) {
            setMultiLine(multiLine);
            return this;
        }

        @JsOverlay
        default Props onBlur(FocusEventHandler onBlur) {
            setOnBlur(onBlur);
            return this;
        }

        @JsOverlay
        default Props onChange(Func.Run1<FormEvent> onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onEnterKeyDown(KeyboardEventHandler onEnterKeyDown) {
            setOnEnterKeyDown(onEnterKeyDown);
            return this;
        }

        @JsOverlay
        default Props onFocus(FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }

        @JsOverlay
        default Props onKeyDown(KeyboardEventHandler onKeyDown) {
            setOnKeyDown(onKeyDown);
            return this;
        }

        @JsOverlay
        default Props rows(double rows) {
            setRows(rows);
            return this;
        }

        @JsOverlay
        default Props rowsMax(double rowsMax) {
            setRowsMax(rowsMax);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props type(String type) {
            setType(type);
            return this;
        }

        @JsOverlay
        default Props underlineDisabledStyle(StyleProps underlineDisabledStyle) {
            setUnderlineDisabledStyle(underlineDisabledStyle);
            return this;
        }

        @JsOverlay
        default Props underlineFocusStyle(StyleProps underlineFocusStyle) {
            setUnderlineFocusStyle(underlineFocusStyle);
            return this;
        }

        @JsOverlay
        default Props underlineShow(boolean underlineShow) {
            setUnderlineShow(underlineShow);
            return this;
        }

        @JsOverlay
        default Props underlineStyle(StyleProps underlineStyle) {
            setUnderlineStyle(underlineStyle);
            return this;
        }

        @JsOverlay
        default Props value(Object value) {
            setValue(value);
            return this;
        }
    }
}
