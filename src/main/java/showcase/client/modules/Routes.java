package showcase.client.modules;

import showcase.client.modules.components.grid.GridPage;
import showcase.client.modules.components.select.SelectPage;

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
        SelectPage.Route selectPage;

        @Inject
        public ComponentsRoutes() {
        }

        public GridPage.Route getGridPage() {
            return gridPage;
        }

        public SelectPage.Route getSelectPage() {
            return selectPage;
        }
    }
}
