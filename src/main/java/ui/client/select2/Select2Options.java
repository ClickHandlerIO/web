package ui.client.select2;

import common.client.Func;
import elemental.dom.Element;
import elemental.html.OptionElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Select2Options {
    @JsProperty
    Func.Run2<Select2DataAdapterParams, Func.Run1<Select2DataAdapterResponse>> getDataAdapterFn();

    @JsProperty
    void setDataAdapterFn(Func.Run2<Select2DataAdapterParams, Func.Run1<Select2DataAdapterResponse>> dataAdapter);

    @JsProperty
    boolean isAllowClear();

    @JsProperty
    void setAllowClear(boolean allowClear);

    @JsProperty
    boolean isCloseOnSelect();

    @JsProperty
    void setCloseOnSelect(boolean closeOnSelect);

    @JsProperty
    String getDir();

    @JsProperty
    void setDir(String dir);

    @JsProperty
    Element getDropdownParent();

    @JsProperty
    void setDropdownParent(Element dropdownParent);

    @JsProperty
    String getLanguage();

    @JsProperty
    void setLanguage(String language);

    @JsProperty
    double getMaximumInputLength();

    @JsProperty
    void setMaximumInputLength(double maximumInputLength);

    @JsProperty
    double getMaximumSelectionLength();

    @JsProperty
    void setMaximumSelectionLength(double maximumSelectionLength);

    @JsProperty
    double getMinimumResultsForSearch();

    @JsProperty
    void setMinimumResultsForSearch(double minimumResultsForSearch);

    @JsProperty
    boolean isMultiple();

    @JsProperty
    void setMultiple(boolean multiple);

    @JsProperty
    String getPlaceholder();

    @JsProperty
    void setPlaceholder(String placeholder);

    @JsProperty
    boolean isSelectOnClose();

    @JsProperty
    void setSelectOnClose(boolean selectOnClose);

    @JsProperty
    boolean isTags();

    @JsProperty
    void setTags(boolean tags);

    @JsProperty
    Func.Call1<String, String> getEscapeMarkup();

    @JsProperty
    void setEscapeMarkup(Func.Call1<String, String> escapeMarkup);

    @JsProperty
    Func.Call2<String, Select2Data, OptionElement> getTemplateResult();

    @JsProperty
    void setTemplateResult(Func.Call2<String, Select2Data, OptionElement> templateResult);

    @JsProperty
    Func.Call2<String, Select2Data, OptionElement> getTemplateSelection();

    @JsProperty
    void setTemplateSelection(Func.Call2<String, Select2Data, OptionElement> templateSelection);

    @JsProperty
    String getTheme();

    @JsProperty
    void setTheme(String theme);

    @JsProperty
    String[] getTokenSeparators();

    @JsProperty
    void setTokenSeparators(String[] tokenSeparators);
}
