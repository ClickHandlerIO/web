package ui.client.util;

import ui.client.timePicker.TimePickerHour;
import ui.client.timePicker.TimePickerMeridian;
import ui.client.timePicker.TimePickerMinute15;

public class CamberEnumUtil {
    public static String toString(TimePickerHour value) {
        if (value == null) {
            return "";
        }

        switch (value) {
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
                return value.toString();
        }
    }

    public static String toString(TimePickerMinute15 value) {
        if (value == null) {
            return "";
        }

        switch (value) {
            case ZERO:
                return "00";
            case FIFTEEN:
                return "15";
            case THIRTY:
                return "30";
            case FOURTY_FIVE:
                return "45";
            default:
                return value.toString();
        }
    }

    public static String toString(TimePickerMeridian value) {
        if (value == null) {
            return "";
        }

        switch (value) {
            case AM:
                return "AM";
            case PM:
                return "PM";
            default:
                return value.toString();
        }
    }
}
