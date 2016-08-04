package ui.client.grid2;

public class GridColumn {
    private int ordinal;
    private String title;
    private Display display;
    private Display defaultDisplay;
    private boolean sortable;
    private GridSort sort = GridSort.NONE;

    public GridColumn(Enum enumValue, String title, Integer flexGrow, boolean sortable) {
        this.ordinal = enumValue.ordinal();
        this.title = title;
        this.sortable = sortable;
        this.defaultDisplay = new Display();
        this.defaultDisplay.setFlexGrow(flexGrow);
        resetDisplay();
    }

    public GridColumn(Enum enumValue, String title, Double width, boolean sortable) {
        this.ordinal = enumValue.ordinal();
        this.title = title;
        this.sortable = sortable;
        this.defaultDisplay = new Display();
        this.defaultDisplay.setWidth(width);
        resetDisplay();
    }

    public void resetDisplay() {
        this.display = defaultDisplay.copy();
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GridSort getSort() {
        return sort;
    }

    public void setSort(GridSort sort) {
        this.sort = sort;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public boolean isSortable() {
        return sortable;
    }

    public void setSortable(boolean sortable) {
        this.sortable = sortable;
    }

    public static class Display {
        private int row;
        private Integer order;

        // col width
        private Double minWidth = 70.;

        // or flex width
        private Integer flexGrow;
        private Integer flexShrink = 1;
        private String flexBasis = "0px";

        // or fixed width
        private Double width;

        public Display copy() {
            Display copy = new Display();
            copy.setRow(this.row);
            copy.setOrder(this.order);
            copy.setMinWidth(this.minWidth);
            copy.setFlexGrow(this.flexGrow);
            copy.setFlexShrink(this.flexShrink);
            copy.setFlexBasis(this.flexBasis);
            copy.setWidth(this.width);
            return copy;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public Double getMinWidth() {
            return minWidth;
        }

        public void setMinWidth(Double minWidth) {
            this.minWidth = minWidth;
        }

        public Integer getFlexGrow() {
            return flexGrow;
        }

        public void setFlexGrow(Integer flexGrow) {
            this.flexGrow = flexGrow;
        }

        public Integer getFlexShrink() {
            return flexShrink;
        }

        public void setFlexShrink(Integer flexShrink) {
            this.flexShrink = flexShrink;
        }

        public String getFlexBasis() {
            return flexBasis;
        }

        public void setFlexBasis(String flexBasis) {
            this.flexBasis = flexBasis;
        }

        public Double getWidth() {
            return width;
        }

        public void setWidth(Double width) {
            this.width = width;
        }
    }
}
