package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class MoreHorizSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreHorizSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.MoreHoriz;
    }-*/;
}
