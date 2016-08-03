package ui.client.stepper;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.ComponentProps;
import react.client.ExternalComponent;
import react.client.ReactClass;
import react.client.StyleProps;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Stepper extends ExternalComponent<Stepper.Props> {
    @Inject
    public Stepper() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Stepper.Stepper;
    }-*/;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public double activeStep;
        public boolean linear;
        public String orientation;
        public StyleProps style;

        @JsOverlay
        public final Props activeStep(final double activeStep) {
            this.activeStep = activeStep;
            return this;
        }

        @JsOverlay
        public final Props linear(final boolean linear) {
            this.linear = linear;
            return this;
        }

        @JsOverlay
        public final Props orientation(final String orientation) {
            this.orientation = orientation;
            return this;
        }

        @JsOverlay
        public final Props horizontal() {
            this.orientation = "horizontal";
            return this;
        }

        @JsOverlay
        public final Props vertical() {
            this.orientation = "vertical";
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props children(final Object children) {
            this.children = children;
            return this;
        }
    }
}
