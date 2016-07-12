package ui.client.grid;

import com.google.gwt.user.client.Timer;
import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import java.util.*;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

public abstract class AbstractGrid<D, P extends AbstractGrid.Props<D>> extends Component<P, AbstractGrid.State<D>> {

    @Inject
    GridHeader gridHeader;
    @Inject
    GridSimplePager gridSimplePager;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<P, State<D>> $this) {
        boolean allSelected = !($this.state.data == null || $this.props.selected == null || $this.state.data.isEmpty() || $this.props.selected.isEmpty()) && $this.state.data.size() == $this.props.selected.size();

        return div(className("camber-grid"),
                childList -> {
                    if (!$this.props.hideHeader) {
                        childList.add(
                                div(
                                        gridHeader.$$()
                                                .columns($this.state.columns)
                                                .reorderEnabled($this.props.reorderEnabled)
                                                .selectionEnabled($this.props.selectionEnabled)
                                                .allSelected(allSelected)
                                                .onAllSelectedChanged(selectAll -> {
                                                    if ($this.state.loading) {
                                                        return;
                                                    }

                                                    List<D> selected = new ArrayList<>();
                                                    if (selectAll) {
                                                        selected.addAll($this.state.data);
                                                    }
                                                    if ($this.props.onSelectionChanged != null) {
                                                        $this.props.onSelectionChanged.run(selected);
                                                    }
                                                })
                                                .onSortChanged((column, sort) -> {
                                                    List<GridColumn> cols = $this.state.columns;
                                                    for (GridColumn c : cols) {
                                                        if (!c.getId().equals(column.getId())) {
                                                            c.setSort(GridSort.NONE);
                                                        } else {
                                                            c.setSort(sort);
                                                        }
                                                    }
                                                    $this.setState(s -> {
                                                        s.columns = cols;
                                                        s.pageIdx = 0.;
                                                        s.pageIdxMap = new HashMap<>();
                                                    });
                                                    load($this);
                                                }).$()
                                )
                        );
                    }

                    childList.add(
                            div(className("grid-row-container"),
                                    childList2 -> {
                                        if ($this.state.loading && $this.state.firstLoad) {
                                            childList2.add(
                                                    div($ -> {
                                                                $.className("first-load-div");
                                                            },
                                                            div(className("loader loader-default"))
                                                    )
                                            );
                                        }

                                        if (!$this.state.firstLoad && $this.state.showLoading) {
                                            childList2.add(
                                                    div($ -> {
                                                                $.onClick(e -> {
                                                                    e.preventDefault();
                                                                    e.stopPropagation();
                                                                });
                                                                $.className("loading-div");
                                                            },
                                                            div(className("loader loader-default"))
                                                    )
                                            );
                                        }

                                        if ($this.state.data != null && !$this.state.data.isEmpty()) {
                                            for (D data : $this.state.data) {
                                                childList2.add(
                                                        createCell($this, $this.props.reorderEnabled, $this.props.selectionEnabled, $this.state.columns, data, $this.props.selected != null && $this.props.selected.contains(data), (d, s) -> {
                                                            if ($this.state.loading) {
                                                                return;
                                                            }

                                                            if ($this.props.selected != null) {
                                                                List<D> selected = $this.props.selected;
                                                                if (s) {
                                                                    selected.add(d);
                                                                } else {
                                                                    selected.remove(d);
                                                                }
                                                                if ($this.props.onSelectionChanged != null) {
                                                                    $this.props.onSelectionChanged.run(selected);
                                                                }
                                                            }
                                                        })
                                                );
                                            }
                                        }

                                        if (!$this.state.firstLoad && ($this.state.data == null || $this.state.data.isEmpty())) {
                                            if ($this.props.noResultsComponent != null) {
                                                childList2.add($this.props.noResultsComponent);
                                            } else {
                                                childList2.add(
                                                        div(className("no-results"),
                                                                $this.props.noResultsText
                                                        )
                                                );
                                            }
                                        }
                                    }
                            )
                    );

                    if (!$this.state.firstLoad && !($this.state.pageIdx == 0 && !$this.state.moreResults)) {
                        childList.add(
                                gridSimplePager.$($ -> {
                                    $.setNextEnabled($this.state.moreResults && !$this.state.loading);
                                    $.setPreviousEnabled($this.state.pageIdx > 0.);
                                    $.setOnNextPage(() -> {
                                        if ($this.state.loading) {
                                            return; // cannot page forward until we have the lastRecord
                                        }
                                        $this.setState(s -> s.pageIdx = $this.state.pageIdx + 1);
                                        load($this);
                                    });

                                    $.setOnPreviousPage(() -> {
                                        $this.setState(s -> s.pageIdx = $this.state.pageIdx - 1.);
                                        load($this);
                                    });
                                })
                        );
                    }
                }
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public State<D> getInitialState() {
        State<D> s = super.getInitialState();
        s.columns = Arrays.asList(getColumns());
        s.data = new ArrayList<>();
        s.pageIdx = 0.;
        s.pageIdxMap = new HashMap<>();
        s.firstLoad = true;
        return s;
    }

    @Override
    public P getDefaultProps() {
        P p = super.getDefaultProps();
        p.loadWhenMounted = true;
        p.reorderEnabled = false;
        p.selectionEnabled = false;
        p.noResultsText = "No Results";
        return p;
    }

    @Override
    protected void componentDidMount(ReactComponent<P, State<D>> $this) {
        super.componentDidMount($this);
        if ($this.props.loadWhenMounted) {
            load($this);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected void load(ReactComponent<P, State<D>> $this) {
        String sortColumnId = null;
        GridSort sortDirection = null;
        for (GridColumn c : $this.state.columns) {
            if (c.getSort() != null && !c.getSort().equals(GridSort.NONE)) {
                sortColumnId = c.getId();
                sortDirection = c.getSort();
                break;
            }
        }

        D lastRecord = null;
        if ($this.state.pageIdx > 0) {
            lastRecord = $this.state.pageIdxMap.get($this.state.pageIdx);
        }

        if (!$this.state.loading && !$this.state.firstLoad) {
            com.google.gwt.user.client.Timer t = new Timer() {
                @Override
                public void run() {
                    if ($this.state.loading) {
                        $this.setState(s -> {
                            s.showLoading = true;
                        });
                    }
                }
            };
            t.schedule(500);
        }

        final String fSortColumnId = sortColumnId;
        final GridSort fSortDirection = sortDirection;
        final D fLastRecord = lastRecord;

        String guid = ui.client.util.UUID.uuid();
        $this.setState(s -> {
            s.loading = true;
            s.pendingFetchGuid = guid;
        }, () -> {

            // for now clear selection before load
            if ($this.props.onSelectionChanged != null) {
                $this.props.onSelectionChanged.run(new ArrayList<>());
            }

            fetchData($this, guid, fSortColumnId, fSortDirection, fLastRecord, new CompletionHandler<D, P>() {
                @Override
                public void onFetchComplete(ReactComponent<P, State<D>> $this, String requestGuid, List<D> data, boolean moreResults) {
                    if (!$this.state.pendingFetchGuid.equals(requestGuid)) {
                        return;
                    }

                    final Double pageIdx = $this.state.pageIdx;
                    $this.setState(s -> {
                        s.firstLoad = false;
                        s.loading = false;
                        s.showLoading = false;
                        s.data = data == null ? new ArrayList<>() : data;
                        s.moreResults = moreResults;

                        // update page idx map
                        if (pageIdx > 0) {
                            Map<Double, D> pageIdxMap = $this.state.pageIdxMap;
                            D lastRecord = data != null ? data.get(data.size() - 1) : null;
                            pageIdxMap.put($this.state.pageIdx, lastRecord);
                            s.pageIdxMap = pageIdxMap;
                        }
                    });
                }
            });
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Abstract
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected abstract GridColumn[] getColumns();

    protected abstract void fetchData(ReactComponent<P, State<D>> $this, String requestGuid, String sortColumnId, GridSort sortDirection, D lastRecord, CompletionHandler<D, P> completionHandler);

    public interface CompletionHandler<D, P> {
        void onFetchComplete(ReactComponent<P, State<D>> $this, String requestGuid, List<D> data, boolean moreResults);
    }

    protected abstract ReactElement createCell(ReactComponent<P, State<D>> $this, boolean reorderEnabled, boolean selectionEnabled, List<GridColumn> columns, D data, boolean isSelected, Func.Run2<D, Boolean> onSelectionChanged);

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<D> extends ComponentProps {
        public boolean selectionEnabled;
        public boolean reorderEnabled;
        public boolean hideHeader;
        public boolean loadWhenMounted;
        public List<D> selected;
        public Func.Run1<List<D>> onSelectionChanged;
        public String noResultsText;
        public ReactElement noResultsComponent;
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State<D> {
        public List<GridColumn> columns;
        public List<D> data;
        public boolean moreResults;
        public Double pageIdx;
        public Map<Double, D> pageIdxMap;
        public String pendingFetchGuid;
        public boolean loading;
        public boolean showLoading;
        public boolean firstLoad;
    }
}
