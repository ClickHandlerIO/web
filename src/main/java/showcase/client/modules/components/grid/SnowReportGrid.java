package showcase.client.modules.components.grid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.grid2.AbstractGrid2;
import ui.client.grid2.GridColumn;
import ui.client.grid2.GridSort;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;
import static react.client.DOM.span;

@Singleton
public class SnowReportGrid extends AbstractGrid2<GridDataSource.SnowReport, SnowReportGrid.Props> {

    enum Column {
        ID,
        RESORT,
        SNOWFALL
    }

    @Inject
    public SnowReportGrid() {
    }

    @Override
    protected GridColumn[] columns() {
        return new GridColumn[]{
                new GridColumn(Column.ID, "Id", 200., true),
                new GridColumn(Column.RESORT, "Resort", 1, false),
                new GridColumn(Column.SNOWFALL, "Snowfall", 1, true)
        };
    }

    @Override
    protected void fetchData(ReactComponent<Props, State<GridDataSource.SnowReport>> $this, String requestGuid, GridSort sortDirection, Integer sortColumnOrdinal, Double startRecordIdx, GridDataSource.SnowReport lastRecord, double pageSize, CompletionHandler<GridDataSource.SnowReport, Props> completionHandler) {
        GridDataSource.fetchData(null, lastRecord == null ? null : lastRecord.getId(), pageSize, data -> {
            completionHandler.onFetchComplete(requestGuid, data);
        });
    }

    @Override
    protected String dataKey(GridDataSource.SnowReport data) {
        return data.getId();
    }

    @Override
    protected ReactElement contentViewForData(ReactComponent<Props, State<GridDataSource.SnowReport>> $this, GridDataSource.SnowReport data) {
        return div(
                column($this, Column.ID, data.getId()),
                column($this, Column.RESORT, props -> props.className("flex align-items-center"), data.getResortName()),
                column($this, Column.SNOWFALL, props -> props.className("flex align-items-center"), span(data.getSnowfall().toString())) //example of el and not text
        );
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends AbstractGrid2.Props<GridDataSource.SnowReport> {

        @JsOverlay
        public final Props selection(final java.util.List<GridDataSource.SnowReport> selection) {
            this.selection = selection;
            return this;
        }

        @JsOverlay
        public final Props onSelectionChanged(final common.client.Func.Run1<java.util.List<GridDataSource.SnowReport>> onSelectionChanged) {
            this.onSelectionChanged = onSelectionChanged;
            return this;
        }

        @JsOverlay
        public final Props handleExcel(final common.client.Func.Run handleExcel) {
            this.handleExcel = handleExcel;
            return this;
        }

        @JsOverlay
        public final Props handlePDF(final common.client.Func.Run handlePDF) {
            this.handlePDF = handlePDF;
            return this;
        }

        @JsOverlay
        public final Props handlePrint(final common.client.Func.Run handlePrint) {
            this.handlePrint = handlePrint;
            return this;
        }

        @JsOverlay
        public final Props handleEmail(final common.client.Func.Run handleEmail) {
            this.handleEmail = handleEmail;
            return this;
        }
    }
}
