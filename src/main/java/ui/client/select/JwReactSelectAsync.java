package ui.client.select;

import common.client.Func;
import elemental.html.InputElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ExternalComponent;
import react.client.ReactClass;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;

// ExternalComponent wrapper for JedWatson React-Select https://github.com/JedWatson/react-select

@Singleton
public class JwReactSelectAsync<V> extends ExternalComponent<JwReactSelectAsync.Props<V>> {
    @Inject
    public JwReactSelectAsync() {
    }

    @Override
    protected native ReactClass<Props<V>> getReactClass() /*-{
        return $wnd.ReactSelect.Async;
    }-*/;

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class LoadOptionsResponse<V> {
        JwReactSelectOption[] options;

        // CAREFUL! Only set this to true when there are no more options,
        // or more specific queries will not be sent to the server.
        boolean complete;
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props<V> extends JwReactSelect.Props<V> {
        public Boolean cache;
        public Func.Run2<InputElement, Func.Run2<String, LoadOptionsResponse<V>>> loadOptions; // <input el, callback<Error, OptionsResponse> // todo confirm if input el or Stringi s passed in here
        public String loadingPlaceholder;
        public double minimumInput;
        public String searchingText;
        public String searchPromptText;

        @JsOverlay
        public final Props<V> cache(final Boolean cache) {
            this.cache = cache;
            return this;
        }

        @JsOverlay
        public final Props<V> loadOptions(final Func.Run2<InputElement, Func.Run2<String, LoadOptionsResponse<V>>> loadOptions) {
            this.loadOptions = loadOptions;
            return this;
        }

        @JsOverlay
        public final Props<V> loadingPlaceholder(final String loadingPlaceholder) {
            this.loadingPlaceholder = loadingPlaceholder;
            return this;
        }

        @JsOverlay
        public final Props<V> minimumInput(final double minimumInput) {
            this.minimumInput = minimumInput;
            return this;
        }

        @JsOverlay
        public final Props<V> searchingText(final String searchingText) {
            this.searchingText = searchingText;
            return this;
        }

        @JsOverlay
        public final Props<V> searchPromptText(final String searchPromptText) {
            this.searchPromptText = searchPromptText;
            return this;
        }
    }
}
