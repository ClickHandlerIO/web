package ui.client.stepper;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class StepLabel extends ExternalComponent<StepLabel.Props> {
    @Inject
    public StepLabel() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Stepper.StepLabel;
    }-*/;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public boolean active;
        public boolean completed;
        public boolean disabled;
        public ReactElement icon;
        public StyleProps style;

        @JsOverlay
        public final Props children(final Object children) {
            this.children = children;
            return this;
        }

        @JsOverlay
        public final Props active(final boolean active) {
            this.active = active;
            return this;
        }

        @JsOverlay
        public final Props completed(final boolean completed) {
            this.completed = completed;
            return this;
        }

        @JsOverlay
        public final Props disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props icon(final ReactElement icon) {
            this.icon = icon;
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }
    }
}
