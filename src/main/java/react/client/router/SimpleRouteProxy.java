package react.client.router;

import javax.inject.Inject;

/**
 *
 */
public class SimpleRouteProxy extends RouteProxy<Object> {
    @Inject
    public SimpleRouteProxy() {
    }

    public SimpleRouteProxy(String path) {
        super(path);
    }

    public SimpleRouteProxy(RouteProxy parent) {
        super(parent);
    }

    public SimpleRouteProxy(String path, RouteProxy parent) {
        super(path, parent);
    }

    public SimpleRouteProxy(String path, boolean index) {
        super(path, index);
    }

    public SimpleRouteProxy(String path, RouteProxy parent, boolean index) {
        super(path, parent, index);
    }
}
