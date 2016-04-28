package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class ReplySvgIcon extends AbstractMaterialIcon {

    @Inject
    public ReplySvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Reply;
    }-*/;
}
