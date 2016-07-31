package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AddBoxSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddBoxSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AddBox;
    }-*/;
}
