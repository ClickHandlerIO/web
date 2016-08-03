package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class MenuSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MenuSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Menu;
    }-*/;
}
