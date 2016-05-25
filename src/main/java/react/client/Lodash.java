package react.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Lodash {
    public static native Object assign(Object object, Object... sources);

    public static native boolean isEqual(Object o1, Object o2);
}
