package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.icons.ArrowDropDownSvgIcon;
import ui.client.icons.ArrowDropUpSvgIcon;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class Grid2HeaderCell extends Component<Grid2HeaderCell.Props, Grid2HeaderCell.State> {

    @Inject
    ArrowDropUpSvgIcon arrowDropUpSvgIcon;
    @Inject
    ArrowDropDownSvgIcon arrowDropDownSvgIcon;

    @Inject
    public Grid2HeaderCell() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        final GridColumn column = $this.props.column;
        return div(props -> {
                props.className("header-cell" + (column.isSortable() ? "" : " not-sortable"));
                props.onClick(e -> {
                    e.preventDefault();
                    e.stopPropagation();
                    if (column.isSortable() && $this.props.requestSortChange != null) {
                        $this.props.requestSortChange.run();
                    }
                });

                StyleProps s = new StyleProps();
                s.overflow("hidden");
                s.minWidth(column.getDisplay().getMinWidth());
                if (column.getDisplay().getWidth() != null) {
                    s.width(column.getDisplay().getWidth());
                } else {
                    s.flexGrow(column.getDisplay().getFlexGrow());
                    s.flexShrink(column.getDisplay().getFlexShrink());
                    s.flexBasis(column.getDisplay().getFlexBasis());
                }
                props.style(s);
            },
            div(className("title"), column.getTitle()),
            !column.isSortable() || column.getSort().equals(GridSort.NONE) ? null :
                column.getSort().equals(GridSort.ASC) ? arrowDropUpSvgIcon.props().color("#5f5f5f").build() : arrowDropDownSvgIcon.props().color("#5f5f5f").build()
        );
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public GridColumn column;
        public Func.Run requestSortChange;

        @JsOverlay
        public final Props key(final String key) {
            this.key = key;
            return this;
        }

        @JsOverlay
        public final Props column(final GridColumn column) {
            this.column = column;
            return this;
        }

        @JsOverlay
        public final Props requestSortChange(final Func.Run requestSortChange) {
            this.requestSortChange = requestSortChange;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}