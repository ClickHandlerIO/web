package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AddCircleOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddCircleOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AddCircleOutline;
    }-*/;
}
