package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class PrintSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PrintSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Print;
    }-*/;
}
