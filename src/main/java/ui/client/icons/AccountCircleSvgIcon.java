package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AccountCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AccountCircle;
    }-*/;
}
