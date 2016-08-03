package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AddCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddCircleSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AddCircle;
    }-*/;
}
