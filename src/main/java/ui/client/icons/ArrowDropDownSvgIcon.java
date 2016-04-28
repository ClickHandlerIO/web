package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class ArrowDropDownSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArrowDropDownSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ArrowDropDown;
    }-*/;
}
