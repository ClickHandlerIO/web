package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import moment.client.Moment;
import react.client.ComponentProps;
import react.client.ExternalComponent;
import react.client.ReactClass;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;

@Singleton
public class DatePicker extends ExternalComponent<DatePicker.Props> {

    @Inject
    public DatePicker() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.ReactDatepicker;
    }-*/;

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public String className;
        public String dateFormat;
        public String dateFormatCalendar;
        public boolean disabled;
        public Moment endDate;
        public Moment[] excludeDates;
        public Func.Run filterDate; // todo signature
        public String id;
        public Moment[] includeDates;
        public boolean isClearable;
        public String locale;
        public Moment maxDate;
        public Moment minDate;
        public String name;
        public Func.Run onBlur;
        public Func.Run1<Moment> onChange; // required
        public Func.Run onFocus;
        public String placeholderText;
        public String popoverAttachment; // default 'top left'
        public String popoverTargetAttachment; // default 'bottom left'
        public String popoverTargetOffset; // default '10px 0'
        public boolean readOnly;
        public Object renderCalendarTo; // todo?
        public boolean required;
        public Moment selected;
        public boolean showYearDropdown;
        public Moment startDate;
        public double tabIndex;
        //        public Object[] tetherConstraints; // todo defaultValue: [ { to: 'window', attachment: 'together' } ]
        public String title;
        public String todayButton;

        @JsOverlay
        public final Props key(final String key) {
            this.key = key;
            return this;
        }

        @JsOverlay
        public final Props className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props dateFormat(final String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        @JsOverlay
        public final Props dateFormatCalendar(final String dateFormatCalendar) {
            this.dateFormatCalendar = dateFormatCalendar;
            return this;
        }

        @JsOverlay
        public final Props disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props endDate(final Moment endDate) {
            this.endDate = endDate;
            return this;
        }

        @JsOverlay
        public final Props excludeDates(final Moment[] excludeDates) {
            this.excludeDates = excludeDates;
            return this;
        }

        @JsOverlay
        public final Props filterDate(final Func.Run filterDate) {
            this.filterDate = filterDate;
            return this;
        }

        @JsOverlay
        public final Props id(final String id) {
            this.id = id;
            return this;
        }

        @JsOverlay
        public final Props includeDates(final Moment[] includeDates) {
            this.includeDates = includeDates;
            return this;
        }

        @JsOverlay
        public final Props isClearable(final boolean isClearable) {
            this.isClearable = isClearable;
            return this;
        }

        @JsOverlay
        public final Props locale(final String locale) {
            this.locale = locale;
            return this;
        }

        @JsOverlay
        public final Props maxDate(final Moment maxDate) {
            this.maxDate = maxDate;
            return this;
        }

        @JsOverlay
        public final Props minDate(final Moment minDate) {
            this.minDate = minDate;
            return this;
        }

        @JsOverlay
        public final Props name(final String name) {
            this.name = name;
            return this;
        }

        @JsOverlay
        public final Props onBlur(final Func.Run onBlur) {
            this.onBlur = onBlur;
            return this;
        }

        @JsOverlay
        public final Props onChange(final Func.Run1<Moment> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props onFocus(final Func.Run onFocus) {
            this.onFocus = onFocus;
            return this;
        }

        @JsOverlay
        public final Props placeholderText(final String placeholderText) {
            this.placeholderText = placeholderText;
            return this;
        }

        @JsOverlay
        public final Props popoverAttachment(final String popoverAttachment) {
            this.popoverAttachment = popoverAttachment;
            return this;
        }

        @JsOverlay
        public final Props popoverTargetAttachment(final String popoverTargetAttachment) {
            this.popoverTargetAttachment = popoverTargetAttachment;
            return this;
        }

        @JsOverlay
        public final Props popoverTargetOffset(final String popoverTargetOffset) {
            this.popoverTargetOffset = popoverTargetOffset;
            return this;
        }

        @JsOverlay
        public final Props readOnly(final boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        @JsOverlay
        public final Props renderCalendarTo(final Object renderCalendarTo) {
            this.renderCalendarTo = renderCalendarTo;
            return this;
        }

        @JsOverlay
        public final Props required(final boolean required) {
            this.required = required;
            return this;
        }

        @JsOverlay
        public final Props selected(final Moment selected) {
            this.selected = selected;
            return this;
        }

        @JsOverlay
        public final Props showYearDropdown(final boolean showYearDropdown) {
            this.showYearDropdown = showYearDropdown;
            return this;
        }

        @JsOverlay
        public final Props startDate(final Moment startDate) {
            this.startDate = startDate;
            return this;
        }

        @JsOverlay
        public final Props tabIndex(final double tabIndex) {
            this.tabIndex = tabIndex;
            return this;
        }

        @JsOverlay
        public final Props title(final String title) {
            this.title = title;
            return this;
        }

        @JsOverlay
        public final Props todayButton(final String todayButton) {
            this.todayButton = todayButton;
            return this;
        }
    }
}
