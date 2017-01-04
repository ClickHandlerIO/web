package ui.client.select;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.FocusEvent;
import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

// ExternalComponent wrapper for JedWatson React-Select https://github.com/JedWatson/react-select

@Singleton
public class JwReactSelect<P extends JwReactSelect.Props> extends ExternalComponent<P> {

    @Inject
    public JwReactSelect() {
    }

    @Override
    protected native ReactClass getReactClass() /*-{
        return $wnd.ReactSelect;
    }-*/;

    @JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
    public static class Props<V> extends ComponentProps {
        public String addLabelText;
        public boolean allowCreate;
        public boolean autoBlur;
        public boolean autofocus;
        public boolean autosize;
        public boolean backspaceRemoves;
        public String className;
        public Object clearAllText;
        public Object clearValueText;
        public boolean clearable;
        public String delimiter;
        public boolean disabled;
        public boolean escapeClearsValue;
        public Func.Call2<Boolean, JwReactSelectOption<V>, String> filterOption; // <Boolean, Option, Filter>
        public Object filterOptions;
        public boolean ignoreAccents;
        public boolean ignoreCase;
        public StyleProps inputProps;
        // todo input renderer
        public boolean loading;
        public boolean joinValues;
        public String labelKey;
        public String matchPos;
        public String getMatchProp; // 'any', 'label', 'ue'
        public double menuBuffer;
        public StyleProps menuContainerStyle;
        // todo menuRenderer (need Call5<>)
        public StyleProps menuStyle;
        public boolean multi;
        public String name;
        // todo new option creator
        public Object noResultsText;
        public Func.Run1<BlurEvent> onBlur;
        public boolean onBlurResetsInput;
        public Func.Run1<Object> onChange;
        public Func.Run onClose;
        public Func.Run1<FocusEvent> onFocus;
        public Func.Run1<String> onInputChange;
        public Func.Run onOpen;
        public Func.Run2<JwReactSelectOption<V>, ClickEvent> onValueClick;
        public boolean openAfterFocus;
        public boolean openOnFocus;
        public String optionClassname;
        // todo optionComponent func
        public Func.Call1<ReactElement, JwReactSelectOption<V>> optionRenderer;
        public JwReactSelectOption<V>[] options;
        public Object placeholder;
        public boolean required;
        public JwReactSelectOption<V> resetValue;
        public boolean scrollMenuIntoView;
        public boolean searchable;
        public boolean simpleValue;
        public StyleProps style;
        public String tabIndex;
        public boolean abSelectsValue;
        public Object value;
        // todo value component
        public String valueKey;
        public Func.Call1<ReactElement, JwReactSelectOption<V>> valueRenderer; // <ReactElement, Value>
        public StyleProps wrapperStyle;

        // Custom setters for handling multiple types for same var

        @JsOverlay
        public final Props<V> clearAllText(String text) {
            this.clearAllText = text;
            return this;
        }

        @JsOverlay
        public final Props<V> clearAllText(ReactElement node) {
            this.clearAllText = node;
            return this;
        }

        @JsOverlay
        public final Props<V> clearValueText(String text) {
            this.clearValueText = text;
            return this;
        }

        @JsOverlay
        public final Props<V> clearValueText(ReactElement node) {
            this.clearValueText = node;
            return this;
        }

        @JsOverlay
        public final Props<V> filterOptions(Boolean bool) {
            this.filterOptions = bool;
            return this;
        }

        @JsOverlay
        public final Props<V> filterOptions(Func.Call3<JwReactSelectOption<V>[], JwReactSelectOption<V>[], String, Object[]> func) {
            this.filterOptions = func;
            return this;
        }

        @JsOverlay
        public final Props<V> noResultsText(String text) {
            this.noResultsText = text;
            return this;
        }

        @JsOverlay
        public final Props<V> noResultsText(ReactElement node) {
            this.noResultsText = node;
            return this;
        }

        @JsOverlay
        public final Props<V> placeholder(String text) {
            this.placeholder = text;
            return this;
        }

        @JsOverlay
        public final Props<V> placeholder(ReactElement node) {
            this.placeholder = node;
            return this;
        }

        // fluent setters

        @JsOverlay
        public final Props optionRenderer(final Func.Call1<ReactElement, JwReactSelectOption<V>> optionRenderer) {
            this.optionRenderer = optionRenderer;
            return this;
        }

        @JsOverlay
        public final Props<V> addLabelText(final String addLabelText) {
            this.addLabelText = addLabelText;
            return this;
        }

        @JsOverlay
        public final Props<V> allowCreate(final boolean allowCreate) {
            this.allowCreate = allowCreate;
            return this;
        }

        @JsOverlay
        public final Props<V> autoBlur(final boolean autoBlur) {
            this.autoBlur = autoBlur;
            return this;
        }

        @JsOverlay
        public final Props<V> autofocus(final boolean autofocus) {
            this.autofocus = autofocus;
            return this;
        }

        @JsOverlay
        public final Props<V> autosize(final boolean autosize) {
            this.autosize = autosize;
            return this;
        }

        @JsOverlay
        public final Props<V> backspaceRemoves(final boolean backspaceRemoves) {
            this.backspaceRemoves = backspaceRemoves;
            return this;
        }

        @JsOverlay
        public final Props<V> className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props<V> clearable(final boolean clearable) {
            this.clearable = clearable;
            return this;
        }

