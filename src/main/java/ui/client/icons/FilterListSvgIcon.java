package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class FilterListSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FilterListSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.FilterList;
    }-*/;
}
