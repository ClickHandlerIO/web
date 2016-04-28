package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class FileUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileUploadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.FileUpload;
    }-*/;
}
