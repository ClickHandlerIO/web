package ui.client.reactSelect;

import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactSelectAsync extends ExternalComponent<ReactSelectAsync.Props> {
    @Inject
    public ReactSelectAsync() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.Camber.ReactSelectAsync;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // todo
    }
}
