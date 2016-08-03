package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class RemoveCircleOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public RemoveCircleOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.RemoveCircleOutline;
    }-*/;
}
