package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class KeyboardBackspaceSvgIcon extends AbstractMaterialIcon {

    @Inject
    public KeyboardBackspaceSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.KeyboardBackspace;
    }-*/;
}
