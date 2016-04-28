package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class PersonAddSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PersonAddSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.PersonAdd;
    }-*/;
}
