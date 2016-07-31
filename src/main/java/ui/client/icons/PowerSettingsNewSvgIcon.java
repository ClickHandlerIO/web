package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class PowerSettingsNewSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PowerSettingsNewSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.PowerSettingsNew;
    }-*/;
}
