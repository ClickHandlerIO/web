package ui.client.fullCalendar;

import com.google.gwt.dom.client.NativeEvent;
import common.client.Func;
import moment.client.Moment;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface FullCalendarOptions {

    @JsProperty
    String getTimezone();

    @JsProperty
    void setTimezone(String timezone);

    @JsProperty
    Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> getEvents();

    @JsProperty
    void setEvents(Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> events);

    @JsProperty
    boolean isAllDayDefault();

    @JsProperty
    void setAllDayDefault(boolean allDayDefault);

    @JsProperty
    double getAspectRatio();

    @JsProperty
    void setAspectRatio(double aspectRatio);

    @JsProperty
    Moment getDefaultDate();

    @JsProperty
    void setDefaultDate(Moment defaultDate);

    @JsProperty
    String getEventColor();

    @JsProperty
    void setEventColor(String eventColor);

    @JsProperty
    String getEventBackgroundColor();

    @JsProperty
    void setEventBackgroundColor(String eventBackgroundColor);

    @JsProperty
    String getEventBorderColor();

    @JsProperty
    void setEventBorderColor(String eventBorderColor);

    @JsProperty
    String getEventTextColor();

    @JsProperty
    void setEventTextColor(String eventTextColor);

    @JsProperty
    FullCalendarHeader getHeader();

    @JsProperty
    void setHeader(FullCalendarHeader header);

    @JsProperty
    double getHeight();

    @JsProperty
    void setHeight(double height);

    @JsProperty
    boolean isEditable();

    @JsProperty
    void setEditable(boolean editable);

    @JsProperty
    boolean isEventStartEditable();

    @JsProperty
    void setEventStartEditable(boolean eventStartEditable);

    @JsProperty
    boolean isEventDurationEditable();

    @JsProperty
    void setEventDurationEditable(boolean eventDurationEditable);

    @JsProperty
    Object getEventConstraint();

    @JsProperty
    void setEventConstraint(Object eventConstraint);

    @JsProperty
    boolean isEventOverlap();

    @JsProperty
    void setEventOverlap(boolean eventOverlap);

    @JsProperty
    boolean isEventLimit();

    @JsProperty
    void setEventLimit(boolean eventLimit);

    @JsProperty
    String getDefaultView();

    @JsProperty
    void setDefaultView(String defaultView);

    @JsProperty
    Func.Run3<Moment, NativeEvent, FullCalendarView> getDayClick();

    @JsProperty
    void setDayClick(Func.Run3<Moment, NativeEvent, FullCalendarView> dayClick);

    @JsProperty
    Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> getEventClick();

    @JsProperty
    void setEventClick(Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventClick);

    @JsProperty
    Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> getEventMouseover();

    @JsProperty
    void setEventMouseover(Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseover);

    @JsProperty
    Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> getEventMouseout();

    @JsProperty
    void setEventMouseout(Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseout);
}
