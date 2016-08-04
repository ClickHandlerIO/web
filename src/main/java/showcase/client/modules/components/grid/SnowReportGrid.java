package showcase.client.modules.components.grid;

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

@Singleton
public class SnowReportGrid extends AbstractGrid2<GridDataSource.SnowReport, SnowReportGrid.Props> {

    enum Column {
        DATE,
        RESORT,
        SNOWFALL
    }

    @Inject
    public SnowReportGrid() {
    }

    @Override
    protected GridColumn[] columns() {
        return new GridColumn[]{
                new GridColumn(Column.DATE, "Date", 1, true),
                new GridColumn(Column.RESORT, "Resort", 1, true),
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
    protected ReactElement contentViewForData(GridDataSource.SnowReport data) {
        return div("content view here!!!");
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends AbstractGrid2.Props<GridDataSource.SnowReport> {

    }
}
