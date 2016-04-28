package ui.client.fullCalendar;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface FullCalendarHeader {
    @JsProperty
    String getCenter();

    @JsProperty
    void setCenter(String center);

    @JsProperty
    String getLeft();

    @JsProperty
    void setLeft(String left);

    @JsProperty
    String getRight();

    @JsProperty
    void setRight(String right);
}
