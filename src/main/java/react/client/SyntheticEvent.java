package react.client;

import elemental.events.Event;
import elemental.events.EventTarget;
import jsinterop.annotations.*;

import java.util.Date;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class SyntheticEvent {
    public boolean bubbles;
    public boolean cancelable;
    public EventTarget currentTarget;
    public boolean defaultPrevented;
    public double eventPhase;
    public boolean isTrusted;
    public Event nativeEvent;
    public EventTarget target;
    public Date timeStamp;
    public String type;

    @JsOverlay
    public final boolean getBubbles() {
        return bubbles;
    }

    @JsOverlay
    public final boolean getCancelable() {
        return cancelable;
    }

    @JsOverlay
    public final EventTarget getCurrentTarget() {
        return currentTarget;
    }

    @JsOverlay
    public final boolean getDefaultPrevented() {
        return defaultPrevented;
    }

    @JsOverlay
    public final double getEventPhase() {
        return eventPhase;
    }

    @JsOverlay
    public final boolean isTrusted() {
        return isTrusted;
    }

    @JsOverlay
    public final Event getNativeEvent() {
        return nativeEvent;
    }

    @JsMethod
    public final native void preventDefault();

    @JsMethod
    public final native void stopPropagation();

    @JsOverlay
    public final EventTarget getTarget() {
        return target;
    }

    @JsOverlay
    public final Date getTimeStamp() {
        return timeStamp;
    }

    @JsOverlay
    public final String getType() {
        return type;
    }
}