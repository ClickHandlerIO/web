package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.Component;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.Checkbox;

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
        return div($ -> $.className("grid-header"),
            headerChildren -> {
                if ($this.getProps().isReorderEnabled()) {
                    headerChildren.add(div($ -> $.className("reorder-placeholder")));
                }

                if ($this.getProps().isSelectionEnabled()) {
                    headerChildren.add(
                        div($ -> $.className("checkbox"),
                            checkbox.$($ -> {
                                $.setChecked($this.getProps().isAllSelected());
                                $.setOnCheck(() -> {
                                    if ($this.getProps().getOnAllSelectedChanged() != null) {
                                        $this.getProps().getOnAllSelectedChanged().run(!$this.getProps().isAllSelected());
                                    }
                                });
                            })
                        )
                    );
                }

                headerChildren.add(
                    div($ -> $.className("header-row-container"),
                        rowContainerChildren -> {
                            for (double i = 0.; i <= $this.getState().getMaxRowIdx(); ++i) {
                                final double j = i;
                                rowContainerChildren.add(
                                    div($ -> $.className("header-row"),
                                        rowChildren -> {
                                            for (GridColumn c : $this.getProps().getColumns()) {
                                                if (c.getDisplay().getRow() == j) {
                                                    rowChildren.add(
                                                        gridHeaderCell.$($ -> {
                                                            $.setColumn(c);
                                                            $.setOnSortChanged((c2, sort) -> {
                                                                if ($this.getProps().getOnSortChanged() != null) {
                                                                    $this.getProps().getOnSortChanged().run(c2, sort);
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

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isSelectionEnabled();

        @JsProperty
        void setSelectionEnabled(boolean selectionEnabled);

        @JsProperty
        boolean isReorderEnabled();

        @JsProperty
        void setReorderEnabled(boolean reorderEnabled);

        @JsProperty
        boolean isAllSelected();

        @JsProperty
        void setAllSelected(boolean allSelected);

        @JsProperty
        List<GridColumn> getColumns();

        @JsProperty
        void setColumns(List<GridColumn> columns);

        @JsProperty
        Func.Run1<Boolean> getOnAllSelectedChanged();

        @JsProperty
        void setOnAllSelectedChanged(Func.Run1<Boolean> onAllSelectedChanged);

        @JsProperty
        Func.Run2<GridColumn, GridSort> getOnSortChanged();

        @JsProperty
        void setOnSortChanged(Func.Run2<GridColumn, GridSort> onSortChanged);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        double getMaxRowIdx();

        @JsProperty
        void setMaxRowIdx(double maxRowIdx);
    }
}
