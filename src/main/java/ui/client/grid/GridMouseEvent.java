package ui.client.grid;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface GridMouseEvent {
    @JsProperty
    double getMovementX();

    @JsProperty
    void setMovementX(double movementX);
}
