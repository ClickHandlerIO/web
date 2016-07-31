package ui.client.grid;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;
import ui.client.IconButton;
import ui.client.icons.EmailSvgIcon;
import ui.client.icons.ImportExportSvgIcon;
import ui.client.icons.PrintSvgIcon;

import javax.inject.Inject;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

public class GridActionBar extends Component<GridActionBar.Props, GridActionBar.State> {

    @Inject
    IconButton iconButton;
    @Inject
    PrintSvgIcon printSvgIcon;
    @Inject
    EmailSvgIcon emailSvgIcon;
    @Inject
    ImportExportSvgIcon importExportSvgIcon;


    @Inject
    public GridActionBar() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return
                div(className("grid-action-bar"),
                        childList -> {
                            if ($this.props.onPrint != null) {
                                childList.add(
                                        iconButton.props()
                                                .tooltip("Print")
                                                .tooltipPosition("top-center")
                                                .onTouchTap(() -> {
                                                    if ($this.props.onPrint != null) {
                                                        $this.props.onPrint.run();
                                                    }
                                                })
                                                .build(printSvgIcon.props().build())
                                );
                            }

                            if ($this.props.onEmail != null) {
                                childList.add(
                                        iconButton.props()
                                                .tooltip("Email")
                                                .tooltipPosition("top-center")
                                                .onTouchTap(() -> {
                                                    if ($this.props.onEmail != null) {
                                                        $this.props.onEmail.run();
                                                    }
                                                })
                                                .build(emailSvgIcon.props().build())
                                );
                            }

                            if ($this.props.onPDF != null) {
                                childList.add(
                                        iconButton.props()
                                                .tooltip("PDF")
                                                .tooltipPosition("top-center")
                                                .onTouchTap(() -> {
                                                    if ($this.props.onPDF != null) {
                                                        $this.props.onPDF.run();
                                                    }
                                                })
                                                .build(importExportSvgIcon.props().build())
                                );
                            }

                            if ($this.props.onExcel != null) {
                                childList.add(
                                        iconButton.props()
                                                .tooltip("XLS")
                                                .tooltipPosition("top-center")
                                                .onTouchTap(() -> {
                                                    if ($this.props.onExcel != null) {
                                                        $this.props.onExcel.run();
                                                    }
                                                })
                                                .build(importExportSvgIcon.props().build())
                                );
                            }
                        }
                );
    }

    /*
     * Props & State
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public Func.Run onExcel;
        public Func.Run onPDF;
        public Func.Run onPrint;
        public Func.Run onEmail;

        @JsOverlay
        public final Props onEmail(final Func.Run onEmail) {
            this.onEmail = onEmail;
            return this;
        }

        @JsOverlay
        public final Props onPrint(final Func.Run onPrint) {
            this.onPrint = onPrint;
            return this;
        }

        @JsOverlay
        public final Props onPDF(final Func.Run onPDF) {
            this.onPDF = onPDF;
            return this;
        }

        @JsOverlay
        public final Props onExcel(final Func.Run onExcel) {
            this.onExcel = onExcel;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
