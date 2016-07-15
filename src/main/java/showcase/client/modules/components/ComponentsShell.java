package showcase.client.modules.components;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.RootRoute;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;
import react.client.router.SimpleRouteProxy;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ComponentsShell extends SimpleRouteComponent<ComponentsShell.Route, ComponentsShell.Props, ComponentsShell.State> {

    @Inject
    public ComponentsShell() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return (ReactElement) $this.props.children;
    }

    /*
     * Props and State
     */

    @JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
    public static class Props extends SimpleRouteProps {
    }

    @JsType(isNative = true)
    public interface State {
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(RootRoute parent) {
            super("c", parent);
            setSecured(false);
        }
    }
}
