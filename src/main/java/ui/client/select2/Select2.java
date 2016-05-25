package ui.client.select2;

import common.client.Func;
import common.client.Jso;
import elemental.html.SelectElement;
import ui.client.select2.events.Select2EventArgs;
import ui.client.select2.events.Select2NativeEvent;
import react.client.Lodash;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import java.util.*;

import static react.client.DOM.select;

public class Select2 extends Component<Select2.Props, Select2.State> {
    //    private final Loggly log = Loggly.get(Select2.class);
    private final Ref<SelectElement> selectRef = Ref.make();

    @Inject
    public Select2() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return select($ -> {
            $.ref(selectRef);
            $.disabled($this.props.isDisabled());
            $.className("select2-raw " + ($this.props.getOptions().isMultiple() ? "multiple " : "") + $this.props.getClassName());
            $.style($this.props.getStyle());
            if ($this.props.getOptions() != null && $this.props.getOptions().isMultiple()) {
                $.multiple(true);
            }
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Props getDefaultProps() {
        Props p = Jso.create();
        p.setStyle(new StyleProps().width("100%"));
        p.disabled(false);
        return p;
    }

    @Override
    public State getInitialState() {
        State s = super.getInitialState();
        s.setValue(new HashMap<>());
        return s;
    }

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this) {
        super.componentDidMount($this);

        Func.Run1<Select2NativeEvent<Select2EventArgs>> onSelect = e -> {
            Map<String, Select2Data> valueMap = $this.state.getValue();
            if (!$this.props.getOptions().isMultiple()) {
                valueMap.clear();
            }
            Select2Data val = e.getParams().getData();
            valueMap.put(val.getId(), val);
            $this.setState(s -> s.setValue(valueMap));
            if ($this.props.getOnValueChange() != null) {
                Collection<Select2Data> values = valueMap.values();
                $this.props.getOnValueChange().run(values.toArray(new Select2Data[values.size()]));
            }
        };

        Func.Run1<Select2NativeEvent<Select2EventArgs>> onUnSelect = e -> {
            Map<String, Select2Data> valueMap = $this.state.getValue();
            valueMap.remove(e.getParams().getData().getId());
            $this.setState(s -> s.setValue(valueMap));
            if ($this.props.getOnValueChange() != null) {
                Collection<Select2Data> values = valueMap.values();
                $this.props.getOnValueChange().run(values.toArray(new Select2Data[values.size()]));
            }
        };

        select2(selectRef.get($this), $this.props.getOptions(), onSelect, onUnSelect, $this.props.getEvents(), $this.props.isOpen(), $this.props.isClose());

        if ($this.props.getValue() != null) {
            // todo this probably wont work - needs to be delayed or include in select2() call - same way as open / closed are
            Map<String, Select2Data> updatedMap = new HashMap<>();
            for (Select2Data d : $this.props.getValue()) {
                updatedMap.put(d.getId(), d);
            }
            setValue(selectRef.get($this), $this.props.getValue());
            $this.setState(s -> s.setValue(updatedMap));
        }

//        if (props.isOpen()) {
//            // delay to wait for select2 to be initialized
//            Try.later(100, () -> open(selectRef.get($this)));
//        }
//
//        if (props.isClose()) {
//            Try.later(100, () -> close(selectRef.get($this)));
//        }
    }

    @Override
    protected void componentWillReceiveProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.componentWillReceiveProps($this, nextProps);

        // VALUE
        // Check to see if value passed in and the select2 control are in sync. if not, set the value on the control and update the tracking map
        Set<String> curValueSet = $this.state.getValue().keySet();
        boolean propsValEmpty = nextProps.getValue() == null || nextProps.getValue().length == 0;
        boolean controlValEmpty = curValueSet.size() == 0;

        if (propsValEmpty != controlValEmpty || !propsValEmpty) {
            // props is empty, clear out control value
            if (propsValEmpty) {
                setValue(selectRef.get($this), null);
                $this.setState(s -> s.setValue(new HashMap<>()));
                return;
            }

            // compare
            Set<String> propIds = new HashSet<>();
            for (Select2Data d : nextProps.getValue()) {
                propIds.add(d.getId());
            }

            // diff, set value
            if (propIds.size() != curValueSet.size() || !curValueSet.containsAll(propIds)) {
                Map<String, Select2Data> updatedMap = new HashMap<>();
                for (Select2Data d : nextProps.getValue()) {
                    updatedMap.put(d.getId(), d);
                }
                setValue(selectRef.get($this), nextProps.getValue());
                $this.setState(s -> s.setValue(updatedMap));
            }
        }

        // OPEN
        if ($this.props.isOpen() != nextProps.isOpen() && nextProps.isOpen()) {
            open(selectRef.get($this));
        }

        // CLOSE
        if ($this.props.isClose() != nextProps.isClose() && nextProps.isClose()) {
            close(selectRef.get($this));
        }
    }

