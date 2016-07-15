package showcase.client.modules.components.select;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.Dialog;
import ui.client.FlatButton;

import javax.inject.Inject;

import static jsinterop.annotations.JsPackage.GLOBAL;

public class SelectModal extends Component<SelectModal.Props, SelectModal.State> {

    @Inject
    Dialog dialog;
    @Inject
    SnowResortSelect resortSelect;
    @Inject
    FlatButton flatButton;

    @Inject
    public SelectModal() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return dialog.props()
                .modal(true)
                .autoScrollBodyContent(true)
                .title("Select Overflow Testing")
                .open($this.props.open)
                .actions(new ReactElement[]{
                        flatButton.props()
                                .label("Close")
                                .onTouchTap(() -> {
                                    if ($this.props.onClose != null) {
                                        $this.props.onClose.run();
                                    }
                                })
                                .build()
                })
                .build(
                        resortSelect.props().build()
                );
    }

    @Override
    public Props getDefaultProps() {
        return super.getDefaultProps().open(false);
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public boolean open;
        public Func.Run onClose;

        @JsOverlay
        public final Props open(final boolean open) {
            this.open = open;
            return this;
        }

        @JsOverlay
        public final Props onClose(final Func.Run onClose) {
            this.onClose = onClose;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {

    }
}
