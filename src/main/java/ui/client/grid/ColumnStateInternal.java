package ui.client.grid;

public class ColumnStateInternal {
    private int row;
    private Integer order;
    private boolean visible;
    private GridSort sort;

    // either flex or width must be specified. if a column is manually resized fixed width will be assigned
    private Integer flex;
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

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public GridSort getSort() {
        return sort;
    }

    public void setSort(GridSort sort) {
        this.sort = sort;
    }

    public Integer getFlex() {
        return flex;
    }

    public void setFlex(Integer flex) {
        this.flex = flex;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
