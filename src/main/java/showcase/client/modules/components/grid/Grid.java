package showcase.client.modules.components.grid;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.grid.AbstractGrid;
import ui.client.grid.GridCell;
import ui.client.grid2.GridColumn;
import ui.client.grid2.GridSort;

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
        return null;
//        return new GridColumn[]{
//                new GridColumn(COL_DATE, "Date", 1, true, false),
//                new GridColumn(COL_RESORT, "Resort", 1, true, false),
//                new GridColumn(COL_SNOWFALL, "Snowfall", 1, true, false),
//        };
    }

    /*
     * Lifecycle
     */

    @Override
    public Props getDefaultProps() {
        return super.getDefaultProps().hideHeader(false).noResultsText("No Reports");
    }

    /*
     * Work
     */

    @Override
    protected void fetchData(final ReactComponent<Props, State<GridDataSource.SnowReport>> $this, final String requestGuid, String sortColumnId, GridSort sortDirection, GridDataSource.SnowReport lastRecord, double pageSize, final CompletionHandler<GridDataSource.SnowReport, Props> completionHandler) {
//        log.error("Fetch Data, start record idx: " + startRecordIdx + " lsatRecordId: " + (lastRecord != null ? lastRecord.getId() : "NULL"));
        GridDataSource.fetchData(null, lastRecord == null ? null : lastRecord.getId(), pageSize, data -> {
            completionHandler.onFetchComplete($this, requestGuid, data);
        });
    }

    /*
     * Props
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends AbstractGrid.Props<GridDataSource.SnowReport> {

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
        public final Props hideHeader(final boolean hideHeader) {
            this.hideHeader = hideHeader;
            return this;
        }

        @JsOverlay
        public final Props loadWhenMounted(final boolean loadWhenMounted) {
            this.loadWhenMounted = loadWhenMounted;
            return this;
        }

        @JsOverlay
        public final Props selected(final List<GridDataSource.SnowReport> selected) {
            this.selected = selected;
            return this;
        }

        @JsOverlay
        public final Props onSelectionChanged(final Func.Run1<List<GridDataSource.SnowReport>> onSelectionChanged) {
            this.onSelectionChanged = onSelectionChanged;
            return this;
        }

        @JsOverlay
        public final Props noResultsText(final String noResultsText) {
            this.noResultsText = noResultsText;
            return this;
        }

        @JsOverlay
        public final Props noResultsComponent(final ReactElement noResultsComponent) {
            this.noResultsComponent = noResultsComponent;
            return this;
        }

        @JsOverlay
        public final Props key(final String key) {
            this.key = key;
            return this;
        }

        @JsOverlay
        public final Props onExcel(final Func.Run onExcel) {
            this.onExcel = onExcel;
            return this;
        }

        @JsOverlay
        public final Props onPDF(final Func.Run onPDF) {
            this.onPDF = onPDF;
            return this;
        }

        @JsOverlay
        public final Props onPrint(final Func.Run onPrint) {
            this.onPrint = onPrint;
            return this;
        }

        @JsOverlay
        public final Props onEmail(final Func.Run onEmail) {
            this.onEmail = onEmail;
            return this;
        }
    }

    /*
     * Cell
     */

    @Override
    protected ReactElement createCell(ReactComponent<Props, State<GridDataSource.SnowReport>> $this, boolean reorderEnabled, boolean selectionEnabled, List<GridColumn> columns, GridDataSource.SnowReport data, boolean isSelected, Func.Run2<GridDataSource.SnowReport, Boolean> onSelectionChanged) {
        return cell.createElement(props -> {
            props.setClassName("hover");
            props.setReorderEnabled(reorderEnabled);
            props.setSelectionEnabled(selectionEnabled);
            props.setColumns(columns);
            props.setData(data);
            props.setSelected(isSelected);
            props.setOnSelectionChanged(onSelectionChanged);
            props.setKey(data.getId());
        });
    }

    public static class Cell extends GridCell<GridDataSource.SnowReport, Cell.Props, Cell.State> {

        @Inject
        public Cell() {
        }

        @Override
        protected ReactElement renderCell(ReactComponent<Props, State> $this, GridDataSource.SnowReport data, List<GridColumn> columns) {
            return div(className("cell"),
                    div(stylePropsWithColumnSizing(COL_DATE, columns),
                            data.getId()
                    ),
                    div(stylePropsWithColumnSizing(COL_RESORT, columns),
                            data.getResortName()
                    ),
                    div(stylePropsWithColumnSizing(COL_SNOWFALL, columns),
                            data.getSnowfall().toString()
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
