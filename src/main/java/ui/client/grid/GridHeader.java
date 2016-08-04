package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.Checkbox;
import ui.client.grid2.GridColumn;
import ui.client.grid2.GridSort;

import javax.inject.Inject;
import java.util.List;

import static react.client.DOM.div;

public class GridHeader extends Component<GridHeader.Props, GridHeader.State> {

    @Inject
    Checkbox checkbox;
    @Inject
    GridHeaderCell gridHeaderCell;

    @Inject
    public GridHeader() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return
            div(className("grid-header"),
                headerChildren -> {
                    if ($this.props.isReorderEnabled()) {
                        headerChildren.add(div(className("reorder-placeholder")));
                    }

                    if ($this.props.isSelectionEnabled()) {
                        headerChildren.add(
                            div(className("checkbox"),
                                checkbox.$($ -> {
                                    $.setChecked($this.props.isAllSelected());
//                                    $.setOnCheck(() -> {
//                                        if ($this.props.getOnAllSelectedChanged() != null) {
//                                            $this.props.getOnAllSelectedChanged().run(!$this.props.isAllSelected());
//                                        }
//                                    });
                                })
                            )
                        );
                    }

                    headerChildren.add(
                        div(className("header-row-container"),
                            rowContainerChildren -> {
                                for (double i = 0.; i <= $this.state.getMaxRowIdx(); ++i) {
                                    final double j = i;
                                    rowContainerChildren.add(
                                        div(className("header-row"),
                                            rowChildren -> {
                                                for (GridColumn c : $this.props.getColumns()) {
                                                    if (c.getDisplay().getRow() == j) {
                                                        rowChildren.add(
                                                            gridHeaderCell.$($ -> {
                                                                $.setColumn(c);
                                                                $.setOnSortChanged((c2, sort) -> {
                                                                    if ($this.props.getOnSortChanged() != null) {
                                                                        $this.props.getOnSortChanged().run(c2, sort);
                                                                    }
                                                                });
                                                            })
                                                        );
                                                    }
                                                }
                                            }
                                        )
                                    );
                                }
                            }
                        )
                    );
                }
            );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.intakeProps($this, nextProps);

        // get row count
        double maxRowIdx = 0.;
        if (nextProps.getColumns() != null) {
            for (GridColumn c : nextProps.getColumns()) {
                maxRowIdx = c.getDisplay().getRow() > maxRowIdx ? c.getDisplay().getRow() : maxRowIdx;
            }
        }

        final double finalMaxRowIdx = maxRowIdx;
        $this.setState(s -> s.setMaxRowIdx(finalMaxRowIdx));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public boolean selectionEnabled;
        public boolean reorderEnabled;
        public boolean allSelected;
        public List<GridColumn> columns;
        public Func.Run1<Boolean> onAllSelectedChanged;
        public Func.Run2<GridColumn, GridSort> onSortChanged;
        
        @JsOverlay
        public final boolean isSelectionEnabled() {
            return selectionEnabled;
        }

        @JsOverlay
        public final void setSelectionEnabled(boolean selectionEnabled) {
            this.selectionEnabled = selectionEnabled;
        }

        @JsOverlay
        public final boolean isReorderEnabled() {
            return reorderEnabled;
        }

        @JsOverlay
        public final void setReorderEnabled(boolean reorderEnabled) {
            this.reorderEnabled = reorderEnabled;
        }

        @JsOverlay
        public final boolean isAllSelected() {
            return allSelected;
        }

        @JsOverlay
        public final void setAllSelected(boolean allSelected) {
            this.allSelected = allSelected;
        }

        @JsOverlay
        public final List<GridColumn> getColumns() {
            return columns;
        }

        @JsOverlay
        public final void setColumns(List<GridColumn> columns) {
            this.columns = columns;
        }

        @JsOverlay
        public final Func.Run1<Boolean> getOnAllSelectedChanged() {
            return onAllSelectedChanged;
        }

        @JsOverlay
        public final void setOnAllSelectedChanged(Func.Run1<Boolean> onAllSelectedChanged) {
            this.onAllSelectedChanged = onAllSelectedChanged;
        }

        @JsOverlay
        public final Func.Run2<GridColumn, GridSort> getOnSortChanged() {
            return onSortChanged;
        }

        @JsOverlay
        public final void setOnSortChanged(Func.Run2<GridColumn, GridSort> onSortChanged) {
            this.onSortChanged = onSortChanged;
        }

        @JsOverlay
        public final Props selectionEnabled(final boolean selectionEnabled) {
            this.selectionEnabled = selectionEnabled;
            return this;
        }

        @JsOverlay
        public final Props reorderEnabled(final boolean reorderEnabled) {
            this.reorderEnabled = reorderEnabled;
            return this;
        }

        @JsOverlay
        public final Props allSelected(final boolean allSelected) {
            this.allSelected = allSelected;
            return this;
        }

        @JsOverlay
        public final Props columns(final List<GridColumn> columns) {
            this.columns = columns;
            return this;
        }

        @JsOverlay
        public final Props onAllSelectedChanged(final Func.Run1<Boolean> onAllSelectedChanged) {
            this.onAllSelectedChanged = onAllSelectedChanged;
            return this;
        }

        @JsOverlay
        public final Props onSortChanged(final Func.Run2<GridColumn, GridSort> onSortChanged) {
            this.onSortChanged = onSortChanged;
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        double getMaxRowIdx();

        @JsProperty
        void setMaxRowIdx(double maxRowIdx);
    }
}
