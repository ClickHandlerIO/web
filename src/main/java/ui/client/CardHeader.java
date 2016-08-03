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
public class CardHeader extends ExternalComponent<CardHeader.Props> {
    @Inject
    public CardHeader() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.CardHeader;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isActAsExpander();

        @JsProperty
        void setActAsExpander(boolean actAsExpander);

        @JsProperty
        ReactElement getAvatar();

        @JsProperty
        void setAvatar(ReactElement avatar);

        @JsProperty
        boolean isExpandable();

        @JsProperty
        void setExpandable(boolean expandable);

        @JsProperty
        boolean isShowExpandableButton();

        @JsProperty
        void setShowExpandableButton(boolean showExpandableButton);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        ReactElement getSubtitle();

        @JsProperty
        void setSubtitle(ReactElement subtitle);

        @JsProperty
        String getSubtitleColor();

        @JsProperty
        void setSubtitleColor(String subtitleColor);

        @JsProperty
        StyleProps getSubtitleStyle();

        @JsProperty
        void setSubtitleStyle(StyleProps subtitleStyle);

        @JsProperty
        StyleProps getTextStyle();

        @JsProperty
        void setTextStyle(StyleProps textStyle);

        @JsProperty
        ReactElement getTitle();

        @JsProperty
        void setTitle(ReactElement title);

        @JsProperty
        String getTitleColor();

        @JsProperty
        void setTitleColor(String titleColor);

        @JsProperty
        StyleProps getTitleStyle();

        @JsProperty
        void setTitleStyle(StyleProps titleStyle);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actAsExpander(boolean actAsExpander) {
            setActAsExpander(actAsExpander);
            return this;
        }

        @JsOverlay
        default Props avatar(ReactElement avatar) {
            setAvatar(avatar);
            return this;
        }

        @JsOverlay
        default Props expandable(boolean expandable) {
            setExpandable(expandable);
            return this;
        }

        @JsOverlay
        default Props showExpandableButton(boolean showExpandableButton) {
            setShowExpandableButton(showExpandableButton);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props subtitle(ReactElement subtitle) {
            setSubtitle(subtitle);
            return this;
        }

        @JsOverlay
        default Props subtitleColor(String subtitleColor) {
            setSubtitleColor(subtitleColor);
            return this;
        }

        @JsOverlay
        default Props subtitleStyle(StyleProps subtitleStyle) {
            setSubtitleStyle(subtitleStyle);
            return this;
        }

        @JsOverlay
        default Props textStyle(StyleProps textStyle) {
            setTextStyle(textStyle);
            return this;
        }

        @JsOverlay
        default Props title(ReactElement title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props titleColor(String titleColor) {
            setTitleColor(titleColor);
            return this;
        }

        @JsOverlay
        default Props titleStyle(StyleProps titleStyle) {
            setTitleStyle(titleStyle);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
