package ui.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class RadioButtonGroup extends ExternalComponent<RadioButtonGroup.Props> {

    @Inject
    public RadioButtonGroup() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.MaterialUi.RadioButtonGroup;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getDefaultSelected();

        @JsProperty
        void setDefaultSelected(String defaultSelected);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        String getName();

        @JsProperty
        void setName(String name);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getValueSelected();

        @JsProperty
        void setValueSelected(String valueSelected);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props defaultSelected(final String defaultSelected) {
            setDefaultSelected(defaultSelected);
            return this;
        }

        @JsOverlay
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props valueSelected(final String valueSelected) {
            setValueSelected(valueSelected);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run2<SyntheticEvent, String> onChange) {
            Jso.set(this, "onCheck", onChange);
            return this;
        }
    }
}
