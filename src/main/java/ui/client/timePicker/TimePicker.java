package ui.client.timePicker;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import moment.client.Moment;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class TimePicker extends Component<TimePicker.Props, TimePicker.State> {

    @Inject
    TimePickerHourSelect HourSelect;
    @Inject
    TimePickerMinute15Select MinuteSelect;
    @Inject
    TimePickerMeridianSelect MeridianSelect;

    @Inject
    public TimePicker() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return
                div(className("flex-row align-items-center"), children -> {
                            children.add(
                                    HourSelect.props()
                                            .clearable(false)
                                            .style(new StyleProps().width("56px"))
                                            .value($this.state.hours)
                                            .onChange(v -> {
                                                $this.setState(s -> s.hours(v));
                                                fireUpdate($this, v, $this.state.minutes, $this.state.meridian);
                                            }).build(),
                                    div(style().margin("0 5px"), ":"),
                                    MinuteSelect.props()
                                            .clearable(false)
                                            .style(new StyleProps().width("65px"))
                                            .value($this.state.minutes)
                                            .onChange(v -> {
                                                $this.setState(s -> s.minutes(v));
                                                fireUpdate($this, $this.state.hours, v, $this.state.meridian);
                                            }).build(),
                                    div(style().width("5px")),
                                    MeridianSelect.props()
                                            .clearable(false)
                                            .style(new StyleProps().width("75px"))
                                            .value($this.state.meridian)
                                            .onChange(v -> {
                                                $this.setState(s -> s.meridian(v));
                                                fireUpdate($this, $this.state.hours, $this.state.minutes, v);
                                            }).build()
                            );

                            if ($this.props.timeZone != null && !$this.props.timeZone.isEmpty()) {
                                children.add(
                                        div(style().paddingLeft(5), Moment.moment().tz($this.props.timeZone).format("z"))
                                );
                            }
                        }

                );
    }

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.intakeProps($this, nextProps);

        Moment m = nextProps.time == null ? Moment.moment() : nextProps.time;
        $this.setState(s -> {
            s.hours(TimePickerHour.parse(m.hours()));
            s.minutes(TimePickerMinute15.parse(m.minutes()));
            s.meridian(m.hours() >= 12 ? TimePickerMeridian.PM : TimePickerMeridian.AM);
        });
    }

    private void fireUpdate(ReactComponent<Props, State> $this, TimePickerHour hour, TimePickerMinute15 minute, TimePickerMeridian meridian) {
        Moment time = Moment.moment();
        if ($this.props.timeZone != null && !$this.props.timeZone.isEmpty()) {
            time.tz($this.props.timeZone);
        }
        time.startOf("day"); // zero out time
        time.hours(hour.getValue() + (meridian.equals(TimePickerMeridian.PM) ? 12 : 0));
        time.minutes(minute.getValue());

        if ($this.props.onChange != null) {
            $this.props.onChange.run(time);
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public Moment time;
        public String timeZone;
        public Func.Run1<Moment> onChange;

        @JsOverlay
        public final Props key(final String key) {
            this.key = key;
            return this;
        }

        @JsOverlay
        public final Props timeZone(final String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        @JsOverlay
        public final Props onChange(final Func.Run1<Moment> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props time(final Moment time) {
            this.time = time;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
        TimePickerHour hours;
        TimePickerMinute15 minutes;
        TimePickerMeridian meridian;

        @JsOverlay
        public final State hours(final TimePickerHour hours) {
            this.hours = hours;
            return this;
        }

        @JsOverlay
        public final State minutes(final TimePickerMinute15 minutes) {
            this.minutes = minutes;
            return this;
        }

        @JsOverlay
        public final State meridian(final TimePickerMeridian meridian) {
            this.meridian = meridian;
            return this;
        }
    }
}
