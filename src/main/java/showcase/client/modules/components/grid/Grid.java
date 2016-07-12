package showcase.client.modules.components.grid;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.grid.AbstractGrid;
import ui.client.grid.GridCell;
import ui.client.grid.GridColumn;
import ui.client.grid.GridSort;

import javax.inject.Inject;
import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

public class Grid extends AbstractGrid<GridDataSource.SnowReport, Grid.Props> {
    private static final String COL_DATE = "DATE";
    private static final String COL_RESORT = "RESORT";
    private static final String COL_SNOWFALL = "SNOWFALL";

    @Inject
    Cell cell;

    @Inject
    public Grid() {
    }

    @Override
    protected GridColumn[] getColumns() {
        return new GridColumn[]{
                new GridColumn(COL_DATE, "Date", 70., true, false),
                new GridColumn(COL_RESORT, "Resort", 1, true, false),
                new GridColumn(COL_SNOWFALL, "Snowfall", 4, true, false),
        };
    }

    /*
     * Lifecycle
     */

    @Override
    public Props getDefaultProps() {
        Props p = super.getDefaultProps();
        p.hideHeader = false;
        p.noResultsText = "No Reports";
        return p;
    }

    /*
     * Work
     */

    @Override
    protected void fetchData(final ReactComponent<Props, State<GridDataSource.SnowReport>> $this, final String requestGuid, String sortColumnId, GridSort sortDirection, GridDataSource.SnowReport lastRecord, final CompletionHandler<GridDataSource.SnowReport, Props> completionHandler) {
        GridDataSource.fetchData(null, lastRecord == null ? null : lastRecord.getId(), 10, data -> {
            completionHandler.onFetchComplete($this, requestGuid, data, false);
        });
    }

    /*
     * Props
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends AbstractGrid.Props<GridDataSource.SnowReport> {
    }

    /*
     * Cell
     */

    @Override
    protected ReactElement createCell(ReactComponent<Props, State<GridDataSource.SnowReport>> $this, boolean reorderEnabled, boolean selectionEnabled, List<GridColumn> columns, GridDataSource.SnowReport data, boolean isSelected, Func.Run2<GridDataSource.SnowReport, Boolean> onSelectionChanged) {
        return cell.$($ -> {
            $.setClassName("hover");
            $.setReorderEnabled(reorderEnabled);
            $.setSelectionEnabled(selectionEnabled);
            $.setColumns(columns);
            $.setData(data);
            $.setSelected(isSelected);
            $.setOnSelectionChanged(onSelectionChanged);
        });
    }

    public static class Cell extends GridCell<GridDataSource.SnowReport, Cell.Props, Cell.State> {

        @Inject
        public Cell() {
        }

        @Override
        protected ReactElement renderCell(ReactComponent<Props, State> $this, GridDataSource.SnowReport data, List<GridColumn> columns) {
            return div($ -> $.className("cell"),
                    div($ -> $.style(s -> applyColumnSizing(s, COL_DATE, columns)),
                            "1/1/2016"
                    ),
                    div($ -> $.style(s -> applyColumnSizing(s, COL_RESORT, columns)),
                            "test"
//                            data.getResortName()
                    ),


                    div($ -> $.style(s -> applyColumnSizing(s, COL_SNOWFALL, columns)),
                            "here"
//                            data.getSnowfall().toString()
                    )
            );
        }

        /*
         * Cell Props and State
         */

        @JsType(isNative = true)
        public interface Props extends GridCell.Props<GridDataSource.SnowReport> {

        }

        @JsType(isNative = true)
        public interface State extends GridCell.State {

        }
    }
}
