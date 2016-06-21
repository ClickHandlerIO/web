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
public class StepButton extends ExternalComponent<StepButton.Props> {
    @Inject
    public StepButton() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Stepper.StepButton;
    }-*/;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public boolean active;
        public boolean completed;
        public boolean disabled;
        public ReactElement icon;
        public MouseEventHandler onMouseEnter;
        public MouseEventHandler onMouseLeave;
        public TouchEventHandler onTouchStart;
        public TouchEventHandler onTouchTap;
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
        public final Props onMouseEnter(final MouseEventHandler onMouseEnter) {
            this.onMouseEnter = onMouseEnter;
            return this;
        }

        @JsOverlay
        public final Props onMouseLeave(final MouseEventHandler onMouseLeave) {
            this.onMouseLeave = onMouseLeave;
            return this;
        }

        @JsOverlay
        public final Props onTouchTap(final TouchEventHandler onTouchTap) {
            this.onTouchTap = onTouchTap;
            return this;
        }

        @JsOverlay
        public final Props onTouchStart(final TouchEventHandler onTouchStart) {
            this.onTouchStart = onTouchStart;
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }
    }
}
