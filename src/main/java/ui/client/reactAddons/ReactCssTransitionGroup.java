package ui.client.reactAddons;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactCssTransitionGroup extends ExternalComponent<ReactCssTransitionGroup.Props> {
    @Inject
    public ReactCssTransitionGroup() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.Camber.ReactAddons.ReactCssTransitionGroup;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        TransitionName getTransitionName();

        @JsProperty
        void setTransitionName(TransitionName transitionName);

        @JsProperty
        Double getTransitionAppearTimeout();

        @JsProperty
        void setTransitionAppearTimeout(Double transitionAppearTimeout);

        @JsProperty
        Double getTransitionEnterTimeout();

        @JsProperty
        void setTransitionEnterTimeout(Double transitionEnterTimeout);

        @JsProperty
        Double getTransitionLeaveTimeout();

        @JsProperty
        void setTransitionLeaveTimeout(Double transitionLeaveTimeout);

        @JsProperty
        boolean isTransitionAppear();

        @JsProperty
        void setTransitionAppear(boolean transitionAppear);

        @JsProperty
        boolean isTransitionEnter();

        @JsProperty
        void setTransitionEnter(boolean transitionEnter);

        @JsProperty
        boolean isTransitionLeave();

        @JsProperty
        void setTransitionLeave(boolean transitionLeave);
    }

    @JsType(isNative = true)
    public class TransitionName {
        String appear;
        String appearActive;
        String enter;
        String enterActive;
        String leave;
        String leaveActive;

        @JsIgnore
        public TransitionName(String className) {
            appear = className + "-appear";
            appearActive = appear + "-active";
            enter = className + "-enter";
            enterActive = enter + "-active";
            leave = className + "-leave";
            leaveActive = leave + "-active";
        }

        @JsIgnore
        public TransitionName(String appearClass, String enterClass, String leaveClass) {
            appear = appearClass;
            appearActive = appear + "-active";
            enter = enterClass;
            enterActive = enter + "-active";
            leave = leaveClass;
            leaveActive = leave + "-active";
        }

        @JsIgnore
        public TransitionName(String appear, String appearActive, String enter, String enterActive, String leave, String leaveActive) {
            this.appear = appear;
            this.appearActive = appearActive;
            this.enter = enter;
            this.enterActive = enterActive;
            this.leave = leave;
            this.leaveActive = leaveActive;
        }
    }
}
