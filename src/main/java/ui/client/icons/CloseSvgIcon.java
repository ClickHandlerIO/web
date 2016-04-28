package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class CloseSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloseSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Close;
    }-*/;
}
