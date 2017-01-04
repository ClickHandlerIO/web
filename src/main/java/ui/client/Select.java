package ui.client;

import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Select extends Component<Select.Props, Select.State> {
    @Inject
    AutoComplete AutoComplete;

    @Inject
    public Select() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        Props p = $this.props;

        if ($this.props.focus) {
            p = Jso.copy($this.props);
            p.ref(value -> {
                if ($this.props.disableInput)
                    setReadonly(Jso.get(Jso.get(Jso.get(value, "refs"), "searchTextField"), "input"));

                Jso.call(Jso.get(Jso.get(Jso.get(value, "refs"), "searchTextField"), "input"), "focus");
            });
        } else if ($this.props.disableInput) {
            p = Jso.copy($this.props);
            p.ref(
                value -> {
                    setReadonly(Jso.get(Jso.get(Jso.get(value, "refs"), "searchTextField"), "input"));
                }
            );
        }

        return AutoComplete.$(p);
    }

    private static native void setReadonly(Object o) /*-{
        if (!o)
            return;
        o.setAttribute("readonly", "readonly");
    }-*/;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Props extends AutoComplete.Props {
        public boolean focus;
        public boolean disableInput;

        @JsOverlay
        public final Props focus(boolean focus) {
            this.focus = focus;
            return this;
        }

        @JsOverlay
        public final Props disableInput(boolean readOnly) {
            this.disableInput = readOnly;
            return this;
        }
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class State extends ComponentProps {

    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Item {
        public String text;
        public ReactElement value;

        @JsOverlay
        public final Item text(String text) {
            this.text = text;
            return this;
        }

        @JsOverlay
        public final Item value(ReactElement value) {
            this.value = value;
            return this;
        }
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class DataSourceConfig {
        public String text;
        public String value;

        @JsOverlay
        public final DataSourceConfig text(String text) {
            this.text = text;
            return this;
        }

        @JsOverlay
        public final DataSourceConfig value(String value) {
            this.value = value;
            return this;
        }
    }
}
