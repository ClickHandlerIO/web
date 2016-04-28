package react.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsProperty;

/**
 * TODO finish going through this stuff see what is required
 */
public class Ref<T> {
    private final static String INIT_PROP_NAME = "$$refinit$$";
    private static long id = 0;

    @JsProperty
    final String name;

    private Ref(String name) {
        this.name = "$$" + name;
    }

    public static <T> Ref<T> make() {
        return new Ref<>(String.valueOf(id++));
    }

    public String getName() {
        return name;
    }

    public void init(ReactComponent $this, Func.Run1<T> callback) {
        final T ref = get($this);
        final Boolean inited = Jso.get(ref, INIT_PROP_NAME);
        if (inited == null || !inited) {
            Jso.set(ref, INIT_PROP_NAME, true);
            callback.run(ref);
        }
    }

    public T get(ReactComponent $this) {
        return Jso.get(Jso.get($this, "refs"), name);
    }

    public void set(ReactComponent $this, T value) {
        Jso.set($this, name, value);
    }
}
