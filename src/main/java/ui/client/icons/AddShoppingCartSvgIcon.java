package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class AddShoppingCartSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddShoppingCartSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AddShoppingCart;
    }-*/;
}
