package ui.client.fullCalendar;

import com.google.gwt.user.client.Window;
import common.client.Func;
import common.client.Jso;
import elemental.html.DivElement;
import moment.client.Moment;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;

import static react.client.DOM.div;

public class FullCalendar extends Component<FullCalendar.Props, FullCalendar.State> {
    private final Ref<DivElement> divRef = Ref.make();

    @Inject
    public FullCalendar() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div($ -> {
            $.ref(divRef);
            $.className("camber-full-calendar");
            if ($this.props.getStyle() != null) {
                $.style($this.props.getStyle());
            }
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void componentDidMount(final ReactComponent<Props, State> $this) {
        super.componentDidMount($this);
        buildFullCalendar($this);

        $this.register(Window.addResizeHandler(resizeEvent -> {
            destroy(divRef.get($this));
            buildFullCalendar($this);
        }));

        $this.subscribe(UpdateFullCalendarEvent.class, e -> {
            destroy(divRef.get($this)); // todo call 'render' instead?
            buildFullCalendar($this);
        });
    }

    @Override
    protected void componentWillReceiveProps(ReactComponent<Props, State> $this, Props nextProps) {
        super.componentWillReceiveProps($this, nextProps);

        if (!$this.props.getView().equals(nextProps.getView())) {
            changeView(divRef.get($this), nextProps.getView().getId());
        }

//        if (!curProps.getMoment().isSame(nextProps.getMoment())) {
        goToDate(divRef.get($this), nextProps.getMoment());
//        }
    }

    @Override
    protected void componentWillUnmount(ReactComponent<Props, State> $this) {
        super.componentWillUnmount($this);
        destroy(divRef.get($this));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private void buildFullCalendar(final ReactComponent<Props, State> $this) {
        FullCalendarHeader header = Jso.create();
        header.setCenter("");
        header.setLeft("");
        header.setRight("");

        FullCalendarOptions options = Jso.create();
        options.setHeader(header);
        options.setDefaultView($this.props.getView().getId());
        options.setDefaultDate($this.props.getMoment());
        options.setAllDayDefault(false);
        options.setEditable(false);
        options.setTimezone("local");
        options.setEventColor("#3a87ad");
        options.setEventTextColor("#fff");
        options.setEventLimit(true);
        if(divRef != null && divRef.get($this) != null) {
            options.setHeight(Window.getClientHeight() - divRef.get($this).getOffsetTop() - 15); // 15 is padding
        }
        options.setDayClick((arg1, arg2, arg3) -> {
            if ($this.props.getOnDayClicked() != null) {
                $this.props.getOnDayClicked().run(arg1);
            }
        });
        options.setEventClick((fullCalendarEvent, nativeEvent1, fullCalendarView1) -> {
            if ($this.props.getOnEventClicked() != null) {
                $this.props.getOnEventClicked().onEventClicked(fullCalendarEvent);
            }
        });
        options.setEvents((moment, moment2, o, run1) -> {
            if ($this.props.getEventFn() != null) {
                $this.props.getEventFn().run(moment, moment2, o, run1);
            }
        });

        init(divRef.get($this), options);
    }

    private native void init(DivElement divElement, FullCalendarOptions options) /*-{
        $wnd.$(divElement).fullCalendar(options);
    }-*/;

    private native void destroy(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('destroy');
    }-*/;

    private native void clearEvents(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('removeEvents');
    }-*/;

    private native void addEvents(DivElement divElement, FullCalendarEvent[] data) /*-{
        $wnd.$(divElement).fullCalendar('addEventSource', data);
    }-*/;

    private native void changeView(DivElement divElement, String view) /*-{
        $wnd.$(divElement).fullCalendar('changeView', view);
    }-*/;

    private native void goToDate(DivElement divElement, Moment date) /*-{
        $wnd.$(divElement).fullCalendar('gotoDate', date);
    }-*/;

    public interface EventClickHandler {
        void onEventClicked(FullCalendarEvent event);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> getEventFn();

        @JsProperty
        void setEventFn(Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> eventFn);

        @JsProperty
        EventClickHandler getOnEventClicked();

        @JsProperty
        void setOnEventClicked(EventClickHandler onEventClicked);

        @JsProperty
        Func.Run1<Moment> getOnDayClicked();

        @JsProperty
        void setOnDayClicked(Func.Run1<Moment> onDayClicked);

        @JsProperty
        Moment getMoment();

        @JsProperty
        void setMoment(Moment moment);

        @JsProperty
        FullCalendarViewType getView();

        @JsProperty
        void setView(FullCalendarViewType view);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsOverlay
        default Props eventFn(final Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> eventFn) {
            setEventFn(eventFn);
            return this;
        }

        @JsOverlay
        default Props onEventClicked(final EventClickHandler onEventClicked) {
            setOnEventClicked(onEventClicked);
            return this;
        }

        @JsOverlay
        default Props moment(final Moment moment) {
            setMoment(moment);
            return this;
        }

        @JsOverlay
        default Props view(final FullCalendarViewType view) {
            setView(view);
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
    }
}
