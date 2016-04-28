package ui.client.grid;

public class GridColumn {
    private String id;
    private String title;
    private GridSort sort = GridSort.NONE;
    private Display display;
    private boolean allowSort;
    private boolean allowHide;

    public GridColumn(String id, String title, Integer flexGrow, boolean allowSort, boolean allowHide) {
        this.id = id;
        this.title = title;
        this.allowSort = allowSort;
        this.allowHide = allowHide;
        this.display = new Display();
        this.display.setFlexGrow(flexGrow);
    }

    public GridColumn(String id, String title, Double width, boolean allowSort, boolean allowHide) {
        this.id = id;
        this.title = title;
        this.allowSort = allowSort;
        this.allowHide = allowHide;
        this.display = new Display();
        this.display.setWidth(width);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isAllowSort() {
        return allowSort;
    }

    public void setAllowSort(boolean allowSort) {
        this.allowSort = allowSort;
    }

    public boolean isAllowHide() {
        return allowHide;
    }

    public void setAllowHide(boolean allowHide) {
        this.allowHide = allowHide;
    }

    public static class Display {
        private int row;
        private Integer order;
        private boolean hidden;

        // col width
        private Double minWidth = 70.;
        // flex width
        private Integer flexGrow;
        private Integer flexShrink = 1;
        private String flexBasis = "0px";
        // or fixed width
        private Double width;

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

        public boolean isHidden() {
            return hidden;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
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
