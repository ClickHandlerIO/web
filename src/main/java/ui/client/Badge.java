package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Badge extends ExternalComponent<Badge.Props> {
    @Inject
    public Badge() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Badge;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement getBadgeContent();

        @JsProperty
        void setBadgeContent(ReactElement badgeContent);

        @JsProperty
        StyleProps getBadgeStyle();

        @JsProperty
        void setBadgeStyle(StyleProps badgeStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isPrimary();

        @JsProperty
        void setPrimary(boolean primary);

        @JsProperty
        boolean isSecondary();

        @JsProperty
        void setSecondary(boolean secondary);

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
        default Props badgeContent(ReactElement badgeContent) {
            setBadgeContent(badgeContent);
            return this;
        }

        @JsOverlay
        default Props badgeStyle(StyleProps badgeStyle) {
            setBadgeStyle(badgeStyle);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props primary(boolean primary) {
            setPrimary(primary);
            return this;
        }

        @JsOverlay
        default Props secondary(boolean secondary) {
            setSecondary(secondary);
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
