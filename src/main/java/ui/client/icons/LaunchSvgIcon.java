package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class LaunchSvgIcon extends AbstractMaterialIcon {

    @Inject
    public LaunchSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Launch;
    }-*/;
}
