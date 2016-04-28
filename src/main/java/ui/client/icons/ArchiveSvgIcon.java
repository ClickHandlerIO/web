package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class ArchiveSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArchiveSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Archive;
    }-*/;
}
