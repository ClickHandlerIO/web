package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class MoreVertSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreVertSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.MoreVert;
    }-*/;
}
