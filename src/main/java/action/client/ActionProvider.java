package action.client;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 *
 */
public class ActionProvider<A extends AbstractAction<IN, OUT>, IN, OUT, INP extends Provider<IN>, OUTP extends Provider<OUT>> implements Provider<A> {
    @Inject
    Provider<A> actionProvider;
    @Inject
    INP inProvider;
    @Inject
    OUTP outProvider;

    @Inject
    public ActionProvider() {
    }

    @Override
    public A get() {
        return actionProvider.get();
    }

    public Provider<A> getActionProvider() {
        return actionProvider;
    }

    public INP getInProvider() {
        return inProvider;
    }

    public OUTP getOutProvider() {
        return outProvider;
    }
}
