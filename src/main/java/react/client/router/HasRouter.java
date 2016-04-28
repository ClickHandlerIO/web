package react.client.router;

import common.client.Jso;
import react.client.ReactComponent;

/**
 *
 */
public interface HasRouter {
    default Router getRouter(ReactComponent $this) {
        return Jso.get($this.getProperty("context"), "router");
    }
}
