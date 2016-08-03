package ui.client.icons;

import react.client.ReactClass;

import javax.inject.Inject;


public class SearchSvgIcon extends AbstractMaterialIcon {

    @Inject
    public SearchSvgIcon() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Search;
    }-*/;
}
