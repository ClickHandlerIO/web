package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class StorageSvgIcon extends AbstractMaterialIcon {

    @Inject
    public StorageSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Storage;
    }-*/;
}
