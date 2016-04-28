package ui.client.datePicker;

import com.google.gwt.event.logical.shared.HasShowRangeHandlers;
import com.google.gwt.event.logical.shared.ShowRangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import io.clickhandler.momentGwt.client.Moment;

import java.util.Date;

public class MomentPickerWidget extends Composite implements HasShowRangeHandlers<Date>, HasValue<Moment> {
    private static Double browserOffset = null;
    private com.google.gwt.user.datepicker.client.DatePicker picker;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Pass through to GWT DatePicker
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public MomentPickerWidget() {
        initWidget(picker = new com.google.gwt.user.datepicker.client.DatePicker());

        picker.addValueChangeHandler(new ValueChangeHandler<Date>() {
            @Override
            public void onValueChange(ValueChangeEvent<Date> event) {
                ValueChangeEvent.fire(MomentPickerWidget.this, getValue());
            }
        });

        picker.setValue(toBrowserAdjustedDate(Moment.moment())); // set to now with user's default time zone
    }

    private static Moment fromBrowserAdjustedDate(Date date) {
        Moment m = Moment.moment(date.getTime());
        return Moment.moment(m.valueOf() - ((m.utcOffset() - getBrowserOffset()) * 1000. * 60.));
    }

    private static double getBrowserOffset() {
        if (browserOffset == null) {
            try {
                String[] strings = DateTimeFormat.getFormat("ZZZ").format(new Date()).split(":"); // Date time format -07:00
                if (strings.length != 2) {
                    return 0.;
                }

                double hour = Integer.parseInt(strings[0]);
                double minutes = Integer.parseInt(strings[1]);
                minutes += (hour * 60.);

                browserOffset = minutes;
            } catch (Exception e) {
                browserOffset = 0.;
            }
        }
        return browserOffset;
    }

    public void setCurrentMonth() {
        setCurrentMonth(getValue());
    }

    public void setCurrentMonth(Moment moment) {
        if (moment == null) {
            moment = Moment.moment();
        }
        picker.setCurrentMonth(toBrowserAdjustedDate(moment));
    }

    public Moment getFirstDate() {
        return fromBrowserAdjustedDate(picker.getFirstDate());
    }

    public Moment getLastDate() {
        return fromBrowserAdjustedDate(picker.getLastDate());
    }

    public boolean isDateVisible(Moment moment) {
        return picker.isDateVisible(toBrowserAdjustedDate(moment));
    }

    public void addTransientStyleToDates(String styleName, Moment moment) {
        picker.addTransientStyleToDates(styleName, toBrowserAdjustedDate(moment));
    }

    public void addTransientStyleToDates(String styleName, Iterable<Moment> dates) {
        for (Moment d : dates) {
            addTransientStyleToDates(styleName, d);
        }
    }

    public void removeStyleFromDates(String styleName, Moment moment) {
        picker.removeStyleFromDates(styleName, toBrowserAdjustedDate(moment));
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Show Range Handlers
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void removeStyleFromDates(String styleName, Iterable<Moment> dates) {
        for (Moment d : dates) {
            removeStyleFromDates(styleName, d);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Date Utils
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public final void setTransientEnabledOnDates(boolean enabled, Moment moment) {
        picker.setTransientEnabledOnDates(enabled, toBrowserAdjustedDate(moment));
    }

    public void setTransientEnabledOnDates(boolean enabled, Iterable<Moment> dates) {
        for (Moment d : dates) {
            setTransientEnabledOnDates(enabled, d);
        }
    }

    @Override
    public HandlerRegistration addShowRangeHandler(ShowRangeHandler<Date> handler) {
        return picker.addShowRangeHandler(handler);
    }

    private final Date toBrowserAdjustedDate(Moment moment) {
        Double millis = moment.valueOf() + (moment.utcOffset() - getBrowserOffset()) * 1000. * 60.;
        return new Date(millis.longValue());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // HasValue
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Moment getValue() {
        return fromBrowserAdjustedDate(picker.getValue());
    }

    @Override
    public void setValue(Moment value) {
        setValue(value, false);
    }

    @Override
    public void setValue(Moment value, boolean fireEvents) {
        if (value == null) {
            value = Moment.moment();
        }
        picker.setValue(toBrowserAdjustedDate(value), fireEvents);
    }

    @Override
    public HandlerRegistration addValueChangeHandler(ValueChangeHandler<Moment> handler) {
        return addHandler(handler, ValueChangeEvent.getType());
    }
}
