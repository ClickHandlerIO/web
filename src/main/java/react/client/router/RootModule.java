package react.client.router;

import common.client.Func;
import elemental.client.Browser;
import react.client.ReactDOM;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 *
 */
public abstract class RootModule extends ModuleLoader {
    private final RouteComponent root;

    @Inject
    RootRoute rootRoute;

    @Inject
    Provider<RouteGatekeeper> routeGatekeeper;

    private Route appRoute;

    public RootModule(RouteComponent root) {
        super("/");
        this.root = root;
    }

    protected History history() {
        return ReactRouter.getHashHistory();
    }

    @Override
    protected void loadRouteBuilder(Func.Run1<RoutesBuilder> run1) {
        run1.run(null);
    }

    protected Route appRoute() {
        if (appRoute != null) {
            return appRoute;
        }

        return appRoute = new Route()
            .path("/")
            .component(root)
            .getChildRoutes(
                (location, callback) -> handle(location.getPathname(), location, callback))
            .onEnter(
                (nextState, replaceState) -> routeGatekeeper.get().onEnter(rootRoute, nextState, replaceState))
            .onLeave(
                () -> routeGatekeeper.get().onLeave(rootRoute));
    }

    public void start(String elementId) {
        // Create Router.
        final ReactElement router =
            ReactRouter.create(new RouterProps()
                .history(history())
                .routes(appRoute()));

//        Try.run(beforeRender);

        // Render.
        ReactDOM.render(router, Browser.getDocument().getElementById(elementId));
    }
}
