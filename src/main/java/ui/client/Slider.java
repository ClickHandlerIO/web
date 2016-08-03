package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Slider extends ExternalComponent<Slider.Props> {

    @Inject
    public Slider() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Slider;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        double getDefaultValue();

        @JsProperty
        void setDefaultValue(double defaultValue);

        @JsProperty
        double getMin();

        @JsProperty
        void setMin(double min);

        @JsProperty
        double getMax();

        @JsProperty
        void setMax(double max);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);

        @JsProperty
        String getDescription();

        @JsProperty
        void setDescription(String description);

        @JsProperty
        boolean isDisableFocusRipple();

        @JsProperty
        void setDisableFocusRipple(boolean disableFocusRipple);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getError();

        @JsProperty
        void setError(String error);

        @JsProperty
        String getName();

        @JsProperty
        void setName(String name);

        @JsProperty
        boolean isRequired();

        @JsProperty
        void setRequired(boolean required);

        @JsProperty
        double getStep();

        @JsProperty
        void setStep(double step);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        FocusEventHandler getOnBlur();

        @JsProperty
        void setOnBlur(FocusEventHandler onBlur);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        Func.Run getOnDragStart();

        @JsProperty
        void setOnDragStart(Func.Run onDragStart);

        @JsProperty
        Func.Run getOnDragStop();

        @JsProperty
        void setOnDragStop(Func.Run onDragStop);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onFocus);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props defaultValue(final double defaultValue) {
            setDefaultValue(defaultValue);
            return this;
        }

        @JsOverlay
        default Props min(final double min) {
            setMin(min);
            return this;
        }

        @JsOverlay
        default Props max(final double max) {
            setMax(max);
            return this;
        }

        @JsOverlay
        default Props value(final double value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props description(final String description) {
            setDescription(description);
            return this;
        }

        @JsOverlay
        default Props disableFocusRipple(final boolean disableFocusRipple) {
            setDisableFocusRipple(disableFocusRipple);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props error(final String error) {
            setError(error);
            return this;
        }

        @JsOverlay
        default Props name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default Props required(final boolean required) {
            setRequired(required);
            return this;
        }

        @JsOverlay
        default Props step(final double step) {
            setStep(step);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onBlur(final FocusEventHandler onBlur) {
            setOnBlur(onBlur);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onDragStart(final Func.Run onDragStart) {
            setOnDragStart(onDragStart);
            return this;
        }

        @JsOverlay
        default Props onDragStop(final Func.Run onDragStop) {
            setOnDragStop(onDragStop);
            return this;
        }

        @JsOverlay
        default Props onFocus(final FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
