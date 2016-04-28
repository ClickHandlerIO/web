package ui.client;

import com.google.gwt.core.client.JsDate;
import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Date;

@Singleton
public class DatePicker extends ExternalComponent<DatePicker.Props> {

    @Inject
    public DatePicker() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.DatePicker;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isAutoOk();

        @JsProperty
        void setAutoOk(boolean autoOk);

        @JsProperty
        String getContainer();

        @JsProperty
        void setContainer(String container);

        @JsProperty
        Date getDefaultDate();

        @JsProperty
        void setDefaultDate(Date defaultDate);

        @JsProperty
        boolean isDisableYearSelection();

        @JsProperty
        void setDisableYearSelection(boolean disableYearSelection);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        int getFirstDayOfWeek();

        @JsProperty
        void setFirstDayOfWeek(int firstDayOfWeek);

        @JsProperty
        String getLocale();

        @JsProperty
        void setLocale(String locale);

        @JsProperty
        String getMaxDate();

        @JsProperty
        void setMaxDate(String maxDate);

        @JsProperty
        String getMinDate();

        @JsProperty
        void setMinDate(String minDate);

        @JsProperty
        String getMode();

        @JsProperty
        void setMode(String mode);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        StyleProps getTextFieldStyle();

        @JsProperty
        void setTextFieldStyle(StyleProps textFieldStyle);

        @JsProperty
        JsDate getValue();

        @JsProperty
        void setValue(JsDate value);

        @JsProperty
        String getValueLink();

        @JsProperty
        void setValueLink(String valueLink);

        @JsProperty
        String getWordings();

        @JsProperty
        void setWordings(String wordings);

        @JsProperty
        Func.Run getDateTimeFormat();

        @JsProperty
        void setDateTimeFormat(Func.Run dateTimeFormat);

        @JsProperty
        Func.Call1<String, JsDate> getFormatDate();

        @JsProperty
        void setFormatDate(Func.Call1<String, JsDate> formatDate);

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
        Func.Run getShouldDisableDate();

        @JsProperty
        void setShouldDisableDate(Func.Run shouldDisableDate);

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
        default Props container(final String container) {
            setContainer(container);
            return this;
        }

        @JsOverlay
        default Props defaultDate(final Date defaultDate) {
            setDefaultDate(defaultDate);
            return this;
        }

        @JsOverlay
        default Props disableYearSelection(final boolean disableYearSelection) {
            setDisableYearSelection(disableYearSelection);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props firstDayOfWeek(final int firstDayOfWeek) {
            setFirstDayOfWeek(firstDayOfWeek);
            return this;
        }

        @JsOverlay
        default Props locale(final String locale) {
            setLocale(locale);
            return this;
        }

        @JsOverlay
        default Props maxDate(final String maxDate) {
            setMaxDate(maxDate);
            return this;
        }

        @JsOverlay
        default Props minDate(final String minDate) {
            setMinDate(minDate);
            return this;
        }

        @JsOverlay
        default Props mode(final String mode) {
            setMode(mode);
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
        default Props value(final JsDate value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props valueLink(final String valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props wordings(final String wordings) {
            setWordings(wordings);
            return this;
        }

        @JsOverlay
        default Props DateTimeFormat(final Func.Run dateTimeFormat) {
            setDateTimeFormat(dateTimeFormat);
            return this;
        }

        @JsOverlay
        default Props formatDate(final Func.Call1<String, JsDate> formatDate) {
            setFormatDate(formatDate);
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
        default Props shouldDisableDate(final Func.Run shouldDisableDate) {
            setShouldDisableDate(shouldDisableDate);
            return this;
        }


    }
}
