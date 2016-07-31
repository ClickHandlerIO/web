package ui.client;

import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;
import react.client.StyleProps;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Paper extends ExternalComponent<Paper.Props> {

    @Inject
    public Paper() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Paper;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isCircle();

        @JsProperty
        void setCircle(boolean circle);

        @JsProperty
        boolean isRounded();

        @JsProperty
        void setRounded(boolean rounded);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        boolean isTransitionEnabled();

        @JsProperty
        void setTransitionEnabled(boolean transitionEnabled);

        @JsProperty(name = "zDepth")
        double getZDepth();

        @JsProperty(name = "zDepth")
        void setZDepth(double zDepth);

        // leaving out onClick as this contains many other components


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props circle(boolean circle) {
            setCircle(circle);
            return this;
        }

        @JsOverlay
        default Props rounded(boolean rounded) {
            setRounded(rounded);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props transitionEnabled(boolean transitionEnabled) {
            setTransitionEnabled(transitionEnabled);
            return this;
        }

        @JsOverlay
        default Props zDepth(double zDepth) {
            Jso.set(this, "zDepth", zDepth);
            return this;
        }

    }
}
