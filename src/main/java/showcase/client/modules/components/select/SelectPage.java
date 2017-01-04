package showcase.client.modules.components.select;

import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import react.client.ReactElement;
import react.client.router.SimpleRouteComponent;
import react.client.router.SimpleRouteProps;
import react.client.router.SimpleRouteProxy;
import showcase.client.modules.components.ComponentsShell;
import ui.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

/**
 *
 */
@Singleton
public class SelectPage extends SimpleRouteComponent<SelectPage.Route, SelectPage.Props, SelectPage.State> {

    final List<Object> elements = new ArrayList<>();
    @Inject
    Checkbox checkbox;
    @Inject
    SnowResortSelect resortSelect;
    @Inject
    RaisedButton raisedButton;
    @Inject
    SelectModal modal;
    @Inject
    Select Select;
    @Inject
    MenuItem MenuItem;

    @Inject
    public SelectPage() {

    }


    protected ReactElement render(ReactComponent<Props, State> $this) {
        final ReactElement autoComplete = Select.builder()
            .focus(false)
//                    .floatingLabelText("Purpose")
//                    .floatingLabelFixed(true)
            .fullWidth(true)
            .openOnFocus(true)
            .hintText("Select Option...")
            .style(css().fontSize("13px").paddingLeft("5px"))
            .popoverProps(Jso.create(Popover.Props.class).canAutoPosition(true).style(css().overflow("auto").marginTop("-7px")))
            .listStyle(css().maxHeight("150px").overflow("auto").marginTop("0px").paddingTop("0px"))
            .dataSourceConfig(new Select.DataSourceConfig().text("text").value("value"))
            .dataSource($this.state.autoCompleteResults)
            .inputStyle(css().userSelect("none"))
            .filter((searchText, key) -> {
                if (searchText.isEmpty())
                    return true;

                return key.indexOf(searchText) != -1;
            })
            .onUpdateInput((searchText, dataSource, params) -> {
//                        Browser.getWindow().getConsole().log("Search: " + searchText);
                if (searchText.isEmpty()) {
                    $this.setState(s -> s.autoCompleteResults = elements.toArray(new Object[elements.size()]));
                    return;
                }
                final List<Object> elements = new ArrayList<>();
                for (int i = 0; i < searchText.length(); i++) {
                    elements.add(
                        new Select.Item()
                            .text("option " + i)
                            .value(
                                MenuItem.builder()
                                    .style(css().fontSize("13px").lineHeight("28px").minHeight("28px").maxHeight("28px"))
                                    .innerDivStyle(style().lineHeight("28px").borderWidth("0px").borderBottomWidth("1px").borderStyle("solid").borderColor("#ccc"))
                                    .primaryText(div(css(), "Option " + i))
//                            .secondaryText(div("" + i))
                                    .build()
                            )
                    );
                }
                $this.setState(s -> s.autoCompleteResults = elements.toArray(new Object[elements.size()]));
            })
//            .ref((value) -> {
//                Browser.getWindow().getConsole().log(value);
//                Browser.getWindow().getConsole().log(Jso.get(value, "refs"));
////                Jso.call(value, "focus");
//            })
            .build();

        final ReactElement autoComplete2 = Select.builder()
            .focus(false)
//                    .floatingLabelText("Purpose")
//                    .floatingLabelFixed(true)
            .fullWidth(true)
            .openOnFocus(true)
            .hintText("Select Option...")
            .style(css().fontSize("13px").paddingLeft("5px"))
            .popoverProps(Jso.create(Popover.Props.class).canAutoPosition(true).style(css().overflow("auto").marginTop("-7px")))
            .listStyle(css().maxHeight("150px").overflow("auto").marginTop("0px").paddingTop("0px"))
            .dataSourceConfig(new Select.DataSourceConfig().text("text").value("value"))
            .dataSource($this.state.autoCompleteResults)
            .filter((searchText, key) -> {
                return true;
            })
//            .onUpdateInput((searchText, dataSource, params) -> {
////                        Browser.getWindow().getConsole().log("Search: " + searchText);
//                if (searchText.isEmpty()) {
//                    $this.setState(s -> s.autoCompleteResults = elements.toArray(new Object[elements.size()]));
//                    return;
//                }
//                final List<Object> elements = new ArrayList<>();
//                for (int i = 0; i < searchText.length(); i++) {
//                    elements.add(
//                        new Select.Item()
//                            .text("option " + i)
//                            .value(
//                                MenuItem.builder()
//                                    .style(css().fontSize("13px").lineHeight("28px").minHeight("28px").maxHeight("28px"))
//                                    .innerDivStyle(style().lineHeight("28px").borderWidth("0px").borderBottomWidth("1px").borderStyle("solid").borderColor("#ccc"))
//                                    .primaryText(div(css(), "Option " + i))
////                            .secondaryText(div("" + i))
//                                    .build()
//                            )
//                    );
//                }
//                $this.setState(s -> s.autoCompleteResults = elements.toArray(new Object[elements.size()]));
//            })
//            .ref((value) -> {
//                Browser.getWindow().getConsole().log(value);
//                Browser.getWindow().getConsole().log(Jso.get(value, "refs"));
////                Jso.call(value, "focus");
//            })
            .build();

        return
            div(style().padding("20px"),
                div("Select Page Here"),
                autoComplete,
                autoComplete2,
                checkbox.props()
                    .label("UT Only")
                    .style(style().margin("5px"))
//                .onCheck(value -> $this.setState(s -> s.utahOnly(!$this.state.utahOnly)))
//                .checked($this.state.utahOnly)
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
        elements.clear();
        for (int i = 0; i < 10; i++) {
            elements.add(
                new Select.Item()
                    .text("option " + i)
                    .value(
                        MenuItem.builder()
                            .style(css().fontSize("13px").lineHeight("28px").minHeight("28px").maxHeight("28px"))
                            .innerDivStyle(style().lineHeight("28px").borderWidth("0px").borderBottomWidth("1px").borderStyle("solid").borderColor("#ccc"))
                            .primaryText(div(css(), "Option " + i))
//                            .secondaryText(div("" + i))
                            .build()
                    )
            );
        }


        return super.getInitialState().utahOnly(true).showModal(false).autoCompleteResults(elements.toArray(new Object[elements.size()]));
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
        Object[] autoCompleteResults;

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

        @JsOverlay
        public final State autoCompleteResults(Object[] autoCompleteResults) {
            this.autoCompleteResults = autoCompleteResults;
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
