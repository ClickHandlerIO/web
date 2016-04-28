package ui.client.grid;

public class ColumnDefinitionInternal {
    private ColumnDefinition defaultDefinition;
    private ColumnDefinition currentDefinition;

    public ColumnDefinition getDefaultDefinition() {
        return defaultDefinition;
    }

    public void setDefaultDefinition(ColumnDefinition defaultDefinition) {
        this.defaultDefinition = defaultDefinition;
    }

    public ColumnDefinition getCurrentDefinition() {
        return currentDefinition;
    }

    public void setCurrentDefinition(ColumnDefinition currentDefinition) {
        this.currentDefinition = currentDefinition;
    }
}
