package ui.client.icons;


import react.client.ReactClass;

import javax.inject.Inject;


public class AccountBoxSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountBoxSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AccountBox;
    }-*/;
}
