package ui.client.reactSelect;

import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactSelect extends ExternalComponent<ReactSelect.Props> {
    @Inject
    public ReactSelect() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.Camber.ReactSelect;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // todo
    }
}
