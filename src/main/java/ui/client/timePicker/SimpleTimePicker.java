package ui.client.timePicker;

import common.client.Func;
import moment.client.Moment;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static react.client.DOM.div;

@Singleton
public class SimpleTimePicker extends Component<SimpleTimePicker.Props, SimpleTimePicker.State> {

    @Inject
    TimePickerHourSelect timePickerHourSelect;
    @Inject
    TimePickerMinute15Select timePickerMinute15Select;
    @Inject
    TimePickerMeridianSelect timePickerMeridianSelect;

    @Inject
    public SimpleTimePicker() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div($ -> $.className("flex-row align-items-center"),
            timePickerHourSelect.$($ -> {
                $.setAllowClear(false);
                $.setStyle(new StyleProps().width("65px"));
                $.setValue($this.getState().getHours());
                $.setOnValueChanged(v -> {
                    $this.setState(s -> s.setHours(v));
                    fireUpdate($this, v, $this.getState().getMinutes(), $this.getState().getMeridian());
                });
            }),
            div($ -> $.style(s -> s.margin("0 5px")), ":"),
            timePickerMinute15Select.$($ -> {
                $.setAllowClear(false);
                $.setStyle(new StyleProps().width("65px"));
                $.setValue($this.getState().getMinutes());
                $.setOnValueChanged(v -> {
                    $this.setState(s -> s.setMinutes(v));
                    fireUpdate($this, $this.getState().getHours(), v, $this.getState().getMeridian());
                });
            }),
            div($ -> $.style(s -> s.width("5px"))),
            timePickerMeridianSelect.$($ -> {
                $.setAllowClear(false);
                $.setStyle(new StyleProps().width("75px"));
                $.setValue($this.getState().getMeridian());
                $.setOnValueChanged(v -> {
                    $this.setState(s -> s.setMeridian(v));
                    fireUpdate($this, $this.getState().getHours(), $this.getState().getMinutes(), v);
                });
            })
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.intakeProps($this, nextProps);

        Moment m = nextProps.getTime() == null ? Moment.moment() : nextProps.getTime();
        $this.setState(s -> {
            s.setHours(TimePickerHour.parse(m.hours()));
            s.setMinutes(TimePickerMinute15.parse(m.minutes()));
            s.setMeridian(m.hours() >= 12 ? TimePickerMeridian.PM : TimePickerMeridian.AM);
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private void fireUpdate(ReactComponent<Props, State> $this, TimePickerHour hour, TimePickerMinute15 minute, TimePickerMeridian meridian) {
        Moment time = Moment.moment();
        time.startOf("day"); // zero out time
        time.hours(hour.getValue() + (meridian.equals(TimePickerMeridian.PM) ? 12 : 0));
        time.minutes(minute.getValue());

        if ($this.getProps().getOnTimeChanged() != null) {
            $this.getProps().getOnTimeChanged().run(time);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        Moment getTime();

        @JsProperty
        void setTime(Moment moment);

        @JsProperty
        Func.Run1<Moment> getOnTimeChanged();

        @JsProperty
        void setOnTimeChanged(Func.Run1<Moment> onTimeChanged);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        TimePickerHour getHours();

        @JsProperty
        void setHours(TimePickerHour hours);

        @JsProperty
        TimePickerMinute15 getMinutes();

        @JsProperty
        void setMinutes(TimePickerMinute15 minutes);

        @JsProperty
        TimePickerMeridian getMeridian();

        @JsProperty
        void setMeridian(TimePickerMeridian meridian);
    }
}
