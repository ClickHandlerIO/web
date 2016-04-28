package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class NotificationsSvgIcon extends AbstractMaterialIcon {

    @Inject
    public NotificationsSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Notifications;
    }-*/;
}
