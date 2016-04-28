package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Card_u consists of many different parts that share property names:
 * for now they are separate classes
 * 1. Card_u
 * 2. CardActions
 * 3. CardHeader
 * 4. CardMedia
 * 5. CardTitle
 * 6. CardText
 */
@Singleton
public class CardMedia extends ExternalComponent<CardMedia.Props> {

    @Inject
    public CardMedia() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.CardMedia;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isActAsExpander();

        @JsProperty
        void setActAsExpander(boolean actAsExpander);

        @JsProperty
        boolean isExpandable();

        @JsProperty
        void setExpandable(boolean expandable);

        @JsProperty
        StyleProps getMediaStyle();

        @JsProperty
        void setMediaStyle(StyleProps mediaStyle);

        @JsProperty
        ReactElement getOverlay();

        @JsProperty
        void setOverlay(ReactElement overlay);

        @JsProperty
        StyleProps getOverlayContainerStyle();

        @JsProperty
        void setOverlayContainerStyle(StyleProps overlayContainerStyle);

        @JsProperty
        StyleProps getOverlayContentStyle();

        @JsProperty
        void setOverlayContentStyle(StyleProps overlayContentStyle);

        @JsProperty
        StyleProps getOverlayStyle();

        @JsProperty
        void setOverlayStyle(StyleProps overlayStyle);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actAsExpander(final boolean actAsExpander) {
            setActAsExpander(actAsExpander);
            return this;
        }

        @JsOverlay
        default Props expandable(final boolean expandable) {
            setExpandable(expandable);
            return this;
        }

        @JsOverlay
        default Props mediaStyle(final StyleProps mediaStyle) {
            setMediaStyle(mediaStyle);
            return this;
        }

        @JsOverlay
        default Props overlay(final ReactElement overlay) {
            setOverlay(overlay);
            return this;
        }

        @JsOverlay
        default Props overlayContainerStyle(final StyleProps overlayContainerStyle) {
            setOverlayContainerStyle(overlayContainerStyle);
            return this;
        }

        @JsOverlay
        default Props overlayContentStyle(final StyleProps overlayContentStyle) {
            setOverlayContentStyle(overlayContentStyle);
            return this;
        }

        @JsOverlay
        default Props overlayStyle(final StyleProps overlayStyle) {
            setOverlayStyle(overlayStyle);
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


    }
}
