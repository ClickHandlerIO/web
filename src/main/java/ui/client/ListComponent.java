package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * material ui list, many options and list types - http://www.material-ui.com/#/components/list
 */
@Singleton
public class ListComponent extends ExternalComponent<ListComponent.Props> {

    @Inject
    public ListComponent() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.List;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isInsetSubheader();

        @JsProperty
        void setInsetSubheader(boolean insetSubheader);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        ReactElement getSubheader();

        @JsProperty
        void setSubheader(ReactElement subheader);

        @JsProperty
        Object getSubheaderStyle();

        @JsProperty
        void setSubheaderStyle(Object subheaderStyle);

        @JsProperty
        double getZDepth();

        @JsProperty
        void setZDepth(double zDepth);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props insetSubheader(boolean insetSubheader) {
            setInsetSubheader(insetSubheader);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props subheader(ReactElement subheader) {
            setSubheader(subheader);
            return this;
        }

        @JsOverlay
        default Props subheaderStyle(Object subheaderStyle) {
            setSubheaderStyle(subheaderStyle);
            return this;
        }

        @JsOverlay
        default Props zDepth(double zDepth) {
            setZDepth(zDepth);
            return this;
        }
    }
}
