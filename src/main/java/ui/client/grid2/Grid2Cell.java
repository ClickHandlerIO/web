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
public class Grid2Cell extends Component<Grid2Cell.Props, Grid2Cell.State> {

    @Inject
    Checkbox checkbox;

    @Inject
    public Grid2Cell() {
    }

    @Override
    protected ReactElement render(final ReactComponent<Props, State> $this) {
        return div(className("grid2-cell " + $this.props.className), children -> {

                    if ($this.props.selectionEnabled) {
                        children.add(
                                div(className("checkbox-container"),
                                        checkbox.props()
                                                .checked($this.props.selected)
                                                .onCheck((sender, checked) -> $this.props.requestSelectionChange.run(checked))
                                                .iconStyle(new StyleProps().marginRight(0))
                                                .build()
                                )
                        );
                    }

                    children.add(div(className("content-container"), $this.props.contentView));
                }
        );
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public String className;
        public ReactElement contentView;
        public boolean selectionEnabled;
        public boolean selected;
        public Func.Run1<Boolean> requestSelectionChange;

        @JsOverlay
        public final Props className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props contentView(final ReactElement contentView) {
            this.contentView = contentView;
            return this;
        }

        @JsOverlay
        public final Props selectionEnabled(final boolean selectionEnabled) {
            this.selectionEnabled = selectionEnabled;
            return this;
        }

        @JsOverlay
        public final Props selected(final boolean selected) {
            this.selected = selected;
            return this;
        }

        @JsOverlay
        public final Props requestSelectionChange(final Func.Run1<Boolean> requestSelectionChange) {
            this.requestSelectionChange = requestSelectionChange;
            return this;
        }

        @JsOverlay
        public final Props key(final String key) {
            this.key = key;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}