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
public class CardTitle extends ExternalComponent<CardTitle.Props> {

    @Inject
    public CardTitle() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.CardTitle;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean actAsExpander;
//        boolean expandable;
//        boolean showExpandableButton;
//        StyleProps style; // ?
//        ReactElement subtitle; // node
//        String subtitleColor;
//        StyleProps subtitleStyle; // ?
//        ReactElement title; // node
//        String titleColor;
//        StyleProps titleStyle; // ?
//        // MouseEventHandle onClick; // added in


        @JsProperty
        boolean isActAsExpander();

        @JsProperty
        void setActAsExpander(boolean actAsExpander);

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
        default Props showExpandableButton(final boolean showExpandableButton) {
            setShowExpandableButton(showExpandableButton);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props subtitle(final ReactElement subtitle) {
            setSubtitle(subtitle);
            return this;
        }

        @JsOverlay
        default Props subtitleColor(final String subtitleColor) {
            setSubtitleColor(subtitleColor);
            return this;
        }

        @JsOverlay
        default Props subtitleStyle(final StyleProps subtitleStyle) {
            setSubtitleStyle(subtitleStyle);
            return this;
        }

        @JsOverlay
        default Props title(final ReactElement title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props titleColor(final String titleColor) {
            setTitleColor(titleColor);
            return this;
        }

        @JsOverlay
        default Props titleStyle(final StyleProps titleStyle) {
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
