package showcase.client;

import react.client.router.*;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class RouteListener implements RouteGatekeeper {

    @Inject
    History history;
    private String lastPath = null;

    @Inject
    public RouteListener() {
    }

    public static native void replace(Object replaceFunction, LocationDescriptor descriptor) /*-{
        replaceFunction(descriptor);
    }-*/;

    @Override
    public void onEnter(RouteProxy routeProxy, RouteProps routeProps, ReplaceStateFunction replaceStateFunction) {

        // if full path is "/" go to either login or home
        if (routeProps.location.getPathname().equals("/")) {
            replace(replaceStateFunction, App.getRoutes().getGridPage().buildLocation());
        }
    }

    @Override
    public Object onLeave(RouteProxy routeProxy) {
        return null;
    }
}
