package ui.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Dialog extends ExternalComponent<Dialog.Props> {

    @Inject
    public Dialog() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Dialog;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement[] getActions();

        @JsProperty
        void setActions(ReactElement[] actions);

        @JsProperty
        String getActionsContainerClassName();

        @JsProperty
        void setActionsContainerClassName(String actionsContainerClassName);

        @JsProperty
        StyleProps getActionsContainerStyle();

        @JsProperty
        void setActionsContainerStyle(StyleProps actionsContainerStyle);

        @JsProperty
        boolean isAutoDetectWindowHeight();

        @JsProperty
        void setAutoDetectWindowHeight(boolean autoDetectWindowHeight);

        @JsProperty
        boolean isAutoScrollBodyContent();

        @JsProperty
        void setAutoScrollBodyContent(boolean autoScrollBodyContent);

        @JsProperty
        String getBodyClassName();

        @JsProperty
        void setBodyClassName(String bodyClassName);

        @JsProperty
        StyleProps getBodyStyle();

        @JsProperty
        void setBodyStyle(StyleProps bodyStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getContentClassName();

        @JsProperty
        void setContentClassName(String contentClassName);

        @JsProperty
        StyleProps getContentStyle();

        @JsProperty
        void setContentStyle(StyleProps contentStyle);

        @JsProperty
        boolean isModal();

        @JsProperty
        void setModal(boolean modal);

        @JsProperty
        Func.Run1<Boolean> getOnRequestClose();

        @JsProperty
        void setOnRequestClose(Func.Run1<Boolean> onRequestClose);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        String getOverlayClassName();

        @JsProperty
        void setOverlayClassName(String overlayClassName);

        @JsProperty
        StyleProps getOverlayStyle();

        @JsProperty
        void setOverlayStyle(StyleProps overlayStyle);

        @JsProperty
        boolean isRepositionOnUpdate();

        @JsProperty
        void setRepositionOnUpdate(boolean repositionOnUpdate);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        String getTitleClassName();

        @JsProperty
        void setTitleClassName(String titleClassName);

        @JsProperty
        StyleProps getTitleStyle();

        @JsProperty
        void setTitleStyle(StyleProps titleStyle);


        ////////////////////
        // fluent setters
        ////////////////////


        @JsOverlay
        default Props actions(ReactElement[] actions) {
            setActions(actions);
            return this;
        }

        @JsOverlay
        default Props actionsContainerClassName(String actionsContainerClassName) {
            setActionsContainerClassName(actionsContainerClassName);
            return this;
        }

        @JsOverlay
        default Props actionsContainerStyle(StyleProps actionsContainerStyle) {
            setActionsContainerStyle(actionsContainerStyle);
            return this;
        }

        @JsOverlay
        default Props autoDetectWindowHeight(boolean autoDetectWindowHeight) {
            setAutoDetectWindowHeight(autoDetectWindowHeight);
            return this;
        }

        @JsOverlay
        default Props autoScrollBodyContent(boolean autoScrollBodyContent) {
            setAutoScrollBodyContent(autoScrollBodyContent);
            return this;
        }

        @JsOverlay
        default Props bodyClassName(String bodyClassName) {
            setBodyClassName(bodyClassName);
            return this;
        }

        @JsOverlay
        default Props bodyStyle(StyleProps bodyStyle) {
            setBodyStyle(bodyStyle);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props contentClassName(String contentClassName) {
            setContentClassName(contentClassName);
            return this;
        }

        @JsOverlay
        default Props contentStyle(StyleProps contentStyle) {
            setContentStyle(contentStyle);
            return this;
        }

        @JsOverlay
        default Props modal(boolean modal) {
            setModal(modal);
            return this;
        }

        @JsOverlay
        default Props onRequestClose(Func.Run1<Boolean> onRequestClose) {
            setOnRequestClose(onRequestClose);
            return this;
        }

        @JsOverlay
        default Props open(boolean open) {
            setOpen(open);
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
        default Props repositionOnUpdate(boolean repositionOnUpdate) {
            setRepositionOnUpdate(repositionOnUpdate);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props title(String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props titleClassName(String titleClassName) {
            setTitleClassName(titleClassName);
            return this;
        }

        @JsOverlay
        default Props titleStyle(StyleProps titleStyle) {
            setTitleStyle(titleStyle);
            return this;
        }


    }
}