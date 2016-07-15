package showcase.client.modules.components;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import common.client.Func;
import dagger.Component;
import react.client.router.ModuleLoader;
import react.client.router.RoutesBuilder;
import showcase.client.App;
import showcase.client.modules.components.grid.GridPage;
import showcase.client.modules.components.select.SelectPage;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Component(modules = App.Core.class)
public interface ComponentsModule {
    ComponentsModule instance = DaggerComponentsModule.create();

    Routes routes();

    @Singleton
    class Routes extends RoutesBuilder {
        @Inject
        ComponentsShell shell;
        @Inject
        GridPage gridPage;
        @Inject
        SelectPage selectPage;

        @Inject
        public Routes() {
        }

        @Override
        protected void registerComponents() {
            add(shell);
            add(gridPage);
            add(selectPage);
        }
    }

    class Loader extends ModuleLoader {
        @Inject
        public Loader(ComponentsShell.Route root) {
            super(root.path());
        }

        @Override
        protected void loadRouteBuilder(Func.Run1<RoutesBuilder> callback) {
            GWT.runAsync(new RunAsyncCallback() {
                @Override
                public void onFailure(Throwable reason) {
                    // Ignore.
                }

                @Override
                public void onSuccess() {
                    callback.run(ComponentsModule.instance.routes());
                }
            });
        }
    }
}
