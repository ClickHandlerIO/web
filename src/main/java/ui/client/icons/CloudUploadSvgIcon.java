package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class CloudUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudUploadSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.CloudUpload;
    }-*/;
}
