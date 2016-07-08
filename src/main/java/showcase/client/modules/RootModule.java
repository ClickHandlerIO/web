package showcase.client.modules;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RootModule extends react.client.router.RootModule {
    @Inject
    public RootModule(RootShell shell) {
        super(shell);
    }

    @Override
    protected void registerModules() {
    }
}
