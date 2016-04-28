package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class FileDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.FileDownload;
    }-*/;
}
