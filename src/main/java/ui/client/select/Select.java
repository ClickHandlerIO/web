package ui.client.select;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType
public abstract class Select<D, P extends Select.Props<D>, S> extends Component<P, S> {
    protected final Ref<SelectComponent> selectRef = Ref.make();

    @Inject
    JwReactSelectAsync<D> SelectAsync;

    @Override
    protected ReactElement render(ReactComponent<P, S> $this) {
        P p = $this.props;
        return SelectAsync.$(props -> {
            props.className(p.className)
                    .style(p.style)
                    .multi(p.multi)
                    .disabled(p.disabled)
                    .clearable(p.clearable)
                    .openAfterFocus(true)
                    .placeholder(p.placeholderText)
                    .ref(selectRef).$();

            if (p.multi) {
                props.onChange(optionArray -> {
                    if (p.onChangeMulti != null) {
                        List<D> data = new ArrayList<>();
                        if (optionArray != null) {
                            JwReactSelectOption<D>[] castArray = (JwReactSelectOption<D>[]) optionArray;
                            for (JwReactSelectOption<D> d : castArray) {
                                data.add(d.getValueObject());
                            }
                        }
                        $this.props.onChangeMulti.run(data);
                    }
                });

                List<JwReactSelectOption<D>> multiVal = new ArrayList<>();
                if ($this.props.valueMulti != null) {
                    for (D d : $this.props.valueMulti) {
                        multiVal.add(createSelectOptionForData(d));
                    }
                }
                props.value(multiVal.toArray(new JwReactSelectOption[multiVal.size()]));
            } else {
                props.value(createSelectOptionForData($this.props.value));
                props.onChange(opt -> {
                    if ($this.props.onChange != null) {
                        $this.props.onChange.run(opt != null ? ((JwReactSelectOption<D>) opt).getValueObject() : null);
                    }
                });
            }

            props.loadOptions((search, callback) -> {
                loadOptions($this, search.getValue(), values -> {
                    JwReactSelectAsync.LoadOptionsResponse<D> resp = Jso.create();
                    resp.complete = false;
                    if (values == null) {
                        resp.options = new JwReactSelectOption[0];

                    } else {
                        List<JwReactSelectOption<D>> opts = new ArrayList<>();
                        for (D data : values) {
                            opts.add(createSelectOptionForData(data));
                        }
                        resp.options = opts.toArray(new JwReactSelectOption[opts.size()]);
                    }
                    callback.run(null, resp);
                });
            });
        });
    }

    @Override
    protected void componentDidMount(ReactComponent<P, S> $this) {
        super.componentDidMount($this);
        final SelectComponent component = selectRef.get($this);

        // put clearCache method onto external control
        setJs(component, "clearCache", () -> {
            clearCacheJs(component);
        });
    }

    /*
     * Expose component methods, JavaScript
     */

    public Func.Run focus = Func.bind(this::focusInternal);

    private void focusInternal(ReactComponent<P, S> $this) {
        selectRef.get($this).focus();
    }

    public Func.Run clearCache = Func.bind(this::clearCacheInternal);

    private void clearCacheInternal(ReactComponent<P, S> $this) {
        selectRef.get($this).clearCache();
    }

    @JsIgnore
    private native void setJs(Object obj, String name, Func.Run callback) /*-{
        obj[name] = callback;
    }-*/;

    @JsIgnore
    private native void clearCacheJs(SelectComponent component) /*-{
        component.setState({cache: {}});
        component.loadOptions('');
    }-*/;

    /*
     * Abstract Methods
     */

    @JsIgnore
    protected abstract String getId(D data);

    @JsIgnore
    protected abstract String getLabel(D data);

    @JsIgnore
    protected abstract void loadOptions(final ReactComponent<P, S> $this, String search, Func.Run1<D[]> callback);

    /*
     * Work
     */

    @JsIgnore
    protected JwReactSelectOption<D> createSelectOptionForData(D data) {
        JwReactSelectOption<D> opt = null;
        if (data != null) {
            opt = Jso.create();
            opt.setValueObject(data);
            opt.setValue(getId(data));
            opt.setLabel(getLabel(data));
        }
        return opt;
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class IntermediateCallbackResponse<D> {
        List<D> data;

        // CAREFUL! Only set this to true when there are no more options,
        // or more specific queries will not be sent to the server.
        boolean complete;

        @JsOverlay
        public final IntermediateCallbackResponse data(final List<D> data) {
            this.data = data;
            return this;
        }

        @JsOverlay
        public final IntermediateCallbackResponse complete(final boolean complete) {
            this.complete = complete;
            return this;
        }
    }

    /*
     * Props
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<D> extends ComponentProps {
       public boolean disabled;
       public boolean clearable;
       public String placeholderText;
       public String className;
       public StyleProps style;

        // Single Select
        public Func.Run1<D> onChange;
        public D value;

        // Multiple Select
        public boolean multi;
        public Func.Run1<List<D>> onChangeMulti;
        public List<D> valueMulti;

        @JsOverlay
        public final Props<D> valueMulti(final List<D> valueMulti) {
            this.valueMulti = valueMulti;
            return this;
        }

        @JsOverlay
        public final Props<D> onChangeMulti(final Func.Run1<List<D>> onChangeMulti) {
            this.onChangeMulti = onChangeMulti;
            return this;
        }

        @JsOverlay
        public final Props<D> multi(final boolean multi) {
            this.multi = multi;
            return this;
        }

        @JsOverlay
        public final Props<D> value(final D value) {
            this.value = value;
            return this;
        }

        @JsOverlay
        public final Props<D> onChange(final Func.Run1<D> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props<D> style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props<D> className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props<D> placeholderText(final String placeholderText) {
            this.placeholderText = placeholderText;
            return this;
        }

        @JsOverlay
        public final Props<D> clearable(final boolean clearable) {
            this.clearable = clearable;
            return this;
        }

        @JsOverlay
        public final Props<D> disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }
    }
}
