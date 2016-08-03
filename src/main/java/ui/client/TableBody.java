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
public class TableBody extends ExternalComponent<TableBody.Props> {

    @Inject
    public TableBody() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.TableBody;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean allRowsSelected;
//        String className;
//        boolean deselectOnClickaway = true;
//        boolean displayRowCheckbox = true;
//        boolean multiSelectable;
//        boolean preScanRows = true;
//        boolean selectable = true;
//        boolean showRowHover;
//        boolean stripedRows;
//        StyleProps style;
//        MouseEventHandler onCellClick; // func - in place of onClick
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
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDeselectOnClickaway();

        @JsProperty
        void setDeselectOnClickaway(boolean deselectOnClickaway);

        @JsProperty
        boolean isDisplayRowCheckbox();

        @JsProperty
        void setDisplayRowCheckbox(boolean displayRowCheckbox);

        @JsProperty
        boolean isMultiSelectable();

        @JsProperty
        void setMultiSelectable(boolean multiSelectable);

        @JsProperty
        boolean isPreScanRows();

        @JsProperty
        void setPreScanRows(boolean preScanRows);

        @JsProperty
        boolean isSelectable();

        @JsProperty
        void setSelectable(boolean selectable);

        @JsProperty
        boolean isShowRowHover();

        @JsProperty
        void setShowRowHover(boolean showRowHover);

        @JsProperty
        boolean isStripedRows();

        @JsProperty
        void setStripedRows(boolean stripedRows);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

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
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props deselectOnClickaway(final boolean deselectOnClickaway) {
            setDeselectOnClickaway(deselectOnClickaway);
            return this;
        }

        @JsOverlay
        default Props displayRowCheckbox(final boolean displayRowCheckbox) {
            setDisplayRowCheckbox(displayRowCheckbox);
            return this;
        }

        @JsOverlay
        default Props multiSelectable(final boolean multiSelectable) {
            setMultiSelectable(multiSelectable);
            return this;
        }

        @JsOverlay
        default Props preScanRows(final boolean preScanRows) {
            setPreScanRows(preScanRows);
            return this;
        }

        @JsOverlay
        default Props selectable(final boolean selectable) {
            setSelectable(selectable);
            return this;
        }

        @JsOverlay
        default Props showRowHover(final boolean showRowHover) {
            setShowRowHover(showRowHover);
            return this;
        }

        @JsOverlay
        default Props stripedRows(final boolean stripedRows) {
            setStripedRows(stripedRows);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
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
