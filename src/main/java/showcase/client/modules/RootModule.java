package showcase.client.modules;

import showcase.client.modules.components.ComponentsModule;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RootModule extends react.client.router.RootModule {
    @Inject
    ComponentsModule.Loader components;

    @Inject
    public RootModule(RootShell shell) {
        super(shell);
    }

    @Override
    protected void registerModules() {
        register(components);
    }
}
