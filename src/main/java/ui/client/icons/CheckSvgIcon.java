package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class CheckSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CheckSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Check;
    }-*/;
}
