package showcase.client.modules.components.select;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;
import react.client.router.SimpleRouteProxy;
import showcase.client.modules.components.ComponentsShell;
import ui.client.Checkbox;
import ui.client.RaisedButton;

import javax.inject.Inject;
import javax.inject.Singleton;

import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

/**
 *
 */
@Singleton
public class SelectPage extends SimpleRouteComponent<SelectPage.Route, SelectPage.Props, SelectPage.State> {

    @Inject
    Checkbox checkbox;
    @Inject
    SnowResortSelect resortSelect;
    @Inject
    RaisedButton raisedButton;
    @Inject
    SelectModal modal;

    @Inject
    public SelectPage() {
    }

    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div(style().padding("20px"),
            div("Select Page Here"),
            checkbox.props()
                .label("UT Only")
                .style(style().margin("5px"))
                .onCheck(value -> $this.setState(s -> s.utahOnly(!$this.state.utahOnly)))
                .checked($this.state.utahOnly)
                .build(),
            resortSelect.props()
                .state($this.state.utahOnly ? "UT" : null)
                .style(style().margin("5px"))
                .value($this.state.resortValue)
                .onChange(value -> $this.setState(s -> s.resortValue(value)))
                .build(),
            resortSelect.props()
                .state($this.state.utahOnly ? "UT" : null)
                .style(style().margin("5px"))
                .multi(true)
                .valueMulti($this.state.resorts)
                .onChangeMulti(value -> $this.setState(s -> s.resorts(value)))
                .build(),
            raisedButton.props()
                .label("Show Modal")
                .style(style().margin("5px"))
                .onTouchTap(value -> $this.setState(s -> s.showModal(true)))
                .build(),
            modal.props()
                .open($this.state.showModal)
                .onClose(() -> $this.setState(s -> s.showModal(false)))
                .build()
        );
    }

//    protected ReactElement render(ReactComponent<Props, State> $this) {
//        return div(style().padding("20px"),
//            div("Select Page Here"),
//            checkbox.$(checkbox.props().label("UT Only")
//                .onCheck(value -> $this.setState(s -> s.utahOnly(!$this.state.utahOnly)))
//                .checked($this.state.utahOnly)),
//            resortSelect.$(resortSelect.props()
//                .state($this.state.utahOnly ? "UT" : null)
//                .value($this.state.resortValue)
//                .onChange(value -> $this.setState(s->s.resortValue(value)))),
//            resortSelect.$(resortSelect.props()
//                .state($this.state.utahOnly ? "UT" : null)
//                .multi(true)
//                .valueMulti($this.state.resorts)
//                .onChangeMulti(value -> $this.setState(s->s.resorts(value)))),
//            raisedButton.$(raisedButton.props()
//                .label("Show Modal")
//                .onTouchTap(value -> $this.setState(s -> s.showModal(true)))),
//            modal.$(modal.props()
//                .open($this.state.showModal)
//                .onClose(() -> $this.setState(s -> s.showModal(false))))
//        );
//    }

    @Override
    public State getInitialState() {
        return super.getInitialState().utahOnly(true).showModal(false);
    }

    /*
     * Props, State, Route
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends SimpleRouteProps {
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
        boolean utahOnly;
        boolean showModal;
        SelectDataSource.SnowResort resortValue;
        List<SelectDataSource.SnowResort> resorts;

        @JsOverlay
        public final State utahOnly(final boolean utahOnly) {
            this.utahOnly = utahOnly;
            return this;
        }

        @JsOverlay
        public final State showModal(final boolean showModal) {
            this.showModal = showModal;
            return this;
        }

        @JsOverlay
        public final State resortValue(final SelectDataSource.SnowResort resortValue) {
            this.resortValue = resortValue;
            return this;
        }

        @JsOverlay
        public final State resorts(final List<SelectDataSource.SnowResort> resorts) {
            this.resorts = resorts;
            return this;
        }
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(ComponentsShell.Route parent) {
            super("select", parent);
            setSecured(false);
        }
    }
}
