package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class DragHandleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public DragHandleSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.DragHandle;
    }-*/;
}
