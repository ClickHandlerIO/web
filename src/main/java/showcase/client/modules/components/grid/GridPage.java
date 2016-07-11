package showcase.client.modules.components.grid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;
import react.client.router.SimpleRouteProxy;
import showcase.client.modules.components.ComponentsShell;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

/**
 *
 */
@Singleton
public class GridPage extends SimpleRouteComponent<GridPage.Route, GridPage.Props, GridPage.State> {

    @Inject
    Grid grid;

    @Inject
    public GridPage() {
    }

    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div(style().padding("20px"),
                div("Grid Page Here"),
                grid.props().build()
        );
    }

    /*
     * Props, State, Route
     */

    @JsType(isNative = true)
    public interface Args {
        @JsProperty
        String getEmail();

        @JsProperty
        void setEmail(String email);

        @JsOverlay
        default Args email(String email) {
            setEmail(email);
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends SimpleRouteProps {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(ComponentsShell.Route parent) {
            super("grid", parent);
            setSecured(false);
        }
    }
}
