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
public class Table extends ExternalComponent<Table.Props> {

    @Inject
    public Table() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Table;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean allRowsSelected;
//        StyleProps bodyStyle;
//        String className;
//        boolean fixedFooter = true;
//        boolean fixedHeader = true;
//        StyleProps footerStyle;
//        StyleProps headerStyle;
//        String height; // defaults to inherit
//        boolean multiSelectable;
//        boolean selectable;
//        StyleProps style;
//        StyleProps wrapperStyle;
//        MouseEventHandler onCellClick; // func - works in place of onClick
//        MouseEventHandler onCellHover; // func
//        MouseEventHandler onCellHoverExit; // func
//        MouseEventHandler onRowHover; // func
//        MouseEventHandler onRowHoverExit; // func
//        Func.Run onRowSelection; // func


        @JsProperty
        boolean isAllRowsSelected();

        @JsProperty
        void setAllRowsSelected(boolean allRowsSelected);

        @JsProperty
        StyleProps getBodyStyle();

        @JsProperty
        void setBodyStyle(StyleProps bodyStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isFixedFooter();

        @JsProperty
        void setFixedFooter(boolean fixedFooter);

        @JsProperty
        boolean isFixedHeader();

        @JsProperty
        void setFixedHeader(boolean fixedHeader);

        @JsProperty
        StyleProps getFooterStyle();

        @JsProperty
        void setFooterStyle(StyleProps footerStyle);

        @JsProperty
        StyleProps getHeaderStyle();

        @JsProperty
        void setHeaderStyle(StyleProps headerStyle);

        @JsProperty
        String getHeight();

        @JsProperty
        void setHeight(String height);

        @JsProperty
        boolean isMultiSelectable();

        @JsProperty
        void setMultiSelectable(boolean multiSelectable);

        @JsProperty
        boolean isSelectable();

        @JsProperty
        void setSelectable(boolean selectable);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        StyleProps getWrapperStyle();

        @JsProperty
        void setWrapperStyle(StyleProps wrapperStyle);

        @JsProperty
        MouseEventHandler getOnCellClick();

        @JsProperty
        void setOnCellClick(MouseEventHandler onCellClick);

        @JsProperty
        MouseEventHandler getOnCellHover();

        @JsProperty
        void setOnCellHover(MouseEventHandler onCellHover);

        @JsProperty
        MouseEventHandler getOnCellHoverExit();

        @JsProperty
        void setOnCellHoverExit(MouseEventHandler onCellHoverExit);

        @JsProperty
        MouseEventHandler getOnRowHover();

        @JsProperty
        void setOnRowHover(MouseEventHandler onRowHover);

        @JsProperty
        MouseEventHandler getOnRowHoverExit();

        @JsProperty
        void setOnRowHoverExit(MouseEventHandler onRowHoverExit);

        @JsProperty
        Func.Run getOnRowSelection();

        @JsProperty
        void setOnRowSelection(Func.Run onRowSelection);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props allRowsSelected(final boolean allRowsSelected) {
            setAllRowsSelected(allRowsSelected);
            return this;
        }

        @JsOverlay
        default Props bodyStyle(final StyleProps bodyStyle) {
            setBodyStyle(bodyStyle);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props fixedFooter(final boolean fixedFooter) {
            setFixedFooter(fixedFooter);
            return this;
        }

        @JsOverlay
        default Props fixedHeader(final boolean fixedHeader) {
            setFixedHeader(fixedHeader);
            return this;
        }

        @JsOverlay
        default Props footerStyle(final StyleProps footerStyle) {
            setFooterStyle(footerStyle);
            return this;
        }

        @JsOverlay
        default Props headerStyle(final StyleProps headerStyle) {
            setHeaderStyle(headerStyle);
            return this;
        }

        @JsOverlay
        default Props height(final String height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props multiSelectable(final boolean multiSelectable) {
            setMultiSelectable(multiSelectable);
            return this;
        }

        @JsOverlay
        default Props selectable(final boolean selectable) {
            setSelectable(selectable);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props wrapperStyle(final StyleProps wrapperStyle) {
            setWrapperStyle(wrapperStyle);
            return this;
        }

        @JsOverlay
        default Props onCellClick(final MouseEventHandler onCellClick) {
            setOnCellClick(onCellClick);
            return this;
        }

        @JsOverlay
        default Props onCellHover(final MouseEventHandler onCellHover) {
            setOnCellHover(onCellHover);
            return this;
        }

        @JsOverlay
        default Props onCellHoverExit(final MouseEventHandler onCellHoverExit) {
            setOnCellHoverExit(onCellHoverExit);
            return this;
        }

        @JsOverlay
        default Props onRowHover(final MouseEventHandler onRowHover) {
            setOnRowHover(onRowHover);
            return this;
        }

        @JsOverlay
        default Props onRowHoverExit(final MouseEventHandler onRowHoverExit) {
            setOnRowHoverExit(onRowHoverExit);
            return this;
        }

        @JsOverlay
        default Props onRowSelection(final Func.Run onRowSelection) {
            setOnRowSelection(onRowSelection);
            return this;
        }


    }
}
