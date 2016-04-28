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
public class Checkbox extends ExternalComponent<Checkbox.Props> {

    @Inject
    public Checkbox() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Checkbox;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean checked;
//        ReactElement checkedIcon; // SvgIcon to use when checked
//        ReactElement unCheckedIcon; // SvgIcon to use when un-checked
//        boolean defaultChecked;
//        boolean disabled;
//        StyleProps iconStyle;
//        String labelPosition; // enum 'left' 'right'
//        StyleProps labelStyle;
//        StyleProps style;
//        String valueLink;


        @JsProperty
        boolean isChecked();

        @JsProperty
        void setChecked(boolean checked);

        @JsProperty
        ReactElement getCheckedIcon();

        @JsProperty
        void setCheckedIcon(ReactElement checkedIcon);

        @JsProperty
        ReactElement getUnCheckedIcon();

        @JsProperty
        void setUnCheckedIcon(ReactElement unCheckedIcon);

        @JsProperty
        boolean isDefaultChecked();

        @JsProperty
        void setDefaultChecked(boolean defaultChecked);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        StyleProps getIconStyle();

        @JsProperty
        void setIconStyle(StyleProps iconStyle);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        StyleProps getLabelStyle();

        @JsProperty
        void setLabelStyle(StyleProps labelStyle);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        String getValueLink();

        @JsProperty
        void setValueLink(String valueLink);

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        Func.Run getOnCheck();

        @JsProperty
        void setOnCheck(Func.Run onCheck);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props checked(final boolean checked) {
            setChecked(checked);
            return this;
        }

        @JsOverlay
        default Props checkedIcon(final ReactElement checkedIcon) {
            setCheckedIcon(checkedIcon);
            return this;
        }

        @JsOverlay
        default Props unCheckedIcon(final ReactElement unCheckedIcon) {
            setUnCheckedIcon(unCheckedIcon);
            return this;
        }

        @JsOverlay
        default Props defaultChecked(final boolean defaultChecked) {
            setDefaultChecked(defaultChecked);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final StyleProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final StyleProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props valueLink(final String valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props label(final String label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run onCheck) {
            Jso.set(this, "onCheck", onCheck);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run1<Object> onCheck) {
            Jso.set(this, "onCheck", onCheck);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run2<Object, Object> onCheck) {
            Jso.set(this, "onCheck", onCheck);
            return this;
        }
    }
}
