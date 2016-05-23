package ui.client.timePicker;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import ui.client.select.Select;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;

@Singleton
public class TimePickerMeridianSelect extends Select<TimePickerMeridian, TimePickerMeridianSelect.Props, TimePickerMeridianSelect.State> {

    @Inject
    public TimePickerMeridianSelect() {
    }

    @Override
    protected String getId(TimePickerMeridian data) {
        return data.toString();
    }

    @Override
    protected String getLabel(TimePickerMeridian data) {
        switch (data) {
            case AM:
                return "AM";
            case PM:
                return "PM";
            default:
                return data.toString();
        }
    }

    @Override
    protected void loadOptions(ReactComponent<Props, State> $this, String search, Func.Run1<TimePickerMeridian[]> callback) {
        callback.run(TimePickerMeridian.values());
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends Select.Props<TimePickerMeridian> {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
