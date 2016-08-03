package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class ImportExportSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ImportExportSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ImportExport;
    }-*/;
}
