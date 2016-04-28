package ui.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;
import react.client.StyleProps;

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
public class CardActions extends ExternalComponent<CardActions.Props> {
    @Inject
    public CardActions() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.CardActions;
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
        boolean isShowExpandableButton();

        @JsProperty
        void setShowExpandableButton(boolean showExpandableButton);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actAsExpander(boolean actAsExpander) {
            setActAsExpander(actAsExpander);
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
    }
}
