package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class EmailSvgIcon extends AbstractMaterialIcon {

    @Inject
    public EmailSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Email;
    }-*/;
}
