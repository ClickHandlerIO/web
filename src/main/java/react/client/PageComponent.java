package react.client;

// Because ReactRouter will call didMount and willReceiveProps sequentially, we need to debounce so intake props is only called once

public abstract class PageComponent<P, S> extends Component<P, S> {

//    @JsIgnore
//    @Override
//    protected void componentDidMountInternal(final ReactComponent<P, S> $this) {
//        try {
//            componentDidMount($this);
//        } finally {
//            intakeProps($this, $this.props);
//            $this.ignoreNextIntakePropsCall = true;
//        }
//    }

//    @JsIgnore
//    @Override
//    protected void componentWillReceivePropsInternal(final ReactComponent<P, S> $this, P nextProps) {
//        try {
//            componentWillReceiveProps($this, nextProps);
//        } finally {
//            if ($this.ignoreNextIntakePropsCall) {
//                $this.ignoreNextIntakePropsCall = false;
//            } else {
//                intakeProps($this, nextProps);
//            }
//        }
//    }

//    @JsIgnore
//    @Override
//    protected void componentDidUpdateInternal(final ReactComponent<P, S> $this, P prevProps, S prevState) {
//        componentDidUpdate($this, prevProps, prevState);
//        $this.ignoreNextIntakePropsCall = false; // If back button was used willReceiveProps was not called, need to reset this bool so subsequent calls are not ignored
//    }
}
