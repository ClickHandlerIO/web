package ui.client.timePicker;

import common.client.Func;
import react.client.ReactComponent;
import ui.client.select.Select;
import jsinterop.annotations.JsType;
import ui.client.util.CamberEnumUtil;

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
        return CamberEnumUtil.toString(data);
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
