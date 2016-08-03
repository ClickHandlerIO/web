package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class CloudDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.CloudUpload;
    }-*/;
}
