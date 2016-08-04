package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public abstract class AbstractGrid2<D, P extends AbstractGrid2.Props<D>> extends Component<P, AbstractGrid2.State<D>> {

    @Inject
    Grid2Header header;
    @Inject
    Grid2Footer footer;
    @Inject
    Grid2Cell cell;

    @Override
    protected ReactElement render(final ReactComponent<P, State<D>> $this) {
        return div(className("grid2"), children -> {

                    children.add(
                            header.props()
                                    .columns($this.state.columns)
                                    .headerVisible($this.props.headerVisible)
                                    .selectionEnabled($this.props.selectionEnabled)
                                    .allSelected(false) // todo
                                    .onAllSelectedChanged(checked -> {
                                        log.error("impl me");
                                    })
                                    .onSortChanged((gridColumn, gridSort) -> {
                                        log.error("impl me");
                                    })
                                    .build()
                    );

                    children.add(
                            div(className("body"), bodyChildren -> {
                                if ($this.state.loading) {
                                    // TODO loading ui
                                    return;
                                }

                                for (D d : $this.state.data) {
                                    bodyChildren.add(
                                            cell.props()
                                                    .key(dataKey(d))
                                                    .leadingAccessoryView(leadingAccessoryViewForData(d))
                                                    .contentView(contentViewForData(d))
                                                    .selected(false)
                                                    .build()
                                    );
                                }
                            })
                    );

                    children.add(
                            footer.props()
                                    .handleExcel($this.props.handleExcel)
                                    .handlePDF($this.props.handlePDF)
                                    .handlePrint($this.props.handlePrint)
                                    .handleEmail($this.props.handleEmail)
                                    .pagerVisible($this.state.pageIdx != 0 || $this.state.moreResults)
                                    .pagerPreviousEnabled($this.state.pageIdx > 0)
                                    .pagerNextEnabled($this.state.moreResults)
                                    .handlePagerNext(() -> {
                                        if ($this.state.loading) {
                                            return;
                                        }
                                        $this.setState(s -> s.pageIdx = $this.state.pageIdx + 1, () -> load($this));
                                    })
                                    .handlePagerPrevious(() -> {
                                        if ($this.state.loading) {
                                            return;
                                        }
                                        $this.setState(s -> s.pageIdx = $this.state.pageIdx - 1, () -> load($this));
                                    })
                                    .build()
                    );
                }
        );
    }

    @Override
    public P getDefaultProps() {
        P props = super.getDefaultProps();
        props.headerVisible = true;
        props.loadOnMount = true;
        props.pageSize = 20.;
        props.noResultsText = "No Results";
        return props;
    }

    @Override
    public State<D> getInitialState() {
        State<D> s = super.getInitialState();
        s.columns = columns();
        s.loading = true; // start in loading state (no data yet)
        s.pageIdx = 0.;
        return s;
    }

    @Override
    protected void componentDidMount(ReactComponent<P, State<D>> $this) {
        super.componentDidMount($this);
        if ($this.props.loadOnMount) {
            load($this);
        }
    }

    @Override
    protected boolean shouldComponentUpdate(ReactComponent<P, State<D>> $this, P nextProps, State<D> nextState) {
        boolean sup = super.shouldComponentUpdate($this, nextProps, nextState);
        return sup;
    }

    protected abstract GridColumn[] columns();

    // Fetch Data

    protected void load(final ReactComponent<P, State<D>> $this) {
        final String requestGuid = ui.client.util.UUID.uuid();
        $this.setState(s -> {
            s.loading = true;
            s.pendingRequestGuid = requestGuid;
        }, () -> {
            fetchData($this, requestGuid, GridSort.NONE, null, 0., null, $this.props.pageSize + 1, (guid, d) -> {

                // make sure the response matches the latest request guid (could have sent out another req since)
                if (guid == null || $this.state.pendingRequestGuid == null || !$this.state.pendingRequestGuid.equals(guid)) {
                    return;
                }

                // trim data if needed (requested 1 more than page size)
                List<D> data = d != null ? d : new ArrayList<>();
                final boolean moreResults = data.size() > $this.props.pageSize;
                if (moreResults) {
                    data = data.subList(0, data.size() - 1);
                }

                // update page idx map (for lastRecord pagination)
                final Map<Double, D> pageIdxMap = new HashMap<>();
                for (Double key: pageIdxMap.keySet()) {
                    pageIdxMap.put(key, $this.state.pageIdxMap.get(key));
                }
                D lastRecord = data.size() > 0 ? data.get(data.size() - 1) : null;
                pageIdxMap.put($this.state.pageIdx, lastRecord);

                final List<D> fData = data;
                $this.setState(s -> {
                    s.loading = false;
                    s.data = fData;
                    s.moreResults = moreResults;
                    s.pageIdxMap = pageIdxMap;
                });
            });
        });
    }

    protected abstract void fetchData(final ReactComponent<P, State<D>> $this, String requestGuid, GridSort sortDirection, Integer sortColumnOrdinal, Double startRecordIdx, D lastRecord, double pageSize, final CompletionHandler<D, P> completionHandler);

    public interface CompletionHandler<D, P> {
        void onFetchComplete(String requestGuid, List<D> data);
    }

    // Cell Render

    protected abstract String dataKey(D data);

    private ReactElement leadingAccessoryViewForData(D data) {
        return null;
    }

    protected abstract ReactElement contentViewForData(D data);

    // Props and State

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<D> extends ComponentProps {
        public boolean loadOnMount;
        public boolean headerVisible;

        public boolean selectionEnabled;
        public List<D> selected;
        public Func.Run1<List<D>> onSelectionChanged;

        public String noResultsText;
        public ReactElement noResultsElement;

        public double pageSize;
        public Func.Run handleExcel;
        public Func.Run handlePDF;
        public Func.Run handlePrint;
        public Func.Run handleEmail;
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State<D> {
        private GridColumn[] columns;
        private List<D> data;
        private String pendingRequestGuid;
        private boolean loading;
        private boolean moreResults;
        private double pageIdx;
        private Map<Double, D> pageIdxMap;
    }
}