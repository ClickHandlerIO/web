package showcase.client;

import common.client.Bus;
import common.client.Is;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import react.client.router.History;
import react.client.router.ReactRouter;
import react.client.router.RouteGatekeeper;
import showcase.client.modules.RootModule;
import showcase.client.modules.Routes;

import javax.inject.Singleton;

/**
 *
 */
@Singleton
@Component(modules = {App.M.class})
public interface App {
    App instance = DaggerApp.create();

    static App get() {
        return instance;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // Convenience Methods
    ////////////////////////////////////////////////////////////////////////////////////////

    static boolean isSuperDevMode() {
        return Is.devMode();
    }

    static History getHistory() {
        return instance.history();
    }

    static Bus getBus() {
        return instance.bus();
    }

    static Routes getRoutes() {
        return instance.routes();
    }


    ////////////////////////////////////////////////////////////////////////////////////////
    // Top Level Dependencies
    ////////////////////////////////////////////////////////////////////////////////////////

    History history();

    Bus bus();

    RootModule bootstrap();

    Routes routes();

    RouteListener routeListener();


    ////////////////////////////////////////////////////////////////////////////////////////
    // Module
    ////////////////////////////////////////////////////////////////////////////////////////

    @Module
    class M {

        ////////////////////////////////////////////////////////////////////////////////////////
        // Configure Route Gatekeeper.
        ////////////////////////////////////////////////////////////////////////////////////////

        @Provides
        @Singleton
        RouteGatekeeper onEnter(RouteListener routeListener) {
            return routeListener;
        }

        ////////////////////////////////////////////////////////////////////////////////////////
        // Configure history.
        ////////////////////////////////////////////////////////////////////////////////////////

        @Provides
        @Singleton
        History history() {
            return ReactRouter.getHashHistory();
        }

        ////////////////////////////////////////////////////////////////////////////////////////
        // Defaults
        ////////////////////////////////////////////////////////////////////////////////////////

        @Provides
        Object object() {
            return new Object();
        }
    }

    /**
     *
     */
    @Module
    class Core {
        @Provides
        App app() {
            return instance;
        }


        @Provides
        @Singleton
        History history() {
            return app().history();
        }

        @Provides
        @Singleton
        Bus bus() {
            return app().bus();
        }

        @Provides
        RouteGatekeeper routeGatekeeper() {
            return app().routeListener();
        }

        @Provides
        Object object() {
            return new Object();
        }
    }
}
