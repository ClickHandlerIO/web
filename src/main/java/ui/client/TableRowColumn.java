package ui.client;

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
public class TableRowColumn extends ExternalComponent<TableRowColumn.Props> {

    @Inject
    public TableRowColumn() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.TableRowColumn;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        int columnNumber;
//        boolean hoverable;
//        String key;
//        StyleProps style;
//        MouseEventHandler onClick; // func
//        MouseEventHandler onHover; // func
//        MouseEventHandler onHoverExit; // func

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        int getColumnNumber();

        @JsProperty
        void setColumnNumber(int columnNumber);

        @JsProperty
        boolean isHoverable();

        @JsProperty
        void setHoverable(boolean hoverable);

        @JsProperty
        String getKey();

        @JsProperty
        void setKey(String key);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);

        @JsProperty
        MouseEventHandler getOnHover();

        @JsProperty
        void setOnHover(MouseEventHandler onHover);

        @JsProperty
        MouseEventHandler getOnHoverExit();

        @JsProperty
        void setOnHoverExit(MouseEventHandler onHoverExit);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props columnNumber(final int columnNumber) {
            setColumnNumber(columnNumber);
            return this;
        }

        @JsOverlay
        default Props hoverable(final boolean hoverable) {
            setHoverable(hoverable);
            return this;
        }

        @JsOverlay
        default Props key(final String key) {
            setKey(key);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

        @JsOverlay
        default Props onHover(final MouseEventHandler onHover) {
            setOnHover(onHover);
            return this;
        }

        @JsOverlay
        default Props onHoverExit(final MouseEventHandler onHoverExit) {
            setOnHoverExit(onHoverExit);
            return this;
        }

    }
}