        @JsOverlay
        public final Props<V> delimiter(final String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        @JsOverlay
        public final Props<V> disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props<V> escapeClearsValue(final boolean escapeClearsValue) {
            this.escapeClearsValue = escapeClearsValue;
            return this;
        }

        @JsOverlay
        public final Props<V> filterOption(final Func.Call2<Boolean, JwReactSelectOption<V>, String> filterOption) {
            this.filterOption = filterOption;
            return this;
        }

        @JsOverlay
        public final Props<V> ignoreAccents(final boolean ignoreAccents) {
            this.ignoreAccents = ignoreAccents;
            return this;
        }

        @JsOverlay
        public final Props<V> ignoreCase(final boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        @JsOverlay
        public final Props<V> inputProps(final StyleProps inputProps) {
            this.inputProps = inputProps;
            return this;
        }

        @JsOverlay
        public final Props<V> loading(final boolean loading) {
            this.loading = loading;
            return this;
        }

        @JsOverlay
        public final Props<V> joinValues(final boolean joinValues) {
            this.joinValues = joinValues;
            return this;
        }

        @JsOverlay
        public final Props<V> labelKey(final String labelKey) {
            this.labelKey = labelKey;
            return this;
        }

        @JsOverlay
        public final Props<V> matchPos(final String matchPos) {
            this.matchPos = matchPos;
            return this;
        }

        @JsOverlay
        public final Props<V> getMatchProp(final String getMatchProp) {
            this.getMatchProp = getMatchProp;
            return this;
        }

        @JsOverlay
        public final Props<V> menuBuffer(final double menuBuffer) {
            this.menuBuffer = menuBuffer;
            return this;
        }

        @JsOverlay
        public final Props<V> menuContainerStyle(final StyleProps menuContainerStyle) {
            this.menuContainerStyle = menuContainerStyle;
            return this;
        }

        @JsOverlay
        public final Props<V> menuStyle(final StyleProps menuStyle) {
            this.menuStyle = menuStyle;
            return this;
        }

        @JsOverlay
        public final Props<V> multi(final boolean multi) {
            this.multi = multi;
            return this;
        }

        @JsOverlay
        public final Props<V> name(final String name) {
            this.name = name;
            return this;
        }

        @JsOverlay
        public final Props<V> onBlur(final Func.Run1<BlurEvent> onBlur) {
            this.onBlur = onBlur;
            return this;
        }

        @JsOverlay
        public final Props<V> onBlurResetsInput(final boolean onBlurResetsInput) {
            this.onBlurResetsInput = onBlurResetsInput;
            return this;
        }

        @JsOverlay
        public final Props<V> onChange(final Func.Run1<Object> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props<V> onClose(final Func.Run onClose) {
            this.onClose = onClose;
            return this;
        }

        @JsOverlay
        public final Props<V> onFocus(final Func.Run1<FocusEvent> onFocus) {
            this.onFocus = onFocus;
            return this;
        }

        @JsOverlay
        public final Props<V> onInputChange(final Func.Run1<String> onInputChange) {
            this.onInputChange = onInputChange;
            return this;
        }

        @JsOverlay
        public final Props<V> onOpen(final Func.Run onOpen) {
            this.onOpen = onOpen;
            return this;
        }

        @JsOverlay
        public final Props<V> onValueClick(final Func.Run2<JwReactSelectOption<V>, ClickEvent> onValueClick) {
            this.onValueClick = onValueClick;
            return this;
        }

        @JsOverlay
        public final Props<V> openAfterFocus(final boolean openAfterFocus) {
            this.openAfterFocus = openAfterFocus;
            return this;
        }

        @JsOverlay
        public final Props<V> openOnFocus(final boolean openOnFocus) {
            this.openOnFocus = openOnFocus;
            return this;
        }

        @JsOverlay
        public final Props<V> optionClassname(final String optionClassname) {
            this.optionClassname = optionClassname;
            return this;
        }

        @JsOverlay
        public final Props<V> options(final JwReactSelectOption<V>[] options) {
            this.options = options;
            return this;
        }

        @JsOverlay
        public final Props<V> required(final boolean required) {
            this.required = required;
            return this;
        }

        @JsOverlay
        public final Props<V> resetValue(final JwReactSelectOption<V> resetValue) {
            this.resetValue = resetValue;
            return this;
        }

        @JsOverlay
        public final Props<V> scrollMenuIntoView(final boolean scrollMenuIntoView) {
            this.scrollMenuIntoView = scrollMenuIntoView;
            return this;
        }

        @JsOverlay
        public final Props<V> searchable(final boolean searchable) {
            this.searchable = searchable;
            return this;
        }

        @JsOverlay
        public final Props<V> simpleValue(final boolean simpleValue) {
            this.simpleValue = simpleValue;
            return this;
        }

        @JsOverlay
        public final Props<V> style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props<V> tabIndex(final String tabIndex) {
            this.tabIndex = tabIndex;
            return this;
        }

        @JsOverlay
        public final Props<V> abSelectsValue(final boolean abSelectsValue) {
            this.abSelectsValue = abSelectsValue;
            return this;
        }

        @JsOverlay
        public final Props<V> value(final Object value) {
            this.value = value;
            return this;
        }

        @JsOverlay
        public final Props<V> valueKey(final String valueKey) {
            this.valueKey = valueKey;
            return this;
        }

        @JsOverlay
        public final Props<V> valueRenderer(final Func.Call1<ReactElement, JwReactSelectOption<V>> valueRenderer) {
            this.valueRenderer = valueRenderer;
            return this;
        }

        @JsOverlay
        public final Props<V> wrapperStyle(final StyleProps wrapperStyle) {
            this.wrapperStyle = wrapperStyle;
            return this;
        }
    }
}
