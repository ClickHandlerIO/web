package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class ArrowDropUpSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArrowDropUpSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ArrowDropUp;
    }-*/;
}
