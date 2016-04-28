package react.client.router;

import common.client.Func;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashMap;

/**
 *
 */
public abstract class ModuleLoader {
    private final HashMap<String, ModuleLoader> loaderMap = new HashMap<>();
    private final String prefix;
    @Inject
    Provider<RouteGatekeeper> routeGatekeeperProvider;
    private RoutesBuilder routesBuilder;
    private Location location;
    private RoutesCallback callback;
    private boolean registeredModulesCalled;

    public ModuleLoader(String prefix) {
        this.prefix = prefix.toLowerCase();
    }

    public String getPrefix() {
        return prefix;
    }

    public Location getLocation() {
        return location;
    }

    public RoutesCallback getCallback() {
        return callback;
    }

    private HashMap<String, ModuleLoader> ensureRegisterModules() {
        if (registeredModulesCalled) {
            return loaderMap;
        }
        registeredModulesCalled = true;
        registerModules();
        return loaderMap;
    }

    /**
     *
     */
    protected void registerModules() {
    }

    /**
     * Register sub-module.
     *
     * @param subModule
     */
    protected void register(ModuleLoader subModule) {
        loaderMap.put(subModule.prefix, subModule);
    }

    boolean isRoot() {
        return false;
    }

    /**
     * @param relativePath
     * @param location
     * @param callback
     */
    protected void handle(final String relativePath, final Location location, RoutesCallback callback) {
        this.location = location;
        this.callback = (error, routes) -> {
            // Find parent route.
            getRouteBuilder(value -> {
                final Route[] ownedRoutes = value != null ? value.getRoutes() : null;

                if (ownedRoutes != null && ownedRoutes.length > 0) {
                    final Route parent = ownedRoutes[0];
                    parent.childRoutes(routes);
                    // Nest under parent.
                    callback.run(null, new Route[]{parent});
                } else {
                    // Pass straight through.
                    callback.run(null, routes);
                }
            });
        };

        // Get first path.
        String p = relativePath.toLowerCase().trim();
        if (p.startsWith("/")) {
            p = p.substring(1);
        }

        // Maybe it's a module prefix.
        String modulePrefix = p.split("/")[0];

        // Is it a sub-module.?
        ModuleLoader loader = ensureRegisterModules().get(modulePrefix.toLowerCase());
        if (loader == null) {
            // Maybe pass-through?
            loader = ensureRegisterModules().get("");
            if (loader != null) {
                modulePrefix = "";
            }
        }
        if (loader != null) {
            // Push down to sub-module.
            loader.handle(!modulePrefix.isEmpty() ? p.substring(modulePrefix.length()) : p, location, this.callback);
        } else {
            // Pass owned routes straight through.
            getRouteBuilder(value -> {
                if (routesBuilder != null) {
                    callback.run(null, routesBuilder.getRoutes());
                } else {
                    callback.run(null, new Route[0]);
                }
            });
        }
    }

    /**
     * @param callback
     */
    protected void getRouteBuilder(Func.Run1<RoutesBuilder> callback) {
        if (routesBuilder != null) {
            callback.run(routesBuilder);
        } else {
            loadRouteBuilder(routeBuilder -> {
                initRouteBuilder(routeBuilder);
                callback.run(routeBuilder);
            });
        }
    }

    /**
     * @param routesBuilder
     */
    protected void initRouteBuilder(RoutesBuilder routesBuilder) {
        this.routesBuilder = routesBuilder;

        if (routesBuilder != null) {
            routesBuilder.init();
        }
    }

    /**
     * @param callback
     */
    protected abstract void loadRouteBuilder(Func.Run1<RoutesBuilder> callback);
}
