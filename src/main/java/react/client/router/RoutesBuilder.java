package react.client.router;

import common.client.Str;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Constructs ReactRouter Route configuration based on RouteComponents
 * and the RouteProxies they are mapped to.
 *
 * @author Clay Molocznik
 */
public abstract class RoutesBuilder {
    private final HashMap<String, Reg> regs = new HashMap<>();
    @Inject
    Provider<RouteGatekeeper> routeGatekeeperProvider;

    private Route[] routes;

    /**
     * @return
     */
    public Route[] getRoutes() {
        return routes;
    }

    void setRoutes(Route[] routes) {
        this.routes = routes;
    }

    /**
     * @return
     */
    protected void registerComponents() {
        // Sniff out injected RouteComponents.
//        Jso.iterate(this, (name, value) -> {
//            add((RouteComponent) value);
//        });
    }

    protected <R extends RouteProxy<A>, A, P extends RouteProps, S> void add(RouteComponent<R, A, P, S> component) {
        // Instantiate RouteProxy.
        final RouteProxy<A> proxy = component.getRouteProxyProvider().get();

        // Add to Reg map.
        regs.put(proxy.getClass().getName(),
            new Reg(
                new Route()
                    .path(proxy.path())
                    .onEnter((nextState, replaceState) -> {
                        proxy.toArgs(nextState.location.getQuery());

                        if (proxy.onEnter(nextState, replaceState)) {
                            routeGatekeeperProvider.get().onEnter(proxy, nextState, replaceState);
                        }
                    })
                    .onLeave(
                        () -> {
                            final Object result = proxy.onLeave();
                            if (result != null) {
                                return result;
                            }
                            return routeGatekeeperProvider.get().onLeave(proxy);
                        }
                    )
                    .component(component.getReactClass()),
                proxy
            )
        );
    }

    void init() {
        if (routes != null) {
            return;
        }

        registerComponents();
        buildRoutes();
    }

    void buildRoutes() {
        // Init top level Reg list.
        // These Routes will be the ones supplied.
        // All other's will be descendants of these.
        final List<Reg> topLevel = new ArrayList<>();

        for (Reg reg : regs.values()) {
            // Get the parent RouteProxy.
            RouteProxy parent = reg.proxy.parent();

//            final String proxyName = reg.proxy.getClass().getName();

            // Is current Reg a child?
            if (parent != null) {
                final String parentProxyClassName = parent.getClass().getName();
                Reg parentReg = regs.get(parentProxyClassName);
                if (parentReg == null) {
                    String parentPath = parent.path();
                    if (parentPath == null || parentPath.isEmpty()) {
                        parentPath = "";
                    } else if (!Str.startsWith(parentPath, "/")) {
                        parent = parent.parent();

                        // Find next registered parent.
                        while (parent != null) {
                            // Is the parent path already fully resolved to an absolute path?
                            if (!Str.startsWith(parentPath, "/")) {
                                // Prepend next parent path if necessary.
                                String nextParentPath = parent.path();
                                if (nextParentPath != null) {
                                    if (Str.startsWith(nextParentPath, "/")) {
                                        parentPath = nextParentPath + parentPath;
                                    } else {
                                        parentPath = nextParentPath + "/" + parentPath;
                                    }
                                }
                            }
                            parentReg = regs.get(parent.getClass().getName());
                            // Did we find one?
                            if (parentReg != null) {
                                break;
                            }
                            // Walk up the tree.
                            parent = parent.parent();
                        }
                    }

                    String currentPath = reg.route.path;
                    if (currentPath == null) {
                        currentPath = "";
                    } else if (Str.startsWith(currentPath, "/")) {
                        currentPath = currentPath.substring(1);
                    }

                    // Prepend the transparent parent's path to ReactRouter Route.
                    if (parentPath.equals("/")) {
                        reg.route.path(parentPath + currentPath);
                    } else {
                        reg.route.path(parentPath + "/" + currentPath);
                    }
                }
                // Was a parent Reg found?
                if (parentReg != null) {
                    // Add current reg as child.
                    parentReg.addChild(reg);
                } else {
                    // This reg is a top level Reg with a transparent parent RouteProxy.
                    // This is most likely for organizational structure.
                    topLevel.add(reg);
                }
            } else {
                // No parent equals top level.
                topLevel.add(reg);
            }
        }

        // Let's addComponents ReactRouter Routes.
        for (Reg reg : regs.values()) {
            if (reg.children == null || reg.children.isEmpty()) {
                continue;
            }
            final Route[] childRoutes = new Route[reg.children.size()];
            for (int i = 0; i < reg.children.size(); i++) {
                final Reg child = reg.children.get(i);
                // Is this child the IndexRoute?
                if (child.proxy.isIndex()) {
                    // Set as IndexRoute.
                    reg.route.indexRoute = child.route;
                }
                childRoutes[i] = child.route;
            }
            reg.route.childRoutes(childRoutes);
        }
        this.routes = new Route[topLevel.size()];
        for (int i = 0; i < topLevel.size(); i++) {
            this.routes[i] = topLevel.get(i).route;
        }
    }

    private final static class Reg {
        private final Route route;
        private final RouteProxy<?> proxy;
        private List<Reg> children = null;

        public Reg(Route route, RouteProxy<?> proxy) {
            this.route = route;
            this.proxy = proxy;
        }

        private void addChild(Reg child) {
            if (children == null) {
                children = new ArrayList<>();
            }
            children.add(child);
        }
    }
}
