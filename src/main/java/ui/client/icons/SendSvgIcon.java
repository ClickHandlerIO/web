package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class SendSvgIcon extends AbstractMaterialIcon {

    @Inject
    public SendSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Send;
    }-*/;
}
