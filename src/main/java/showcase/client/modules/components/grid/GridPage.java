package showcase.client.modules.components.grid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;
import react.client.router.SimpleRouteProxy;
import showcase.client.modules.components.ComponentsShell;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

/**
 *
 */
@Singleton
public class GridPage extends SimpleRouteComponent<GridPage.Route, GridPage.Props, GridPage.State> {

    @Inject
    Grid grid;
    @Inject
    SnowReportGrid snowReportGrid;

    @Inject
    public GridPage() {
    }

    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div(style().padding("20px"),
                div("Grid Page Here"),
                /*snowReportGrid.props()
                        .selection($this.state.selectedReports)
                        .onSelectionChanged(v -> $this.setState(s->s.selectedReports(v)))
//                        .headerVisible(false)
                        .handleEmail(() -> log.error("imp me!"))
                        .handleExcel(() -> log.error("imp me!"))
                        .handlePDF(() -> log.error("imp me!"))
                        .build()*/
                grid.props()
//                        .selectionEnabled(true)
//                        .selected($this.state.selectedReports)
//                        .onSelectionChanged(value -> {
//                            log.error("On Selection CHanged!");
//                            $this.setState(s -> s.selectedReports(value));
//                        })
//                        .onPrint(() -> {
//
//                        })
//                        .onExcel(() -> {
//
//                        })
                        .build()
        );
    }

    /*
     * Props, State, Route
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends SimpleRouteProps {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
        List<GridDataSource.SnowReport> selectedReports;

        @JsOverlay
        public final State selectedReports(final List<GridDataSource.SnowReport> selectedReports) {
            this.selectedReports = selectedReports;
            return this;
        }
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(ComponentsShell.Route parent) {
            super("grid", parent);
            setSecured(false);
        }
    }
}
