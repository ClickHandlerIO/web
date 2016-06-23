package ui.client.icons;


import react.client.ReactClass;

import javax.inject.Inject;


public class WarningSvgIcon extends AbstractMaterialIcon {

    @Inject
    public WarningSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Warning;
    }-*/;
}
