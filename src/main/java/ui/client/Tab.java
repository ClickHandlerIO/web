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
public class Tab extends ExternalComponent<Tab.Props> {

    @Inject
    public Tab() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Tab;
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
        ReactElement getIcon();

        @JsProperty
        void setIcon(ReactElement icon);

        @JsProperty
        ReactElement getLabel();

        @JsProperty
        void setLabel(ReactElement label);

        @JsProperty
        Func.Run getOnActive();

        @JsProperty
        void setOnActive(Func.Run onActive);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        boolean isSelected();

        @JsProperty
        void setSelected(boolean selected);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        String getWidth();

        @JsProperty
        void setWidth(String width);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props icon(ReactElement icon) {
            setIcon(icon);
            return this;
        }

        @JsOverlay
        default Props label(ReactElement label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props onActive(Func.Run onActive) {
            setOnActive(onActive);
            return this;
        }

        @JsOverlay
        default Props onTouchTap(TouchEventHandler onTouchTap) {
            setOnTouchTap(onTouchTap);
            return this;
        }

        @JsOverlay
        default Props selected(boolean selected) {
            setSelected(selected);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props width(String width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props key(String key) {
            setKey(key);
            return this;
        }
    }
}
