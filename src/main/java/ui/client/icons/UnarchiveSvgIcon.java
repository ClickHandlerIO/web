package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class UnarchiveSvgIcon extends AbstractMaterialIcon {

    @Inject
    public UnarchiveSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Unarchive;
    }-*/;
}
