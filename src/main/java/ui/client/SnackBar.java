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
public class SnackBar extends ExternalComponent<SnackBar.Props> {

    @Inject
    public SnackBar() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.SnackBar;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String action; // label for the action
//        int autoHideDuration; // in ms
//        StyleProps bodyStyle;
//        String className;
//        String message; //? node  - required
//        boolean open; // required
//        StyleProps style;
//        TouchEventHandler onActionTouchTap; // func
//        Func.Run onRequestClose; // func
//        MouseEventHandler onClick;


        @JsProperty
        String getAction();

        @JsProperty
        void setAction(String action);

        @JsProperty
        int getAutoHideDuration();

        @JsProperty
        void setAutoHideDuration(int autoHideDuration);

        @JsProperty
        StyleProps getBodyStyle();

        @JsProperty
        void setBodyStyle(StyleProps bodyStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getMessage();

        @JsProperty
        void setMessage(String message);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        TouchEventHandler getOnActionTouchTap();

        @JsProperty
        void setOnActionTouchTap(TouchEventHandler onActionTouchTap);

        @JsProperty
        Func.Run getOnRequestClose();

        @JsProperty
        void setOnRequestClose(Func.Run onRequestClose);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props action(final String action) {
            setAction(action);
            return this;
        }

        @JsOverlay
        default Props autoHideDuration(final int autoHideDuration) {
            setAutoHideDuration(autoHideDuration);
            return this;
        }

        @JsOverlay
        default Props bodyStyle(final StyleProps bodyStyle) {
            setBodyStyle(bodyStyle);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props message(final String message) {
            setMessage(message);
            return this;
        }

        @JsOverlay
        default Props open(final boolean open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onActionTouchTap(final TouchEventHandler onActionTouchTap) {
            setOnActionTouchTap(onActionTouchTap);
            return this;
        }

        @JsOverlay
        default Props onRequestClose(final Func.Run onRequestClose) {
            setOnRequestClose(onRequestClose);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
