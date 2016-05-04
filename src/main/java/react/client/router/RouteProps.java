package react.client.router;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.ComponentProps;

/**
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RouteProps<T> extends ComponentProps {
    /**
     * @return
     */
    public Location<T> location;

    /**
     * The dynamic segments of the URL.
     *
     * @return
     */
    public Object params;

    /**
     * The route that rendered this component.
     *
     * @return
     */
    public Route route;

    /**
     * @return
     */
    public Object routeParams;

    /**
     * @return Query Params
     */
    @JsOverlay
    public final T getQueryParams() {
        return location.getQuery();
    }

    /**
     * @return Query Params
     */
    @JsOverlay
    public final T queryParams() {
        return location.getQuery();
    }
}
