package react.client.router;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;

/**
 *
 */
@JsType(isNative = true)
public interface RouteProps<T> extends BaseProps {
    /**
     * The Router's history history.
     * <p/>
     * Useful mostly for transitioning around with this.props.history.pushState(state, path, query)
     *
     * @return
     */
    @JsProperty
    History getHistory();

    /**
     * @return
     */
    @JsProperty
    Location<T> getLocation();

    /**
     * The dynamic segments of the URL.
     *
     * @return
     */
    @JsProperty
    Object getParams();

    /**
     * The route that rendered this component.
     *
     * @return
     */
    @JsProperty
    Route getRoute();

    /**
     * @return
     */
    @JsProperty
    Object getRouteParams();

    /**
     * @return Query Params
     */
    @JsOverlay
    default T getQueryParams() {
        return getLocation().getQuery();
    }
}
