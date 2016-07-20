package ui.client.camberSelect;

import common.client.Jso;
import ui.client.select2.Select2Data;
import react.client.ReactComponent;

import java.util.ArrayList;
import java.util.Arrays;

@Deprecated
public abstract class AbstractEnumCamberSelect<E extends Enum<E>, P extends AbstractCamberSelect.CamberSelectProps<E>> extends AbstractCamberSelect<E, P> {
    public abstract String toString(E value);

    public abstract E[] getValues();

    @Override
    public P getDefaultProps() {
        P p = super.getDefaultProps();
        p.setMinimumResultsForSearch(-1.);
        p.setDebounceDisabled(true);
        return p;
    }

    @Override
    protected Select2Data translate(E value) {
        Select2Data data = Jso.create();
        data.setId(value.toString());
        data.setText(toString(value));
        return data;
    }

    @Override
    protected void fetch(ReactComponent<P, State<E>> $this, String search, FetchCompletionHandler<E> completionHandler) {
        completionHandler.onComplete(new ArrayList<>(Arrays.asList(getValues())));
    }
}
