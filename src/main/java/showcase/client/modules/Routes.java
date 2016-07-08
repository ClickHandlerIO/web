package showcase.client.modules;

import showcase.client.modules.components.grid.GridPage;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Routes {

    @Inject
    ComponentsRoutes components;

    @Inject
    public Routes() {
    }

    public ComponentsRoutes getComponents() {
        return components;
    }

    public static class ComponentsRoutes {
        @Inject
        GridPage.Route gridPage;

        @Inject
        public ComponentsRoutes() {
        }

        public GridPage.Route getGridPage() {
            return gridPage;
        }
    }
}
