package ui.client.grid;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ColumnDefinition {
    @JsProperty
    String getId(); // id must be unique - used as map key and for col comparison

    @JsProperty
    void setId(String id);

    @JsProperty
    String getTitle();

    @JsProperty
    void setTitle(String title);

    @JsProperty
    GridSort getSort();

    @JsProperty
    void setSort(GridSort sort);

    // Configuration

    @JsProperty
    boolean isAllowResize();

    @JsProperty
    void setAllowResize(boolean allowResize);

    @JsProperty
    boolean isAllowHide();

    @JsProperty
    void setAllowHide(boolean allowHide);

    @JsProperty
    boolean isSortable();

    @JsProperty
    void setSortable(boolean sortable);

    // Position

    @JsProperty
    boolean isHidden();

    @JsProperty
    void setHidden(boolean hidden);

    @JsProperty
    double getRow();

    @JsProperty
    void setRow(double row);

    @JsProperty
    Double getOrder();

    @JsProperty
    void setOrder(Double order);

    // Sizing

    @JsProperty
    Double getFlexGrow();

    @JsProperty
    void setFlexGrow(Double flexGrow);

    @JsProperty
    Double getFlexShrink();

    @JsProperty
    void setFlexShrink(Double flexShrink);

    @JsProperty
    Double getFlexBasis();

    @JsProperty
    void setFlexBasis(Double flexBasis);

    @JsProperty
    Double getMinWidth();

    @JsProperty
    void setMinWidth(Double minWidth);

    // width only used when setting fixed width (other size properties are omitted if this is set)

    @JsProperty
    Double getWidth();

    @JsProperty
    void setWidth(Double flexBasis);
}
