package ui.client.icons;

import jsinterop.annotations.JsType;
import react.client.ExternalComponent;
import ui.client.SvgIcon;

public abstract class AbstractMaterialIcon extends ExternalComponent<AbstractMaterialIcon.Props> {

    @Override
    protected void applyDefaults(Props props) {
        super.applyDefaults(props);
        props.setViewBox("0 0 24 24");
    }

    @JsType(isNative = true)
    public interface Props extends SvgIcon.Props {
    }
}