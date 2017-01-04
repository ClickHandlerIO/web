package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.Checkbox;
import ui.client.grid2.GridColumn;

import javax.inject.Inject;
import java.util.List;

import static react.client.DOM.div;


public abstract class GridCell<D, P extends GridCell.Props<D>, S extends GridCell.State> extends Component<P, S> {

    @Inject
    Checkbox checkbox;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(final ReactComponent<P, S> $this) {
//        return div("cell here");
        return div(className("grid-cell" + " " + ($this.props.getClassName() != null ? $this.props.getClassName() : "") + ($this.props.isSelected() ? " selected" : "")),
            childList -> {
                if ($this.props.isReorderEnabled()) {
                    childList.add(
                        div(className("reorder"),
                            "todo"
                        )
                    );
                }

                if ($this.props.isSelectionEnabled()) {
                    childList.add(
                        div(className("checkbox"),
                            checkbox.$($ -> {
                                $.setChecked($this.props.isSelected());
//                                            $.setOnCheck(() -> {
//                                                if ($this.props.onSelectionChanged != null) {
//                                                    $this.props.onSelectionChanged.run($this.props.data, !$this.props.selected);
//                                                }
//                                            });
                            })
                        )
                    );
                }

                childList.add(
                    renderCell($this, $this.props.getData(), $this.props.getColumns())
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
            // todo ?
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


    @JsType(isNative = true)
    public interface Props<D> extends BaseProps {
        @JsProperty
        boolean isSelectionEnabled();

        @JsProperty
        void setSelectionEnabled(boolean selectionEnabled);

        @JsProperty
        boolean isReorderEnabled();

        @JsProperty
        void setReorderEnabled(boolean reorderEnabled);

        @JsProperty
        boolean isSelected();

        @JsProperty
        void setSelected(boolean selected);

        @JsProperty
        Func.Run2<D, Boolean> getOnSelectionChanged();

        @JsProperty
        void setOnSelectionChanged(Func.Run2<D, Boolean> onSelectionChanged);

        @JsProperty
        D getData();

        @JsProperty
        void setData(D data);

        @JsProperty
        List<GridColumn> getColumns();

        @JsProperty
        void setColumns(List<GridColumn> columns);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
