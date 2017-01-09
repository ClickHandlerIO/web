package ui.client.datePicker;

import com.google.gwt.dom.client.Document;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import moment.client.Moment;
import react.client.BaseProps;
import react.client.Component;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.util.DateUtil;
import ui.client.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;

import static react.client.DOM.div;

@Singleton
public class CamberDateBox extends Component<CamberDateBox.Props, CamberDateBox.State> {
//    private final Loggly log = Loggly.get(CamberDateBox.class);

    @Inject
    public CamberDateBox() {
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

        DateBox widget = new DateBox();
//        widget.setFireNullValues(true);
        s.setDateBox(widget);

        return s;
    }

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this) {
        super.componentDidMount($this);

        // add widget to ui
        HTMLPanel panel = HTMLPanel.wrap(Document.get().getElementById($this.state.getGuid()));
        panel.add($this.state.getDateBox());
    }

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.intakeProps($this, nextProps);

        DateBox widget = $this.state.getDateBox();
        widget.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat(nextProps.getFormat())));
        widget.setValue(nextProps.getMoment() == null ? null : DateUtil.toBrowserAdjustedDate(nextProps.getMoment()), false);
//        widget.getDatePicker().setVisibleYearCount(nextProps.getVisibleYearCount() == null ? 20 : nextProps.getVisibleYearCount().intValue());
//        widget.getDatePicker().setYearAndMonthDropdownVisible(nextProps.isEnableMonthYearDropdowns());
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
        String getFormat();

        @JsProperty
        void setFormat(String format);  // http://www.gwtproject.org/javadoc/latest/com/google/gwt/i18n/client/DateTimeFormat.html

        @JsProperty
        Moment getMoment();

        @JsProperty
        void setMoment(Moment moment);

        @JsProperty
        Func.Run1<Moment> getOnMomentChanged();

        @JsProperty
        void setOnMomentChanged(Func.Run1<Moment> onMomentChanged);

        @JsProperty
        boolean isEnableMonthYearDropdowns();

        @JsProperty
        void setEnableMonthYearDropdowns(boolean enableMonthYearDropdowns);

        @JsProperty
        Double getVisibleYearCount();

        @JsProperty
        void setVisibleYearCount(Double visibleYearCount);

        @JsProperty
        String getWidth();

        @JsProperty
        void setWidth(String width);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        String getGuid();

        @JsProperty
        void setGuid(String guid);

        @JsProperty
        DateBox getDateBox();

        @JsProperty
        void setDateBox(DateBox momentBox);
    }
}
