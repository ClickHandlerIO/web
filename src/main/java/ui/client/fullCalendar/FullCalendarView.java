package ui.client.fullCalendar;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import moment.client.Moment;

@JsType(isNative = true)
public interface FullCalendarView {

    @JsProperty
    String getName();

    @JsProperty
    void setName(String name);

    @JsProperty
    String getTitle();

    @JsProperty
    void setTitle(String title);

    @JsProperty
    Moment getStart();

    @JsProperty
    void setStart(Moment start);

    @JsProperty
    Moment getEnd();

    @JsProperty
    void setEnd(Moment end);

    @JsProperty
    Moment getIntervalStart();

    @JsProperty
    void setIntervalStart(Moment intervalStart);

    @JsProperty
    Moment getIntervalEnd();

    @JsProperty
    void setIntervalEnd(Moment intervalEnd);
}
