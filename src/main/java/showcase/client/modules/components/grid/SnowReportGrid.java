package showcase.client.modules.components.grid;

import jsinterop.annotations.JsType;
import react.client.ReactElement;
import ui.client.grid2.AbstractGrid2;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class SnowReportGrid extends AbstractGrid2<GridDataSource.SnowReport, SnowReportGrid.Props> {

    @Inject
    public SnowReportGrid() {
    }

    @Override
    protected ReactElement contentViewForData(GridDataSource.SnowReport data) {
        return div("content view here!!!");
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends AbstractGrid2.Props<GridDataSource.SnowReport> {

    }
}
