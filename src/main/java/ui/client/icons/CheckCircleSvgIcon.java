package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class CheckCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CheckCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.CheckCircle;
    }-*/;
}
