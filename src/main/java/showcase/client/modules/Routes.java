package showcase.client.modules;

import showcase.client.modules.grid.GridPage;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Routes {
    @Inject
    GridPage.Route gridPage;

    @Inject
    public Routes() {
    }

    public GridPage.Route getGridPage() {
        return gridPage;
    }
}
