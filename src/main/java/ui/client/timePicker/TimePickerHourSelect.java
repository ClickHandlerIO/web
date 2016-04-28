package ui.client.timePicker;

import ui.client.camberSelect.AbstractEnumCamberSelect;
import ui.client.util.CamberEnumUtil;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePickerHourSelect extends AbstractEnumCamberSelect<TimePickerHour, TimePickerHourSelect.Props> {

    @Inject
    public TimePickerHourSelect() {
    }

    @Override
    public String toString(TimePickerHour value) {
        return CamberEnumUtil.toString(value);
    }

    @Override
    public TimePickerHour[] getValues() {
        return TimePickerHour.values();
    }

    @JsType(isNative = true)
    public interface Props extends AbstractEnumCamberSelect.CamberSelectProps<TimePickerHour> {
    }
}
