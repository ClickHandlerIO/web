package ui.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppBar extends ExternalComponent<AppBar.Props> {
    @Inject
    public AppBar() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.AppBar;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends ComponentProps {
        public String className;
        public String iconClassNameLeft;
        public String iconClassNameRight;
        public ReactElement iconElementLeft;
        public ReactElement iconElementRight;
        public StyleProps iconStyleRight;
        public MouseEventHandler onLeftIconButtonTouchTap;
        public MouseEventHandler onRIghtIconButtonTouchTap;
        public TouchEventHandler onTitleTouchTap;
        public boolean showMenuIconButton;
        public StyleProps style;
        public String title;
        public StyleProps titleStyle;
        public double zDepth;
        public MouseEventHandler onClick;
    }
}
