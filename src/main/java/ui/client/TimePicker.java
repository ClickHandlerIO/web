package ui.client;

import com.google.gwt.core.client.JsDate;
import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePicker extends ExternalComponent<TimePicker.Props> {

    @Inject
    public TimePicker() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.TimePicker;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isAutoOk();

        @JsProperty
        void setAutoOk(boolean autoOk);

        @JsProperty
        String getDefaultTime();

        @JsProperty
        void setDefaultTime(String defaultTime);

        @JsProperty
        String getFormat();

        @JsProperty
        void setFormat(String format);

        @JsProperty
        boolean isPedantic();

        @JsProperty
        void setPedantic(boolean pedantic);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        StyleProps getTextFieldStyle();

        @JsProperty
        void setTextFieldStyle(StyleProps textFieldStyle);

        @JsProperty
        Func.Run2<Object, JsDate> getOnChange();

        @JsProperty
        void setOnChange(Func.Run2<Object, JsDate> onChange);

        @JsProperty
        Func.Run getOnDismiss();

        @JsProperty
        void setOnDismiss(Func.Run onDismiss);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);

        @JsProperty
        Func.Run getOnShow();

        @JsProperty
        void setOnShow(Func.Run onShow);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);

        @JsProperty
        String getHintText();

        @JsProperty
        void setHintText(String hintText);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props autoOk(final boolean autoOk) {
            setAutoOk(autoOk);
            return this;
        }

        @JsOverlay
        default Props defaultTime(final String defaultTime) {
            setDefaultTime(defaultTime);
            return this;
        }

        @JsOverlay
        default Props format(final String format) {
            setFormat(format);
            return this;
        }

        @JsOverlay
        default Props pedantic(final boolean pedantic) {
            setPedantic(pedantic);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props textFieldStyle(final StyleProps textFieldStyle) {
            setTextFieldStyle(textFieldStyle);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run2<Object, JsDate> onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onDismiss(final Func.Run onDismiss) {
            setOnDismiss(onDismiss);
            return this;
        }

        @JsOverlay
        default Props onFocus(final FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }

        @JsOverlay
        default Props onShow(final Func.Run onShow) {
            setOnShow(onShow);
            return this;
        }

        @JsOverlay
        default Props onTouchTap(final TouchEventHandler onTouchTap) {
            setOnTouchTap(onTouchTap);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
