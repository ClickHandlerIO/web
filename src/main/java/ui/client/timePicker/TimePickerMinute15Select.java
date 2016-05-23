package ui.client.timePicker;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import ui.client.select.Select;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;

@Singleton

public class TimePickerMinute15Select extends Select<TimePickerMinute15, TimePickerMinute15Select.Props, TimePickerMinute15Select.State> {
    @Inject
    public TimePickerMinute15Select() {
    }

    @Override
    protected String getId(TimePickerMinute15 data) {
        return data.toString();
    }

    @Override
    protected String getLabel(TimePickerMinute15 data) {
        switch (data) {
            case ZERO:
                return "00";
            case FIFTEEN:
                return "15";
            case THIRTY:
                return "30";
            case FOURTY_FIVE:
                return "45";
            default:
                return data.toString();
        }
    }

    @Override
    protected void loadOptions(ReactComponent<Props, State> $this, String search, Func.Run1<TimePickerMinute15[]> callback) {
        callback.run(TimePickerMinute15.values());
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends Select.Props<TimePickerMinute15> {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
