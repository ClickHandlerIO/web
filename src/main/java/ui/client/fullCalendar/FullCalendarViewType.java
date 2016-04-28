package ui.client.fullCalendar;

public enum FullCalendarViewType {
    MONTH("month"),
    BASIC_WEEK("basicWeek"),
    AGENDA_WEEK("agendaWeek"),
    BASIC_DAY("basicDay"),
    AGENDA_DAY("agendaDay");

    private String id;

    FullCalendarViewType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
