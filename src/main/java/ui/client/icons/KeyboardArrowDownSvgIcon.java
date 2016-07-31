package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class KeyboardArrowDownSvgIcon extends AbstractMaterialIcon {

    @Inject
    public KeyboardArrowDownSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.KeyboardArrowDown;
    }-*/;
}
