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
public class TableHeader extends ExternalComponent<TableHeader.Props> {

    @Inject
    public TableHeader() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.TableHeader;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean adjustForCheckBox;
//        String className;
//        boolean displaySelectAll = true;
//        boolean enableSelectAll = true;
//        boolean selectAllSelected;
//        StyleProps style;
//        Func.Run onSelectAll; // func
//        MouseEventHandler onClick;

        @JsProperty
        boolean isAdjustForCheckBox();

        @JsProperty
        void setAdjustForCheckBox(boolean adjustForCheckBox);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisplaySelectAll();

        @JsProperty
        void setDisplaySelectAll(boolean displaySelectAll);

        @JsProperty
        boolean isEnableSelectAll();

        @JsProperty
        void setEnableSelectAll(boolean enableSelectAll);

        @JsProperty
        boolean isSelectAllSelected();

        @JsProperty
        void setSelectAllSelected(boolean selectAllSelected);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        Func.Run getOnSelectAll();

        @JsProperty
        void setOnSelectAll(Func.Run onSelectAll);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props adjustForCheckBox(final boolean adjustForCheckBox) {
            setAdjustForCheckBox(adjustForCheckBox);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props displaySelectAll(final boolean displaySelectAll) {
            setDisplaySelectAll(displaySelectAll);
            return this;
        }

        @JsOverlay
        default Props enableSelectAll(final boolean enableSelectAll) {
            setEnableSelectAll(enableSelectAll);
            return this;
        }

        @JsOverlay
        default Props selectAllSelected(final boolean selectAllSelected) {
            setSelectAllSelected(selectAllSelected);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onSelectAll(final Func.Run onSelectAll) {
            setOnSelectAll(onSelectAll);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
