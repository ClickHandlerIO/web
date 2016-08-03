package ui.client;

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
public class TableRow extends ExternalComponent<TableRow.Props> {

    @Inject
    public TableRow() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.TableRow;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        boolean displayborder = true;
//        boolean hoverable;
//        boolean hovered;
//        double rowNumber; // automatiaclly populated when used with TableBody
//        boolean selectable;
//        boolean selected;
//        boolean striped;
//        StyleProps style;
//        MouseEventHandler onCellClick; // func  - replace onClick
//        MouseEventHandler onCellHover; // func
//        MouseEventHandler onCellHoverExit; // func
//        MouseEventHandler onRowClick; // func
//        MouseEventHandler onRowHover; // func
//        MouseEventHandler onRowHoverExit; // func

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisplayborder();

        @JsProperty
        void setDisplayborder(boolean displayborder);

        @JsProperty
        boolean isHoverable();

        @JsProperty
        void setHoverable(boolean hoverable);

        @JsProperty
        boolean isHovered();

        @JsProperty
        void setHovered(boolean hovered);

        @JsProperty
        double getRowNumber();

        @JsProperty
        void setRowNumber(double rowNumber);

        @JsProperty
        boolean isSelectable();

        @JsProperty
        void setSelectable(boolean selectable);

        @JsProperty
        boolean isSelected();

        @JsProperty
        void setSelected(boolean selected);

        @JsProperty
        boolean isStriped();

        @JsProperty
        void setStriped(boolean striped);

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
        MouseEventHandler getOnRowClick();

        @JsProperty
        void setOnRowClick(MouseEventHandler onRowClick);

        @JsProperty
        MouseEventHandler getOnRowHover();

        @JsProperty
        void setOnRowHover(MouseEventHandler onRowHover);

        @JsProperty
        MouseEventHandler getOnRowHoverExit();

        @JsProperty
        void setOnRowHoverExit(MouseEventHandler onRowHoverExit);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props displayborder(final boolean displayborder) {
            setDisplayborder(displayborder);
            return this;
        }

        @JsOverlay
        default Props hoverable(final boolean hoverable) {
            setHoverable(hoverable);
            return this;
        }

        @JsOverlay
        default Props hovered(final boolean hovered) {
            setHovered(hovered);
            return this;
        }

        @JsOverlay
        default Props rowNumber(final double rowNumber) {
            setRowNumber(rowNumber);
            return this;
        }

        @JsOverlay
        default Props selectable(final boolean selectable) {
            setSelectable(selectable);
            return this;
        }

        @JsOverlay
        default Props selected(final boolean selected) {
            setSelected(selected);
            return this;
        }

        @JsOverlay
        default Props striped(final boolean striped) {
            setStriped(striped);
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
        default Props onRowClick(final MouseEventHandler onRowClick) {
            setOnRowClick(onRowClick);
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


    }
}
