package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public class Grid2Footer extends Component<Grid2Footer.Props, Grid2Footer.State> {

    @Inject
    public Grid2Footer() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div("Grid2Footer Component");
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {

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