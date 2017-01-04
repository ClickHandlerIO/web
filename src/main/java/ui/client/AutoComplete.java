package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class AutoComplete extends ExternalComponent<AutoComplete.Props> {
    @Inject
    public AutoComplete() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.AutoComplete;
    }-*/;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public Object anchorOrigin;
        public boolean animated;
        public Object animation;
        public Object[] dataSource;
        public Object dataSourceConfig;
        public boolean disableFocusRipple;
        public StyleProps errorStyle;
        public ReactElement errorText;
        public Func.Call2<Boolean, String, String> filter;
        public ReactElement floatingLabelText;
        public boolean fullWidth;
        public StyleProps listStyle;
        public double maxSearchResults;
        public double menuCloseDelay;
        public Func.Run onClose;
        public Func.Run2<String, Double> onNewRequest;
        public Func.Run3<String, Object[], Object> onUpdateInput;
        public boolean open;
        public boolean openOnFocus;
        public Object popoverProps;
        public String searchText;
        public StyleProps style;
        public Object targetOrigin;
        public StyleProps textFieldStyle;

        public boolean disabled;
        public StyleProps floatingLabelStyle;
        public boolean floatingLabelFixed;
        public StyleProps hintStyle;
        public String hintText;
        public String id;
        public StyleProps inputStyle;
        public FocusEventHandler onBlur;
        public Func.Run2<SyntheticEvent, String> onChange;
        public KeyboardEventHandler onEnterKeyDown;
        public FocusEventHandler onFocus;
        public KeyboardEventHandler onKeyDown;
        public StyleProps underlineDisabledStyle;
        public StyleProps underlineFocusStyle;
        public boolean underlineShow;
        public StyleProps underlineStyle;
        public Object value;

        @JsOverlay
        public final Props anchorOrigin(final Object anchorOrigin) {
            this.anchorOrigin = anchorOrigin;
            return this;
        }

        @JsOverlay
        public final Props animated(final boolean animated) {
            this.animated = animated;
            return this;
        }

        @JsOverlay
        public final Props animation(final Object animation) {
            this.animation = animation;
            return this;
        }

        @JsOverlay
        public final Props dataSource(final Object[] dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        @JsOverlay
        public final Props dataSourceConfig(final Object dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }

        @JsOverlay
        public final Props disableFocusRipple(final boolean disableFocusRipple) {
            this.disableFocusRipple = disableFocusRipple;
            return this;
        }

        @JsOverlay
        public final Props errorStyle(final StyleProps errorStyle) {
            this.errorStyle = errorStyle;
            return this;
        }

        @JsOverlay
        public final Props errorText(final ReactElement errorText) {
            this.errorText = errorText;
            return this;
        }

        @JsOverlay
        public final Props filter(final Func.Call2<Boolean, String, String> filter) {
            this.filter = filter;
            return this;
        }

        @JsOverlay
        public final Props floatingLabelText(final ReactElement floatingLabelText) {
            this.floatingLabelText = floatingLabelText;
            return this;
        }

        @JsOverlay
        public final Props fullWidth(final boolean fullWidth) {
            this.fullWidth = fullWidth;
            return this;
        }

        @JsOverlay
        public final Props listStyle(final StyleProps listStyle) {
            this.listStyle = listStyle;
            return this;
        }

        @JsOverlay
        public final Props maxSearchResults(final double maxSearchResults) {
            this.maxSearchResults = maxSearchResults;
            return this;
        }

        @JsOverlay
        public final Props menuCloseDelay(final double menuCloseDelay) {
            this.menuCloseDelay = menuCloseDelay;
            return this;
        }

        @JsOverlay
        public final Props onClose(final Func.Run onClose) {
            this.onClose = onClose;
            return this;
        }

        @JsOverlay
        public final Props onNewRequest(final Func.Run2<String, Double> onNewRequest) {
            this.onNewRequest = onNewRequest;
            return this;
        }

        @JsOverlay
        public final Props onUpdateInput(final Func.Run3<String, Object[], Object> onUpdateInput) {
            this.onUpdateInput = onUpdateInput;
            return this;
        }

        @JsOverlay
        public final Props open(final boolean open) {
            this.open = open;
            return this;
        }

        @JsOverlay
        public final Props openOnFocus(final boolean openOnFocus) {
            this.openOnFocus = openOnFocus;
            return this;
        }

        @JsOverlay
        public final Props popoverProps(final Object popoverProps) {
            this.popoverProps = popoverProps;
            return this;
        }

        @JsOverlay
        public final Props searchText(final String searchText) {
            this.searchText = searchText;
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props targetOrigin(final Object targetOrigin) {
            this.targetOrigin = targetOrigin;
            return this;
        }

        @JsOverlay
        public final Props textFieldStyle(final StyleProps textFieldStyle) {
            this.textFieldStyle = textFieldStyle;
            return this;
        }
        
        @JsOverlay
        public final Props disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props floatingLabelStyle(StyleProps floatingLabelStyle) {
            this.floatingLabelStyle = floatingLabelStyle;
            return this;
        }

        @JsOverlay
        public final Props floatingLabelFixed(boolean floatingLabelFixed) {
            this.floatingLabelFixed = floatingLabelFixed;
            return this;
        }

        @JsOverlay
        public final Props hintStyle(StyleProps hintStyle) {
            this.hintStyle = hintStyle;
            return this;
        }

        @JsOverlay
        public final Props hintText(String hintText) {
            this.hintText = hintText;
            return this;
        }

        @JsOverlay
        public final Props id(String id) {
            this.id = id;
            return this;
        }

        @JsOverlay
        public final Props inputStyle(StyleProps inputStyle) {
            this.inputStyle = inputStyle;
            return this;
        }

        @JsOverlay
        public final Props onBlur(FocusEventHandler onBlur) {
            this.onBlur = onBlur;
            return this;
        }

        @JsOverlay
        public final Props onChange(Func.Run2<SyntheticEvent, String> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props onEnterKeyDown(KeyboardEventHandler onEnterKeyDown) {
            this.onEnterKeyDown = onEnterKeyDown;
            return this;
        }

        @JsOverlay
        public final Props onFocus(FocusEventHandler onFocus) {
            this.onFocus = onFocus;
            return this;
        }

        @JsOverlay
        public final Props onKeyDown(KeyboardEventHandler onKeyDown) {
            this.onKeyDown = onKeyDown;
            return this;
        }

        @JsOverlay
        public final Props underlineDisabledStyle(StyleProps underlineDisabledStyle) {
            this.underlineDisabledStyle = underlineDisabledStyle;
            return this;
        }

        @JsOverlay
        public final Props underlineFocusStyle(StyleProps underlineFocusStyle) {
            this.underlineFocusStyle = underlineFocusStyle;
            return this;
        }

        @JsOverlay
        public final Props underlineShow(boolean underlineShow) {
            this.underlineShow = underlineShow;
            return this;
        }

        @JsOverlay
        public final Props underlineStyle(StyleProps underlineStyle) {
            this.underlineStyle = underlineStyle;
            return this;
        }

        @JsOverlay
        public final Props value(Object value) {
            this.value = value;
            return this;
        }
    }
}
