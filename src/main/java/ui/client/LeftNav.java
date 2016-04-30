package ui.client;

import common.client.Func;
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
public class LeftNav extends ExternalComponent<LeftNav.Props> {

    @Inject
    public LeftNav() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.LeftNav;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisableSwipeToOpen();

        @JsProperty
        void setDisableSwipeToOpen(boolean disableSwipeToOpen);

        @JsProperty
        boolean isDocked();

        @JsProperty
        void setDocked(boolean docked);

        @JsProperty
        Boolean getOpen();

        @JsProperty
        void setOpen(Boolean open);

        @JsProperty
        boolean isOpenRight();

        @JsProperty
        void setOpenRight(boolean openRight);

        @JsProperty
        String getOverlayClassName();

        @JsProperty
        void setOverlayClassName(String overlayClassName);

        @JsProperty
        StyleProps getOverlayStyle();

        @JsProperty
        void setOverlayStyle(StyleProps overlayStyle);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        double getSwipeAreaWidth();

        @JsProperty
        void setSwipeAreaWidth(double swipeAreaWidth);

        @JsProperty
        Double getWidth();

        @JsProperty
        void setWidth(Double width);

        @JsProperty
        Func.Run2<Boolean, Object> getOnRequestChange();

        @JsProperty
        void setOnRequestChange(Func.Run2<Boolean, Object> onRequestChange);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props disableSwipeToOpen(boolean disableSwipeToOpen) {
            setDisableSwipeToOpen(disableSwipeToOpen);
            return this;
        }

        @JsOverlay
        default Props docked(boolean docked) {
            setDocked(docked);
            return this;
        }

        @JsOverlay
        default Props open(Boolean open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Props openRight(boolean openRight) {
            setOpenRight(openRight);
            return this;
        }

        @JsOverlay
        default Props overlayClassName(String overlayClassName) {
            setOverlayClassName(overlayClassName);
            return this;
        }

        @JsOverlay
        default Props overlayStyle(StyleProps overlayStyle) {
            setOverlayStyle(overlayStyle);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props swipeAreaWidth(double swipeAreaWidth) {
            setSwipeAreaWidth(swipeAreaWidth);
            return this;
        }

        @JsOverlay
        default Props width(Double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props onRequestChange(Func.Run2<Boolean, Object> onRequestChange) {
            setOnRequestChange(onRequestChange);
            return this;
        }

    }
}
