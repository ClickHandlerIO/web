package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class Grid2Header extends Component<Grid2Header.Props, Grid2Header.State> {

    @Inject
    public Grid2Header() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div("Grid2Header Component");
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public GridColumn[] columns;
        public boolean headerVisible;
        public boolean selectionEnabled;
        public boolean allSelected;
        public Func.Run1<Boolean> onAllSelectedChanged;
        public Func.Run2<GridColumn, GridSort> onSortChanged;

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
        public final Props onAllSelectedChanged(final Func.Run1<Boolean> onAllSelectedChanged) {
            this.onAllSelectedChanged = onAllSelectedChanged;
            return this;
        }

        @JsOverlay
        public final Props onSortChanged(final Func.Run2<GridColumn, GridSort> onSortChanged) {
            this.onSortChanged = onSortChanged;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}