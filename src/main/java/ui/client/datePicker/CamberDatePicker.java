package ui.client.datePicker;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.HTMLPanel;
import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import moment.client.Moment;
import react.client.BaseProps;
import react.client.Component;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;

import static react.client.DOM.div;


@Singleton
public class CamberDatePicker extends Component<CamberDatePicker.Props, CamberDatePicker.State> {
//    private final Loggly log = Loggly.get(CamberDatePicker.class);

    @Inject
    public CamberDatePicker() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div($ -> $.id($this.state.getGuid()));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public State getInitialState() {
        State s = super.getInitialState();
        s.setGuid(UUID.uuid());
        s.setPicker(new MomentPickerWidget());
        return s;
    }

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this) {
        super.componentDidMount($this);

        // add widget to ui
        HTMLPanel panel = HTMLPanel.wrap(Document.get().getElementById($this.state.getGuid()));
        panel.add($this.state.getPicker());
    }

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.intakeProps($this, nextProps);
        $this.state.getPicker().setValue(nextProps.getMoment());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        Moment getMoment();

        @JsProperty
        void setMoment(Moment moment);

        @JsProperty
        Func.Run1<Moment> getOnMomentChanged();

        @JsProperty
        void setOnMomentChanged(Func.Run1<Moment> onMomentChanged);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        String getGuid();

        @JsProperty
        void setGuid(String guid);

        @JsProperty
        MomentPickerWidget getPicker();

        @JsProperty
        void setPicker(MomentPickerWidget picker);
    }
}
