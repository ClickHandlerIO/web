package ui.client.fullCalendar;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface FullCalendarEvent {

    @JsProperty
    boolean isAllDay();

    @JsProperty
    void setAllDay(boolean allDay);

    @JsProperty
    String getId();

    @JsProperty
    void setId(String id);

    @JsProperty
    String getTitle();

    @JsProperty
    void setTitle(String title);

    @JsProperty
    String getStart();

    @JsProperty
    void setStart(String start);

    @JsProperty
    String getEnd();

    @JsProperty
    void setEnd(String end);

    @JsProperty
    String getUrl();

    @JsProperty
    void setUrl(String url);

    @JsProperty
    String getClassName();

    @JsProperty
    void setClassName(String className);

    @JsProperty
    boolean isEditable();

    @JsProperty
    void setEditable(boolean editable);

    @JsProperty
    boolean isStartEditable();

    @JsProperty
    void setStartEditable(boolean startEditable);

    @JsProperty
    boolean isDurationEditable();

    @JsProperty
    void setDurationEditable(boolean durationEditable);

    @JsProperty
    String getRendering();

    @JsProperty
    void setRendering(String rendering);

    @JsProperty
    boolean isOverlap();

    @JsProperty
    void setOverlap(boolean overlap);

    @JsProperty
    Object getConstraint();

    @JsProperty
    void setConstraint(Object constraint);

    @JsProperty
    Object getSource();

    @JsProperty
    void setSource(Object source);

    @JsProperty
    String getColor();

    @JsProperty
    void setColor(String color);

    @JsProperty
    String getBackgroundColor();

    @JsProperty
    void setBackgroundColor(String backgroundColor);

    @JsProperty
    String getBorderColor();

    @JsProperty
    void setBorderColor(String borderColor);

    @JsProperty
    String getTextColor();

    @JsProperty
    void setTextColor(String textColor);
}
