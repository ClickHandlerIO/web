package ui.client.timePicker;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import ui.client.select.Select;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;

@Singleton
public class TimePickerHourSelect extends Select<TimePickerHour, TimePickerHourSelect.Props, TimePickerHourSelect.State> {

    @Inject
    public TimePickerHourSelect() {
    }

    @Override
    protected String getId(TimePickerHour data) {
        return data.toString();
    }

    @Override
    protected String getLabel(TimePickerHour data) {
        switch (data) {
            case ONE:
                return "01";
            case TWO:
                return "02";
            case THREE:
                return "03";
            case FOUR:
                return "04";
            case FIVE:
                return "05";
            case SIX:
                return "06";
            case SEVEN:
                return "07";
            case EIGHT:
                return "08";
            case NINE:
                return "09";
            case TEN:
                return "10";
            case ELEVEN:
                return "11";
            case TWELVE:
                return "12";
            default:
                return data.toString();
        }
    }

    @Override
    protected void loadOptions(ReactComponent<Props, State> $this, String search, Func.Run1<TimePickerHour[]> callback) {
        callback.run(TimePickerHour.values());
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends Select.Props<TimePickerHour> {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
