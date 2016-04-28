package react.client;

import elemental.events.Event;
import elemental.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true)
public interface SyntheticEvent {
    @JsProperty
    boolean getBubbles();

    void setBubbles(boolean bubbles);

    @JsProperty
    Boolean getCancelable();

    @JsProperty
    EventTarget getCurrentTarget();

    @JsMethod
    boolean defaultPrevented();

    @JsProperty
    int getEventPhase();

    @JsProperty
    boolean isTrusted();

    @JsProperty
    Event getNativeEvent();

    @JsMethod
    void preventDefault();

    @JsMethod
    void stopPropagation();

    @JsProperty
    EventTarget getTarget();

    @JsProperty
    Date getTimeStamp();

    @JsProperty
    String getType();
}