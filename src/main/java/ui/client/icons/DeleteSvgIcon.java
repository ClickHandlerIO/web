package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class DeleteSvgIcon extends AbstractMaterialIcon {

    @Inject
    public DeleteSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Delete;
    }-*/;
}
