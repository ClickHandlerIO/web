package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.Checkbox;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class Grid2Header extends Component<Grid2Header.Props, Grid2Header.State> {

    @Inject
    Grid2HeaderCell headerCell;
    @Inject
    Checkbox checkbox;

    @Inject
    public Grid2Header() {
    }

    @Override
    protected ReactElement render(final ReactComponent<Props, State> $this) {
        return div(className("header"), children -> {
            if ($this.props.headerVisible) {
                if ($this.props.selectionEnabled) {
                    children.add(
                        div(className("checkbox-container"),
                            checkbox.props()
                                .checked($this.props.allSelected)
                                .onCheck((sender, checked) -> $this.props.requestAllSelectedChange.run(checked))
                                .iconStyle(new StyleProps().marginRight(0))
                                .build()
                        )
                    );
                }

                for (final GridColumn c : $this.props.columns) {
                    children.add(
                        headerCell.props()
                            .key(String.valueOf(c.getOrdinal()))
                            .column(c)
                            .requestSortChange(() -> $this.props.requestSortChange.run(c))
                            .build()
                    );
                }
            }
        });
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public GridColumn[] columns;
        public boolean headerVisible;
        public boolean selectionEnabled;
        public boolean allSelected;
        public Func.Run1<Boolean> requestAllSelectedChange;
        public Func.Run1<GridColumn> requestSortChange;

        @JsOverlay
        public final Props columns(final GridColumn[] columns) {
            this.columns = columns;
            return this;
        }

        @JsOverlay
        public final Props headerVisible(final boolean headerVisible) {
            this.headerVisible = headerVisible;
            return this;
        }

        @JsOverlay
        public final Props selectionEnabled(final boolean selectionEnabled) {
            this.selectionEnabled = selectionEnabled;
            return this;
        }

        @JsOverlay
        public final Props allSelected(final boolean allSelected) {
            this.allSelected = allSelected;
            return this;
        }

        @JsOverlay
        public final Props requestAllSelectedChange(final Func.Run1<Boolean> requestAllSelectedChange) {
            this.requestAllSelectedChange = requestAllSelectedChange;
            return this;
        }

        @JsOverlay
        public final Props requestSortChange(final Func.Run1<GridColumn> requestSortChange) {
            this.requestSortChange = requestSortChange;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}