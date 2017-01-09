package ui.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.*;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Deprecated, should use TextInput control instead
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
    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public String className;
        public Object defaultValue;
        public boolean disabled;
        public StyleProps errorStyle;
        public String errorText;
        public StyleProps floatingLabelStyle;
        public String floatingLabelText;
        public boolean floatingLabelFixed;
        public boolean fullWidth;
        public StyleProps hintStyle;
        public Object hintText;
        public String id;
        public StyleProps inputStyle;
        public boolean multiLine;
        public FocusEventHandler onBlur;
        public Func.Run2<SyntheticEvent, String> onChange;
        public KeyboardEventHandler onEnterKeyDown;
        public FocusEventHandler onFocus;
        public KeyboardEventHandler onKeyDown;
        public double rows;
        public double rowsMax;
        public StyleProps style;
        public String type;
        public StyleProps underlineDisabledStyle;
        public StyleProps underlineFocusStyle;
        public boolean underlineShow;
        public StyleProps underlineStyle;
        public Object value;

        @JsOverlay
        public final Props className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props defaultValue(final Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        @JsOverlay
        public final Props disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props errorStyle(final StyleProps errorStyle) {
            this.errorStyle = errorStyle;
            return this;
        }

        @JsOverlay
        public final Props errorText(final String errorText) {
            this.errorText = errorText;
            return this;
        }

        @JsOverlay
        public final Props min(final String value) {
            Jso.set(this, "min", value);
            return this;
        }

        @JsOverlay
        public final Props floatingLabelStyle(final StyleProps floatingLabelStyle) {
            this.floatingLabelStyle = floatingLabelStyle;
            return this;
        }

        @JsOverlay
        public final Props floatingLabelText(final String floatingLabelText) {
            this.floatingLabelText = floatingLabelText;
            return this;
        }

        @JsOverlay
        public final Props floatingLabelFixed(final boolean floatingLabelFixed) {
            this.floatingLabelFixed = floatingLabelFixed;
            return this;
        }

        @JsOverlay
        public final Props fullWidth(final boolean fullWidth) {
            this.fullWidth = fullWidth;
            return this;
        }

        @JsOverlay
        public final Props hintStyle(final StyleProps hintStyle) {
            this.hintStyle = hintStyle;
            return this;
        }

        @JsOverlay
        public final Props hintText(final Object hintText) {
            this.hintText = hintText;
            return this;
        }

        @JsOverlay
        public final Props placeholder(final Object hintText) {
            this.hintText = hintText;
            return this;
        }

        @JsOverlay
        public final Props id(final String id) {
            this.id = id;
            return this;
        }

        @JsOverlay
        public final Props inputStyle(final StyleProps inputStyle) {
            this.inputStyle = inputStyle;
            return this;
        }

        @JsOverlay
        public final Props multiLine(final boolean multiLine) {
            this.multiLine = multiLine;
            return this;
        }

        @JsOverlay
        public final Props onBlur(final FocusEventHandler onBlur) {
            this.onBlur = onBlur;
            return this;
        }

        @JsOverlay
        public final Props onChange(final Func.Run2<SyntheticEvent, String> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props onEnterKeyDown(final KeyboardEventHandler onEnterKeyDown) {
            this.onEnterKeyDown = onEnterKeyDown;
            return this;
        }

        @JsOverlay
        public final Props onFocus(final FocusEventHandler onFocus) {
            this.onFocus = onFocus;
            return this;
        }

        @JsOverlay
        public final Props onKeyDown(final KeyboardEventHandler onKeyDown) {
            this.onKeyDown = onKeyDown;
            return this;
        }

        @JsOverlay
        public final Props rows(final double rows) {
            this.rows = rows;
            return this;
        }

        @JsOverlay
        public final Props rowsMax(final double rowsMax) {
            this.rowsMax = rowsMax;
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props type(final String type) {
            this.type = type;
            return this;
        }

        @JsOverlay
        public final Props underlineDisabledStyle(final StyleProps underlineDisabledStyle) {
            this.underlineDisabledStyle = underlineDisabledStyle;
            return this;
        }

        @JsOverlay
        public final Props underlineFocusStyle(final StyleProps underlineFocusStyle) {
            this.underlineFocusStyle = underlineFocusStyle;
            return this;
        }

        @JsOverlay
        public final Props underlineShow(final boolean underlineShow) {
            this.underlineShow = underlineShow;
            return this;
        }

        @JsOverlay
        public final Props underlineStyle(final StyleProps underlineStyle) {
            this.underlineStyle = underlineStyle;
            return this;
        }

        @JsOverlay
        public final Props value(final Object value) {
            this.value = value;
            return this;
        }
    }
}
