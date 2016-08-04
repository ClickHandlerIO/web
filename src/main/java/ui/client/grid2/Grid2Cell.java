package ui.client.grid2;

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
public class Grid2Cell extends Component<Grid2Cell.Props, Grid2Cell.State> {

    @Inject
    public Grid2Cell() {
    }

    @Override
    protected ReactElement render(final ReactComponent<Props, State> $this) {
        return div(className("grid2-cell"), children -> {

                    if ($this.props.leadingAccessoryView != null) {
                        children.add(div(className("leading-accessory-container"), $this.props.leadingAccessoryView));
                    }

                    if ($this.props.selectionEnabled) {
                        children.add(div(className("checkbox-container"))); // todo checkbox control
                    }

                    children.add(div(className("content-container"), $this.props.contentView));
                }
        );
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public ReactElement leadingAccessoryView;
        public ReactElement contentView;
        public boolean selectionEnabled;
        public boolean selected;

        @JsOverlay
        public final Props leadingAccessoryView(final ReactElement leadingAccessoryView) {
            this.leadingAccessoryView = leadingAccessoryView;
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
        public final Props key(final String key) {
            this.key = key;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}