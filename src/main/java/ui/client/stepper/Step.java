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
public class Step extends ExternalComponent<Step.Props> {
    @Inject
    public Step() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Stepper.Step;
    }-*/;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public boolean active;
        public boolean completed;
        public boolean disabled;
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
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }
    }
}
