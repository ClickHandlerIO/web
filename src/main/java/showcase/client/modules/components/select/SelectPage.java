package showcase.client.modules.components.select;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;
import react.client.router.SimpleRouteProxy;
import showcase.client.modules.components.ComponentsShell;
import ui.client.Checkbox;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

/**
 *
 */
@Singleton
public class SelectPage extends SimpleRouteComponent<SelectPage.Route, SelectPage.Props, SelectPage.State> {

    @Inject
    Checkbox checkbox;
    @Inject
    SnowResortSelect resortSelect;

    @Inject
    public SelectPage() {
    }

    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div(style().padding("20px"),
                div("Select Page Here"),
                checkbox.props()
                        .label("UT Only")
                        .onCheck(value -> $this.setState(s -> s.utahOnly(!$this.state.utahOnly)))
                        .checked($this.state.utahOnly)
                        .build(),
                resortSelect.props()
                        .state($this.state.utahOnly ? "UT" : null)
                        .build()
        );
    }

    @Override
    public State getInitialState() {
        return super.getInitialState().utahOnly(true);
    }

    /*
     * Props, State, Route
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends SimpleRouteProps {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
        boolean utahOnly;

        @JsOverlay
        public final State utahOnly(final boolean utahOnly) {
            this.utahOnly = utahOnly;
            return this;
        }
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(ComponentsShell.Route parent) {
            super("select", parent);
            setSecured(false);
        }
    }
}