    @Override
    protected boolean shouldComponentUpdate(ReactComponent<Props, State> $this, Props nextProps, State nextState) {
        if ($this.props == null) {
            return true;
        }

        boolean disabled = $this.props.isDisabled() != nextProps.isDisabled();
        boolean className = !Lodash.isEqual($this.props.getClassName(), nextProps.getClassName());
        boolean style = !Lodash.isEqual($this.props.getStyle(), nextProps.getStyle());
        return disabled || className || style;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private native void select2(SelectElement selectEl, Select2Options opts, Func.Run1<Select2NativeEvent<Select2EventArgs>> onSelect, Func.Run1<Select2NativeEvent<Select2EventArgs>> onUnSelect, Select2Events events, boolean open, boolean close) /*-{
        $wnd.$.fn.select2.amd.require([
            'select2/data/array',
            'select2/utils'
        ], function (ArrayData, Utils) {
            function CustomData($element, options) {
                CustomData.__super__.constructor.call(this, $element, options);
            }

            Utils.Extend(CustomData, ArrayData);
            CustomData.prototype.query = opts.dataAdapterFn;

            opts.dataAdapter = CustomData;
            var $select = $wnd.$(selectEl).select2(opts);

            if (events && events.onChange) {
                $select.on("change", function (e) {
                    events.onChange(e);
                });
            }

            if (events && events.onOpening) {
                $select.on("select2:opening", function (e) {
                    events.onOpening(e);
                });
            }

            if (events && events.onOpen) {
                $select.on("select2:open", function (e) {
                    events.onOpen(e);
                });
            }

            if (events && events.onClosing) {
                $select.on("select2:closing", function (e) {
                    events.onClosing(e);
                });
            }

            if (events && events.onClose) {
                $select.on("select2:close", function (e) {
                    events.onClose(e);
                });
            }

            if (events && events.onSelecting) {
                $select.on("select2:selecting", function (e) {
                    events.onSelecting(e);
                });
            }

            $select.on("select2:select", function (e) {
                onSelect(e);
                if (events && events.onSelect) {
                    events.onSelect(e);
                }
            });

            if (events && events.onUnselecting) {
                $select.on("select2:unselecting", function (e) {
                    events.onUnselecting(e);
                });
            }

            $select.on("select2:unselect", function (e) {
                onUnSelect(e);
                if (events && events.onUnselect) {
                    events.onUnselect(e);
                }
            });

            if (open) {
                $select.select2("open");
            }

            if (close) {
                $select.select2("close");
            }
        });
    }-*/;

    private native void destroy(SelectElement selectEl) /*-{
        $wnd.$(selectEl).select2("destroy");
    }-*/;

    private native void setValue(SelectElement element, Select2Data[] value) /*-{
        var $sel = $wnd.$(element);

        // remove option children
        $sel.empty();

        // create and append selected options
        if (value) {
            for (var j = 0; j < value.length; ++j) {
                var d = value[j];
                var $opt = $wnd.$('<option selected></option>').val(d.id).text(d.text);
                $sel.append($opt);
            }
        }
        $sel.trigger('change.select2'); // notify only select2 of change
    }-*/;

    private native void open(SelectElement selectEl) /*-{
        $wnd.$(selectEl).select2("open");
    }-*/;

    private native void close(SelectElement selectEl) /*-{
        $wnd.$(selectEl).select2("close");
    }-*/;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        Func.Run1<Select2Data[]> getOnValueChange();

        @JsProperty
        void setOnValueChange(Func.Run1<Select2Data[]> onValueChange);

        @JsProperty
        Select2Data[] getValue();

        @JsProperty
        void setValue(Select2Data[] value);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        boolean isClose();

        @JsProperty
        void setClose(boolean close);

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        // Options and Events are only used when initializing the component!

        @JsProperty
        Select2Options getOptions();

        @JsProperty
        void setOptions(Select2Options select2Options);

        @JsProperty
        Select2Events getEvents();

        @JsProperty
        void setEvents(Select2Events select2Events);

        @JsOverlay
        default Props options(Select2Options options) {
            setOptions(options);
            return this;
        }

        @JsOverlay
        default Props events(Select2Events events) {
            setEvents(events);
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        Map<String, Select2Data> getValue();

        @JsProperty
        void setValue(Map<String, Select2Data> value);
    }
}
