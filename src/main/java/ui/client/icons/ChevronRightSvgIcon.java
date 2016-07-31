package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class ChevronRightSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ChevronRightSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ChevronRight;
    }-*/;
}
