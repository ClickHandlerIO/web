package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.Checkbox;
import ui.client.icons.DragHandleSvgIcon;

import javax.inject.Inject;
import java.util.List;

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
    protected ReactElement render(ReactComponent<P, S> $this) {
        return div($ -> $.className("grid-cell" + " " + ($this.getProps().getClassName() != null ? $this.getProps().getClassName() : "") + ($this.getProps().isSelected() ? " selected" : "")),
            childList -> {
                if ($this.getProps().isReorderEnabled()) {
                    childList.add(
                        div($ -> $.className("reorder"),
                            dragHandleSvgIcon.$()
                        )
                    );
                }

                if ($this.getProps().isSelectionEnabled()) {
                    childList.add(
                        div($ -> $.className("checkbox"),
                            checkbox.$($ -> {
                                $.setChecked($this.getProps().isSelected());
                                $.setOnCheck(() -> {
                                    if ($this.getProps().getOnSelectionChanged() != null) {
                                        $this.getProps().getOnSelectionChanged().run($this.getProps().getData(), !$this.getProps().isSelected());
                                    }
                                });
                            })
                        )
                    );
                }

                childList.add(
                    renderCell($this, $this.getProps().getData(), $this.getProps().getColumns())
                );
            }
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected abstract ReactElement renderCell(ReactComponent<P, S> $this, D data, List<GridColumn> columns);

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

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

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
