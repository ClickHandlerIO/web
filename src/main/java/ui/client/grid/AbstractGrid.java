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
        boolean allSelected = !($this.getState().getData() == null || $this.getProps().getSelected() == null || $this.getState().getData().isEmpty() || $this.getProps().getSelected().isEmpty()) && $this.getState().getData().size() == $this.getProps().getSelected().size();

        return div($ -> $.className("camber-grid"),
            childList -> {
                if (!$this.getProps().isHideHeader()) {
                    childList.add(
                        div(
                            gridHeader.$($ -> {
                                $.setColumns($this.getState().getColumns());
                                $.setReorderEnabled($this.getProps().isReorderEnabled());
                                $.setSelectionEnabled($this.getProps().isSelectionEnabled());
                                $.setAllSelected(allSelected);
                                $.setOnAllSelectedChanged(selectAll -> {
                                    if ($this.getState().isLoading()) {
                                        return;
                                    }

                                    List<D> selected = new ArrayList<>();
                                    if (selectAll) {
                                        selected.addAll($this.getState().getData());
                                    }
                                    if ($this.getProps().getOnSelectionChanged() != null) {
                                        $this.getProps().getOnSelectionChanged().run(selected);
                                    }
                                });
                                $.setOnSortChanged((column, sort) -> {
                                    List<GridColumn> cols = $this.getState().getColumns();
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
                                });
                            })
                        )
                    );
                }

                childList.add(
                    div($ -> $.className("grid-row-container"),
                        childList2 -> {
                            if ($this.getState().isLoading() && $this.getState().isFirstLoad()) {
                                childList2.add(
                                    div($ -> {
                                            $.className("first-load-div");
                                        },
                                        div($ -> $.className("loader loader-default"))
                                    )
                                );
                            }

                            if (!$this.getState().isFirstLoad() && $this.getState().isShowLoading()) {
                                childList2.add(
                                    div($ -> {
                                            $.onClick(e -> {
                                                e.preventDefault();
                                                e.stopPropagation();
                                            });
                                            $.className("loading-div");
                                        },
                                        div($ -> $.className("loader loader-default"))
                                    )
                                );
                            }

                            if ($this.getState().getData() != null && !$this.getState().getData().isEmpty()) {
                                for (D data : $this.getState().getData()) {
                                    childList2.add(
                                        createCell($this, $this.getProps().isReorderEnabled(), $this.getProps().isSelectionEnabled(), $this.getState().getColumns(), data, $this.getProps().getSelected() != null && $this.getProps().getSelected().contains(data), (d, s) -> {
                                            if ($this.getState().isLoading()) {
                                                return;
                                            }

                                            if ($this.getProps().getSelected() != null) {
                                                List<D> selected = $this.getProps().getSelected();
                                                if (s) {
                                                    selected.add(d);
                                                } else {
                                                    selected.remove(d);
                                                }
                                                if ($this.getProps().getOnSelectionChanged() != null) {
                                                    $this.getProps().getOnSelectionChanged().run(selected);
                                                }
                                            }
                                        })
                                    );
                                }
                            }

                            if (!$this.getState().isFirstLoad() && ($this.getState().getData() == null || $this.getState().getData().isEmpty())) {
                                if ($this.getProps().getNoResultsComponent() != null) {
                                    childList2.add($this.getProps().getNoResultsComponent());
                                } else {
                                    childList2.add(
                                        div($ -> $.className("no-results"),
                                            $this.getProps().getNoResultsText()
                                        )
                                    );
                                }
                            }
                        }
                    )
                );

                if (!$this.getState().isFirstLoad() && !($this.getState().getPageIdx() == 0 && !$this.getState().isMoreResults())) {
                    childList.add(
                        gridSimplePager.$($ -> {
                            $.setNextEnabled($this.getState().isMoreResults() && !$this.getState().isLoading());
                            $.setPreviousEnabled($this.getState().getPageIdx() > 0.);
                            $.setOnNextPage(() -> {
                                if ($this.getState().isLoading()) {
                                    return; // cannot page forward until we have the lastRecord
                                }
                                $this.setState(s -> s.setPageIdx($this.getState().getPageIdx() + 1));
                                load($this);
                            });

                            $.setOnPreviousPage(() -> {
                                $this.setState(s -> s.setPageIdx($this.getState().getPageIdx() - 1.));
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
        if ($this.getProps().isLoadWhenMounted()) {
            load($this);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected void load(ReactComponent<P, State<D>> $this) {
        String sortColumnId = null;
        GridSort sortDirection = null;
        for (GridColumn c : $this.getState().getColumns()) {
            if (c.getSort() != null && !c.getSort().equals(GridSort.NONE)) {
                sortColumnId = c.getId();
                sortDirection = c.getSort();
                break;
            }
        }

        D lastRecord = null;
        if ($this.getState().getPageIdx() > 0) {
            lastRecord = $this.getState().getPageIdxMap().get($this.getState().getPageIdx());
        }

        if (!$this.getState().isLoading() && !$this.getState().isFirstLoad()) {
            com.google.gwt.user.client.Timer t = new Timer() {
                @Override
                public void run() {
                    if ($this.getState().isLoading()) {
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
        if ($this.getProps().getOnSelectionChanged() != null) {
            $this.getProps().getOnSelectionChanged().run(new ArrayList<>());
        }

        fetchData($this, guid, sortColumnId, sortDirection, lastRecord, new CompletionHandler<D, P>() {
            @Override
            public void onFetchComplete(ReactComponent<P, State<D>> $this, String requestGuid, List<D> data, boolean moreResults) {
                if (!$this.getState().getPendingFetchGuid().equals(requestGuid)) {
                    return;
                }

                // todo in future handle selection - check if any of the selected items are in the new data set. if they are keep them, if not remove from selected list
                // for now clearing selection on loading data
//                if ($this.getProps().getOnSelectionChanged() != null) {
//                    $this.getProps().getOnSelectionChanged().run(new ArrayList<>());
//                }
                final Double pageIdx = $this.getState().getPageIdx();
                $this.setState(s -> {
                    s.setFirstLoad(false);
                    s.setLoading(false);
                    s.setShowLoading(false);
                    s.setData(data == null ? new ArrayList<>() : data);
                    s.setMoreResults(moreResults);

                    // update page idx map
                    if (pageIdx > 0) {
                        Map<Double, D> pageIdxMap = $this.getState().getPageIdxMap();
                        D lastRecord = data != null ? data.get(data.size() - 1) : null;
                        pageIdxMap.put($this.getState().getPageIdx(), lastRecord);
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
