package ui.client.icons;


import react.client.ReactClass;

import javax.inject.Inject;


public class SettingsBackupRestoreSvgIcon extends AbstractMaterialIcon {

    @Inject
    public SettingsBackupRestoreSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.SettingsBackupRestore;
    }-*/;
}
