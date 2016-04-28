package react.client.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface Location<T> {
    /**
     * The pathname portion of the URL, without query string
     *
     * @return
     */
    @JsProperty
    String getPathname();

    @JsProperty
    void setPathname(String value);

    /**
     * The query string portion of the URL, including the ?
     *
     * @return
     */
    @JsProperty
    String getSearch();

    @JsProperty
    void setSearch(String value);

    /**
     * An object of data tied to this location
     *
     * @return
     */
    @JsProperty
    Object getState();

    @JsProperty
    void setState(Object state);

    /**
     * One of PUSH, REPLACE, or POP
     *
     * @return
     */
    @JsProperty
    String getAction();

    @JsProperty
    void setAction(String action);

    @JsProperty
    T getQuery();

    @JsProperty
    void setQuery(T query);

    /**
     * @return
     */
    @JsProperty
    String getHash();

    @JsProperty
    void setHash(String hash);

    /**
     * A unique identifier for this location
     *
     * @return
     */
    @JsProperty
    String getKey();

    @JsProperty
    void setKey(String key);

    /**
     *
     */
    enum Action {
        PUSH,
        POP,
        REPLACE,;
    }

    class Factory {
        public static native Location create() /*-{
            return {};
        }-*/;

        public static native Location create(String pathname, String search) /*-{
            return {
                pathname: pathname,
                search: search
            };
        }-*/;
    }
}
