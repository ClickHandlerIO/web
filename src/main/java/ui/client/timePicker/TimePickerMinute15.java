package ui.client.timePicker;

public enum TimePickerMinute15 {
    ZERO(0),
    FIFTEEN(15),
    THIRTY(30),
    FOURTY_FIVE(45);

    private int value;

    TimePickerMinute15(int value) {
        this.value = value;
    }

    public static TimePickerMinute15 parse(int minutes) {
        if (minutes < 15) {
            return ZERO;
        } else if (minutes < 30) {
            return FIFTEEN;
        } else if (minutes < 45) {
            return THIRTY;
        } else {
            return FOURTY_FIVE;
        }
    }

    public int getValue() {
        return value;
    }
}
