package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class MailOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MailOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.MailOutline;
    }-*/;
}
