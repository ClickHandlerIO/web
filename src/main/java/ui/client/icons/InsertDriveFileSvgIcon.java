package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class InsertDriveFileSvgIcon extends AbstractMaterialIcon {

    @Inject
    public InsertDriveFileSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.InsertDriveFile;
    }-*/;
}
