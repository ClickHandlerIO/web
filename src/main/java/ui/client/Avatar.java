package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Avatar extends ExternalComponent<Avatar.Props> {

    @Inject
    public Avatar() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Avatar;
    }-*/;


    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getBackgroundColor();

        @JsProperty
        void setBackgroundColor(String backgroundColor);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        ReactElement getIcon();

        @JsProperty
        void setIcon(ReactElement icon);

        @JsProperty
        int getSize();

        @JsProperty
        void setSize(int size);

        @JsProperty
        String getSrc();

        @JsProperty
        void setSrc(String src);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler style);


        // fluent setters

        @JsOverlay
        default Props backgroundColor(String backgroundColor) {
            setBackgroundColor(backgroundColor);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props color(String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props icon(ReactElement icon) {
            setIcon(icon);
            return this;
        }

        @JsOverlay
        default Props size(int size) {
            setSize(size);
            return this;
        }

        @JsOverlay
        default Props src(String src) {
            setSrc(src);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
