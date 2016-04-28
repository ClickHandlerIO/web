package ui.client.timePicker;

import ui.client.camberSelect.AbstractEnumCamberSelect;
import ui.client.util.CamberEnumUtil;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePickerMinute15Select extends AbstractEnumCamberSelect<TimePickerMinute15, TimePickerMinute15Select.Props> {

    @Inject
    public TimePickerMinute15Select() {
    }

    @Override
    public String toString(TimePickerMinute15 value) {
        return CamberEnumUtil.toString(value);
    }

    @Override
    public TimePickerMinute15[] getValues() {
        return TimePickerMinute15.values();
    }

    @JsType(isNative = true)
    public interface Props extends AbstractEnumCamberSelect.CamberSelectProps<TimePickerMinute15> {
    }
}
