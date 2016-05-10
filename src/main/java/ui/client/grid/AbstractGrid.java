package ui.client.grid;

import com.google.gwt.user.client.Timer;
import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.Component;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import java.util.*;

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
        boolean allSelected = !($this.state.getData() == null || $this.props.getSelected() == null || $this.state.getData().isEmpty() || $this.props.getSelected().isEmpty()) && $this.state.getData().size() == $this.props.getSelected().size();

        return div(className("camber-grid"),
            childList -> {
                if (!$this.props.isHideHeader()) {
                    childList.add(
                        div(
                            gridHeader.$$()
                                .columns($this.state.getColumns())
                                .reorderEnabled($this.props.isReorderEnabled())
                                .selectionEnabled($this.props.isSelectionEnabled())
                                .allSelected(allSelected)
                                .onAllSelectedChanged(selectAll -> {
                                    if ($this.state.isLoading()) {
                                        return;
                                    }

                                    List<D> selected = new ArrayList<>();
                                    if (selectAll) {
                                        selected.addAll($this.state.getData());
                                    }
                                    if ($this.props.getOnSelectionChanged() != null) {
                                        $this.props.getOnSelectionChanged().run(selected);
                                    }
                                })
                                .onSortChanged((column, sort) -> {
                                    List<GridColumn> cols = $this.state.getColumns();
                                    for (GridColumn c : cols) {
                                        if (!c.getId().equals(column.getId())) {
                                            c.setSort(GridSort.NONE);
                                        } else {
                                            c.setSort(sort);
                                        }
                                    }
                                    $this.setState(s -> {
                                        s.setColumns(cols);
                                        s.setPageIdx(0.);
                                        s.setPageIdxMap(new HashMap<>());
                                    });
                                    load($this);
                                }).$()
//                            gridHeader.$($ -> {
//                                $.setColumns($this.state.getColumns());
//                                $.setReorderEnabled($this.props.isReorderEnabled());
//                                $.setSelectionEnabled($this.props.isSelectionEnabled());
//                                $.setAllSelected(allSelected);
//                                $.setOnAllSelectedChanged(selectAll -> {
//                                    if ($this.state.isLoading()) {
//                                        return;
//                                    }
//
//                                    List<D> selected = new ArrayList<>();
//                                    if (selectAll) {
//                                        selected.addAll($this.state.getData());
//                                    }
//                                    if ($this.props.getOnSelectionChanged() != null) {
//                                        $this.props.getOnSelectionChanged().run(selected);
//                                    }
//                                });
//                                $.setOnSortChanged((column, sort) -> {
//                                    List<GridColumn> cols = $this.state.getColumns();
//                                    for (GridColumn c : cols) {
//                                        if (!c.getId().equals(column.getId())) {
//                                            c.setSort(GridSort.NONE);
//                                        } else {
//                                            c.setSort(sort);
//                                        }
//                                    }
//                                    $this.setState(s -> {
//                                        s.setColumns(cols);
//                                        s.setPageIdx(0.);
//                                        s.setPageIdxMap(new HashMap<>());
//                                    });
//                                    load($this);
//                                });
//                            })
                        )
                    );
                }

                childList.add(
                    div(className("grid-row-container"),
                        childList2 -> {
                            if ($this.state.isLoading() && $this.state.isFirstLoad()) {
                                childList2.add(
                                    div($ -> {
                                            $.className("first-load-div");
                                        },
                                        div(className("loader loader-default"))
                                    )
                                );
                            }

                            if (!$this.state.isFirstLoad() && $this.state.isShowLoading()) {
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

                            if ($this.state.getData() != null && !$this.state.getData().isEmpty()) {
                                for (D data : $this.state.getData()) {
                                    childList2.add(
                                        createCell($this, $this.props.isReorderEnabled(), $this.props.isSelectionEnabled(), $this.state.getColumns(), data, $this.props.getSelected() != null && $this.props.getSelected().contains(data), (d, s) -> {
                                            if ($this.state.isLoading()) {
                                                return;
                                            }

                                            if ($this.props.getSelected() != null) {
                                                List<D> selected = $this.props.getSelected();
                                                if (s) {
                                                    selected.add(d);
                                                } else {
                                                    selected.remove(d);
                                                }
                                                if ($this.props.getOnSelectionChanged() != null) {
                                                    $this.props.getOnSelectionChanged().run(selected);
                                                }
                                            }
                                        })
                                    );
                                }
                            }

                            if (!$this.state.isFirstLoad() && ($this.state.getData() == null || $this.state.getData().isEmpty())) {
                                if ($this.props.getNoResultsComponent() != null) {
                                    childList2.add($this.props.getNoResultsComponent());
                                } else {
                                    childList2.add(
                                        div(className("no-results"),
                                            $this.props.getNoResultsText()
                                        )
                                    );
                                }
                            }
                        }
                    )
                );

                if (!$this.state.isFirstLoad() && !($this.state.getPageIdx() == 0 && !$this.state.isMoreResults())) {
                    childList.add(
                        gridSimplePager.$($ -> {
                            $.setNextEnabled($this.state.isMoreResults() && !$this.state.isLoading());
                            $.setPreviousEnabled($this.state.getPageIdx() > 0.);
                            $.setOnNextPage(() -> {
                                if ($this.state.isLoading()) {
                                    return; // cannot page forward until we have the lastRecord
                                }
                                $this.setState(s -> s.setPageIdx($this.state.getPageIdx() + 1));
                                load($this);
                            });

                            $.setOnPreviousPage(() -> {
                                $this.setState(s -> s.setPageIdx($this.state.getPageIdx() - 1.));
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
        s.setColumns(Arrays.asList(getColumns()));
        s.setData(new ArrayList<>());
        s.setPageIdx(0.);
        s.setPageIdxMap(new HashMap<>());
        s.setFirstLoad(true);
        return s;
    }

    @Override
    public P getDefaultProps() {
        P p = super.getDefaultProps();
        p.setLoadWhenMounted(true);
        p.setReorderEnabled(false);
        p.setSelectionEnabled(false);
        p.setNoResultsText("No Results");
        return p;
    }

    @Override
    protected void componentDidMount(ReactComponent<P, State<D>> $this) {
        super.componentDidMount($this);
        if ($this.props.isLoadWhenMounted()) {
            load($this);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected void load(ReactComponent<P, State<D>> $this) {
        String sortColumnId = null;
        GridSort sortDirection = null;
        for (GridColumn c : $this.state.getColumns()) {
            if (c.getSort() != null && !c.getSort().equals(GridSort.NONE)) {
                sortColumnId = c.getId();
                sortDirection = c.getSort();
                break;
            }
        }

        D lastRecord = null;
        if ($this.state.getPageIdx() > 0) {
            lastRecord = $this.state.getPageIdxMap().get($this.state.getPageIdx());
        }

        if (!$this.state.isLoading() && !$this.state.isFirstLoad()) {
            com.google.gwt.user.client.Timer t = new Timer() {
                @Override
                public void run() {
                    if ($this.state.isLoading()) {
                        $this.setState(s -> {
                            s.setShowLoading(true);
                        });
                    }
                }
            };
            t.schedule(500);
        }

        String guid = ui.client.util.UUID.uuid();
        $this.setState(s -> {
            s.setLoading(true);
            s.setPendingFetchGuid(guid);
        });

        // for now clear selection before load
        if ($this.props.getOnSelectionChanged() != null) {
            $this.props.getOnSelectionChanged().run(new ArrayList<>());
        }

        fetchData($this, guid, sortColumnId, sortDirection, lastRecord, new CompletionHandler<D, P>() {
            @Override
            public void onFetchComplete(ReactComponent<P, State<D>> $this, String requestGuid, List<D> data, boolean moreResults) {
                if (!$this.state.getPendingFetchGuid().equals(requestGuid)) {
                    return;
                }

                // todo in future handle selection - check if any of the selected items are in the new data set. if they are keep them, if not remove from selected list
                // for now clearing selection on loading data
//                if ($this.props.getOnSelectionChanged() != null) {
//                    $this.props.getOnSelectionChanged().run(new ArrayList<>());
//                }
                final Double pageIdx = $this.state.getPageIdx();
                $this.setState(s -> {
                    s.setFirstLoad(false);
                    s.setLoading(false);
                    s.setShowLoading(false);
                    s.setData(data == null ? new ArrayList<>() : data);
                    s.setMoreResults(moreResults);

                    // update page idx map
                    if (pageIdx > 0) {
                        Map<Double, D> pageIdxMap = $this.state.getPageIdxMap();
                        D lastRecord = data != null ? data.get(data.size() - 1) : null;
                        pageIdxMap.put($this.state.getPageIdx(), lastRecord);
                        s.setPageIdxMap(pageIdxMap);
                    }
                });
            }
        });
    }

    protected abstract ReactElement createCell(ReactComponent<P, State<D>> $this, boolean reorderEnabled, boolean selectionEnabled, List<GridColumn> columns, D data, boolean isSelected, Func.Run2<D, Boolean> onSelectionChanged); // todo add handlers for selection change

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Abstract
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected abstract GridColumn[] getColumns();

    protected abstract void fetchData(ReactComponent<P, State<D>> $this, String requestGuid, String sortColumnId, GridSort sortDirection, D lastRecord, CompletionHandler<D, P> completionHandler);

    public interface CompletionHandler<D, P> {
        void onFetchComplete(ReactComponent<P, State<D>> $this, String requestGuid, List<D> data, boolean moreResults);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props<D> extends BaseProps {
        @JsProperty
        boolean isSelectionEnabled();

        @JsProperty
        void setSelectionEnabled(boolean selectionEnabled);

        @JsProperty
        boolean isReorderEnabled();

        @JsProperty
        void setReorderEnabled(boolean reorderEnabled);

        @JsProperty
        boolean isHideHeader();

        @JsProperty
        void setHideHeader(boolean hideHeader);

        @JsProperty
        boolean isLoadWhenMounted();

        @JsProperty
        void setLoadWhenMounted(boolean loadWhenMounted);

        @JsProperty
        List<D> getSelected();

        @JsProperty
        void setSelected(List<D> selected);

        @JsProperty
        Func.Run1<List<D>> getOnSelectionChanged();

        @JsProperty
        void setOnSelectionChanged(Func.Run1<List<D>> onSelectionChanged);

        @JsProperty
        String getNoResultsText();

        @JsProperty
        void setNoResultsText(String noResultsText);

        @JsProperty
        ReactElement getNoResultsComponent();

        @JsProperty
        void setNoResultsComponent(ReactElement noResultsComponent);
    }

    @JsType(isNative = true)
    public interface State<D> {
        @JsProperty
        List<GridColumn> getColumns();

        @JsProperty
        void setColumns(List<GridColumn> columns);

        @JsProperty
        List<D> getData();

        @JsProperty
        void setData(List<D> data);

        @JsProperty
        boolean isMoreResults();

        @JsProperty
        void setMoreResults(boolean moreResults);

        @JsProperty
        Double getPageIdx();

        @JsProperty
        void setPageIdx(Double pageIdx);

        @JsProperty
        Map<Double, D> getPageIdxMap();

        @JsProperty
        void setPageIdxMap(Map<Double, D> pageIdxMap);

        @JsProperty
        String getPendingFetchGuid();

        @JsProperty
        void setPendingFetchGuid(String pendingFetchGuid);

        @JsProperty
        boolean isLoading();

        @JsProperty
        void setLoading(boolean loading);

        @JsProperty
        boolean isShowLoading();

        @JsProperty
        void setShowLoading(boolean showLoading);

        @JsProperty
        boolean isFirstLoad();

        @JsProperty
        void setFirstLoad(boolean firstLoad);
    }
}
