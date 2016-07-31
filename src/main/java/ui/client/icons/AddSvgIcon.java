package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AddSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Add;
    }-*/;
}
