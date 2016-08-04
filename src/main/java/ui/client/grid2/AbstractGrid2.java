package ui.client.grid2;

import common.client.Func;
import jsinterop.annotations.JsType;
import react.client.Component;
import react.client.ComponentProps;
import react.client.ReactComponent;
import react.client.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

import java.util.List;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.div;

@Singleton
public abstract class AbstractGrid2<D, P extends AbstractGrid2.Props<D>> extends Component<P, AbstractGrid2.State> {

    @Inject
    Grid2Cell cell;

    @Override
    protected ReactElement render(ReactComponent<P, State> $this) {
        return div(className("grid2"),
                cell.props()
                        .leadingAccessoryView(leadingAccessoryViewForData(null))
                        .contentView(contentViewForData(null))
                        .selected(false)
                        .build()
        );
    }

    private ReactElement leadingAccessoryViewForData(D data) {
        return null;
    }

    protected abstract ReactElement contentViewForData(D data);

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<D> extends ComponentProps {
        public boolean loadOnMount;
        public boolean headerVisible;

        public boolean selectionEnabled;
        public List<D> selected;
        public Func.Run1<List<D>> onSelectionChanged;

        public String noResultsText;
        public ReactElement noResultsElement;

        public double pageSize;
        public Func.Run handleExcel;
        public Func.Run handlePDF;
        public Func.Run handlePrint;
        public Func.Run handleEmail;
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}