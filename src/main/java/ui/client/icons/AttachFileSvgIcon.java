package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AttachFileSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AttachFileSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AttachFile;
    }-*/;
}
