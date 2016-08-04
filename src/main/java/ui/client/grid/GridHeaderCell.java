package ui.client.grid;

import common.client.Func;
import elemental.html.DivElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.Checkbox;
import ui.client.grid2.GridColumn;
import ui.client.grid2.GridSort;
import ui.client.icons.ArrowDropDownSvgIcon;
import ui.client.icons.ArrowDropUpSvgIcon;

import javax.inject.Inject;

import static react.client.DOM.div;
import static react.client.DOM.span;

public class GridHeaderCell extends Component<GridHeaderCell.Props, GridHeaderCell.State> {
    @Inject
    Checkbox checkbox;
    @Inject
    ArrowDropUpSvgIcon arrowDropUpSvgIcon;
    @Inject
    ArrowDropDownSvgIcon arrowDropDownSvgIcon;
    @Inject
    GridHeaderCellDivider gridHeaderCellDivider;
    private Ref<DivElement> divRef = Ref.make();

    @Inject
    public GridHeaderCell() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        GridColumn c = $this.props.getColumn();

        return div($ -> {
                $.ref(divRef);
                $.className("header-cell" + (!c.isSortable() ? " not-sortable" : ""));

                StyleProps s = new StyleProps();
                s.overflow("hidden");
                s.minWidth(c.getDisplay().getMinWidth() == null ? 0 : c.getDisplay().getMinWidth() + "px");
                if (c.getDisplay().getWidth() != null) {
                    s.width(c.getDisplay().getWidth() + "px");
                } else {
                    s.flexGrow(c.getDisplay().getFlexGrow());
                    s.flexShrink(c.getDisplay().getFlexShrink());
                    s.flexBasis(c.getDisplay().getFlexBasis());
                }
                $.style(s);
            },
            span($ -> {
                    // handle sort
                    $.className("title-span");
                    $.onClick(e -> {
                        GridColumn c2 = $this.props.getColumn();
                        if (!c2.isSortable()) {
                            return;
                        }

                        GridSort updatedSort;
                        if (c2.getSort() == null) {
                            c2.setSort(GridSort.NONE);
                        }

                        switch (c2.getSort()) {
                            case NONE:
                                updatedSort = GridSort.DESC;
                                break;
                            case ASC:
                                updatedSort = GridSort.NONE;
                                break;
                            case DESC:
                                updatedSort = GridSort.ASC;
                                break;
                            default:
                                updatedSort = GridSort.NONE;
                                break;
                        }

                        if ($this.props.getOnSortChanged() != null) {
                            $this.props.getOnSortChanged().run(c2, updatedSort);
                        }
                    });
                },
                c.getTitle()
            ),
            c.getSort() == null || c.getSort().equals(GridSort.NONE) ? null : c.getSort().equals(GridSort.ASC) ? arrowDropUpSvgIcon.$($ -> $.setColor("#5f5f5f")) : arrowDropDownSvgIcon.$($ -> $.setColor("#5f5f5f"))
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        GridColumn getColumn();

        @JsProperty
        void setColumn(GridColumn column);

        @JsProperty
        Func.Run2<GridColumn, GridSort> getOnSortChanged();

        @JsProperty
        void setOnSortChanged(Func.Run2<GridColumn, GridSort> onSortChanged);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
