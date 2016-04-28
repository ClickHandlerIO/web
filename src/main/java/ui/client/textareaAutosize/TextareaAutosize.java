package ui.client.textareaAutosize;

import jsinterop.annotations.JsType;
import react.client.ExternalComponent;
import react.client.ReactClass;

import javax.inject.Inject;

public class TextareaAutosize extends ExternalComponent<TextareaAutosize.Props> {

    @Inject
    public TextareaAutosize() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.Camber.TextAreaAutosize;
    }-*/;

    @JsType(isNative = true)
    public interface Props {
        // todo
    }
}
