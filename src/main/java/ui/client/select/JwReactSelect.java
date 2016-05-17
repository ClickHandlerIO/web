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
    protected native ReactClass<P> getReactClass() /*-{
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
       // todo option renderer
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
        public final Props clearAllText(String text) {
            this.clearAllText = text;
            return this;
        }

        @JsOverlay
        public final Props clearAllText(ReactElement node) {
            this.clearAllText = node;
            return this;
        }

        @JsOverlay
        public final Props clearValueText(String text) {
            this.clearValueText = text;
            return this;
        }

        @JsOverlay
        public final Props clearValueText(ReactElement node) {
            this.clearValueText = node;
            return this;
        }

        @JsOverlay
        public final Props filterOptions(Boolean bool) {
            this.filterOptions = bool;
            return this;
        }

        @JsOverlay
        public final Props filterOptions(Func.Call3<JwReactSelectOption<V>[], JwReactSelectOption<V>[], String, Object[]> func) {
            this.filterOptions = func;
            return this;
        }

        @JsOverlay
        public final Props noResultsText(String text) {
            this.noResultsText = text;
            return this;
        }

        @JsOverlay
        public final Props noResultsText(ReactElement node) {
            this.noResultsText = node;
            return this;
        }

        @JsOverlay
        public final Props placeholder(String text) {
            this.placeholder = text;
            return this;
        }

        @JsOverlay
        public final Props placeholder(ReactElement node) {
            this.placeholder = node;
            return this;
        }

        // fluent setters

        @JsOverlay
        public final Props addLabelText(final String addLabelText) {
            this.addLabelText = addLabelText;
            return this;
        }

        @JsOverlay
        public final Props allowCreate(final boolean allowCreate) {
            this.allowCreate = allowCreate;
            return this;
        }

        @JsOverlay
        public final Props autoBlur(final boolean autoBlur) {
            this.autoBlur = autoBlur;
            return this;
        }

        @JsOverlay
        public final Props autofocus(final boolean autofocus) {
            this.autofocus = autofocus;
            return this;
        }

        @JsOverlay
        public final Props autosize(final boolean autosize) {
            this.autosize = autosize;
            return this;
        }

        @JsOverlay
        public final Props backspaceRemoves(final boolean backspaceRemoves) {
            this.backspaceRemoves = backspaceRemoves;
            return this;
        }

        @JsOverlay
        public final Props className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props clearable(final boolean clearable) {
            this.clearable = clearable;
            return this;
        }

        @JsOverlay
        public final Props delimiter(final String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        @JsOverlay
        public final Props disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props escapeClearsValue(final boolean escapeClearsValue) {
            this.escapeClearsValue = escapeClearsValue;
            return this;
        }

        @JsOverlay
        public final Props filterOption(final Func.Call2<Boolean, JwReactSelectOption<V>, String> filterOption) {
            this.filterOption = filterOption;
            return this;
        }

        @JsOverlay
        public final Props ignoreAccents(final boolean ignoreAccents) {
            this.ignoreAccents = ignoreAccents;
            return this;
        }

        @JsOverlay
        public final Props ignoreCase(final boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        @JsOverlay
        public final Props inputProps(final StyleProps inputProps) {
            this.inputProps = inputProps;
            return this;
        }

        @JsOverlay
        public final Props loading(final boolean loading) {
            this.loading = loading;
            return this;
        }

        @JsOverlay
        public final Props joinValues(final boolean joinValues) {
            this.joinValues = joinValues;
            return this;
        }

        @JsOverlay
        public final Props labelKey(final String labelKey) {
            this.labelKey = labelKey;
            return this;
        }

        @JsOverlay
        public final Props matchPos(final String matchPos) {
            this.matchPos = matchPos;
            return this;
        }

        @JsOverlay
        public final Props getMatchProp(final String getMatchProp) {
            this.getMatchProp = getMatchProp;
            return this;
        }

        @JsOverlay
        public final Props menuBuffer(final double menuBuffer) {
            this.menuBuffer = menuBuffer;
            return this;
        }

        @JsOverlay
        public final Props menuContainerStyle(final StyleProps menuContainerStyle) {
            this.menuContainerStyle = menuContainerStyle;
            return this;
        }

        @JsOverlay
        public final Props menuStyle(final StyleProps menuStyle) {
            this.menuStyle = menuStyle;
            return this;
        }

        @JsOverlay
        public final Props multi(final boolean multi) {
            this.multi = multi;
            return this;
        }

        @JsOverlay
        public final Props name(final String name) {
            this.name = name;
            return this;
        }

        @JsOverlay
        public final Props onBlur(final Func.Run1<BlurEvent> onBlur) {
            this.onBlur = onBlur;
            return this;
        }

        @JsOverlay
        public final Props onBlurResetsInput(final boolean onBlurResetsInput) {
            this.onBlurResetsInput = onBlurResetsInput;
            return this;
        }

        @JsOverlay
        public final Props onChange(final Func.Run1<Object> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props onClose(final Func.Run onClose) {
            this.onClose = onClose;
            return this;
        }

        @JsOverlay
        public final Props onFocus(final Func.Run1<FocusEvent> onFocus) {
            this.onFocus = onFocus;
            return this;
        }

        @JsOverlay
        public final Props onInputChange(final Func.Run1<String> onInputChange) {
            this.onInputChange = onInputChange;
            return this;
        }

        @JsOverlay
        public final Props onOpen(final Func.Run onOpen) {
            this.onOpen = onOpen;
            return this;
        }

        @JsOverlay
        public final Props onValueClick(final Func.Run2<JwReactSelectOption<V>, ClickEvent> onValueClick) {
            this.onValueClick = onValueClick;
            return this;
        }

        @JsOverlay
        public final Props openAfterFocus(final boolean openAfterFocus) {
            this.openAfterFocus = openAfterFocus;
            return this;
        }

        @JsOverlay
        public final Props openOnFocus(final boolean openOnFocus) {
            this.openOnFocus = openOnFocus;
            return this;
        }

        @JsOverlay
        public final Props optionClassname(final String optionClassname) {
            this.optionClassname = optionClassname;
            return this;
        }

        @JsOverlay
        public final Props options(final JwReactSelectOption<V>[] options) {
            this.options = options;
            return this;
        }

        @JsOverlay
        public final Props required(final boolean required) {
            this.required = required;
            return this;
        }

        @JsOverlay
        public final Props resetValue(final JwReactSelectOption<V> resetValue) {
            this.resetValue = resetValue;
            return this;
        }

        @JsOverlay
        public final Props scrollMenuIntoView(final boolean scrollMenuIntoView) {
            this.scrollMenuIntoView = scrollMenuIntoView;
            return this;
        }

        @JsOverlay
        public final Props searchable(final boolean searchable) {
            this.searchable = searchable;
            return this;
        }

        @JsOverlay
        public final Props simpleValue(final boolean simpleValue) {
            this.simpleValue = simpleValue;
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props tabIndex(final String tabIndex) {
            this.tabIndex = tabIndex;
            return this;
        }

        @JsOverlay
        public final Props abSelectsValue(final boolean abSelectsValue) {
            this.abSelectsValue = abSelectsValue;
            return this;
        }

        @JsOverlay
        public final Props value(final Object value) {
            this.value = value;
            return this;
        }

        @JsOverlay
        public final Props valueKey(final String valueKey) {
            this.valueKey = valueKey;
            return this;
        }

        @JsOverlay
        public final Props valueRenderer(final Func.Call1<ReactElement, JwReactSelectOption<V>> valueRenderer) {
            this.valueRenderer = valueRenderer;
            return this;
        }

        @JsOverlay
        public final Props wrapperStyle(final StyleProps wrapperStyle) {
            this.wrapperStyle = wrapperStyle;
            return this;
        }
    }
}
