package react.client.router;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType
public class RouterProps {
    public Object history;
    public Route routes;

    @JsIgnore
    public RouterProps history(Object history) {
        this.history = history;
        return this;
    }

    @JsIgnore
    public RouterProps routes(Route routes) {
        this.routes = routes;
        return this;
    }
}
