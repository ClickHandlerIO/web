package showcase.client.modules;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import react.client.React;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.RootRoute;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;

@Singleton
public class RootShell extends SimpleRouteComponent<RootRoute, RootShell.Props, RootShell.State> {

    @Inject
    public RootShell() {
    }

    @Override
    @JsIgnore
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return $this.props.children();
    }

    /*
     * Lifecycle
     */

    @Override
    protected void addChildContextTypes(ContextTypes contextTypes) {
        super.addChildContextTypes(contextTypes);
        contextTypes.set("muiTheme", React.PropTypes.object(true));
    }

    @Override
    protected native Object getChildContext() /*-{
        return {
            muiTheme: $wnd.MaterialUi.CustomTheme
        }
    }-*/;

    /*
     * Props and State
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends SimpleRouteProps {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
