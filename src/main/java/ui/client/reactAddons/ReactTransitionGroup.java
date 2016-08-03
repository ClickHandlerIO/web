package ui.client.reactAddons;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.BaseProps;
import react.client.ExternalComponent;
import react.client.ReactClass;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactTransitionGroup extends ExternalComponent<ReactTransitionGroup.Props> {
    @Inject
    public ReactTransitionGroup() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.Camber.ReactAddons.ReactTransitionGroup;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement getComponent();

        @JsProperty
        void setComponent(ReactElement component);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);
    }
}
