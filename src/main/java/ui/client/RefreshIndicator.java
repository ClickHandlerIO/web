package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;
import react.client.StyleProps;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class RefreshIndicator extends ExternalComponent<RefreshIndicator.Props> {

    @Inject
    public RefreshIndicator() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.RefreshIndicator;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String color;
//        double left; // the absolute left position of the indicator in pixels
//        String loadingColor;
//        double percentage = 0; // max is 100
//        double size = 40; // size in pixels
//        String status = "hide"; // enum 'ready' 'loading' 'hide'
//        StyleProps style;
//        double top; // the absolute top position of the indicator in pixels
//        // leaving out onClick, unless we want is to be an attempted interrupt or something, sounds a little odd though

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        double getLeft();

        @JsProperty
        void setLeft(double left);

        @JsProperty
        String getLoadingColor();

        @JsProperty
        void setLoadingColor(String loadingColor);

        @JsProperty
        double getPercentage();

        @JsProperty
        void setPercentage(double percentage);

        @JsProperty
        double getSize();

        @JsProperty
        void setSize(double size);

        @JsProperty
        String getStatus();

        @JsProperty
        void setStatus(String status);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        double getTop();

        @JsProperty
        void setTop(double top);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props color(final String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props left(final double left) {
            setLeft(left);
            return this;
        }

        @JsOverlay
        default Props loadingColor(final String loadingColor) {
            setLoadingColor(loadingColor);
            return this;
        }

        @JsOverlay
        default Props percentage(final double percentage) {
            setPercentage(percentage);
            return this;
        }

        @JsOverlay
        default Props size(final double size) {
            setSize(size);
            return this;
        }

        @JsOverlay
        default Props status(final String status) {
            setStatus(status);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props top(final double top) {
            setTop(top);
            return this;
        }


    }
}
