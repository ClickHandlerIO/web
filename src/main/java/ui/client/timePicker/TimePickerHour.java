package ui.client.timePicker;

public enum TimePickerHour {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12);

    private int value;

    TimePickerHour(int value) {
        this.value = value;
    }

    public static TimePickerHour parse(int hours) {
        for (TimePickerHour h : values()) {
            if (h.getValue() == hours || h.getValue() + 12 == hours) {
                return h;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }
}
