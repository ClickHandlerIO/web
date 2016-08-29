package react.client.router;

import react.client.React;
import react.client.ReactElement;

/**
 *
 */
public class ReactRouter {
    /**
     *
     * @return
     */
    public static native Object getRouter() /*-{
        return $wnd.ReactRouter.Router;
    }-*/;

    /**
     *
     * @return
     */
    public static native History getBrowserHistory() /*-{
        return $wnd.ReactRouter.browserHistory;
    }-*/;

    public static native History getHashHistory() /*-{
        return $wnd.ReactRouter.hashHistory;
    }-*/;

    public static ReactElement create(RouterProps props) {
        return React.createElement(getRouter(), props);
    }
}
