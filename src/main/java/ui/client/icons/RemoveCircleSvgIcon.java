package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class RemoveCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public RemoveCircleSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.RemoveCircle;
    }-*/;
}
