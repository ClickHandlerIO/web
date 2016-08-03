package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.Checkbox;
import ui.client.icons.DragHandleSvgIcon;

import javax.inject.Inject;
import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;


public abstract class GridCell<D, P extends GridCell.Props<D>, S extends GridCell.State> extends Component<P, S> {

    @Inject
    Checkbox checkbox;
    @Inject
    DragHandleSvgIcon dragHandleSvgIcon;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(final ReactComponent<P, S> $this) {
//        return div("cell here");
        return div(className("grid-cell" + " " + ($this.props.className != null ? $this.props.className : "") + ($this.props.selected ? " selected" : "")),
                childList -> {
                    if ($this.props.reorderEnabled) {
                        childList.add(
                                div(className("reorder"),
                                        dragHandleSvgIcon.$()
                                )
                        );
                    }

                    if ($this.props.selectionEnabled) {
                        childList.add(
                                div(className("checkbox"),
                                        checkbox.$($ -> {
                                            $.setChecked($this.props.selected);
                                            $.setOnCheck(() -> {
                                                if ($this.props.onSelectionChanged != null) {
                                                    $this.props.onSelectionChanged.run($this.props.data, !$this.props.selected);
                                                }
                                            });
                                        })
                                )
                        );
                    }

                    childList.add(
                            renderCell($this, $this.props.data, $this.props.columns)
                    );
                }
        );
    }

    protected abstract ReactElement renderCell(ReactComponent<P, S> $this, D data, List<GridColumn> columns);

    protected StyleProps stylePropsWithColumnSizing(String columnId, List<GridColumn> columns) {
        return applyColumnSizing(new StyleProps(), columnId, columns);
    }

    protected StyleProps applyColumnSizing(StyleProps style, String columnId, List<GridColumn> columns) {
        if (style == null) {
            style = new StyleProps();
        }

        if (columnId == null || columnId.isEmpty() || columns == null || columns.isEmpty()) {
            return style;
        }

        GridColumn column = null;
        for (GridColumn c : columns) {
            if (c.getId() != null && c.getId().equals(columnId)) {
                column = c;
                break;
            }
        }

        if (column == null) {
            return style;
        }

        GridColumn.Display display = column.getDisplay();
        if (display == null) {
            return style;
        }

//        style.overflow("hidden");
        style.minWidth(display.getMinWidth() == null ? 0 : display.getMinWidth() + "px");
        if (display.getWidth() != null) {
            style.width(display.getWidth() + "px");
        } else {
            style.flexGrow(display.getFlexGrow());
            style.flexShrink(display.getFlexShrink());
            style.flexBasis(display.getFlexBasis());
        }
        return style;
    }


    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<D> extends ComponentProps {
        public boolean selectionEnabled;
        public boolean reorderEnabled;
        public boolean selected;
        public Func.Run2<D, Boolean> onSelectionChanged;
        public D data;
        public List<GridColumn> columns;
        public String className;
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
