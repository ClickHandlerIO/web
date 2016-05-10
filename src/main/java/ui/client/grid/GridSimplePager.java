package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.FlatButton;
import ui.client.icons.ChevronLeftSvgIcon;
import ui.client.icons.ChevronRightSvgIcon;

import javax.inject.Inject;

import static react.client.DOM.div;

public class GridSimplePager extends Component<GridSimplePager.Props, GridSimplePager.State> {

    @Inject
    FlatButton flatButton;
    @Inject
    ChevronLeftSvgIcon chevronLeftSvgIcon;
    @Inject
    ChevronRightSvgIcon chevronRightSvgIcon;

    @Inject
    public GridSimplePager() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return
            div(className("grid-simple-pager"),
                flatButton.$($ -> {
                    $.setStyle(new StyleProps().marginRight("10px"));
                    $.setDisabled(!$this.props.isPreviousEnabled());
                    $.setLabel("Prev");
                    $.setIcon(chevronLeftSvgIcon.$());
                    $.setLabelPosition("after");
                    $.onTouchTap(() -> {
                        if ($this.props.getOnPreviousPage() != null) {
                            $this.props.getOnPreviousPage().run();
                        }
                    });
                }),
                flatButton.$($ -> {
                    $.setDisabled(!$this.props.isNextEnabled());
                    $.setLabel("More");
                    $.setIcon(chevronRightSvgIcon.$());
                    $.setLabelPosition("before");
                    $.onTouchTap(() -> {
                        if ($this.props.getOnNextPage() != null) {
                            $this.props.getOnNextPage().run();
                        }
                    });
                })
            );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isPreviousEnabled();

        @JsProperty
        void setPreviousEnabled(boolean previousEnabled);

        @JsProperty
        boolean isNextEnabled();

        @JsProperty
        void setNextEnabled(boolean nextEnabled);

        @JsProperty
        Func.Run getOnNextPage();

        @JsProperty
        void setOnNextPage(Func.Run onNextPage);

        @JsProperty
        Func.Run getOnPreviousPage();

        @JsProperty
        void setOnPreviousPage(Func.Run onPreviousPage);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
