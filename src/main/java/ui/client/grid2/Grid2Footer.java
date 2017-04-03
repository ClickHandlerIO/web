package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.*;
import ui.client.FlatButton;
import ui.client.IconButton;
import ui.client.icons.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class Grid2Footer extends Component<Grid2Footer.Props, Grid2Footer.State> {

    @Inject
    FlatButton flatButton;
    @Inject
    ChevronLeftSvgIcon chevronLeftSvgIcon;
    @Inject
    ChevronRightSvgIcon chevronRightSvgIcon;
    @Inject
    IconButton iconButton;
    @Inject
    PrintSvgIcon printSvgIcon;
    @Inject
    EmailSvgIcon emailSvgIcon;
    @Inject
    ImportExportSvgIcon importExportSvgIcon;

    @Inject
    public Grid2Footer() {
    }

    @Override
    protected ReactElement render(final ReactComponent<Props, State> $this) {
        return div(className("footer"), children -> {
            if ($this.props.showLoading) {
                children.add(
                        div(className("flex-row align-items-center").style(new StyleProps().padding(5)),
                                div(className("loader loader-default")),
                                div(new StyleProps().marginLeft(10), "Loading...")
                        )
                );
            }

            children.add(
                div(className("export-actions"), exportChildren -> {
                    if ($this.props.handlePrint != null) {
                        exportChildren.add(
                            iconButton.props()
                                .tooltip("Print")
                                .tooltipPosition("top-center")
                                .onTouchTap(() -> $this.props.handlePrint.run())
                                .build(printSvgIcon.props().color("#4C5660").build())
                        );
                    }

                    if ($this.props.handleEmail != null) {
                        exportChildren.add(
                            iconButton.props()
                                .tooltip("Email")
                                .tooltipPosition("top-center")
                                .onTouchTap(() -> $this.props.handleEmail.run())
                                .build(emailSvgIcon.props().color("#4C5660").build())
                        );
                    }

                    if ($this.props.handlePDF != null) {
                        exportChildren.add(
                            iconButton.props()
                                .tooltip("PDF")
                                .tooltipPosition("top-center")
                                .onTouchTap(() -> $this.props.handlePDF.run())
                                .build(importExportSvgIcon.props().color("#4C5660").build())
                        );
                    }

                    if ($this.props.handleExcel != null) {
                        exportChildren.add(
                            iconButton.props()
                                .tooltip("XLS")
                                .tooltipPosition("top-center")
                                .onTouchTap(() -> $this.props.handleExcel.run())
                                .build(importExportSvgIcon.props().color("#4C5660").build())
                        );
                    }
                })
            );

            if ($this.props.pagerVisible) {
                children.add(
                    div(className("pager"),
                        flatButton.props()
                            .style(new StyleProps().marginRight("10px"))
                            .disabled(!$this.props.pagerPreviousEnabled)
                            .label("Prev")
                            .icon(chevronLeftSvgIcon.$())
                            .labelPosition("after")
                            .onTouchTap(() -> {
                                if ($this.props.handlePagerPrevious != null) {
                                    $this.props.handlePagerPrevious.run();
                                }
                            })
                            .build(),
                        flatButton.props()
                            .style(new StyleProps().marginRight("10px"))
                            .disabled(!$this.props.pagerNextEnabled)
                            .label("More")
                            .icon(chevronRightSvgIcon.$())
                            .labelPosition("before")
                            .onTouchTap(() -> {
                                if ($this.props.handlePagerNext != null) {
                                    $this.props.handlePagerNext.run();
                                }
                            })
                            .build()
                    )
                );
            }
        });
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {

        public boolean showLoading;

        // actions
        public Func.Run handleExcel;
        public Func.Run handlePDF;
        public Func.Run handlePrint;
        public Func.Run handleEmail;

        // pager
        public boolean pagerVisible;
        public boolean pagerPreviousEnabled;
        public boolean pagerNextEnabled;
        public Func.Run handlePagerPrevious;
        public Func.Run handlePagerNext;

        @JsOverlay
        public final Props showLoading(final boolean showLoading) {
            this.showLoading = showLoading;
            return this;
        }

        @JsOverlay
        public final Props handleExcel(final Func.Run handleExcel) {
            this.handleExcel = handleExcel;
            return this;
        }

        @JsOverlay
        public final Props handlePDF(final Func.Run handlePDF) {
            this.handlePDF = handlePDF;
            return this;
        }

        @JsOverlay
        public final Props handlePrint(final Func.Run handlePrint) {
            this.handlePrint = handlePrint;
            return this;
        }

        @JsOverlay
        public final Props handleEmail(final Func.Run handleEmail) {
            this.handleEmail = handleEmail;
            return this;
        }

        @JsOverlay
        public final Props pagerVisible(final boolean pagerVisible) {
            this.pagerVisible = pagerVisible;
            return this;
        }

        @JsOverlay
        public final Props pagerPreviousEnabled(final boolean pagerPreviousEnabled) {
            this.pagerPreviousEnabled = pagerPreviousEnabled;
            return this;
        }

        @JsOverlay
        public final Props pagerNextEnabled(final boolean pagerNextEnabled) {
            this.pagerNextEnabled = pagerNextEnabled;
            return this;
        }

        @JsOverlay
        public final Props handlePagerPrevious(final Func.Run handlePagerPrevious) {
            this.handlePagerPrevious = handlePagerPrevious;
            return this;
        }

        @JsOverlay
        public final Props handlePagerNext(final Func.Run handlePagerNext) {
            this.handlePagerNext = handlePagerNext;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}