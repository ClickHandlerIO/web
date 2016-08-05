package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.*;

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
        return div((props, children) -> {
                    props.className("grid2");
                    // todo impl fixed height

                    children.add(
                            header.props()
                                    .columns($this.state.columns)
                                    .headerVisible($this.props.headerVisible)
                                    .selectionEnabled($this.props.onSelectionChanged != null)
                                    .allSelected($this.props.selection != null && $this.state.data != null && !$this.state.data.isEmpty() && $this.props.selection.size() == $this.state.data.size()) // todo
                                    .requestAllSelectedChange(checked -> {
                                        if ($this.state.loading) {
                                            return;
                                        }

                                        List<D> updatedSelection = new ArrayList<>();
                                        if (checked) {
                                            updatedSelection.addAll($this.state.data);
                                        }
                                        if ($this.props.onSelectionChanged != null) {
                                            $this.props.onSelectionChanged.run(updatedSelection);
                                        }
                                    })
                                    .requestSortChange(gridColumn -> {
                                        // changing sort can be done while loading

                                        // remove sort from other columns
                                        final GridColumn[] columns = new GridColumn[$this.state.columns.length];
                                        for (int i = 0; i < $this.state.columns.length; ++i) {
                                            GridColumn c = $this.state.columns[i];
                                            if (c.getOrdinal() != gridColumn.getOrdinal()) {
                                                c.setSort(GridSort.NONE);
                                            }
                                            columns[i] = c;
                                        }

                                        // apply correct sort to new column
                                        if (gridColumn.getSort().equals(GridSort.NONE)) {
                                            gridColumn.setSort(GridSort.DESC);
                                        } else if (gridColumn.getSort().equals(GridSort.DESC)) {
                                            gridColumn.setSort(GridSort.ASC);
                                        } else {
                                            gridColumn.setSort(GridSort.NONE);
                                        }
                                        $this.setState(s -> {
                                            s.columns = columns;
                                            s.pageIdx = 0.;
                                            s.pageIdxMap = new HashMap<>();
                                        }, () -> load($this));
                                    })
                                    .build()
                    );

                    children.add(
                            div(className("body" + ($this.state.loading ? " loading" : "")), bodyChildren -> {
                                if ($this.state.loading) {
                                    bodyChildren.add(
                                            div(className("loading-container"),
                                                    div(className("backdrop")),
                                                    div(className("loader loader-default"))
                                            )
                                    );
                                }

                                if ($this.state.data != null && !$this.state.data.isEmpty()) {
                                    for (D d : $this.state.data) {
                                        boolean selected = $this.props.selection != null && $this.props.selection.contains(d);
                                        bodyChildren.add(
                                                cell.props()
                                                        .key(dataKey(d))
                                                        .contentView(contentViewForData($this, d))
                                                        .selected(selected)
                                                        .selectionEnabled($this.props.onSelectionChanged != null)
                                                        .requestSelectionChange(checked -> {
                                                            List<D> updatedSelection = new ArrayList<>();
                                                            if ($this.props.selection != null) {
                                                                updatedSelection.addAll($this.props.selection);
                                                            }
                                                            if (checked) {
                                                                updatedSelection.add(d);
                                                            } else {
                                                                updatedSelection.remove(d);
                                                            }

                                                            if ($this.props.onSelectionChanged != null) {
                                                                $this.props.onSelectionChanged.run(updatedSelection);
                                                            }
                                                        })
                                                        .build()
                                        );
                                    }
                                } else if (!$this.state.firstLoad) {
                                    if ($this.props.noResultsElement != null) {
                                        bodyChildren.add($this.props.noResultsElement);
                                    } else {
                                        bodyChildren.add(
                                                div(className("no-results"), $this.props.noResultsText)
                                        );
                                    }
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
                                        // paging backwards can be done while loading (we know LastRecord items that we have already passed)
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
        s.firstLoad = true;
        return s;
    }

    @Override
    protected void componentDidMount(final ReactComponent<P, State<D>> $this) {
        super.componentDidMount($this);
        if ($this.props.loadOnMount) {
            load($this);
        }
    }

    protected abstract GridColumn[] columns();

    // Fetch Data

    protected void load(final ReactComponent<P, State<D>> $this) {
        final String requestGuid = ui.client.util.UUID.uuid();

        // Sort
        GridSort sortDirection = GridSort.NONE;
        int sortOrdinal = 0;
        for (GridColumn c : $this.state.columns) {
            if (!c.getSort().equals(GridSort.NONE)) {
                sortDirection = c.getSort();
                sortOrdinal = c.getOrdinal();
                break;
            }
        }
        final GridSort fSortDirection = sortDirection;
        final int fSortOrdinal = sortOrdinal;

        // Pagination
        D lastRecord = null;
        Double startRecordIdx = 0.;
        if ($this.state.pageIdx > 0) {
            lastRecord = $this.state.pageIdxMap.get($this.state.pageIdx - 1);
            startRecordIdx = $this.state.pageIdx * $this.props.pageSize;
        }
        final D fLastRecord = lastRecord;
        final Double fStartRecordIdx = startRecordIdx;

        $this.setState(s -> {
            s.loading = true;
            s.pendingRequestGuid = requestGuid;
        }, () -> {

            // clear selection before load
            if ($this.props.onSelectionChanged != null) {
                $this.props.onSelectionChanged.run(new ArrayList<D>());
            }

            fetchData($this, requestGuid, fSortDirection, fSortOrdinal, fStartRecordIdx, fLastRecord, $this.props.pageSize + 1, (guid, d) -> {

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
                for (Double key : pageIdxMap.keySet()) {
                    pageIdxMap.put(key, $this.state.pageIdxMap.get(key));
                }
                D updatedLastRecord = data.size() > 0 ? data.get(data.size() - 1) : null;
                pageIdxMap.put($this.state.pageIdx, updatedLastRecord);

                final List<D> fData = data;
                $this.setState(s -> {
                    s.firstLoad = false;
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

    protected abstract ReactElement contentViewForData(final ReactComponent<P, State<D>> $this, D data);

    protected ReactElement column(final ReactComponent<P, State<D>> $this, Enum columnEnum, String text) {
        return div(new HTMLProps().style(s -> applyColumnSizing($this, s, columnEnum)), text);
    }

    protected ReactElement column(final ReactComponent<P, State<D>> $this, Enum columnEnum, ReactElement child) {
        return div(new HTMLProps().style(s -> applyColumnSizing($this, s, columnEnum)), child);
    }

    protected ReactElement column(final ReactComponent<P, State<D>> $this, Enum columnEnum, Func.Run1<HTMLProps> callback, String text) {
        HTMLProps htmlProps = new HTMLProps();
        if (callback != null) {
            callback.run(htmlProps);
        }
        applyColumnSizing($this, htmlProps.style(), columnEnum);
        return div(htmlProps, text);
    }

    protected ReactElement column(final ReactComponent<P, State<D>> $this, Enum columnEnum, Func.Run1<HTMLProps> callback, ReactElement child) {
        HTMLProps htmlProps = new HTMLProps();
        if (callback != null) {
            callback.run(htmlProps);
        }
        applyColumnSizing($this, htmlProps.style(), columnEnum);
        return div(htmlProps, child);
    }

    protected ReactElement column(final ReactComponent<P, State<D>> $this, Enum columnEnum, Func.Run2<HTMLProps, Children> callback) {
        HTMLProps htmlProps = new HTMLProps();
        Children children = new Children();
        if (callback != null) {
            callback.run(htmlProps, children);
        }
        applyColumnSizing($this, htmlProps.style(), columnEnum);
        return div(htmlProps, (ReactElement[]) children.toArray());
    }

    protected StyleProps applyColumnSizing(final ReactComponent<P, State<D>> $this, StyleProps style, Enum columnEnum) {
        if (style == null) {
            style = new StyleProps();
        }

        GridColumn column = null;
        for (GridColumn c : $this.state.columns) {
            if (c.getOrdinal() == columnEnum.ordinal()) {
                column = c;
                break;
            }
        }

        if (column == null || column.getDisplay() == null) {
            return style;
        }

        style.minWidth(column.getDisplay().getMinWidth());
        style.padding(5);
        if (column.getDisplay().getWidth() != null) {
            style.width(column.getDisplay().getWidth());
        } else {
            style.flexGrow(column.getDisplay().getFlexGrow());
            style.flexShrink(column.getDisplay().getFlexShrink());
            style.flexBasis(column.getDisplay().getFlexBasis());
        }

        return style;
    }

    // Props and State

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<D> extends ComponentProps {
        public boolean loadOnMount;
        public boolean headerVisible; // todo test/build

// todo impl fixed height later. need to handle scrollbar width padding in header, and loading div over content, not scrolled away
//        public boolean fullHeight;
//        public Double fixedHeight;

        public List<D> selection;
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
        private boolean firstLoad;
    }
}