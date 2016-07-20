package react.client;

import common.client.Func;
import jsinterop.annotations.JsFunction;

import java.util.List;

/**
 *
 */
@SuppressWarnings("all")
public interface DOM {
    static HTMLProps props(String tagName) {
        final HTMLProps props = new HTMLProps();
        return props;
    }

    static Object[] toObjectArray(List<Object> list) {
        Object[] params = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            params[i] = list.get(i);
        }
        return params;
    }

    static ReactElement create(String tagName, String value) {
        return React.createElement(
            tagName,
            props(tagName),
            value
        );
    }

    static ReactElement create(String tagName) {
        return React.createElement(
            tagName,
            props(tagName)
        );
    }

    static ReactElement create(String tagName, ReactElement children) {
        return React.createElement(
            tagName,
            props(tagName),
            children
        );
    }

    static ReactElement create(String tagName, ReactElement... children) {
        return React.createElement(
            tagName,
            props(tagName),
            children
        );
    }

    static ReactElement create(String tagName, HTMLProps props, ReactElement children) {
        return React.createElement(
            tagName,
            props,
            children
        );
    }

    static ReactElement create(String tagName, HTMLProps props, ReactElement... children) {
        return React.createElement(
            tagName,
            props,
            children
        );
    }

    static ReactElement create(String tagName, Func.Run1<HTMLProps> callback, String html) {
        final HTMLProps props = props(tagName);
        callback.run(props);
        return React.createElement(
            tagName,
            props,
            html
        );
    }

    static ReactElement create(String tagName, Func.Run1<HTMLProps> callback) {
        final HTMLProps props = props(tagName);
        callback.run(props);
        return React.createElement(
            tagName,
            props
        );
    }

    static ReactElement create(String tagName, Func.Run1<HTMLProps> callback, ReactElement... children) {
        final HTMLProps props = props(tagName);
        callback.run(props);
        return React.createElement(
            tagName,
            props,
            children
        );
    }

    static ReactElement create(String tagName,
                               Func.Run1<HTMLProps> callback,
                               Func.Run1<Children> childrenCallback) {
        final HTMLProps props = props(tagName);
        callback.run(props);
        final Children components = new Children();
        childrenCallback.run(components);

//        switch (components.list.size()) {
//            case 0:
//                return React.createElement(tagName, props);
//            case 1:
//                return React.createElement(tagName, props, components.list.get(0));
//            default:
//                return React.createElement(ta)
//        }

        return React.createElement(
            tagName,
            props,
            components.toArray()
        );
    }

    static ReactElement create(String tagName,
                               HTMLProps props,
                               Func.Run1<Children> childrenCallback) {
        final Children components = new Children();
        childrenCallback.run(components);

//        switch (components.list.size()) {
//            case 0:
//                return React.createElement(tagName, props);
//            case 1:
//                return React.createElement(tagName, props, components.list.get(0));
//            default:
//                return React.createElement(ta)
//        }

        return React.createElement(
            tagName,
            props,
            components.toArray()
        );
    }

    static ReactElement create(String tagName, HTMLProps props, String html) {
        return React.createElement(
            tagName,
            props,
            html
        );
    }

    static ReactElement create(String tagName, PropsAndChildren callback) {
        final HTMLProps props = new HTMLProps();
        final Children children = new Children();

        callback.run(props, children);

        return React.createElement(
            tagName,
            props,
            children.toArray()
        );
    }

    static ReactElement a() {
        return create("a");
    }

    static ReactElement a(String value) {
        return create("a", value);
    }

    static ReactElement a(ReactElement child) {
        return create("a", child);
    }

    static ReactElement a(ReactElement... children) {
        return create("a", children);
    }

    static ReactElement a(StyleProps style) {
        return create("a", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement a(StyleProps style, String text) {
        return create("a", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement a(StyleProps style, ReactElement child) {
        return create("a", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement a(StyleProps style, ReactElement... children) {
        return create("a", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement a(HTMLProps props) {
        return create("a", props);
    }

    static ReactElement a(HTMLProps props, String text) {
        return create("a", props, text);
    }

    static ReactElement a(HTMLProps props, ReactElement child) {
        return create("a", props, child);
    }

    static ReactElement a(HTMLProps props, ReactElement... children) {
        return create("a", props, children);
    }

    static ReactElement a(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("a", props, childrenCallback);
    }

    static ReactElement a(Func.Run1<HTMLProps> callback) {
        return create("a", callback);
    }

    static ReactElement a(Func.Run1<HTMLProps> callback, String text) {
        return create("a", callback, text);
    }

    static ReactElement a(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("a", callback, child);
    }

    static ReactElement a(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("a", callback, children);
    }

    static ReactElement a(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("a", callback, childrenCallback);
    }

    static ReactElement a(PropsAndChildren callback) {
        return create("a", callback);
    }

    static ReactElement abbr() {
        return create("abbr");
    }

    static ReactElement abbr(String value) {
        return create("abbr", value);
    }

    static ReactElement abbr(ReactElement child) {
        return create("abbr", child);
    }

    static ReactElement abbr(ReactElement... children) {
        return create("abbr", children);
    }

    static ReactElement abbr(StyleProps style) {
        return create("abbr", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement abbr(StyleProps style, String text) {
        return create("abbr", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement abbr(StyleProps style, ReactElement child) {
        return create("abbr", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement abbr(StyleProps style, ReactElement... children) {
        return create("abbr", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement abbr(HTMLProps props) {
        return create("abbr", props);
    }

    static ReactElement abbr(HTMLProps props, String text) {
        return create("abbr", props, text);
    }

    static ReactElement abbr(HTMLProps props, ReactElement child) {
        return create("abbr", props, child);
    }

    static ReactElement abbr(HTMLProps props, ReactElement... children) {
        return create("abbr", props, children);
    }

    static ReactElement abbr(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("abbr", props, childrenCallback);
    }

    static ReactElement abbr(Func.Run1<HTMLProps> callback) {
        return create("abbr", callback);
    }

    static ReactElement abbr(Func.Run1<HTMLProps> callback, String text) {
        return create("abbr", callback, text);
    }

    static ReactElement abbr(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("abbr", callback, child);
    }

    static ReactElement abbr(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("abbr", callback, children);
    }

    static ReactElement abbr(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("abbr", callback, childrenCallback);
    }

    static ReactElement abbr(PropsAndChildren callback) {
        return create("abbr", callback);
    }

    static ReactElement address() {
        return create("address");
    }

    static ReactElement address(String value) {
        return create("address", value);
    }

    static ReactElement address(ReactElement child) {
        return create("address", child);
    }

    static ReactElement address(ReactElement... children) {
        return create("address", children);
    }

    static ReactElement address(StyleProps style) {
        return create("address", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement address(StyleProps style, String text) {
        return create("address", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement address(StyleProps style, ReactElement child) {
        return create("address", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement address(StyleProps style, ReactElement... children) {
        return create("address", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement address(HTMLProps props) {
        return create("address", props);
    }

    static ReactElement address(HTMLProps props, String text) {
        return create("address", props, text);
    }

    static ReactElement address(HTMLProps props, ReactElement child) {
        return create("address", props, child);
    }

    static ReactElement address(HTMLProps props, ReactElement... children) {
        return create("address", props, children);
    }

    static ReactElement address(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("address", props, childrenCallback);
    }

    static ReactElement address(Func.Run1<HTMLProps> callback) {
        return create("address", callback);
    }

    static ReactElement address(Func.Run1<HTMLProps> callback, String text) {
        return create("address", callback, text);
    }

    static ReactElement address(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("address", callback, child);
    }

    static ReactElement address(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("address", callback, children);
    }

    static ReactElement address(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("address", callback, childrenCallback);
    }

    static ReactElement address(PropsAndChildren callback) {
        return create("address", callback);
    }

    static ReactElement area() {
        return create("area");
    }

    static ReactElement area(String value) {
        return create("area", value);
    }

    static ReactElement area(ReactElement child) {
        return create("area", child);
    }

    static ReactElement area(ReactElement... children) {
        return create("area", children);
    }

    static ReactElement area(StyleProps style) {
        return create("area", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement area(StyleProps style, String text) {
        return create("area", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement area(StyleProps style, ReactElement child) {
        return create("area", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement area(StyleProps style, ReactElement... children) {
        return create("area", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement area(HTMLProps props) {
        return create("area", props);
    }

    static ReactElement area(HTMLProps props, String text) {
        return create("area", props, text);
    }

    static ReactElement area(HTMLProps props, ReactElement child) {
        return create("area", props, child);
    }

    static ReactElement area(HTMLProps props, ReactElement... children) {
        return create("area", props, children);
    }

    static ReactElement area(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("area", props, childrenCallback);
    }

    static ReactElement area(Func.Run1<HTMLProps> callback) {
        return create("area", callback);
    }

    static ReactElement area(Func.Run1<HTMLProps> callback, String text) {
        return create("area", callback, text);
    }

    static ReactElement area(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("area", callback, child);
    }

    static ReactElement area(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("area", callback, children);
    }

    static ReactElement area(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("area", callback, childrenCallback);
    }

    static ReactElement area(PropsAndChildren callback) {
        return create("area", callback);
    }

    static ReactElement article() {
        return create("article");
    }

    static ReactElement article(String value) {
        return create("article", value);
    }

    static ReactElement article(ReactElement child) {
        return create("article", child);
    }

    static ReactElement article(ReactElement... children) {
        return create("article", children);
    }

    static ReactElement article(StyleProps style) {
        return create("article", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement article(StyleProps style, String text) {
        return create("article", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement article(StyleProps style, ReactElement child) {
        return create("article", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement article(StyleProps style, ReactElement... children) {
        return create("article", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement article(HTMLProps props) {
        return create("article", props);
    }

    static ReactElement article(HTMLProps props, String text) {
        return create("article", props, text);
    }

    static ReactElement article(HTMLProps props, ReactElement child) {
        return create("article", props, child);
    }

    static ReactElement article(HTMLProps props, ReactElement... children) {
        return create("article", props, children);
    }

    static ReactElement article(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("article", props, childrenCallback);
    }

    static ReactElement article(Func.Run1<HTMLProps> callback) {
        return create("article", callback);
    }

    static ReactElement article(Func.Run1<HTMLProps> callback, String text) {
        return create("article", callback, text);
    }

    static ReactElement article(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("article", callback, child);
    }

    static ReactElement article(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("article", callback, children);
    }

    static ReactElement article(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("article", callback, childrenCallback);
    }

    static ReactElement article(PropsAndChildren callback) {
        return create("article", callback);
    }

    static ReactElement aside() {
        return create("aside");
    }

    static ReactElement aside(String value) {
        return create("aside", value);
    }

    static ReactElement aside(ReactElement child) {
        return create("aside", child);
    }

    static ReactElement aside(ReactElement... children) {
        return create("aside", children);
    }

    static ReactElement aside(StyleProps style) {
        return create("aside", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement aside(StyleProps style, String text) {
        return create("aside", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement aside(StyleProps style, ReactElement child) {
        return create("aside", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement aside(StyleProps style, ReactElement... children) {
        return create("aside", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement aside(HTMLProps props) {
        return create("aside", props);
    }

    static ReactElement aside(HTMLProps props, String text) {
        return create("aside", props, text);
    }

    static ReactElement aside(HTMLProps props, ReactElement child) {
        return create("aside", props, child);
    }

    static ReactElement aside(HTMLProps props, ReactElement... children) {
        return create("aside", props, children);
    }

    static ReactElement aside(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("aside", props, childrenCallback);
    }

    static ReactElement aside(Func.Run1<HTMLProps> callback) {
        return create("aside", callback);
    }

    static ReactElement aside(Func.Run1<HTMLProps> callback, String text) {
        return create("aside", callback, text);
    }

    static ReactElement aside(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("aside", callback, child);
    }

    static ReactElement aside(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("aside", callback, children);
    }

    static ReactElement aside(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("aside", callback, childrenCallback);
    }

    static ReactElement aside(PropsAndChildren callback) {
        return create("aside", callback);
    }

    static ReactElement audio() {
        return create("audio");
    }

    static ReactElement audio(String value) {
        return create("audio", value);
    }

    static ReactElement audio(ReactElement child) {
        return create("audio", child);
    }

    static ReactElement audio(ReactElement... children) {
        return create("audio", children);
    }

    static ReactElement audio(StyleProps style) {
        return create("audio", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement audio(StyleProps style, String text) {
        return create("audio", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement audio(StyleProps style, ReactElement child) {
        return create("audio", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement audio(StyleProps style, ReactElement... children) {
        return create("audio", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement audio(HTMLProps props) {
        return create("audio", props);
    }

    static ReactElement audio(HTMLProps props, String text) {
        return create("audio", props, text);
    }

    static ReactElement audio(HTMLProps props, ReactElement child) {
        return create("audio", props, child);
    }

    static ReactElement audio(HTMLProps props, ReactElement... children) {
        return create("audio", props, children);
    }

    static ReactElement audio(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("audio", props, childrenCallback);
    }

    static ReactElement audio(Func.Run1<HTMLProps> callback) {
        return create("audio", callback);
    }

    static ReactElement audio(Func.Run1<HTMLProps> callback, String text) {
        return create("audio", callback, text);
    }

    static ReactElement audio(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("audio", callback, child);
    }

    static ReactElement audio(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("audio", callback, children);
    }

    static ReactElement audio(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("audio", callback, childrenCallback);
    }

    static ReactElement audio(PropsAndChildren callback) {
        return create("audio", callback);
    }

    static ReactElement b() {
        return create("b");
    }

    static ReactElement b(String value) {
        return create("b", value);
    }

    static ReactElement b(ReactElement child) {
        return create("b", child);
    }

    static ReactElement b(ReactElement... children) {
        return create("b", children);
    }

    static ReactElement b(StyleProps style) {
        return create("b", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement b(StyleProps style, String text) {
        return create("b", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement b(StyleProps style, ReactElement child) {
        return create("b", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement b(StyleProps style, ReactElement... children) {
        return create("b", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement b(HTMLProps props) {
        return create("b", props);
    }

    static ReactElement b(HTMLProps props, String text) {
        return create("b", props, text);
    }

    static ReactElement b(HTMLProps props, ReactElement child) {
        return create("b", props, child);
    }

    static ReactElement b(HTMLProps props, ReactElement... children) {
        return create("b", props, children);
    }

    static ReactElement b(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("b", props, childrenCallback);
    }

    static ReactElement b(Func.Run1<HTMLProps> callback) {
        return create("b", callback);
    }

    static ReactElement b(Func.Run1<HTMLProps> callback, String text) {
        return create("b", callback, text);
    }

    static ReactElement b(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("b", callback, child);
    }

    static ReactElement b(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("b", callback, children);
    }

    static ReactElement b(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("b", callback, childrenCallback);
    }

    static ReactElement b(PropsAndChildren callback) {
        return create("b", callback);
    }

    static ReactElement base() {
        return create("base");
    }

    static ReactElement base(String value) {
        return create("base", value);
    }

    static ReactElement base(ReactElement child) {
        return create("base", child);
    }

    static ReactElement base(ReactElement... children) {
        return create("base", children);
    }

    static ReactElement base(StyleProps style) {
        return create("base", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement base(StyleProps style, String text) {
        return create("base", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement base(StyleProps style, ReactElement child) {
        return create("base", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement base(StyleProps style, ReactElement... children) {
        return create("base", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement base(HTMLProps props) {
        return create("base", props);
    }

    static ReactElement base(HTMLProps props, String text) {
        return create("base", props, text);
    }

    static ReactElement base(HTMLProps props, ReactElement child) {
        return create("base", props, child);
    }

    static ReactElement base(HTMLProps props, ReactElement... children) {
        return create("base", props, children);
    }

    static ReactElement base(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("base", props, childrenCallback);
    }

    static ReactElement base(Func.Run1<HTMLProps> callback) {
        return create("base", callback);
    }

    static ReactElement base(Func.Run1<HTMLProps> callback, String text) {
        return create("base", callback, text);
    }

    static ReactElement base(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("base", callback, child);
    }

    static ReactElement base(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("base", callback, children);
    }

    static ReactElement base(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("base", callback, childrenCallback);
    }

    static ReactElement base(PropsAndChildren callback) {
        return create("base", callback);
    }

    static ReactElement bdi() {
        return create("bdi");
    }

    static ReactElement bdi(String value) {
        return create("bdi", value);
    }

    static ReactElement bdi(ReactElement child) {
        return create("bdi", child);
    }

    static ReactElement bdi(ReactElement... children) {
        return create("bdi", children);
    }

    static ReactElement bdi(StyleProps style) {
        return create("bdi", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement bdi(StyleProps style, String text) {
        return create("bdi", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement bdi(StyleProps style, ReactElement child) {
        return create("bdi", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement bdi(StyleProps style, ReactElement... children) {
        return create("bdi", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement bdi(HTMLProps props) {
        return create("bdi", props);
    }

    static ReactElement bdi(HTMLProps props, String text) {
        return create("bdi", props, text);
    }

    static ReactElement bdi(HTMLProps props, ReactElement child) {
        return create("bdi", props, child);
    }

    static ReactElement bdi(HTMLProps props, ReactElement... children) {
        return create("bdi", props, children);
    }

    static ReactElement bdi(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("bdi", props, childrenCallback);
    }

    static ReactElement bdi(Func.Run1<HTMLProps> callback) {
        return create("bdi", callback);
    }

    static ReactElement bdi(Func.Run1<HTMLProps> callback, String text) {
        return create("bdi", callback, text);
    }

    static ReactElement bdi(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("bdi", callback, child);
    }

    static ReactElement bdi(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("bdi", callback, children);
    }

    static ReactElement bdi(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("bdi", callback, childrenCallback);
    }

    static ReactElement bdi(PropsAndChildren callback) {
        return create("bdi", callback);
    }

    static ReactElement bdo() {
        return create("bdo");
    }

    static ReactElement bdo(String value) {
        return create("bdo", value);
    }

    static ReactElement bdo(ReactElement child) {
        return create("bdo", child);
    }

    static ReactElement bdo(ReactElement... children) {
        return create("bdo", children);
    }

    static ReactElement bdo(StyleProps style) {
        return create("bdo", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement bdo(StyleProps style, String text) {
        return create("bdo", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement bdo(StyleProps style, ReactElement child) {
        return create("bdo", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement bdo(StyleProps style, ReactElement... children) {
        return create("bdo", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement bdo(HTMLProps props) {
        return create("bdo", props);
    }

    static ReactElement bdo(HTMLProps props, String text) {
        return create("bdo", props, text);
    }

    static ReactElement bdo(HTMLProps props, ReactElement child) {
        return create("bdo", props, child);
    }

    static ReactElement bdo(HTMLProps props, ReactElement... children) {
        return create("bdo", props, children);
    }

    static ReactElement bdo(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("bdo", props, childrenCallback);
    }

    static ReactElement bdo(Func.Run1<HTMLProps> callback) {
        return create("bdo", callback);
    }

    static ReactElement bdo(Func.Run1<HTMLProps> callback, String text) {
        return create("bdo", callback, text);
    }

    static ReactElement bdo(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("bdo", callback, child);
    }

    static ReactElement bdo(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("bdo", callback, children);
    }

    static ReactElement bdo(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("bdo", callback, childrenCallback);
    }

    static ReactElement bdo(PropsAndChildren callback) {
        return create("bdo", callback);
    }

    static ReactElement big() {
        return create("big");
    }

    static ReactElement big(String value) {
        return create("big", value);
    }

    static ReactElement big(ReactElement child) {
        return create("big", child);
    }

    static ReactElement big(ReactElement... children) {
        return create("big", children);
    }

    static ReactElement big(StyleProps style) {
        return create("big", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement big(StyleProps style, String text) {
        return create("big", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement big(StyleProps style, ReactElement child) {
        return create("big", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement big(StyleProps style, ReactElement... children) {
        return create("big", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement big(HTMLProps props) {
        return create("big", props);
    }

    static ReactElement big(HTMLProps props, String text) {
        return create("big", props, text);
    }

    static ReactElement big(HTMLProps props, ReactElement child) {
        return create("big", props, child);
    }

    static ReactElement big(HTMLProps props, ReactElement... children) {
        return create("big", props, children);
    }

    static ReactElement big(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("big", props, childrenCallback);
    }

    static ReactElement big(Func.Run1<HTMLProps> callback) {
        return create("big", callback);
    }

    static ReactElement big(Func.Run1<HTMLProps> callback, String text) {
        return create("big", callback, text);
    }

    static ReactElement big(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("big", callback, child);
    }

    static ReactElement big(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("big", callback, children);
    }

    static ReactElement big(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("big", callback, childrenCallback);
    }

    static ReactElement big(PropsAndChildren callback) {
        return create("big", callback);
    }

    static ReactElement blockquote() {
        return create("blockquote");
    }

    static ReactElement blockquote(String value) {
        return create("blockquote", value);
    }

    static ReactElement blockquote(ReactElement child) {
        return create("blockquote", child);
    }

    static ReactElement blockquote(ReactElement... children) {
        return create("blockquote", children);
    }

    static ReactElement blockquote(StyleProps style) {
        return create("blockquote", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement blockquote(StyleProps style, String text) {
        return create("blockquote", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement blockquote(StyleProps style, ReactElement child) {
        return create("blockquote", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement blockquote(StyleProps style, ReactElement... children) {
        return create("blockquote", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement blockquote(HTMLProps props) {
        return create("blockquote", props);
    }

    static ReactElement blockquote(HTMLProps props, String text) {
        return create("blockquote", props, text);
    }

    static ReactElement blockquote(HTMLProps props, ReactElement child) {
        return create("blockquote", props, child);
    }

    static ReactElement blockquote(HTMLProps props, ReactElement... children) {
        return create("blockquote", props, children);
    }

    static ReactElement blockquote(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("blockquote", props, childrenCallback);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps> callback) {
        return create("blockquote", callback);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps> callback, String text) {
        return create("blockquote", callback, text);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("blockquote", callback, child);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("blockquote", callback, children);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("blockquote", callback, childrenCallback);
    }

    static ReactElement blockquote(PropsAndChildren callback) {
        return create("blockquote", callback);
    }

    static ReactElement body() {
        return create("body");
    }

    static ReactElement body(String value) {
        return create("body", value);
    }

    static ReactElement body(ReactElement child) {
        return create("body", child);
    }

    static ReactElement body(ReactElement... children) {
        return create("body", children);
    }

    static ReactElement body(StyleProps style) {
        return create("body", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement body(StyleProps style, String text) {
        return create("body", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement body(StyleProps style, ReactElement child) {
        return create("body", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement body(StyleProps style, ReactElement... children) {
        return create("body", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement body(HTMLProps props) {
        return create("body", props);
    }

    static ReactElement body(HTMLProps props, String text) {
        return create("body", props, text);
    }

    static ReactElement body(HTMLProps props, ReactElement child) {
        return create("body", props, child);
    }

    static ReactElement body(HTMLProps props, ReactElement... children) {
        return create("body", props, children);
    }

    static ReactElement body(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("body", props, childrenCallback);
    }

    static ReactElement body(Func.Run1<HTMLProps> callback) {
        return create("body", callback);
    }

    static ReactElement body(Func.Run1<HTMLProps> callback, String text) {
        return create("body", callback, text);
    }

    static ReactElement body(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("body", callback, child);
    }

    static ReactElement body(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("body", callback, children);
    }

    static ReactElement body(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("body", callback, childrenCallback);
    }

    static ReactElement body(PropsAndChildren callback) {
        return create("body", callback);
    }

    static ReactElement br() {
        return create("br");
    }

    static ReactElement br(String value) {
        return create("br", value);
    }

    static ReactElement br(ReactElement child) {
        return create("br", child);
    }

    static ReactElement br(ReactElement... children) {
        return create("br", children);
    }

    static ReactElement br(StyleProps style) {
        return create("br", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement br(StyleProps style, String text) {
        return create("br", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement br(StyleProps style, ReactElement child) {
        return create("br", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement br(StyleProps style, ReactElement... children) {
        return create("br", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement br(HTMLProps props) {
        return create("br", props);
    }

    static ReactElement br(HTMLProps props, String text) {
        return create("br", props, text);
    }

    static ReactElement br(HTMLProps props, ReactElement child) {
        return create("br", props, child);
    }

    static ReactElement br(HTMLProps props, ReactElement... children) {
        return create("br", props, children);
    }

    static ReactElement br(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("br", props, childrenCallback);
    }

    static ReactElement br(Func.Run1<HTMLProps> callback) {
        return create("br", callback);
    }

    static ReactElement br(Func.Run1<HTMLProps> callback, String text) {
        return create("br", callback, text);
    }

    static ReactElement br(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("br", callback, child);
    }

    static ReactElement br(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("br", callback, children);
    }

    static ReactElement br(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("br", callback, childrenCallback);
    }

    static ReactElement br(PropsAndChildren callback) {
        return create("br", callback);
    }

    static ReactElement button() {
        return create("button");
    }

    static ReactElement button(String value) {
        return create("button", value);
    }

    static ReactElement button(ReactElement child) {
        return create("button", child);
    }

    static ReactElement button(ReactElement... children) {
        return create("button", children);
    }

    static ReactElement button(StyleProps style) {
        return create("button", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement button(StyleProps style, String text) {
        return create("button", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement button(StyleProps style, ReactElement child) {
        return create("button", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement button(StyleProps style, ReactElement... children) {
        return create("button", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement button(HTMLProps props) {
        return create("button", props);
    }

    static ReactElement button(HTMLProps props, String text) {
        return create("button", props, text);
    }

    static ReactElement button(HTMLProps props, ReactElement child) {
        return create("button", props, child);
    }

    static ReactElement button(HTMLProps props, ReactElement... children) {
        return create("button", props, children);
    }

    static ReactElement button(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("button", props, childrenCallback);
    }

    static ReactElement button(Func.Run1<HTMLProps> callback) {
        return create("button", callback);
    }

    static ReactElement button(Func.Run1<HTMLProps> callback, String text) {
        return create("button", callback, text);
    }

    static ReactElement button(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("button", callback, child);
    }

    static ReactElement button(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("button", callback, children);
    }

    static ReactElement button(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("button", callback, childrenCallback);
    }

    static ReactElement button(PropsAndChildren callback) {
        return create("button", callback);
    }

    static ReactElement canvas() {
        return create("canvas");
    }

    static ReactElement canvas(String value) {
        return create("canvas", value);
    }

    static ReactElement canvas(ReactElement child) {
        return create("canvas", child);
    }

    static ReactElement canvas(ReactElement... children) {
        return create("canvas", children);
    }

    static ReactElement canvas(StyleProps style) {
        return create("canvas", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement canvas(StyleProps style, String text) {
        return create("canvas", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement canvas(StyleProps style, ReactElement child) {
        return create("canvas", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement canvas(StyleProps style, ReactElement... children) {
        return create("canvas", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement canvas(HTMLProps props) {
        return create("canvas", props);
    }

    static ReactElement canvas(HTMLProps props, String text) {
        return create("canvas", props, text);
    }

    static ReactElement canvas(HTMLProps props, ReactElement child) {
        return create("canvas", props, child);
    }

    static ReactElement canvas(HTMLProps props, ReactElement... children) {
        return create("canvas", props, children);
    }

    static ReactElement canvas(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("canvas", props, childrenCallback);
    }

    static ReactElement canvas(Func.Run1<HTMLProps> callback) {
        return create("canvas", callback);
    }

    static ReactElement canvas(Func.Run1<HTMLProps> callback, String text) {
        return create("canvas", callback, text);
    }

    static ReactElement canvas(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("canvas", callback, child);
    }

    static ReactElement canvas(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("canvas", callback, children);
    }

    static ReactElement canvas(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("canvas", callback, childrenCallback);
    }

    static ReactElement canvas(PropsAndChildren callback) {
        return create("canvas", callback);
    }

    static ReactElement caption() {
        return create("caption");
    }

    static ReactElement caption(String value) {
        return create("caption", value);
    }

    static ReactElement caption(ReactElement child) {
        return create("caption", child);
    }

    static ReactElement caption(ReactElement... children) {
        return create("caption", children);
    }

    static ReactElement caption(StyleProps style) {
        return create("caption", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement caption(StyleProps style, String text) {
        return create("caption", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement caption(StyleProps style, ReactElement child) {
        return create("caption", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement caption(StyleProps style, ReactElement... children) {
        return create("caption", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement caption(HTMLProps props) {
        return create("caption", props);
    }

    static ReactElement caption(HTMLProps props, String text) {
        return create("caption", props, text);
    }

    static ReactElement caption(HTMLProps props, ReactElement child) {
        return create("caption", props, child);
    }

    static ReactElement caption(HTMLProps props, ReactElement... children) {
        return create("caption", props, children);
    }

    static ReactElement caption(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("caption", props, childrenCallback);
    }

    static ReactElement caption(Func.Run1<HTMLProps> callback) {
        return create("caption", callback);
    }

    static ReactElement caption(Func.Run1<HTMLProps> callback, String text) {
        return create("caption", callback, text);
    }

    static ReactElement caption(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("caption", callback, child);
    }

    static ReactElement caption(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("caption", callback, children);
    }

    static ReactElement caption(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("caption", callback, childrenCallback);
    }

    static ReactElement caption(PropsAndChildren callback) {
        return create("caption", callback);
    }

    static ReactElement cite() {
        return create("cite");
    }

    static ReactElement cite(String value) {
        return create("cite", value);
    }

    static ReactElement cite(ReactElement child) {
        return create("cite", child);
    }

    static ReactElement cite(ReactElement... children) {
        return create("cite", children);
    }

    static ReactElement cite(StyleProps style) {
        return create("cite", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement cite(StyleProps style, String text) {
        return create("cite", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement cite(StyleProps style, ReactElement child) {
        return create("cite", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement cite(StyleProps style, ReactElement... children) {
        return create("cite", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement cite(HTMLProps props) {
        return create("cite", props);
    }

    static ReactElement cite(HTMLProps props, String text) {
        return create("cite", props, text);
    }

    static ReactElement cite(HTMLProps props, ReactElement child) {
        return create("cite", props, child);
    }

    static ReactElement cite(HTMLProps props, ReactElement... children) {
        return create("cite", props, children);
    }

    static ReactElement cite(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("cite", props, childrenCallback);
    }

    static ReactElement cite(Func.Run1<HTMLProps> callback) {
        return create("cite", callback);
    }

    static ReactElement cite(Func.Run1<HTMLProps> callback, String text) {
        return create("cite", callback, text);
    }

    static ReactElement cite(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("cite", callback, child);
    }

    static ReactElement cite(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("cite", callback, children);
    }

    static ReactElement cite(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("cite", callback, childrenCallback);
    }

    static ReactElement cite(PropsAndChildren callback) {
        return create("cite", callback);
    }

    static ReactElement code() {
        return create("code");
    }

    static ReactElement code(String value) {
        return create("code", value);
    }

    static ReactElement code(ReactElement child) {
        return create("code", child);
    }

    static ReactElement code(ReactElement... children) {
        return create("code", children);
    }

    static ReactElement code(StyleProps style) {
        return create("code", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement code(StyleProps style, String text) {
        return create("code", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement code(StyleProps style, ReactElement child) {
        return create("code", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement code(StyleProps style, ReactElement... children) {
        return create("code", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement code(HTMLProps props) {
        return create("code", props);
    }

    static ReactElement code(HTMLProps props, String text) {
        return create("code", props, text);
    }

    static ReactElement code(HTMLProps props, ReactElement child) {
        return create("code", props, child);
    }

    static ReactElement code(HTMLProps props, ReactElement... children) {
        return create("code", props, children);
    }

    static ReactElement code(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("code", props, childrenCallback);
    }

    static ReactElement code(Func.Run1<HTMLProps> callback) {
        return create("code", callback);
    }

    static ReactElement code(Func.Run1<HTMLProps> callback, String text) {
        return create("code", callback, text);
    }

    static ReactElement code(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("code", callback, child);
    }

    static ReactElement code(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("code", callback, children);
    }

    static ReactElement code(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("code", callback, childrenCallback);
    }

    static ReactElement code(PropsAndChildren callback) {
        return create("code", callback);
    }

    static ReactElement col() {
        return create("col");
    }

    static ReactElement col(String value) {
        return create("col", value);
    }

    static ReactElement col(ReactElement child) {
        return create("col", child);
    }

    static ReactElement col(ReactElement... children) {
        return create("col", children);
    }

    static ReactElement col(StyleProps style) {
        return create("col", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement col(StyleProps style, String text) {
        return create("col", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement col(StyleProps style, ReactElement child) {
        return create("col", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement col(StyleProps style, ReactElement... children) {
        return create("col", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement col(HTMLProps props) {
        return create("col", props);
    }

    static ReactElement col(HTMLProps props, String text) {
        return create("col", props, text);
    }

    static ReactElement col(HTMLProps props, ReactElement child) {
        return create("col", props, child);
    }

    static ReactElement col(HTMLProps props, ReactElement... children) {
        return create("col", props, children);
    }

    static ReactElement col(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("col", props, childrenCallback);
    }

    static ReactElement col(Func.Run1<HTMLProps> callback) {
        return create("col", callback);
    }

    static ReactElement col(Func.Run1<HTMLProps> callback, String text) {
        return create("col", callback, text);
    }

    static ReactElement col(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("col", callback, child);
    }

    static ReactElement col(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("col", callback, children);
    }

    static ReactElement col(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("col", callback, childrenCallback);
    }

    static ReactElement col(PropsAndChildren callback) {
        return create("col", callback);
    }

    static ReactElement colgroup() {
        return create("colgroup");
    }

    static ReactElement colgroup(String value) {
        return create("colgroup", value);
    }

    static ReactElement colgroup(ReactElement child) {
        return create("colgroup", child);
    }

    static ReactElement colgroup(ReactElement... children) {
        return create("colgroup", children);
    }

    static ReactElement colgroup(StyleProps style) {
        return create("colgroup", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement colgroup(StyleProps style, String text) {
        return create("colgroup", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement colgroup(StyleProps style, ReactElement child) {
        return create("colgroup", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement colgroup(StyleProps style, ReactElement... children) {
        return create("colgroup", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement colgroup(HTMLProps props) {
        return create("colgroup", props);
    }

    static ReactElement colgroup(HTMLProps props, String text) {
        return create("colgroup", props, text);
    }

    static ReactElement colgroup(HTMLProps props, ReactElement child) {
        return create("colgroup", props, child);
    }

    static ReactElement colgroup(HTMLProps props, ReactElement... children) {
        return create("colgroup", props, children);
    }

    static ReactElement colgroup(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("colgroup", props, childrenCallback);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps> callback) {
        return create("colgroup", callback);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps> callback, String text) {
        return create("colgroup", callback, text);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("colgroup", callback, child);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("colgroup", callback, children);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("colgroup", callback, childrenCallback);
    }

    static ReactElement colgroup(PropsAndChildren callback) {
        return create("colgroup", callback);
    }

    static ReactElement data() {
        return create("data");
    }

    static ReactElement data(String value) {
        return create("data", value);
    }

    static ReactElement data(ReactElement child) {
        return create("data", child);
    }

    static ReactElement data(ReactElement... children) {
        return create("data", children);
    }

    static ReactElement data(StyleProps style) {
        return create("data", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement data(StyleProps style, String text) {
        return create("data", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement data(StyleProps style, ReactElement child) {
        return create("data", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement data(StyleProps style, ReactElement... children) {
        return create("data", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement data(HTMLProps props) {
        return create("data", props);
    }

    static ReactElement data(HTMLProps props, String text) {
        return create("data", props, text);
    }

    static ReactElement data(HTMLProps props, ReactElement child) {
        return create("data", props, child);
    }

    static ReactElement data(HTMLProps props, ReactElement... children) {
        return create("data", props, children);
    }

    static ReactElement data(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("data", props, childrenCallback);
    }

    static ReactElement data(Func.Run1<HTMLProps> callback) {
        return create("data", callback);
    }

    static ReactElement data(Func.Run1<HTMLProps> callback, String text) {
        return create("data", callback, text);
    }

    static ReactElement data(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("data", callback, child);
    }

    static ReactElement data(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("data", callback, children);
    }

    static ReactElement data(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("data", callback, childrenCallback);
    }

    static ReactElement data(PropsAndChildren callback) {
        return create("data", callback);
    }

    static ReactElement datalist() {
        return create("datalist");
    }

    static ReactElement datalist(String value) {
        return create("datalist", value);
    }

    static ReactElement datalist(ReactElement child) {
        return create("datalist", child);
    }

    static ReactElement datalist(ReactElement... children) {
        return create("datalist", children);
    }

    static ReactElement datalist(StyleProps style) {
        return create("datalist", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement datalist(StyleProps style, String text) {
        return create("datalist", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement datalist(StyleProps style, ReactElement child) {
        return create("datalist", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement datalist(StyleProps style, ReactElement... children) {
        return create("datalist", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement datalist(HTMLProps props) {
        return create("datalist", props);
    }

    static ReactElement datalist(HTMLProps props, String text) {
        return create("datalist", props, text);
    }

    static ReactElement datalist(HTMLProps props, ReactElement child) {
        return create("datalist", props, child);
    }

    static ReactElement datalist(HTMLProps props, ReactElement... children) {
        return create("datalist", props, children);
    }

    static ReactElement datalist(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("datalist", props, childrenCallback);
    }

    static ReactElement datalist(Func.Run1<HTMLProps> callback) {
        return create("datalist", callback);
    }

    static ReactElement datalist(Func.Run1<HTMLProps> callback, String text) {
        return create("datalist", callback, text);
    }

    static ReactElement datalist(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("datalist", callback, child);
    }

    static ReactElement datalist(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("datalist", callback, children);
    }

    static ReactElement datalist(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("datalist", callback, childrenCallback);
    }

    static ReactElement datalist(PropsAndChildren callback) {
        return create("datalist", callback);
    }

    static ReactElement dd() {
        return create("dd");
    }

    static ReactElement dd(String value) {
        return create("dd", value);
    }

    static ReactElement dd(ReactElement child) {
        return create("dd", child);
    }

    static ReactElement dd(ReactElement... children) {
        return create("dd", children);
    }

    static ReactElement dd(StyleProps style) {
        return create("dd", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement dd(StyleProps style, String text) {
        return create("dd", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement dd(StyleProps style, ReactElement child) {
        return create("dd", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement dd(StyleProps style, ReactElement... children) {
        return create("dd", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement dd(HTMLProps props) {
        return create("dd", props);
    }

    static ReactElement dd(HTMLProps props, String text) {
        return create("dd", props, text);
    }

    static ReactElement dd(HTMLProps props, ReactElement child) {
        return create("dd", props, child);
    }

    static ReactElement dd(HTMLProps props, ReactElement... children) {
        return create("dd", props, children);
    }

    static ReactElement dd(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("dd", props, childrenCallback);
    }

    static ReactElement dd(Func.Run1<HTMLProps> callback) {
        return create("dd", callback);
    }

    static ReactElement dd(Func.Run1<HTMLProps> callback, String text) {
        return create("dd", callback, text);
    }

    static ReactElement dd(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("dd", callback, child);
    }

    static ReactElement dd(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("dd", callback, children);
    }

    static ReactElement dd(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("dd", callback, childrenCallback);
    }

    static ReactElement dd(PropsAndChildren callback) {
        return create("dd", callback);
    }

    static ReactElement defs() {
        return create("defs");
    }

    static ReactElement defs(String value) {
        return create("defs", value);
    }

    static ReactElement defs(ReactElement child) {
        return create("defs", child);
    }

    static ReactElement defs(ReactElement... children) {
        return create("defs", children);
    }

    static ReactElement defs(StyleProps style) {
        return create("defs", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement defs(StyleProps style, String text) {
        return create("defs", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement defs(StyleProps style, ReactElement child) {
        return create("defs", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement defs(StyleProps style, ReactElement... children) {
        return create("defs", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement defs(HTMLProps props) {
        return create("defs", props);
    }

    static ReactElement defs(HTMLProps props, String text) {
        return create("defs", props, text);
    }

    static ReactElement defs(HTMLProps props, ReactElement child) {
        return create("defs", props, child);
    }

    static ReactElement defs(HTMLProps props, ReactElement... children) {
        return create("defs", props, children);
    }

    static ReactElement defs(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("defs", props, childrenCallback);
    }

    static ReactElement defs(Func.Run1<HTMLProps> callback) {
        return create("defs", callback);
    }

    static ReactElement defs(Func.Run1<HTMLProps> callback, String text) {
        return create("defs", callback, text);
    }

    static ReactElement defs(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("defs", callback, child);
    }

    static ReactElement defs(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("defs", callback, children);
    }

    static ReactElement defs(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("defs", callback, childrenCallback);
    }

    static ReactElement defs(PropsAndChildren callback) {
        return create("defs", callback);
    }
    
    static ReactElement del() {
        return create("del");
    }

    static ReactElement del(String value) {
        return create("del", value);
    }

    static ReactElement del(ReactElement child) {
        return create("del", child);
    }

    static ReactElement del(ReactElement... children) {
        return create("del", children);
    }

    static ReactElement del(StyleProps style) {
        return create("del", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement del(StyleProps style, String text) {
        return create("del", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement del(StyleProps style, ReactElement child) {
        return create("del", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement del(StyleProps style, ReactElement... children) {
        return create("del", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement del(HTMLProps props) {
        return create("del", props);
    }

    static ReactElement del(HTMLProps props, String text) {
        return create("del", props, text);
    }

    static ReactElement del(HTMLProps props, ReactElement child) {
        return create("del", props, child);
    }

    static ReactElement del(HTMLProps props, ReactElement... children) {
        return create("del", props, children);
    }

    static ReactElement del(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("del", props, childrenCallback);
    }

    static ReactElement del(Func.Run1<HTMLProps> callback) {
        return create("del", callback);
    }

    static ReactElement del(Func.Run1<HTMLProps> callback, String text) {
        return create("del", callback, text);
    }

    static ReactElement del(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("del", callback, child);
    }

    static ReactElement del(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("del", callback, children);
    }

    static ReactElement del(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("del", callback, childrenCallback);
    }

    static ReactElement del(PropsAndChildren callback) {
        return create("del", callback);
    }

    static ReactElement details() {
        return create("details");
    }

    static ReactElement details(String value) {
        return create("details", value);
    }

    static ReactElement details(ReactElement child) {
        return create("details", child);
    }

    static ReactElement details(ReactElement... children) {
        return create("details", children);
    }

    static ReactElement details(StyleProps style) {
        return create("details", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement details(StyleProps style, String text) {
        return create("details", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement details(StyleProps style, ReactElement child) {
        return create("details", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement details(StyleProps style, ReactElement... children) {
        return create("details", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement details(HTMLProps props) {
        return create("details", props);
    }

    static ReactElement details(HTMLProps props, String text) {
        return create("details", props, text);
    }

    static ReactElement details(HTMLProps props, ReactElement child) {
        return create("details", props, child);
    }

    static ReactElement details(HTMLProps props, ReactElement... children) {
        return create("details", props, children);
    }

    static ReactElement details(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("details", props, childrenCallback);
    }

    static ReactElement details(Func.Run1<HTMLProps> callback) {
        return create("details", callback);
    }

    static ReactElement details(Func.Run1<HTMLProps> callback, String text) {
        return create("details", callback, text);
    }

    static ReactElement details(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("details", callback, child);
    }

    static ReactElement details(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("details", callback, children);
    }

    static ReactElement details(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("details", callback, childrenCallback);
    }

    static ReactElement details(PropsAndChildren callback) {
        return create("details", callback);
    }

    static ReactElement dfn() {
        return create("dfn");
    }

    static ReactElement dfn(String value) {
        return create("dfn", value);
    }

    static ReactElement dfn(ReactElement child) {
        return create("dfn", child);
    }

    static ReactElement dfn(ReactElement... children) {
        return create("dfn", children);
    }

    static ReactElement dfn(StyleProps style) {
        return create("dfn", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement dfn(StyleProps style, String text) {
        return create("dfn", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement dfn(StyleProps style, ReactElement child) {
        return create("dfn", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement dfn(StyleProps style, ReactElement... children) {
        return create("dfn", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement dfn(HTMLProps props) {
        return create("dfn", props);
    }

    static ReactElement dfn(HTMLProps props, String text) {
        return create("dfn", props, text);
    }

    static ReactElement dfn(HTMLProps props, ReactElement child) {
        return create("dfn", props, child);
    }

    static ReactElement dfn(HTMLProps props, ReactElement... children) {
        return create("dfn", props, children);
    }

    static ReactElement dfn(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("dfn", props, childrenCallback);
    }

    static ReactElement dfn(Func.Run1<HTMLProps> callback) {
        return create("dfn", callback);
    }

    static ReactElement dfn(Func.Run1<HTMLProps> callback, String text) {
        return create("dfn", callback, text);
    }

    static ReactElement dfn(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("dfn", callback, child);
    }

    static ReactElement dfn(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("dfn", callback, children);
    }

    static ReactElement dfn(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("dfn", callback, childrenCallback);
    }

    static ReactElement dfn(PropsAndChildren callback) {
        return create("dfn", callback);
    }

    static ReactElement dialog() {
        return create("dialog");
    }

    static ReactElement dialog(String value) {
        return create("dialog", value);
    }

    static ReactElement dialog(ReactElement child) {
        return create("dialog", child);
    }

    static ReactElement dialog(ReactElement... children) {
        return create("dialog", children);
    }

    static ReactElement dialog(StyleProps style) {
        return create("dialog", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement dialog(StyleProps style, String text) {
        return create("dialog", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement dialog(StyleProps style, ReactElement child) {
        return create("dialog", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement dialog(StyleProps style, ReactElement... children) {
        return create("dialog", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement dialog(HTMLProps props) {
        return create("dialog", props);
    }

    static ReactElement dialog(HTMLProps props, String text) {
        return create("dialog", props, text);
    }

    static ReactElement dialog(HTMLProps props, ReactElement child) {
        return create("dialog", props, child);
    }

    static ReactElement dialog(HTMLProps props, ReactElement... children) {
        return create("dialog", props, children);
    }

    static ReactElement dialog(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("dialog", props, childrenCallback);
    }

    static ReactElement dialog(Func.Run1<HTMLProps> callback) {
        return create("dialog", callback);
    }

    static ReactElement dialog(Func.Run1<HTMLProps> callback, String text) {
        return create("dialog", callback, text);
    }

    static ReactElement dialog(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("dialog", callback, child);
    }

    static ReactElement dialog(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("dialog", callback, children);
    }

    static ReactElement dialog(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("dialog", callback, childrenCallback);
    }

    static ReactElement dialog(PropsAndChildren callback) {
        return create("dialog", callback);
    }

    static ReactElement div() {
        return create("div");
    }

    static ReactElement div(String value) {
        return create("div", value);
    }

    static ReactElement div(ReactElement child) {
        return create("div", child);
    }

    static ReactElement div(ReactElement... children) {
        return create("div", children);
    }

    static ReactElement div(StyleProps style) {
        return create("div", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement div(StyleProps style, String text) {
        return create("div", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement div(StyleProps style, ReactElement child) {
        return create("div", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement div(StyleProps style, ReactElement... children) {
        return create("div", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement div(HTMLProps props) {
        return create("div", props);
    }

    static ReactElement div(HTMLProps props, String text) {
        return create("div", props, text);
    }

    static ReactElement div(HTMLProps props, ReactElement child) {
        return create("div", props, child);
    }

    static ReactElement div(HTMLProps props, ReactElement... children) {
        return create("div", props, children);
    }

    static ReactElement div(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("div", props, childrenCallback);
    }

    static ReactElement div(Func.Run1<HTMLProps> callback) {
        return create("div", callback);
    }

    static ReactElement div(Func.Run1<HTMLProps> callback, String text) {
        return create("div", callback, text);
    }

    static ReactElement div(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("div", callback, child);
    }

    static ReactElement div(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("div", callback, children);
    }

    static ReactElement div(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("div", callback, childrenCallback);
    }

    static ReactElement div(PropsAndChildren callback) {
        return create("div", callback);
    }

    static ReactElement dl() {
        return create("dl");
    }

    static ReactElement dl(String value) {
        return create("dl", value);
    }

    static ReactElement dl(ReactElement child) {
        return create("dl", child);
    }

    static ReactElement dl(ReactElement... children) {
        return create("dl", children);
    }

    static ReactElement dl(StyleProps style) {
        return create("dl", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement dl(StyleProps style, String text) {
        return create("dl", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement dl(StyleProps style, ReactElement child) {
        return create("dl", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement dl(StyleProps style, ReactElement... children) {
        return create("dl", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement dl(HTMLProps props) {
        return create("dl", props);
    }

    static ReactElement dl(HTMLProps props, String text) {
        return create("dl", props, text);
    }

    static ReactElement dl(HTMLProps props, ReactElement child) {
        return create("dl", props, child);
    }

    static ReactElement dl(HTMLProps props, ReactElement... children) {
        return create("dl", props, children);
    }

    static ReactElement dl(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("dl", props, childrenCallback);
    }

    static ReactElement dl(Func.Run1<HTMLProps> callback) {
        return create("dl", callback);
    }

    static ReactElement dl(Func.Run1<HTMLProps> callback, String text) {
        return create("dl", callback, text);
    }

    static ReactElement dl(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("dl", callback, child);
    }

    static ReactElement dl(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("dl", callback, children);
    }

    static ReactElement dl(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("dl", callback, childrenCallback);
    }

    static ReactElement dl(PropsAndChildren callback) {
        return create("dl", callback);
    }

    static ReactElement dt() {
        return create("dt");
    }

    static ReactElement dt(String value) {
        return create("dt", value);
    }

    static ReactElement dt(ReactElement child) {
        return create("dt", child);
    }

    static ReactElement dt(ReactElement... children) {
        return create("dt", children);
    }

    static ReactElement dt(StyleProps style) {
        return create("dt", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement dt(StyleProps style, String text) {
        return create("dt", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement dt(StyleProps style, ReactElement child) {
        return create("dt", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement dt(StyleProps style, ReactElement... children) {
        return create("dt", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement dt(HTMLProps props) {
        return create("dt", props);
    }

    static ReactElement dt(HTMLProps props, String text) {
        return create("dt", props, text);
    }

    static ReactElement dt(HTMLProps props, ReactElement child) {
        return create("dt", props, child);
    }

    static ReactElement dt(HTMLProps props, ReactElement... children) {
        return create("dt", props, children);
    }

    static ReactElement dt(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("dt", props, childrenCallback);
    }

    static ReactElement dt(Func.Run1<HTMLProps> callback) {
        return create("dt", callback);
    }

    static ReactElement dt(Func.Run1<HTMLProps> callback, String text) {
        return create("dt", callback, text);
    }

    static ReactElement dt(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("dt", callback, child);
    }

    static ReactElement dt(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("dt", callback, children);
    }

    static ReactElement dt(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("dt", callback, childrenCallback);
    }

    static ReactElement dt(PropsAndChildren callback) {
        return create("dt", callback);
    }

    static ReactElement em() {
        return create("em");
    }

    static ReactElement em(String value) {
        return create("em", value);
    }

    static ReactElement em(ReactElement child) {
        return create("em", child);
    }

    static ReactElement em(ReactElement... children) {
        return create("em", children);
    }

    static ReactElement em(StyleProps style) {
        return create("em", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement em(StyleProps style, String text) {
        return create("em", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement em(StyleProps style, ReactElement child) {
        return create("em", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement em(StyleProps style, ReactElement... children) {
        return create("em", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement em(HTMLProps props) {
        return create("em", props);
    }

    static ReactElement em(HTMLProps props, String text) {
        return create("em", props, text);
    }

    static ReactElement em(HTMLProps props, ReactElement child) {
        return create("em", props, child);
    }

    static ReactElement em(HTMLProps props, ReactElement... children) {
        return create("em", props, children);
    }

    static ReactElement em(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("em", props, childrenCallback);
    }

    static ReactElement em(Func.Run1<HTMLProps> callback) {
        return create("em", callback);
    }

    static ReactElement em(Func.Run1<HTMLProps> callback, String text) {
        return create("em", callback, text);
    }

    static ReactElement em(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("em", callback, child);
    }

    static ReactElement em(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("em", callback, children);
    }

    static ReactElement em(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("em", callback, childrenCallback);
    }

    static ReactElement em(PropsAndChildren callback) {
        return create("em", callback);
    }

    static ReactElement embed() {
        return create("embed");
    }

    static ReactElement embed(String value) {
        return create("embed", value);
    }

    static ReactElement embed(ReactElement child) {
        return create("embed", child);
    }

    static ReactElement embed(ReactElement... children) {
        return create("embed", children);
    }

    static ReactElement embed(StyleProps style) {
        return create("embed", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement embed(StyleProps style, String text) {
        return create("embed", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement embed(StyleProps style, ReactElement child) {
        return create("embed", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement embed(StyleProps style, ReactElement... children) {
        return create("embed", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement embed(HTMLProps props) {
        return create("embed", props);
    }

    static ReactElement embed(HTMLProps props, String text) {
        return create("embed", props, text);
    }

    static ReactElement embed(HTMLProps props, ReactElement child) {
        return create("embed", props, child);
    }

    static ReactElement embed(HTMLProps props, ReactElement... children) {
        return create("embed", props, children);
    }

    static ReactElement embed(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("embed", props, childrenCallback);
    }

    static ReactElement embed(Func.Run1<HTMLProps> callback) {
        return create("embed", callback);
    }

    static ReactElement embed(Func.Run1<HTMLProps> callback, String text) {
        return create("embed", callback, text);
    }

    static ReactElement embed(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("embed", callback, child);
    }

    static ReactElement embed(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("embed", callback, children);
    }

    static ReactElement embed(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("embed", callback, childrenCallback);
    }

    static ReactElement embed(PropsAndChildren callback) {
        return create("embed", callback);
    }

    static ReactElement fieldset() {
        return create("fieldset");
    }

    static ReactElement fieldset(String value) {
        return create("fieldset", value);
    }

    static ReactElement fieldset(ReactElement child) {
        return create("fieldset", child);
    }

    static ReactElement fieldset(ReactElement... children) {
        return create("fieldset", children);
    }

    static ReactElement fieldset(StyleProps style) {
        return create("fieldset", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement fieldset(StyleProps style, String text) {
        return create("fieldset", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement fieldset(StyleProps style, ReactElement child) {
        return create("fieldset", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement fieldset(StyleProps style, ReactElement... children) {
        return create("fieldset", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement fieldset(HTMLProps props) {
        return create("fieldset", props);
    }

    static ReactElement fieldset(HTMLProps props, String text) {
        return create("fieldset", props, text);
    }

    static ReactElement fieldset(HTMLProps props, ReactElement child) {
        return create("fieldset", props, child);
    }

    static ReactElement fieldset(HTMLProps props, ReactElement... children) {
        return create("fieldset", props, children);
    }

    static ReactElement fieldset(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("fieldset", props, childrenCallback);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps> callback) {
        return create("fieldset", callback);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps> callback, String text) {
        return create("fieldset", callback, text);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("fieldset", callback, child);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("fieldset", callback, children);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("fieldset", callback, childrenCallback);
    }

    static ReactElement fieldset(PropsAndChildren callback) {
        return create("fieldset", callback);
    }

    static ReactElement figcaption() {
        return create("figcaption");
    }

    static ReactElement figcaption(String value) {
        return create("figcaption", value);
    }

    static ReactElement figcaption(ReactElement child) {
        return create("figcaption", child);
    }

    static ReactElement figcaption(ReactElement... children) {
        return create("figcaption", children);
    }

    static ReactElement figcaption(StyleProps style) {
        return create("figcaption", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement figcaption(StyleProps style, String text) {
        return create("figcaption", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement figcaption(StyleProps style, ReactElement child) {
        return create("figcaption", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement figcaption(StyleProps style, ReactElement... children) {
        return create("figcaption", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement figcaption(HTMLProps props) {
        return create("figcaption", props);
    }

    static ReactElement figcaption(HTMLProps props, String text) {
        return create("figcaption", props, text);
    }

    static ReactElement figcaption(HTMLProps props, ReactElement child) {
        return create("figcaption", props, child);
    }

    static ReactElement figcaption(HTMLProps props, ReactElement... children) {
        return create("figcaption", props, children);
    }

    static ReactElement figcaption(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("figcaption", props, childrenCallback);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps> callback) {
        return create("figcaption", callback);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps> callback, String text) {
        return create("figcaption", callback, text);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("figcaption", callback, child);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("figcaption", callback, children);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("figcaption", callback, childrenCallback);
    }

    static ReactElement figcaption(PropsAndChildren callback) {
        return create("figcaption", callback);
    }

    static ReactElement figure() {
        return create("figure");
    }

    static ReactElement figure(String value) {
        return create("figure", value);
    }

    static ReactElement figure(ReactElement child) {
        return create("figure", child);
    }

    static ReactElement figure(ReactElement... children) {
        return create("figure", children);
    }

    static ReactElement figure(StyleProps style) {
        return create("figure", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement figure(StyleProps style, String text) {
        return create("figure", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement figure(StyleProps style, ReactElement child) {
        return create("figure", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement figure(StyleProps style, ReactElement... children) {
        return create("figure", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement figure(HTMLProps props) {
        return create("figure", props);
    }

    static ReactElement figure(HTMLProps props, String text) {
        return create("figure", props, text);
    }

    static ReactElement figure(HTMLProps props, ReactElement child) {
        return create("figure", props, child);
    }

    static ReactElement figure(HTMLProps props, ReactElement... children) {
        return create("figure", props, children);
    }

    static ReactElement figure(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("figure", props, childrenCallback);
    }

    static ReactElement figure(Func.Run1<HTMLProps> callback) {
        return create("figure", callback);
    }

    static ReactElement figure(Func.Run1<HTMLProps> callback, String text) {
        return create("figure", callback, text);
    }

    static ReactElement figure(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("figure", callback, child);
    }

    static ReactElement figure(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("figure", callback, children);
    }

    static ReactElement figure(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("figure", callback, childrenCallback);
    }

    static ReactElement figure(PropsAndChildren callback) {
        return create("figure", callback);
    }

    static ReactElement footer() {
        return create("footer");
    }

    static ReactElement footer(String value) {
        return create("footer", value);
    }

    static ReactElement footer(ReactElement child) {
        return create("footer", child);
    }

    static ReactElement footer(ReactElement... children) {
        return create("footer", children);
    }

    static ReactElement footer(StyleProps style) {
        return create("footer", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement footer(StyleProps style, String text) {
        return create("footer", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement footer(StyleProps style, ReactElement child) {
        return create("footer", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement footer(StyleProps style, ReactElement... children) {
        return create("footer", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement footer(HTMLProps props) {
        return create("footer", props);
    }

    static ReactElement footer(HTMLProps props, String text) {
        return create("footer", props, text);
    }

    static ReactElement footer(HTMLProps props, ReactElement child) {
        return create("footer", props, child);
    }

    static ReactElement footer(HTMLProps props, ReactElement... children) {
        return create("footer", props, children);
    }

    static ReactElement footer(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("footer", props, childrenCallback);
    }

    static ReactElement footer(Func.Run1<HTMLProps> callback) {
        return create("footer", callback);
    }

    static ReactElement footer(Func.Run1<HTMLProps> callback, String text) {
        return create("footer", callback, text);
    }

    static ReactElement footer(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("footer", callback, child);
    }

    static ReactElement footer(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("footer", callback, children);
    }

    static ReactElement footer(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("footer", callback, childrenCallback);
    }

    static ReactElement footer(PropsAndChildren callback) {
        return create("footer", callback);
    }

    static ReactElement form() {
        return create("form");
    }

    static ReactElement form(String value) {
        return create("form", value);
    }

    static ReactElement form(ReactElement child) {
        return create("form", child);
    }

    static ReactElement form(ReactElement... children) {
        return create("form", children);
    }

    static ReactElement form(StyleProps style) {
        return create("form", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement form(StyleProps style, String text) {
        return create("form", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement form(StyleProps style, ReactElement child) {
        return create("form", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement form(StyleProps style, ReactElement... children) {
        return create("form", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement form(HTMLProps props) {
        return create("form", props);
    }

    static ReactElement form(HTMLProps props, String text) {
        return create("form", props, text);
    }

    static ReactElement form(HTMLProps props, ReactElement child) {
        return create("form", props, child);
    }

    static ReactElement form(HTMLProps props, ReactElement... children) {
        return create("form", props, children);
    }

    static ReactElement form(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("form", props, childrenCallback);
    }

    static ReactElement form(Func.Run1<HTMLProps> callback) {
        return create("form", callback);
    }

    static ReactElement form(Func.Run1<HTMLProps> callback, String text) {
        return create("form", callback, text);
    }

    static ReactElement form(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("form", callback, child);
    }

    static ReactElement form(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("form", callback, children);
    }

    static ReactElement form(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("form", callback, childrenCallback);
    }

    static ReactElement form(PropsAndChildren callback) {
        return create("form", callback);
    }

    static ReactElement g() {
        return create("g");
    }

    static ReactElement g(String value) {
        return create("g", value);
    }

    static ReactElement g(ReactElement child) {
        return create("g", child);
    }

    static ReactElement g(ReactElement... children) {
        return create("g", children);
    }

    static ReactElement g(StyleProps style) {
        return create("g", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement g(StyleProps style, String text) {
        return create("g", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement g(StyleProps style, ReactElement child) {
        return create("g", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement g(StyleProps style, ReactElement... children) {
        return create("g", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement g(HTMLProps props) {
        return create("g", props);
    }

    static ReactElement g(HTMLProps props, String text) {
        return create("g", props, text);
    }

    static ReactElement g(HTMLProps props, ReactElement child) {
        return create("g", props, child);
    }

    static ReactElement g(HTMLProps props, ReactElement... children) {
        return create("g", props, children);
    }

    static ReactElement g(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("g", props, childrenCallback);
    }

    static ReactElement g(Func.Run1<HTMLProps> callback) {
        return create("g", callback);
    }

    static ReactElement g(Func.Run1<HTMLProps> callback, String text) {
        return create("g", callback, text);
    }

    static ReactElement g(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("g", callback, child);
    }

    static ReactElement g(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("g", callback, children);
    }

    static ReactElement g(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("g", callback, childrenCallback);
    }

    static ReactElement g(PropsAndChildren callback) {
        return create("g", callback);
    }
    
    static ReactElement h1() {
        return create("h1");
    }

    static ReactElement h1(String value) {
        return create("h1", value);
    }

    static ReactElement h1(ReactElement child) {
        return create("h1", child);
    }

    static ReactElement h1(ReactElement... children) {
        return create("h1", children);
    }

    static ReactElement h1(StyleProps style) {
        return create("h1", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement h1(StyleProps style, String text) {
        return create("h1", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement h1(StyleProps style, ReactElement child) {
        return create("h1", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement h1(StyleProps style, ReactElement... children) {
        return create("h1", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement h1(HTMLProps props) {
        return create("h1", props);
    }

    static ReactElement h1(HTMLProps props, String text) {
        return create("h1", props, text);
    }

    static ReactElement h1(HTMLProps props, ReactElement child) {
        return create("h1", props, child);
    }

    static ReactElement h1(HTMLProps props, ReactElement... children) {
        return create("h1", props, children);
    }

    static ReactElement h1(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("h1", props, childrenCallback);
    }

    static ReactElement h1(Func.Run1<HTMLProps> callback) {
        return create("h1", callback);
    }

    static ReactElement h1(Func.Run1<HTMLProps> callback, String text) {
        return create("h1", callback, text);
    }

    static ReactElement h1(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("h1", callback, child);
    }

    static ReactElement h1(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("h1", callback, children);
    }

    static ReactElement h1(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("h1", callback, childrenCallback);
    }

    static ReactElement h1(PropsAndChildren callback) {
        return create("h1", callback);
    }

    static ReactElement h2() {
        return create("h2");
    }

    static ReactElement h2(String value) {
        return create("h2", value);
    }

    static ReactElement h2(ReactElement child) {
        return create("h2", child);
    }

    static ReactElement h2(ReactElement... children) {
        return create("h2", children);
    }

    static ReactElement h2(StyleProps style) {
        return create("h2", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement h2(StyleProps style, String text) {
        return create("h2", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement h2(StyleProps style, ReactElement child) {
        return create("h2", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement h2(StyleProps style, ReactElement... children) {
        return create("h2", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement h2(HTMLProps props) {
        return create("h2", props);
    }

    static ReactElement h2(HTMLProps props, String text) {
        return create("h2", props, text);
    }

    static ReactElement h2(HTMLProps props, ReactElement child) {
        return create("h2", props, child);
    }

    static ReactElement h2(HTMLProps props, ReactElement... children) {
        return create("h2", props, children);
    }

    static ReactElement h2(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("h2", props, childrenCallback);
    }

    static ReactElement h2(Func.Run1<HTMLProps> callback) {
        return create("h2", callback);
    }

    static ReactElement h2(Func.Run1<HTMLProps> callback, String text) {
        return create("h2", callback, text);
    }

    static ReactElement h2(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("h2", callback, child);
    }

    static ReactElement h2(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("h2", callback, children);
    }

    static ReactElement h2(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("h2", callback, childrenCallback);
    }

    static ReactElement h2(PropsAndChildren callback) {
        return create("h2", callback);
    }

    static ReactElement h3() {
        return create("h3");
    }

    static ReactElement h3(String value) {
        return create("h3", value);
    }

    static ReactElement h3(ReactElement child) {
        return create("h3", child);
    }

    static ReactElement h3(ReactElement... children) {
        return create("h3", children);
    }

    static ReactElement h3(StyleProps style) {
        return create("h3", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement h3(StyleProps style, String text) {
        return create("h3", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement h3(StyleProps style, ReactElement child) {
        return create("h3", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement h3(StyleProps style, ReactElement... children) {
        return create("h3", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement h3(HTMLProps props) {
        return create("h3", props);
    }

    static ReactElement h3(HTMLProps props, String text) {
        return create("h3", props, text);
    }

    static ReactElement h3(HTMLProps props, ReactElement child) {
        return create("h3", props, child);
    }

    static ReactElement h3(HTMLProps props, ReactElement... children) {
        return create("h3", props, children);
    }

    static ReactElement h3(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("h3", props, childrenCallback);
    }

    static ReactElement h3(Func.Run1<HTMLProps> callback) {
        return create("h3", callback);
    }

    static ReactElement h3(Func.Run1<HTMLProps> callback, String text) {
        return create("h3", callback, text);
    }

    static ReactElement h3(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("h3", callback, child);
    }

    static ReactElement h3(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("h3", callback, children);
    }

    static ReactElement h3(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("h3", callback, childrenCallback);
    }

    static ReactElement h3(PropsAndChildren callback) {
        return create("h3", callback);
    }

    static ReactElement h4() {
        return create("h4");
    }

    static ReactElement h4(String value) {
        return create("h4", value);
    }

    static ReactElement h4(ReactElement child) {
        return create("h4", child);
    }

    static ReactElement h4(ReactElement... children) {
        return create("h4", children);
    }

    static ReactElement h4(StyleProps style) {
        return create("h4", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement h4(StyleProps style, String text) {
        return create("h4", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement h4(StyleProps style, ReactElement child) {
        return create("h4", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement h4(StyleProps style, ReactElement... children) {
        return create("h4", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement h4(HTMLProps props) {
        return create("h4", props);
    }

    static ReactElement h4(HTMLProps props, String text) {
        return create("h4", props, text);
    }

    static ReactElement h4(HTMLProps props, ReactElement child) {
        return create("h4", props, child);
    }

    static ReactElement h4(HTMLProps props, ReactElement... children) {
        return create("h4", props, children);
    }

    static ReactElement h4(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("h4", props, childrenCallback);
    }

    static ReactElement h4(Func.Run1<HTMLProps> callback) {
        return create("h4", callback);
    }

    static ReactElement h4(Func.Run1<HTMLProps> callback, String text) {
        return create("h4", callback, text);
    }

    static ReactElement h4(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("h4", callback, child);
    }

    static ReactElement h4(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("h4", callback, children);
    }

    static ReactElement h4(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("h4", callback, childrenCallback);
    }

    static ReactElement h4(PropsAndChildren callback) {
        return create("h4", callback);
    }

    static ReactElement h5() {
        return create("h5");
    }

    static ReactElement h5(String value) {
        return create("h5", value);
    }

    static ReactElement h5(ReactElement child) {
        return create("h5", child);
    }

    static ReactElement h5(ReactElement... children) {
        return create("h5", children);
    }

    static ReactElement h5(StyleProps style) {
        return create("h5", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement h5(StyleProps style, String text) {
        return create("h5", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement h5(StyleProps style, ReactElement child) {
        return create("h5", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement h5(StyleProps style, ReactElement... children) {
        return create("h5", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement h5(HTMLProps props) {
        return create("h5", props);
    }

    static ReactElement h5(HTMLProps props, String text) {
        return create("h5", props, text);
    }

    static ReactElement h5(HTMLProps props, ReactElement child) {
        return create("h5", props, child);
    }

    static ReactElement h5(HTMLProps props, ReactElement... children) {
        return create("h5", props, children);
    }

    static ReactElement h5(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("h5", props, childrenCallback);
    }

    static ReactElement h5(Func.Run1<HTMLProps> callback) {
        return create("h5", callback);
    }

    static ReactElement h5(Func.Run1<HTMLProps> callback, String text) {
        return create("h5", callback, text);
    }

    static ReactElement h5(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("h5", callback, child);
    }

    static ReactElement h5(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("h5", callback, children);
    }

    static ReactElement h5(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("h5", callback, childrenCallback);
    }

    static ReactElement h5(PropsAndChildren callback) {
        return create("h5", callback);
    }

    static ReactElement h6() {
        return create("h6");
    }

    static ReactElement h6(String value) {
        return create("h6", value);
    }

    static ReactElement h6(ReactElement child) {
        return create("h6", child);
    }

    static ReactElement h6(ReactElement... children) {
        return create("h6", children);
    }

    static ReactElement h6(StyleProps style) {
        return create("h6", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement h6(StyleProps style, String text) {
        return create("h6", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement h6(StyleProps style, ReactElement child) {
        return create("h6", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement h6(StyleProps style, ReactElement... children) {
        return create("h6", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement h6(HTMLProps props) {
        return create("h6", props);
    }

    static ReactElement h6(HTMLProps props, String text) {
        return create("h6", props, text);
    }

    static ReactElement h6(HTMLProps props, ReactElement child) {
        return create("h6", props, child);
    }

    static ReactElement h6(HTMLProps props, ReactElement... children) {
        return create("h6", props, children);
    }

    static ReactElement h6(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("h6", props, childrenCallback);
    }

    static ReactElement h6(Func.Run1<HTMLProps> callback) {
        return create("h6", callback);
    }

    static ReactElement h6(Func.Run1<HTMLProps> callback, String text) {
        return create("h6", callback, text);
    }

    static ReactElement h6(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("h6", callback, child);
    }

    static ReactElement h6(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("h6", callback, children);
    }

    static ReactElement h6(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("h6", callback, childrenCallback);
    }

    static ReactElement h6(PropsAndChildren callback) {
        return create("h6", callback);
    }

    static ReactElement head() {
        return create("head");
    }

    static ReactElement head(String value) {
        return create("head", value);
    }

    static ReactElement head(ReactElement child) {
        return create("head", child);
    }

    static ReactElement head(ReactElement... children) {
        return create("head", children);
    }

    static ReactElement head(StyleProps style) {
        return create("head", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement head(StyleProps style, String text) {
        return create("head", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement head(StyleProps style, ReactElement child) {
        return create("head", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement head(StyleProps style, ReactElement... children) {
        return create("head", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement head(HTMLProps props) {
        return create("head", props);
    }

    static ReactElement head(HTMLProps props, String text) {
        return create("head", props, text);
    }

    static ReactElement head(HTMLProps props, ReactElement child) {
        return create("head", props, child);
    }

    static ReactElement head(HTMLProps props, ReactElement... children) {
        return create("head", props, children);
    }

    static ReactElement head(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("head", props, childrenCallback);
    }

    static ReactElement head(Func.Run1<HTMLProps> callback) {
        return create("head", callback);
    }

    static ReactElement head(Func.Run1<HTMLProps> callback, String text) {
        return create("head", callback, text);
    }

    static ReactElement head(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("head", callback, child);
    }

    static ReactElement head(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("head", callback, children);
    }

    static ReactElement head(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("head", callback, childrenCallback);
    }

    static ReactElement head(PropsAndChildren callback) {
        return create("head", callback);
    }

    static ReactElement header() {
        return create("header");
    }

    static ReactElement header(String value) {
        return create("header", value);
    }

    static ReactElement header(ReactElement child) {
        return create("header", child);
    }

    static ReactElement header(ReactElement... children) {
        return create("header", children);
    }

    static ReactElement header(StyleProps style) {
        return create("header", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement header(StyleProps style, String text) {
        return create("header", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement header(StyleProps style, ReactElement child) {
        return create("header", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement header(StyleProps style, ReactElement... children) {
        return create("header", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement header(HTMLProps props) {
        return create("header", props);
    }

    static ReactElement header(HTMLProps props, String text) {
        return create("header", props, text);
    }

    static ReactElement header(HTMLProps props, ReactElement child) {
        return create("header", props, child);
    }

    static ReactElement header(HTMLProps props, ReactElement... children) {
        return create("header", props, children);
    }

    static ReactElement header(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("header", props, childrenCallback);
    }

    static ReactElement header(Func.Run1<HTMLProps> callback) {
        return create("header", callback);
    }

    static ReactElement header(Func.Run1<HTMLProps> callback, String text) {
        return create("header", callback, text);
    }

    static ReactElement header(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("header", callback, child);
    }

    static ReactElement header(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("header", callback, children);
    }

    static ReactElement header(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("header", callback, childrenCallback);
    }

    static ReactElement header(PropsAndChildren callback) {
        return create("header", callback);
    }

    static ReactElement hr() {
        return create("hr");
    }

    static ReactElement hr(String value) {
        return create("hr", value);
    }

    static ReactElement hr(ReactElement child) {
        return create("hr", child);
    }

    static ReactElement hr(ReactElement... children) {
        return create("hr", children);
    }

    static ReactElement hr(StyleProps style) {
        return create("hr", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement hr(StyleProps style, String text) {
        return create("hr", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement hr(StyleProps style, ReactElement child) {
        return create("hr", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement hr(StyleProps style, ReactElement... children) {
        return create("hr", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement hr(HTMLProps props) {
        return create("hr", props);
    }

    static ReactElement hr(HTMLProps props, String text) {
        return create("hr", props, text);
    }

    static ReactElement hr(HTMLProps props, ReactElement child) {
        return create("hr", props, child);
    }

    static ReactElement hr(HTMLProps props, ReactElement... children) {
        return create("hr", props, children);
    }

    static ReactElement hr(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("hr", props, childrenCallback);
    }

    static ReactElement hr(Func.Run1<HTMLProps> callback) {
        return create("hr", callback);
    }

    static ReactElement hr(Func.Run1<HTMLProps> callback, String text) {
        return create("hr", callback, text);
    }

    static ReactElement hr(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("hr", callback, child);
    }

    static ReactElement hr(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("hr", callback, children);
    }

    static ReactElement hr(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("hr", callback, childrenCallback);
    }

    static ReactElement hr(PropsAndChildren callback) {
        return create("hr", callback);
    }

    static ReactElement html() {
        return create("html");
    }

    static ReactElement html(String value) {
        return create("html", value);
    }

    static ReactElement html(ReactElement child) {
        return create("html", child);
    }

    static ReactElement html(ReactElement... children) {
        return create("html", children);
    }

    static ReactElement html(StyleProps style) {
        return create("html", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement html(StyleProps style, String text) {
        return create("html", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement html(StyleProps style, ReactElement child) {
        return create("html", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement html(StyleProps style, ReactElement... children) {
        return create("html", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement html(HTMLProps props) {
        return create("html", props);
    }

    static ReactElement html(HTMLProps props, String text) {
        return create("html", props, text);
    }

    static ReactElement html(HTMLProps props, ReactElement child) {
        return create("html", props, child);
    }

    static ReactElement html(HTMLProps props, ReactElement... children) {
        return create("html", props, children);
    }

    static ReactElement html(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("html", props, childrenCallback);
    }

    static ReactElement html(Func.Run1<HTMLProps> callback) {
        return create("html", callback);
    }

    static ReactElement html(Func.Run1<HTMLProps> callback, String text) {
        return create("html", callback, text);
    }

    static ReactElement html(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("html", callback, child);
    }

    static ReactElement html(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("html", callback, children);
    }

    static ReactElement html(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("html", callback, childrenCallback);
    }

    static ReactElement html(PropsAndChildren callback) {
        return create("html", callback);
    }

    static ReactElement i() {
        return create("i");
    }

    static ReactElement i(String value) {
        return create("i", value);
    }

    static ReactElement i(ReactElement child) {
        return create("i", child);
    }

    static ReactElement i(ReactElement... children) {
        return create("i", children);
    }

    static ReactElement i(StyleProps style) {
        return create("i", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement i(StyleProps style, String text) {
        return create("i", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement i(StyleProps style, ReactElement child) {
        return create("i", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement i(StyleProps style, ReactElement... children) {
        return create("i", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement i(HTMLProps props) {
        return create("i", props);
    }

    static ReactElement i(HTMLProps props, String text) {
        return create("i", props, text);
    }

    static ReactElement i(HTMLProps props, ReactElement child) {
        return create("i", props, child);
    }

    static ReactElement i(HTMLProps props, ReactElement... children) {
        return create("i", props, children);
    }

    static ReactElement i(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("i", props, childrenCallback);
    }

    static ReactElement i(Func.Run1<HTMLProps> callback) {
        return create("i", callback);
    }

    static ReactElement i(Func.Run1<HTMLProps> callback, String text) {
        return create("i", callback, text);
    }

    static ReactElement i(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("i", callback, child);
    }

    static ReactElement i(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("i", callback, children);
    }

    static ReactElement i(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("i", callback, childrenCallback);
    }

    static ReactElement i(PropsAndChildren callback) {
        return create("i", callback);
    }

    static ReactElement iframe() {
        return create("iframe");
    }

    static ReactElement iframe(String value) {
        return create("iframe", value);
    }

    static ReactElement iframe(ReactElement child) {
        return create("iframe", child);
    }

    static ReactElement iframe(ReactElement... children) {
        return create("iframe", children);
    }

    static ReactElement iframe(StyleProps style) {
        return create("iframe", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement iframe(StyleProps style, String text) {
        return create("iframe", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement iframe(StyleProps style, ReactElement child) {
        return create("iframe", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement iframe(StyleProps style, ReactElement... children) {
        return create("iframe", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement iframe(HTMLProps props) {
        return create("iframe", props);
    }

    static ReactElement iframe(HTMLProps props, String text) {
        return create("iframe", props, text);
    }

    static ReactElement iframe(HTMLProps props, ReactElement child) {
        return create("iframe", props, child);
    }

    static ReactElement iframe(HTMLProps props, ReactElement... children) {
        return create("iframe", props, children);
    }

    static ReactElement iframe(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("iframe", props, childrenCallback);
    }

    static ReactElement iframe(Func.Run1<HTMLProps> callback) {
        return create("iframe", callback);
    }

    static ReactElement iframe(Func.Run1<HTMLProps> callback, String text) {
        return create("iframe", callback, text);
    }

    static ReactElement iframe(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("iframe", callback, child);
    }

    static ReactElement iframe(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("iframe", callback, children);
    }

    static ReactElement iframe(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("iframe", callback, childrenCallback);
    }

    static ReactElement iframe(PropsAndChildren callback) {
        return create("iframe", callback);
    }

    static ReactElement img() {
        return create("img");
    }

    static ReactElement img(String value) {
        return create("img", value);
    }

    static ReactElement img(ReactElement child) {
        return create("img", child);
    }

    static ReactElement img(ReactElement... children) {
        return create("img", children);
    }

    static ReactElement img(StyleProps style) {
        return create("img", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement img(StyleProps style, String text) {
        return create("img", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement img(StyleProps style, ReactElement child) {
        return create("img", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement img(StyleProps style, ReactElement... children) {
        return create("img", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement img(HTMLProps props) {
        return create("img", props);
    }

    static ReactElement img(HTMLProps props, String text) {
        return create("img", props, text);
    }

    static ReactElement img(HTMLProps props, ReactElement child) {
        return create("img", props, child);
    }

    static ReactElement img(HTMLProps props, ReactElement... children) {
        return create("img", props, children);
    }

    static ReactElement img(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("img", props, childrenCallback);
    }

    static ReactElement img(Func.Run1<HTMLProps> callback) {
        return create("img", callback);
    }

    static ReactElement img(Func.Run1<HTMLProps> callback, String text) {
        return create("img", callback, text);
    }

    static ReactElement img(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("img", callback, child);
    }

    static ReactElement img(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("img", callback, children);
    }

    static ReactElement img(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("img", callback, childrenCallback);
    }

    static ReactElement img(PropsAndChildren callback) {
        return create("img", callback);
    }

    static ReactElement input() {
        return create("input");
    }

    static ReactElement input(String value) {
        return create("input", value);
    }

    static ReactElement input(ReactElement child) {
        return create("input", child);
    }

    static ReactElement input(ReactElement... children) {
        return create("input", children);
    }

    static ReactElement input(StyleProps style) {
        return create("input", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement input(StyleProps style, String text) {
        return create("input", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement input(StyleProps style, ReactElement child) {
        return create("input", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement input(StyleProps style, ReactElement... children) {
        return create("input", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement input(HTMLProps props) {
        return create("input", props);
    }

    static ReactElement input(HTMLProps props, String text) {
        return create("input", props, text);
    }

    static ReactElement input(HTMLProps props, ReactElement child) {
        return create("input", props, child);
    }

    static ReactElement input(HTMLProps props, ReactElement... children) {
        return create("input", props, children);
    }

    static ReactElement input(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("input", props, childrenCallback);
    }

    static ReactElement input(Func.Run1<HTMLProps> callback) {
        return create("input", callback);
    }

    static ReactElement input(Func.Run1<HTMLProps> callback, String text) {
        return create("input", callback, text);
    }

    static ReactElement input(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("input", callback, child);
    }

    static ReactElement input(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("input", callback, children);
    }

    static ReactElement input(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("input", callback, childrenCallback);
    }

    static ReactElement input(PropsAndChildren callback) {
        return create("input", callback);
    }

    static ReactElement ins() {
        return create("ins");
    }

    static ReactElement ins(String value) {
        return create("ins", value);
    }

    static ReactElement ins(ReactElement child) {
        return create("ins", child);
    }

    static ReactElement ins(ReactElement... children) {
        return create("ins", children);
    }

    static ReactElement ins(StyleProps style) {
        return create("ins", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement ins(StyleProps style, String text) {
        return create("ins", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement ins(StyleProps style, ReactElement child) {
        return create("ins", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement ins(StyleProps style, ReactElement... children) {
        return create("ins", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement ins(HTMLProps props) {
        return create("ins", props);
    }

    static ReactElement ins(HTMLProps props, String text) {
        return create("ins", props, text);
    }

    static ReactElement ins(HTMLProps props, ReactElement child) {
        return create("ins", props, child);
    }

    static ReactElement ins(HTMLProps props, ReactElement... children) {
        return create("ins", props, children);
    }

    static ReactElement ins(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("ins", props, childrenCallback);
    }

    static ReactElement ins(Func.Run1<HTMLProps> callback) {
        return create("ins", callback);
    }

    static ReactElement ins(Func.Run1<HTMLProps> callback, String text) {
        return create("ins", callback, text);
    }

    static ReactElement ins(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("ins", callback, child);
    }

    static ReactElement ins(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("ins", callback, children);
    }

    static ReactElement ins(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("ins", callback, childrenCallback);
    }

    static ReactElement ins(PropsAndChildren callback) {
        return create("ins", callback);
    }

    static ReactElement kbd() {
        return create("kbd");
    }

    static ReactElement kbd(String value) {
        return create("kbd", value);
    }

    static ReactElement kbd(ReactElement child) {
        return create("kbd", child);
    }

    static ReactElement kbd(ReactElement... children) {
        return create("kbd", children);
    }

    static ReactElement kbd(StyleProps style) {
        return create("kbd", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement kbd(StyleProps style, String text) {
        return create("kbd", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement kbd(StyleProps style, ReactElement child) {
        return create("kbd", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement kbd(StyleProps style, ReactElement... children) {
        return create("kbd", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement kbd(HTMLProps props) {
        return create("kbd", props);
    }

    static ReactElement kbd(HTMLProps props, String text) {
        return create("kbd", props, text);
    }

    static ReactElement kbd(HTMLProps props, ReactElement child) {
        return create("kbd", props, child);
    }

    static ReactElement kbd(HTMLProps props, ReactElement... children) {
        return create("kbd", props, children);
    }

    static ReactElement kbd(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("kbd", props, childrenCallback);
    }

    static ReactElement kbd(Func.Run1<HTMLProps> callback) {
        return create("kbd", callback);
    }

    static ReactElement kbd(Func.Run1<HTMLProps> callback, String text) {
        return create("kbd", callback, text);
    }

    static ReactElement kbd(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("kbd", callback, child);
    }

    static ReactElement kbd(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("kbd", callback, children);
    }

    static ReactElement kbd(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("kbd", callback, childrenCallback);
    }

    static ReactElement kbd(PropsAndChildren callback) {
        return create("kbd", callback);
    }

    static ReactElement keygen() {
        return create("keygen");
    }

    static ReactElement keygen(String value) {
        return create("keygen", value);
    }

    static ReactElement keygen(ReactElement child) {
        return create("keygen", child);
    }

    static ReactElement keygen(ReactElement... children) {
        return create("keygen", children);
    }

    static ReactElement keygen(StyleProps style) {
        return create("keygen", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement keygen(StyleProps style, String text) {
        return create("keygen", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement keygen(StyleProps style, ReactElement child) {
        return create("keygen", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement keygen(StyleProps style, ReactElement... children) {
        return create("keygen", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement keygen(HTMLProps props) {
        return create("keygen", props);
    }

    static ReactElement keygen(HTMLProps props, String text) {
        return create("keygen", props, text);
    }

    static ReactElement keygen(HTMLProps props, ReactElement child) {
        return create("keygen", props, child);
    }

    static ReactElement keygen(HTMLProps props, ReactElement... children) {
        return create("keygen", props, children);
    }

    static ReactElement keygen(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("keygen", props, childrenCallback);
    }

    static ReactElement keygen(Func.Run1<HTMLProps> callback) {
        return create("keygen", callback);
    }

    static ReactElement keygen(Func.Run1<HTMLProps> callback, String text) {
        return create("keygen", callback, text);
    }

    static ReactElement keygen(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("keygen", callback, child);
    }

    static ReactElement keygen(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("keygen", callback, children);
    }

    static ReactElement keygen(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("keygen", callback, childrenCallback);
    }

    static ReactElement keygen(PropsAndChildren callback) {
        return create("keygen", callback);
    }

    static ReactElement label() {
        return create("label");
    }

    static ReactElement label(String value) {
        return create("label", value);
    }

    static ReactElement label(ReactElement child) {
        return create("label", child);
    }

    static ReactElement label(ReactElement... children) {
        return create("label", children);
    }

    static ReactElement label(StyleProps style) {
        return create("label", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement label(StyleProps style, String text) {
        return create("label", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement label(StyleProps style, ReactElement child) {
        return create("label", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement label(StyleProps style, ReactElement... children) {
        return create("label", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement label(HTMLProps props) {
        return create("label", props);
    }

    static ReactElement label(HTMLProps props, String text) {
        return create("label", props, text);
    }

    static ReactElement label(HTMLProps props, ReactElement child) {
        return create("label", props, child);
    }

    static ReactElement label(HTMLProps props, ReactElement... children) {
        return create("label", props, children);
    }

    static ReactElement label(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("label", props, childrenCallback);
    }

    static ReactElement label(Func.Run1<HTMLProps> callback) {
        return create("label", callback);
    }

    static ReactElement label(Func.Run1<HTMLProps> callback, String text) {
        return create("label", callback, text);
    }

    static ReactElement label(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("label", callback, child);
    }

    static ReactElement label(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("label", callback, children);
    }

    static ReactElement label(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("label", callback, childrenCallback);
    }

    static ReactElement label(PropsAndChildren callback) {
        return create("label", callback);
    }

    static ReactElement legend() {
        return create("legend");
    }

    static ReactElement legend(String value) {
        return create("legend", value);
    }

    static ReactElement legend(ReactElement child) {
        return create("legend", child);
    }

    static ReactElement legend(ReactElement... children) {
        return create("legend", children);
    }

    static ReactElement legend(StyleProps style) {
        return create("legend", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement legend(StyleProps style, String text) {
        return create("legend", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement legend(StyleProps style, ReactElement child) {
        return create("legend", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement legend(StyleProps style, ReactElement... children) {
        return create("legend", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement legend(HTMLProps props) {
        return create("legend", props);
    }

    static ReactElement legend(HTMLProps props, String text) {
        return create("legend", props, text);
    }

    static ReactElement legend(HTMLProps props, ReactElement child) {
        return create("legend", props, child);
    }

    static ReactElement legend(HTMLProps props, ReactElement... children) {
        return create("legend", props, children);
    }

    static ReactElement legend(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("legend", props, childrenCallback);
    }

    static ReactElement legend(Func.Run1<HTMLProps> callback) {
        return create("legend", callback);
    }

    static ReactElement legend(Func.Run1<HTMLProps> callback, String text) {
        return create("legend", callback, text);
    }

    static ReactElement legend(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("legend", callback, child);
    }

    static ReactElement legend(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("legend", callback, children);
    }

    static ReactElement legend(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("legend", callback, childrenCallback);
    }

    static ReactElement legend(PropsAndChildren callback) {
        return create("legend", callback);
    }

    static ReactElement li() {
        return create("li");
    }

    static ReactElement li(String value) {
        return create("li", value);
    }

    static ReactElement li(ReactElement child) {
        return create("li", child);
    }

    static ReactElement li(ReactElement... children) {
        return create("li", children);
    }

    static ReactElement li(StyleProps style) {
        return create("li", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement li(StyleProps style, String text) {
        return create("li", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement li(StyleProps style, ReactElement child) {
        return create("li", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement li(StyleProps style, ReactElement... children) {
        return create("li", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement li(HTMLProps props) {
        return create("li", props);
    }

    static ReactElement li(HTMLProps props, String text) {
        return create("li", props, text);
    }

    static ReactElement li(HTMLProps props, ReactElement child) {
        return create("li", props, child);
    }

    static ReactElement li(HTMLProps props, ReactElement... children) {
        return create("li", props, children);
    }

    static ReactElement li(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("li", props, childrenCallback);
    }

    static ReactElement li(Func.Run1<HTMLProps> callback) {
        return create("li", callback);
    }

    static ReactElement li(Func.Run1<HTMLProps> callback, String text) {
        return create("li", callback, text);
    }

    static ReactElement li(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("li", callback, child);
    }

    static ReactElement li(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("li", callback, children);
    }

    static ReactElement li(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("li", callback, childrenCallback);
    }

    static ReactElement li(PropsAndChildren callback) {
        return create("li", callback);
    }

    static ReactElement link() {
        return create("link");
    }

    static ReactElement link(String value) {
        return create("link", value);
    }

    static ReactElement link(ReactElement child) {
        return create("link", child);
    }

    static ReactElement link(ReactElement... children) {
        return create("link", children);
    }

    static ReactElement link(StyleProps style) {
        return create("link", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement link(StyleProps style, String text) {
        return create("link", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement link(StyleProps style, ReactElement child) {
        return create("link", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement link(StyleProps style, ReactElement... children) {
        return create("link", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement link(HTMLProps props) {
        return create("link", props);
    }

    static ReactElement link(HTMLProps props, String text) {
        return create("link", props, text);
    }

    static ReactElement link(HTMLProps props, ReactElement child) {
        return create("link", props, child);
    }

    static ReactElement link(HTMLProps props, ReactElement... children) {
        return create("link", props, children);
    }

    static ReactElement link(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("link", props, childrenCallback);
    }

    static ReactElement link(Func.Run1<HTMLProps> callback) {
        return create("link", callback);
    }

    static ReactElement link(Func.Run1<HTMLProps> callback, String text) {
        return create("link", callback, text);
    }

    static ReactElement link(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("link", callback, child);
    }

    static ReactElement link(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("link", callback, children);
    }

    static ReactElement link(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("link", callback, childrenCallback);
    }

    static ReactElement link(PropsAndChildren callback) {
        return create("link", callback);
    }

    static ReactElement main() {
        return create("main");
    }

    static ReactElement main(String value) {
        return create("main", value);
    }

    static ReactElement main(ReactElement child) {
        return create("main", child);
    }

    static ReactElement main(ReactElement... children) {
        return create("main", children);
    }

    static ReactElement main(StyleProps style) {
        return create("main", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement main(StyleProps style, String text) {
        return create("main", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement main(StyleProps style, ReactElement child) {
        return create("main", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement main(StyleProps style, ReactElement... children) {
        return create("main", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement main(HTMLProps props) {
        return create("main", props);
    }

    static ReactElement main(HTMLProps props, String text) {
        return create("main", props, text);
    }

    static ReactElement main(HTMLProps props, ReactElement child) {
        return create("main", props, child);
    }

    static ReactElement main(HTMLProps props, ReactElement... children) {
        return create("main", props, children);
    }

    static ReactElement main(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("main", props, childrenCallback);
    }

    static ReactElement main(Func.Run1<HTMLProps> callback) {
        return create("main", callback);
    }

    static ReactElement main(Func.Run1<HTMLProps> callback, String text) {
        return create("main", callback, text);
    }

    static ReactElement main(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("main", callback, child);
    }

    static ReactElement main(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("main", callback, children);
    }

    static ReactElement main(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("main", callback, childrenCallback);
    }

    static ReactElement main(PropsAndChildren callback) {
        return create("main", callback);
    }

    static ReactElement map() {
        return create("map");
    }

    static ReactElement map(String value) {
        return create("map", value);
    }

    static ReactElement map(ReactElement child) {
        return create("map", child);
    }

    static ReactElement map(ReactElement... children) {
        return create("map", children);
    }

    static ReactElement map(StyleProps style) {
        return create("map", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement map(StyleProps style, String text) {
        return create("map", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement map(StyleProps style, ReactElement child) {
        return create("map", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement map(StyleProps style, ReactElement... children) {
        return create("map", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement map(HTMLProps props) {
        return create("map", props);
    }

    static ReactElement map(HTMLProps props, String text) {
        return create("map", props, text);
    }

    static ReactElement map(HTMLProps props, ReactElement child) {
        return create("map", props, child);
    }

    static ReactElement map(HTMLProps props, ReactElement... children) {
        return create("map", props, children);
    }

    static ReactElement map(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("map", props, childrenCallback);
    }

    static ReactElement map(Func.Run1<HTMLProps> callback) {
        return create("map", callback);
    }

    static ReactElement map(Func.Run1<HTMLProps> callback, String text) {
        return create("map", callback, text);
    }

    static ReactElement map(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("map", callback, child);
    }

    static ReactElement map(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("map", callback, children);
    }

    static ReactElement map(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("map", callback, childrenCallback);
    }

    static ReactElement map(PropsAndChildren callback) {
        return create("map", callback);
    }

    static ReactElement mark() {
        return create("mark");
    }

    static ReactElement mark(String value) {
        return create("mark", value);
    }

    static ReactElement mark(ReactElement child) {
        return create("mark", child);
    }

    static ReactElement mark(ReactElement... children) {
        return create("mark", children);
    }

    static ReactElement mark(StyleProps style) {
        return create("mark", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement mark(StyleProps style, String text) {
        return create("mark", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement mark(StyleProps style, ReactElement child) {
        return create("mark", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement mark(StyleProps style, ReactElement... children) {
        return create("mark", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement mark(HTMLProps props) {
        return create("mark", props);
    }

    static ReactElement mark(HTMLProps props, String text) {
        return create("mark", props, text);
    }

    static ReactElement mark(HTMLProps props, ReactElement child) {
        return create("mark", props, child);
    }

    static ReactElement mark(HTMLProps props, ReactElement... children) {
        return create("mark", props, children);
    }

    static ReactElement mark(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("mark", props, childrenCallback);
    }

    static ReactElement mark(Func.Run1<HTMLProps> callback) {
        return create("mark", callback);
    }

    static ReactElement mark(Func.Run1<HTMLProps> callback, String text) {
        return create("mark", callback, text);
    }

    static ReactElement mark(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("mark", callback, child);
    }

    static ReactElement mark(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("mark", callback, children);
    }

    static ReactElement mark(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("mark", callback, childrenCallback);
    }

    static ReactElement mark(PropsAndChildren callback) {
        return create("mark", callback);
    }

    static ReactElement mask() {
        return create("mask");
    }

    static ReactElement mask(String value) {
        return create("mask", value);
    }

    static ReactElement mask(ReactElement child) {
        return create("mask", child);
    }

    static ReactElement mask(ReactElement... children) {
        return create("mask", children);
    }

    static ReactElement mask(StyleProps style) {
        return create("mask", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement mask(StyleProps style, String text) {
        return create("mask", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement mask(StyleProps style, ReactElement child) {
        return create("mask", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement mask(StyleProps style, ReactElement... children) {
        return create("mask", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement mask(HTMLProps props) {
        return create("mask", props);
    }

    static ReactElement mask(HTMLProps props, String text) {
        return create("mask", props, text);
    }

    static ReactElement mask(HTMLProps props, ReactElement child) {
        return create("mask", props, child);
    }

    static ReactElement mask(HTMLProps props, ReactElement... children) {
        return create("mask", props, children);
    }

    static ReactElement mask(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("mask", props, childrenCallback);
    }

    static ReactElement mask(Func.Run1<HTMLProps> callback) {
        return create("mask", callback);
    }

    static ReactElement mask(Func.Run1<HTMLProps> callback, String text) {
        return create("mask", callback, text);
    }

    static ReactElement mask(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("mask", callback, child);
    }

    static ReactElement mask(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("mask", callback, children);
    }

    static ReactElement mask(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("mask", callback, childrenCallback);
    }

    static ReactElement mask(PropsAndChildren callback) {
        return create("mask", callback);
    }

    static ReactElement menu() {
        return create("menu");
    }

    static ReactElement menu(String value) {
        return create("menu", value);
    }

    static ReactElement menu(ReactElement child) {
        return create("menu", child);
    }

    static ReactElement menu(ReactElement... children) {
        return create("menu", children);
    }

    static ReactElement menu(StyleProps style) {
        return create("menu", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement menu(StyleProps style, String text) {
        return create("menu", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement menu(StyleProps style, ReactElement child) {
        return create("menu", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement menu(StyleProps style, ReactElement... children) {
        return create("menu", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement menu(HTMLProps props) {
        return create("menu", props);
    }

    static ReactElement menu(HTMLProps props, String text) {
        return create("menu", props, text);
    }

    static ReactElement menu(HTMLProps props, ReactElement child) {
        return create("menu", props, child);
    }

    static ReactElement menu(HTMLProps props, ReactElement... children) {
        return create("menu", props, children);
    }

    static ReactElement menu(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("menu", props, childrenCallback);
    }

    static ReactElement menu(Func.Run1<HTMLProps> callback) {
        return create("menu", callback);
    }

    static ReactElement menu(Func.Run1<HTMLProps> callback, String text) {
        return create("menu", callback, text);
    }

    static ReactElement menu(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("menu", callback, child);
    }

    static ReactElement menu(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("menu", callback, children);
    }

    static ReactElement menu(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("menu", callback, childrenCallback);
    }

    static ReactElement menu(PropsAndChildren callback) {
        return create("menu", callback);
    }

    static ReactElement menuitem() {
        return create("menuitem");
    }

    static ReactElement menuitem(String value) {
        return create("menuitem", value);
    }

    static ReactElement menuitem(ReactElement child) {
        return create("menuitem", child);
    }

    static ReactElement menuitem(ReactElement... children) {
        return create("menuitem", children);
    }

    static ReactElement menuitem(StyleProps style) {
        return create("menuitem", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement menuitem(StyleProps style, String text) {
        return create("menuitem", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement menuitem(StyleProps style, ReactElement child) {
        return create("menuitem", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement menuitem(StyleProps style, ReactElement... children) {
        return create("menuitem", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement menuitem(HTMLProps props) {
        return create("menuitem", props);
    }

    static ReactElement menuitem(HTMLProps props, String text) {
        return create("menuitem", props, text);
    }

    static ReactElement menuitem(HTMLProps props, ReactElement child) {
        return create("menuitem", props, child);
    }

    static ReactElement menuitem(HTMLProps props, ReactElement... children) {
        return create("menuitem", props, children);
    }

    static ReactElement menuitem(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("menuitem", props, childrenCallback);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps> callback) {
        return create("menuitem", callback);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps> callback, String text) {
        return create("menuitem", callback, text);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("menuitem", callback, child);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("menuitem", callback, children);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("menuitem", callback, childrenCallback);
    }

    static ReactElement menuitem(PropsAndChildren callback) {
        return create("menuitem", callback);
    }

    static ReactElement meta() {
        return create("meta");
    }

    static ReactElement meta(String value) {
        return create("meta", value);
    }

    static ReactElement meta(ReactElement child) {
        return create("meta", child);
    }

    static ReactElement meta(ReactElement... children) {
        return create("meta", children);
    }

    static ReactElement meta(StyleProps style) {
        return create("meta", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement meta(StyleProps style, String text) {
        return create("meta", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement meta(StyleProps style, ReactElement child) {
        return create("meta", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement meta(StyleProps style, ReactElement... children) {
        return create("meta", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement meta(HTMLProps props) {
        return create("meta", props);
    }

    static ReactElement meta(HTMLProps props, String text) {
        return create("meta", props, text);
    }

    static ReactElement meta(HTMLProps props, ReactElement child) {
        return create("meta", props, child);
    }

    static ReactElement meta(HTMLProps props, ReactElement... children) {
        return create("meta", props, children);
    }

    static ReactElement meta(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("meta", props, childrenCallback);
    }

    static ReactElement meta(Func.Run1<HTMLProps> callback) {
        return create("meta", callback);
    }

    static ReactElement meta(Func.Run1<HTMLProps> callback, String text) {
        return create("meta", callback, text);
    }

    static ReactElement meta(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("meta", callback, child);
    }

    static ReactElement meta(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("meta", callback, children);
    }

    static ReactElement meta(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("meta", callback, childrenCallback);
    }

    static ReactElement meta(PropsAndChildren callback) {
        return create("meta", callback);
    }

    static ReactElement meter() {
        return create("meter");
    }

    static ReactElement meter(String value) {
        return create("meter", value);
    }

    static ReactElement meter(ReactElement child) {
        return create("meter", child);
    }

    static ReactElement meter(ReactElement... children) {
        return create("meter", children);
    }

    static ReactElement meter(StyleProps style) {
        return create("meter", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement meter(StyleProps style, String text) {
        return create("meter", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement meter(StyleProps style, ReactElement child) {
        return create("meter", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement meter(StyleProps style, ReactElement... children) {
        return create("meter", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement meter(HTMLProps props) {
        return create("meter", props);
    }

    static ReactElement meter(HTMLProps props, String text) {
        return create("meter", props, text);
    }

    static ReactElement meter(HTMLProps props, ReactElement child) {
        return create("meter", props, child);
    }

    static ReactElement meter(HTMLProps props, ReactElement... children) {
        return create("meter", props, children);
    }

    static ReactElement meter(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("meter", props, childrenCallback);
    }

    static ReactElement meter(Func.Run1<HTMLProps> callback) {
        return create("meter", callback);
    }

    static ReactElement meter(Func.Run1<HTMLProps> callback, String text) {
        return create("meter", callback, text);
    }

    static ReactElement meter(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("meter", callback, child);
    }

    static ReactElement meter(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("meter", callback, children);
    }

    static ReactElement meter(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("meter", callback, childrenCallback);
    }

    static ReactElement meter(PropsAndChildren callback) {
        return create("meter", callback);
    }

    static ReactElement nav() {
        return create("nav");
    }

    static ReactElement nav(String value) {
        return create("nav", value);
    }

    static ReactElement nav(ReactElement child) {
        return create("nav", child);
    }

    static ReactElement nav(ReactElement... children) {
        return create("nav", children);
    }

    static ReactElement nav(StyleProps style) {
        return create("nav", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement nav(StyleProps style, String text) {
        return create("nav", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement nav(StyleProps style, ReactElement child) {
        return create("nav", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement nav(StyleProps style, ReactElement... children) {
        return create("nav", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement nav(HTMLProps props) {
        return create("nav", props);
    }

    static ReactElement nav(HTMLProps props, String text) {
        return create("nav", props, text);
    }

    static ReactElement nav(HTMLProps props, ReactElement child) {
        return create("nav", props, child);
    }

    static ReactElement nav(HTMLProps props, ReactElement... children) {
        return create("nav", props, children);
    }

    static ReactElement nav(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("nav", props, childrenCallback);
    }

    static ReactElement nav(Func.Run1<HTMLProps> callback) {
        return create("nav", callback);
    }

    static ReactElement nav(Func.Run1<HTMLProps> callback, String text) {
        return create("nav", callback, text);
    }

    static ReactElement nav(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("nav", callback, child);
    }

    static ReactElement nav(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("nav", callback, children);
    }

    static ReactElement nav(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("nav", callback, childrenCallback);
    }

    static ReactElement nav(PropsAndChildren callback) {
        return create("nav", callback);
    }

    static ReactElement noscript() {
        return create("noscript");
    }

    static ReactElement noscript(String value) {
        return create("noscript", value);
    }

    static ReactElement noscript(ReactElement child) {
        return create("noscript", child);
    }

    static ReactElement noscript(ReactElement... children) {
        return create("noscript", children);
    }

    static ReactElement noscript(StyleProps style) {
        return create("noscript", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement noscript(StyleProps style, String text) {
        return create("noscript", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement noscript(StyleProps style, ReactElement child) {
        return create("noscript", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement noscript(StyleProps style, ReactElement... children) {
        return create("noscript", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement noscript(HTMLProps props) {
        return create("noscript", props);
    }

    static ReactElement noscript(HTMLProps props, String text) {
        return create("noscript", props, text);
    }

    static ReactElement noscript(HTMLProps props, ReactElement child) {
        return create("noscript", props, child);
    }

    static ReactElement noscript(HTMLProps props, ReactElement... children) {
        return create("noscript", props, children);
    }

    static ReactElement noscript(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("noscript", props, childrenCallback);
    }

    static ReactElement noscript(Func.Run1<HTMLProps> callback) {
        return create("noscript", callback);
    }

    static ReactElement noscript(Func.Run1<HTMLProps> callback, String text) {
        return create("noscript", callback, text);
    }

    static ReactElement noscript(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("noscript", callback, child);
    }

    static ReactElement noscript(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("noscript", callback, children);
    }

    static ReactElement noscript(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("noscript", callback, childrenCallback);
    }

    static ReactElement noscript(PropsAndChildren callback) {
        return create("noscript", callback);
    }

    static ReactElement object() {
        return create("object");
    }

    static ReactElement object(String value) {
        return create("object", value);
    }

    static ReactElement object(ReactElement child) {
        return create("object", child);
    }

    static ReactElement object(ReactElement... children) {
        return create("object", children);
    }

    static ReactElement object(StyleProps style) {
        return create("object", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement object(StyleProps style, String text) {
        return create("object", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement object(StyleProps style, ReactElement child) {
        return create("object", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement object(StyleProps style, ReactElement... children) {
        return create("object", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement object(HTMLProps props) {
        return create("object", props);
    }

    static ReactElement object(HTMLProps props, String text) {
        return create("object", props, text);
    }

    static ReactElement object(HTMLProps props, ReactElement child) {
        return create("object", props, child);
    }

    static ReactElement object(HTMLProps props, ReactElement... children) {
        return create("object", props, children);
    }

    static ReactElement object(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("object", props, childrenCallback);
    }

    static ReactElement object(Func.Run1<HTMLProps> callback) {
        return create("object", callback);
    }

    static ReactElement object(Func.Run1<HTMLProps> callback, String text) {
        return create("object", callback, text);
    }

    static ReactElement object(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("object", callback, child);
    }

    static ReactElement object(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("object", callback, children);
    }

    static ReactElement object(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("object", callback, childrenCallback);
    }

    static ReactElement object(PropsAndChildren callback) {
        return create("object", callback);
    }

    static ReactElement ol() {
        return create("ol");
    }

    static ReactElement ol(String value) {
        return create("ol", value);
    }

    static ReactElement ol(ReactElement child) {
        return create("ol", child);
    }

    static ReactElement ol(ReactElement... children) {
        return create("ol", children);
    }

    static ReactElement ol(StyleProps style) {
        return create("ol", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement ol(StyleProps style, String text) {
        return create("ol", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement ol(StyleProps style, ReactElement child) {
        return create("ol", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement ol(StyleProps style, ReactElement... children) {
        return create("ol", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement ol(HTMLProps props) {
        return create("ol", props);
    }

    static ReactElement ol(HTMLProps props, String text) {
        return create("ol", props, text);
    }

    static ReactElement ol(HTMLProps props, ReactElement child) {
        return create("ol", props, child);
    }

    static ReactElement ol(HTMLProps props, ReactElement... children) {
        return create("ol", props, children);
    }

    static ReactElement ol(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("ol", props, childrenCallback);
    }

    static ReactElement ol(Func.Run1<HTMLProps> callback) {
        return create("ol", callback);
    }

    static ReactElement ol(Func.Run1<HTMLProps> callback, String text) {
        return create("ol", callback, text);
    }

    static ReactElement ol(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("ol", callback, child);
    }

    static ReactElement ol(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("ol", callback, children);
    }

    static ReactElement ol(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("ol", callback, childrenCallback);
    }

    static ReactElement ol(PropsAndChildren callback) {
        return create("ol", callback);
    }

    static ReactElement optgroup() {
        return create("optgroup");
    }

    static ReactElement optgroup(String value) {
        return create("optgroup", value);
    }

    static ReactElement optgroup(ReactElement child) {
        return create("optgroup", child);
    }

    static ReactElement optgroup(ReactElement... children) {
        return create("optgroup", children);
    }

    static ReactElement optgroup(StyleProps style) {
        return create("optgroup", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement optgroup(StyleProps style, String text) {
        return create("optgroup", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement optgroup(StyleProps style, ReactElement child) {
        return create("optgroup", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement optgroup(StyleProps style, ReactElement... children) {
        return create("optgroup", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement optgroup(HTMLProps props) {
        return create("optgroup", props);
    }

    static ReactElement optgroup(HTMLProps props, String text) {
        return create("optgroup", props, text);
    }

    static ReactElement optgroup(HTMLProps props, ReactElement child) {
        return create("optgroup", props, child);
    }

    static ReactElement optgroup(HTMLProps props, ReactElement... children) {
        return create("optgroup", props, children);
    }

    static ReactElement optgroup(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("optgroup", props, childrenCallback);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps> callback) {
        return create("optgroup", callback);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps> callback, String text) {
        return create("optgroup", callback, text);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("optgroup", callback, child);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("optgroup", callback, children);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("optgroup", callback, childrenCallback);
    }

    static ReactElement optgroup(PropsAndChildren callback) {
        return create("optgroup", callback);
    }

    static ReactElement option() {
        return create("option");
    }

    static ReactElement option(String value) {
        return create("option", value);
    }

    static ReactElement option(ReactElement child) {
        return create("option", child);
    }

    static ReactElement option(ReactElement... children) {
        return create("option", children);
    }

    static ReactElement option(StyleProps style) {
        return create("option", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement option(StyleProps style, String text) {
        return create("option", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement option(StyleProps style, ReactElement child) {
        return create("option", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement option(StyleProps style, ReactElement... children) {
        return create("option", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement option(HTMLProps props) {
        return create("option", props);
    }

    static ReactElement option(HTMLProps props, String text) {
        return create("option", props, text);
    }

    static ReactElement option(HTMLProps props, ReactElement child) {
        return create("option", props, child);
    }

    static ReactElement option(HTMLProps props, ReactElement... children) {
        return create("option", props, children);
    }

    static ReactElement option(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("option", props, childrenCallback);
    }

    static ReactElement option(Func.Run1<HTMLProps> callback) {
        return create("option", callback);
    }

    static ReactElement option(Func.Run1<HTMLProps> callback, String text) {
        return create("option", callback, text);
    }

    static ReactElement option(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("option", callback, child);
    }

    static ReactElement option(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("option", callback, children);
    }

    static ReactElement option(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("option", callback, childrenCallback);
    }

    static ReactElement option(PropsAndChildren callback) {
        return create("option", callback);
    }

    static ReactElement output() {
        return create("output");
    }

    static ReactElement output(String value) {
        return create("output", value);
    }

    static ReactElement output(ReactElement child) {
        return create("output", child);
    }

    static ReactElement output(ReactElement... children) {
        return create("output", children);
    }

    static ReactElement output(StyleProps style) {
        return create("output", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement output(StyleProps style, String text) {
        return create("output", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement output(StyleProps style, ReactElement child) {
        return create("output", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement output(StyleProps style, ReactElement... children) {
        return create("output", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement output(HTMLProps props) {
        return create("output", props);
    }

    static ReactElement output(HTMLProps props, String text) {
        return create("output", props, text);
    }

    static ReactElement output(HTMLProps props, ReactElement child) {
        return create("output", props, child);
    }

    static ReactElement output(HTMLProps props, ReactElement... children) {
        return create("output", props, children);
    }

    static ReactElement output(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("output", props, childrenCallback);
    }

    static ReactElement output(Func.Run1<HTMLProps> callback) {
        return create("output", callback);
    }

    static ReactElement output(Func.Run1<HTMLProps> callback, String text) {
        return create("output", callback, text);
    }

    static ReactElement output(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("output", callback, child);
    }

    static ReactElement output(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("output", callback, children);
    }

    static ReactElement output(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("output", callback, childrenCallback);
    }

    static ReactElement output(PropsAndChildren callback) {
        return create("output", callback);
    }

    static ReactElement p() {
        return create("p");
    }

    static ReactElement p(String value) {
        return create("p", value);
    }

    static ReactElement p(ReactElement child) {
        return create("p", child);
    }

    static ReactElement p(ReactElement... children) {
        return create("p", children);
    }

    static ReactElement p(StyleProps style) {
        return create("p", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement p(StyleProps style, String text) {
        return create("p", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement p(StyleProps style, ReactElement child) {
        return create("p", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement p(StyleProps style, ReactElement... children) {
        return create("p", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement p(HTMLProps props) {
        return create("p", props);
    }

    static ReactElement p(HTMLProps props, String text) {
        return create("p", props, text);
    }

    static ReactElement p(HTMLProps props, ReactElement child) {
        return create("p", props, child);
    }

    static ReactElement p(HTMLProps props, ReactElement... children) {
        return create("p", props, children);
    }

    static ReactElement p(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("p", props, childrenCallback);
    }

    static ReactElement p(Func.Run1<HTMLProps> callback) {
        return create("p", callback);
    }

    static ReactElement p(Func.Run1<HTMLProps> callback, String text) {
        return create("p", callback, text);
    }

    static ReactElement p(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("p", callback, child);
    }

    static ReactElement p(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("p", callback, children);
    }

    static ReactElement p(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("p", callback, childrenCallback);
    }

    static ReactElement p(PropsAndChildren callback) {
        return create("p", callback);
    }

    static ReactElement path() {
        return create("path");
    }

    static ReactElement path(String value) {
        return create("path", value);
    }

    static ReactElement path(ReactElement child) {
        return create("path", child);
    }

    static ReactElement path(ReactElement... children) {
        return create("path", children);
    }

    static ReactElement path(StyleProps style) {
        return create("path", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement path(StyleProps style, String text) {
        return create("path", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement path(StyleProps style, ReactElement child) {
        return create("path", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement path(StyleProps style, ReactElement... children) {
        return create("path", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement path(HTMLProps props) {
        return create("path", props);
    }

    static ReactElement path(HTMLProps props, String text) {
        return create("path", props, text);
    }

    static ReactElement path(HTMLProps props, ReactElement child) {
        return create("path", props, child);
    }

    static ReactElement path(HTMLProps props, ReactElement... children) {
        return create("path", props, children);
    }

    static ReactElement path(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("path", props, childrenCallback);
    }

    static ReactElement path(Func.Run1<HTMLProps> callback) {
        return create("path", callback);
    }

    static ReactElement path(Func.Run1<HTMLProps> callback, String text) {
        return create("path", callback, text);
    }

    static ReactElement path(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("path", callback, child);
    }

    static ReactElement path(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("path", callback, children);
    }

    static ReactElement path(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("path", callback, childrenCallback);
    }

    static ReactElement path(PropsAndChildren callback) {
        return create("path", callback);
    }

    static ReactElement param() {
        return create("param");
    }

    static ReactElement param(String value) {
        return create("param", value);
    }

    static ReactElement param(ReactElement child) {
        return create("param", child);
    }

    static ReactElement param(ReactElement... children) {
        return create("param", children);
    }

    static ReactElement param(StyleProps style) {
        return create("param", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement param(StyleProps style, String text) {
        return create("param", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement param(StyleProps style, ReactElement child) {
        return create("param", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement param(StyleProps style, ReactElement... children) {
        return create("param", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement param(HTMLProps props) {
        return create("param", props);
    }

    static ReactElement param(HTMLProps props, String text) {
        return create("param", props, text);
    }

    static ReactElement param(HTMLProps props, ReactElement child) {
        return create("param", props, child);
    }

    static ReactElement param(HTMLProps props, ReactElement... children) {
        return create("param", props, children);
    }

    static ReactElement param(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("param", props, childrenCallback);
    }

    static ReactElement param(Func.Run1<HTMLProps> callback) {
        return create("param", callback);
    }

    static ReactElement param(Func.Run1<HTMLProps> callback, String text) {
        return create("param", callback, text);
    }

    static ReactElement param(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("param", callback, child);
    }

    static ReactElement param(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("param", callback, children);
    }

    static ReactElement param(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("param", callback, childrenCallback);
    }

    static ReactElement param(PropsAndChildren callback) {
        return create("param", callback);
    }

    static ReactElement picture() {
        return create("picture");
    }

    static ReactElement picture(String value) {
        return create("picture", value);
    }

    static ReactElement picture(ReactElement child) {
        return create("picture", child);
    }

    static ReactElement picture(ReactElement... children) {
        return create("picture", children);
    }

    static ReactElement picture(StyleProps style) {
        return create("picture", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement picture(StyleProps style, String text) {
        return create("picture", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement picture(StyleProps style, ReactElement child) {
        return create("picture", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement picture(StyleProps style, ReactElement... children) {
        return create("picture", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement picture(HTMLProps props) {
        return create("picture", props);
    }

    static ReactElement picture(HTMLProps props, String text) {
        return create("picture", props, text);
    }

    static ReactElement picture(HTMLProps props, ReactElement child) {
        return create("picture", props, child);
    }

    static ReactElement picture(HTMLProps props, ReactElement... children) {
        return create("picture", props, children);
    }

    static ReactElement picture(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("picture", props, childrenCallback);
    }

    static ReactElement picture(Func.Run1<HTMLProps> callback) {
        return create("picture", callback);
    }

    static ReactElement picture(Func.Run1<HTMLProps> callback, String text) {
        return create("picture", callback, text);
    }

    static ReactElement picture(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("picture", callback, child);
    }

    static ReactElement picture(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("picture", callback, children);
    }

    static ReactElement picture(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("picture", callback, childrenCallback);
    }

    static ReactElement picture(PropsAndChildren callback) {
        return create("picture", callback);
    }

    static ReactElement polygon() {
        return create("polygon");
    }

    static ReactElement polygon(String value) {
        return create("polygon", value);
    }

    static ReactElement polygon(ReactElement child) {
        return create("polygon", child);
    }

    static ReactElement polygon(ReactElement... children) {
        return create("polygon", children);
    }

    static ReactElement polygon(StyleProps style) {
        return create("polygon", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement polygon(StyleProps style, String text) {
        return create("polygon", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement polygon(StyleProps style, ReactElement child) {
        return create("polygon", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement polygon(StyleProps style, ReactElement... children) {
        return create("polygon", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement polygon(HTMLProps props) {
        return create("polygon", props);
    }

    static ReactElement polygon(HTMLProps props, String text) {
        return create("polygon", props, text);
    }

    static ReactElement polygon(HTMLProps props, ReactElement child) {
        return create("polygon", props, child);
    }

    static ReactElement polygon(HTMLProps props, ReactElement... children) {
        return create("polygon", props, children);
    }

    static ReactElement polygon(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("polygon", props, childrenCallback);
    }

    static ReactElement polygon(Func.Run1<HTMLProps> callback) {
        return create("polygon", callback);
    }

    static ReactElement polygon(Func.Run1<HTMLProps> callback, String text) {
        return create("polygon", callback, text);
    }

    static ReactElement polygon(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("polygon", callback, child);
    }

    static ReactElement polygon(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("polygon", callback, children);
    }

    static ReactElement polygon(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("polygon", callback, childrenCallback);
    }

    static ReactElement polygon(PropsAndChildren callback) {
        return create("polygon", callback);
    }

    static ReactElement polyline() {
        return create("polyline");
    }

    static ReactElement polyline(String value) {
        return create("polyline", value);
    }

    static ReactElement polyline(ReactElement child) {
        return create("polyline", child);
    }

    static ReactElement polyline(ReactElement... children) {
        return create("polyline", children);
    }

    static ReactElement polyline(StyleProps style) {
        return create("polyline", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement polyline(StyleProps style, String text) {
        return create("polyline", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement polyline(StyleProps style, ReactElement child) {
        return create("polyline", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement polyline(StyleProps style, ReactElement... children) {
        return create("polyline", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement polyline(HTMLProps props) {
        return create("polyline", props);
    }

    static ReactElement polyline(HTMLProps props, String text) {
        return create("polyline", props, text);
    }

    static ReactElement polyline(HTMLProps props, ReactElement child) {
        return create("polyline", props, child);
    }

    static ReactElement polyline(HTMLProps props, ReactElement... children) {
        return create("polyline", props, children);
    }

    static ReactElement polyline(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("polyline", props, childrenCallback);
    }

    static ReactElement polyline(Func.Run1<HTMLProps> callback) {
        return create("polyline", callback);
    }

    static ReactElement polyline(Func.Run1<HTMLProps> callback, String text) {
        return create("polyline", callback, text);
    }

    static ReactElement polyline(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("polyline", callback, child);
    }

    static ReactElement polyline(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("polyline", callback, children);
    }

    static ReactElement polyline(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("polyline", callback, childrenCallback);
    }

    static ReactElement polyline(PropsAndChildren callback) {
        return create("polyline", callback);
    }
    
    static ReactElement pre() {
        return create("pre");
    }

    static ReactElement pre(String value) {
        return create("pre", value);
    }

    static ReactElement pre(ReactElement child) {
        return create("pre", child);
    }

    static ReactElement pre(ReactElement... children) {
        return create("pre", children);
    }

    static ReactElement pre(StyleProps style) {
        return create("pre", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement pre(StyleProps style, String text) {
        return create("pre", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement pre(StyleProps style, ReactElement child) {
        return create("pre", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement pre(StyleProps style, ReactElement... children) {
        return create("pre", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement pre(HTMLProps props) {
        return create("pre", props);
    }

    static ReactElement pre(HTMLProps props, String text) {
        return create("pre", props, text);
    }

    static ReactElement pre(HTMLProps props, ReactElement child) {
        return create("pre", props, child);
    }

    static ReactElement pre(HTMLProps props, ReactElement... children) {
        return create("pre", props, children);
    }

    static ReactElement pre(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("pre", props, childrenCallback);
    }

    static ReactElement pre(Func.Run1<HTMLProps> callback) {
        return create("pre", callback);
    }

    static ReactElement pre(Func.Run1<HTMLProps> callback, String text) {
        return create("pre", callback, text);
    }

    static ReactElement pre(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("pre", callback, child);
    }

    static ReactElement pre(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("pre", callback, children);
    }

    static ReactElement pre(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("pre", callback, childrenCallback);
    }

    static ReactElement pre(PropsAndChildren callback) {
        return create("pre", callback);
    }

    static ReactElement progress() {
        return create("progress");
    }

    static ReactElement progress(String value) {
        return create("progress", value);
    }

    static ReactElement progress(ReactElement child) {
        return create("progress", child);
    }

    static ReactElement progress(ReactElement... children) {
        return create("progress", children);
    }

    static ReactElement progress(StyleProps style) {
        return create("progress", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement progress(StyleProps style, String text) {
        return create("progress", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement progress(StyleProps style, ReactElement child) {
        return create("progress", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement progress(StyleProps style, ReactElement... children) {
        return create("progress", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement progress(HTMLProps props) {
        return create("progress", props);
    }

    static ReactElement progress(HTMLProps props, String text) {
        return create("progress", props, text);
    }

    static ReactElement progress(HTMLProps props, ReactElement child) {
        return create("progress", props, child);
    }

    static ReactElement progress(HTMLProps props, ReactElement... children) {
        return create("progress", props, children);
    }

    static ReactElement progress(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("progress", props, childrenCallback);
    }

    static ReactElement progress(Func.Run1<HTMLProps> callback) {
        return create("progress", callback);
    }

    static ReactElement progress(Func.Run1<HTMLProps> callback, String text) {
        return create("progress", callback, text);
    }

    static ReactElement progress(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("progress", callback, child);
    }

    static ReactElement progress(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("progress", callback, children);
    }

    static ReactElement progress(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("progress", callback, childrenCallback);
    }

    static ReactElement progress(PropsAndChildren callback) {
        return create("progress", callback);
    }

    static ReactElement q() {
        return create("q");
    }

    static ReactElement q(String value) {
        return create("q", value);
    }

    static ReactElement q(ReactElement child) {
        return create("q", child);
    }

    static ReactElement q(ReactElement... children) {
        return create("q", children);
    }

    static ReactElement q(StyleProps style) {
        return create("q", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement q(StyleProps style, String text) {
        return create("q", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement q(StyleProps style, ReactElement child) {
        return create("q", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement q(StyleProps style, ReactElement... children) {
        return create("q", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement q(HTMLProps props) {
        return create("q", props);
    }

    static ReactElement q(HTMLProps props, String text) {
        return create("q", props, text);
    }

    static ReactElement q(HTMLProps props, ReactElement child) {
        return create("q", props, child);
    }

    static ReactElement q(HTMLProps props, ReactElement... children) {
        return create("q", props, children);
    }

    static ReactElement q(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("q", props, childrenCallback);
    }

    static ReactElement q(Func.Run1<HTMLProps> callback) {
        return create("q", callback);
    }

    static ReactElement q(Func.Run1<HTMLProps> callback, String text) {
        return create("q", callback, text);
    }

    static ReactElement q(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("q", callback, child);
    }

    static ReactElement q(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("q", callback, children);
    }

    static ReactElement q(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("q", callback, childrenCallback);
    }

    static ReactElement q(PropsAndChildren callback) {
        return create("q", callback);
    }

    static ReactElement rect() {
        return create("rect");
    }

    static ReactElement rect(String value) {
        return create("rect", value);
    }

    static ReactElement rect(ReactElement child) {
        return create("rect", child);
    }

    static ReactElement rect(ReactElement... children) {
        return create("rect", children);
    }

    static ReactElement rect(StyleProps style) {
        return create("rect", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement rect(StyleProps style, String text) {
        return create("rect", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement rect(StyleProps style, ReactElement child) {
        return create("rect", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement rect(StyleProps style, ReactElement... children) {
        return create("rect", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement rect(HTMLProps props) {
        return create("rect", props);
    }

    static ReactElement rect(HTMLProps props, String text) {
        return create("rect", props, text);
    }

    static ReactElement rect(HTMLProps props, ReactElement child) {
        return create("rect", props, child);
    }

    static ReactElement rect(HTMLProps props, ReactElement... children) {
        return create("rect", props, children);
    }

    static ReactElement rect(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("rect", props, childrenCallback);
    }

    static ReactElement rect(Func.Run1<HTMLProps> callback) {
        return create("rect", callback);
    }

    static ReactElement rect(Func.Run1<HTMLProps> callback, String text) {
        return create("rect", callback, text);
    }

    static ReactElement rect(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("rect", callback, child);
    }

    static ReactElement rect(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("rect", callback, children);
    }

    static ReactElement rect(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("rect", callback, childrenCallback);
    }

    static ReactElement rect(PropsAndChildren callback) {
        return create("rect", callback);
    }

    static ReactElement rp() {
        return create("rp");
    }

    static ReactElement rp(String value) {
        return create("rp", value);
    }

    static ReactElement rp(ReactElement child) {
        return create("rp", child);
    }

    static ReactElement rp(ReactElement... children) {
        return create("rp", children);
    }

    static ReactElement rp(StyleProps style) {
        return create("rp", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement rp(StyleProps style, String text) {
        return create("rp", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement rp(StyleProps style, ReactElement child) {
        return create("rp", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement rp(StyleProps style, ReactElement... children) {
        return create("rp", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement rp(HTMLProps props) {
        return create("rp", props);
    }

    static ReactElement rp(HTMLProps props, String text) {
        return create("rp", props, text);
    }

    static ReactElement rp(HTMLProps props, ReactElement child) {
        return create("rp", props, child);
    }

    static ReactElement rp(HTMLProps props, ReactElement... children) {
        return create("rp", props, children);
    }

    static ReactElement rp(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("rp", props, childrenCallback);
    }

    static ReactElement rp(Func.Run1<HTMLProps> callback) {
        return create("rp", callback);
    }

    static ReactElement rp(Func.Run1<HTMLProps> callback, String text) {
        return create("rp", callback, text);
    }

    static ReactElement rp(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("rp", callback, child);
    }

    static ReactElement rp(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("rp", callback, children);
    }

    static ReactElement rp(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("rp", callback, childrenCallback);
    }

    static ReactElement rp(PropsAndChildren callback) {
        return create("rp", callback);
    }

    static ReactElement rt() {
        return create("rt");
    }

    static ReactElement rt(String value) {
        return create("rt", value);
    }

    static ReactElement rt(ReactElement child) {
        return create("rt", child);
    }

    static ReactElement rt(ReactElement... children) {
        return create("rt", children);
    }

    static ReactElement rt(StyleProps style) {
        return create("rt", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement rt(StyleProps style, String text) {
        return create("rt", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement rt(StyleProps style, ReactElement child) {
        return create("rt", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement rt(StyleProps style, ReactElement... children) {
        return create("rt", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement rt(HTMLProps props) {
        return create("rt", props);
    }

    static ReactElement rt(HTMLProps props, String text) {
        return create("rt", props, text);
    }

    static ReactElement rt(HTMLProps props, ReactElement child) {
        return create("rt", props, child);
    }

    static ReactElement rt(HTMLProps props, ReactElement... children) {
        return create("rt", props, children);
    }

    static ReactElement rt(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("rt", props, childrenCallback);
    }

    static ReactElement rt(Func.Run1<HTMLProps> callback) {
        return create("rt", callback);
    }

    static ReactElement rt(Func.Run1<HTMLProps> callback, String text) {
        return create("rt", callback, text);
    }

    static ReactElement rt(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("rt", callback, child);
    }

    static ReactElement rt(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("rt", callback, children);
    }

    static ReactElement rt(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("rt", callback, childrenCallback);
    }

    static ReactElement rt(PropsAndChildren callback) {
        return create("rt", callback);
    }

    static ReactElement ruby() {
        return create("ruby");
    }

    static ReactElement ruby(String value) {
        return create("ruby", value);
    }

    static ReactElement ruby(ReactElement child) {
        return create("ruby", child);
    }

    static ReactElement ruby(ReactElement... children) {
        return create("ruby", children);
    }

    static ReactElement ruby(StyleProps style) {
        return create("ruby", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement ruby(StyleProps style, String text) {
        return create("ruby", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement ruby(StyleProps style, ReactElement child) {
        return create("ruby", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement ruby(StyleProps style, ReactElement... children) {
        return create("ruby", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement ruby(HTMLProps props) {
        return create("ruby", props);
    }

    static ReactElement ruby(HTMLProps props, String text) {
        return create("ruby", props, text);
    }

    static ReactElement ruby(HTMLProps props, ReactElement child) {
        return create("ruby", props, child);
    }

    static ReactElement ruby(HTMLProps props, ReactElement... children) {
        return create("ruby", props, children);
    }

    static ReactElement ruby(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("ruby", props, childrenCallback);
    }

    static ReactElement ruby(Func.Run1<HTMLProps> callback) {
        return create("ruby", callback);
    }

    static ReactElement ruby(Func.Run1<HTMLProps> callback, String text) {
        return create("ruby", callback, text);
    }

    static ReactElement ruby(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("ruby", callback, child);
    }

    static ReactElement ruby(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("ruby", callback, children);
    }

    static ReactElement ruby(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("ruby", callback, childrenCallback);
    }

    static ReactElement ruby(PropsAndChildren callback) {
        return create("ruby", callback);
    }

    static ReactElement s() {
        return create("s");
    }

    static ReactElement s(String value) {
        return create("s", value);
    }

    static ReactElement s(ReactElement child) {
        return create("s", child);
    }

    static ReactElement s(ReactElement... children) {
        return create("s", children);
    }

    static ReactElement s(StyleProps style) {
        return create("s", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement s(StyleProps style, String text) {
        return create("s", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement s(StyleProps style, ReactElement child) {
        return create("s", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement s(StyleProps style, ReactElement... children) {
        return create("s", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement s(HTMLProps props) {
        return create("s", props);
    }

    static ReactElement s(HTMLProps props, String text) {
        return create("s", props, text);
    }

    static ReactElement s(HTMLProps props, ReactElement child) {
        return create("s", props, child);
    }

    static ReactElement s(HTMLProps props, ReactElement... children) {
        return create("s", props, children);
    }

    static ReactElement s(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("s", props, childrenCallback);
    }

    static ReactElement s(Func.Run1<HTMLProps> callback) {
        return create("s", callback);
    }

    static ReactElement s(Func.Run1<HTMLProps> callback, String text) {
        return create("s", callback, text);
    }

    static ReactElement s(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("s", callback, child);
    }

    static ReactElement s(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("s", callback, children);
    }

    static ReactElement s(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("s", callback, childrenCallback);
    }

    static ReactElement s(PropsAndChildren callback) {
        return create("s", callback);
    }

    static ReactElement samp() {
        return create("samp");
    }

    static ReactElement samp(String value) {
        return create("samp", value);
    }

    static ReactElement samp(ReactElement child) {
        return create("samp", child);
    }

    static ReactElement samp(ReactElement... children) {
        return create("samp", children);
    }

    static ReactElement samp(StyleProps style) {
        return create("samp", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement samp(StyleProps style, String text) {
        return create("samp", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement samp(StyleProps style, ReactElement child) {
        return create("samp", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement samp(StyleProps style, ReactElement... children) {
        return create("samp", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement samp(HTMLProps props) {
        return create("samp", props);
    }

    static ReactElement samp(HTMLProps props, String text) {
        return create("samp", props, text);
    }

    static ReactElement samp(HTMLProps props, ReactElement child) {
        return create("samp", props, child);
    }

    static ReactElement samp(HTMLProps props, ReactElement... children) {
        return create("samp", props, children);
    }

    static ReactElement samp(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("samp", props, childrenCallback);
    }

    static ReactElement samp(Func.Run1<HTMLProps> callback) {
        return create("samp", callback);
    }

    static ReactElement samp(Func.Run1<HTMLProps> callback, String text) {
        return create("samp", callback, text);
    }

    static ReactElement samp(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("samp", callback, child);
    }

    static ReactElement samp(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("samp", callback, children);
    }

    static ReactElement samp(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("samp", callback, childrenCallback);
    }

    static ReactElement samp(PropsAndChildren callback) {
        return create("samp", callback);
    }

    static ReactElement script() {
        return create("script");
    }

    static ReactElement script(String value) {
        return create("script", value);
    }

    static ReactElement script(ReactElement child) {
        return create("script", child);
    }

    static ReactElement script(ReactElement... children) {
        return create("script", children);
    }

    static ReactElement script(StyleProps style) {
        return create("script", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement script(StyleProps style, String text) {
        return create("script", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement script(StyleProps style, ReactElement child) {
        return create("script", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement script(StyleProps style, ReactElement... children) {
        return create("script", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement script(HTMLProps props) {
        return create("script", props);
    }

    static ReactElement script(HTMLProps props, String text) {
        return create("script", props, text);
    }

    static ReactElement script(HTMLProps props, ReactElement child) {
        return create("script", props, child);
    }

    static ReactElement script(HTMLProps props, ReactElement... children) {
        return create("script", props, children);
    }

    static ReactElement script(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("script", props, childrenCallback);
    }

    static ReactElement script(Func.Run1<HTMLProps> callback) {
        return create("script", callback);
    }

    static ReactElement script(Func.Run1<HTMLProps> callback, String text) {
        return create("script", callback, text);
    }

    static ReactElement script(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("script", callback, child);
    }

    static ReactElement script(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("script", callback, children);
    }

    static ReactElement script(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("script", callback, childrenCallback);
    }

    static ReactElement script(PropsAndChildren callback) {
        return create("script", callback);
    }

    static ReactElement section() {
        return create("section");
    }

    static ReactElement section(String value) {
        return create("section", value);
    }

    static ReactElement section(ReactElement child) {
        return create("section", child);
    }

    static ReactElement section(ReactElement... children) {
        return create("section", children);
    }

    static ReactElement section(StyleProps style) {
        return create("section", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement section(StyleProps style, String text) {
        return create("section", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement section(StyleProps style, ReactElement child) {
        return create("section", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement section(StyleProps style, ReactElement... children) {
        return create("section", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement section(HTMLProps props) {
        return create("section", props);
    }

    static ReactElement section(HTMLProps props, String text) {
        return create("section", props, text);
    }

    static ReactElement section(HTMLProps props, ReactElement child) {
        return create("section", props, child);
    }

    static ReactElement section(HTMLProps props, ReactElement... children) {
        return create("section", props, children);
    }

    static ReactElement section(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("section", props, childrenCallback);
    }

    static ReactElement section(Func.Run1<HTMLProps> callback) {
        return create("section", callback);
    }

    static ReactElement section(Func.Run1<HTMLProps> callback, String text) {
        return create("section", callback, text);
    }

    static ReactElement section(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("section", callback, child);
    }

    static ReactElement section(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("section", callback, children);
    }

    static ReactElement section(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("section", callback, childrenCallback);
    }

    static ReactElement section(PropsAndChildren callback) {
        return create("section", callback);
    }

    static ReactElement select() {
        return create("select");
    }

    static ReactElement select(String value) {
        return create("select", value);
    }

    static ReactElement select(ReactElement child) {
        return create("select", child);
    }

    static ReactElement select(ReactElement... children) {
        return create("select", children);
    }

    static ReactElement select(StyleProps style) {
        return create("select", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement select(StyleProps style, String text) {
        return create("select", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement select(StyleProps style, ReactElement child) {
        return create("select", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement select(StyleProps style, ReactElement... children) {
        return create("select", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement select(HTMLProps props) {
        return create("select", props);
    }

    static ReactElement select(HTMLProps props, String text) {
        return create("select", props, text);
    }

    static ReactElement select(HTMLProps props, ReactElement child) {
        return create("select", props, child);
    }

    static ReactElement select(HTMLProps props, ReactElement... children) {
        return create("select", props, children);
    }

    static ReactElement select(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("select", props, childrenCallback);
    }

    static ReactElement select(Func.Run1<HTMLProps> callback) {
        return create("select", callback);
    }

    static ReactElement select(Func.Run1<HTMLProps> callback, String text) {
        return create("select", callback, text);
    }

    static ReactElement select(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("select", callback, child);
    }

    static ReactElement select(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("select", callback, children);
    }

    static ReactElement select(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("select", callback, childrenCallback);
    }

    static ReactElement select(PropsAndChildren callback) {
        return create("select", callback);
    }

    static ReactElement small() {
        return create("small");
    }

    static ReactElement small(String value) {
        return create("small", value);
    }

    static ReactElement small(ReactElement child) {
        return create("small", child);
    }

    static ReactElement small(ReactElement... children) {
        return create("small", children);
    }

    static ReactElement small(StyleProps style) {
        return create("small", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement small(StyleProps style, String text) {
        return create("small", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement small(StyleProps style, ReactElement child) {
        return create("small", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement small(StyleProps style, ReactElement... children) {
        return create("small", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement small(HTMLProps props) {
        return create("small", props);
    }

    static ReactElement small(HTMLProps props, String text) {
        return create("small", props, text);
    }

    static ReactElement small(HTMLProps props, ReactElement child) {
        return create("small", props, child);
    }

    static ReactElement small(HTMLProps props, ReactElement... children) {
        return create("small", props, children);
    }

    static ReactElement small(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("small", props, childrenCallback);
    }

    static ReactElement small(Func.Run1<HTMLProps> callback) {
        return create("small", callback);
    }

    static ReactElement small(Func.Run1<HTMLProps> callback, String text) {
        return create("small", callback, text);
    }

    static ReactElement small(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("small", callback, child);
    }

    static ReactElement small(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("small", callback, children);
    }

    static ReactElement small(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("small", callback, childrenCallback);
    }

    static ReactElement small(PropsAndChildren callback) {
        return create("small", callback);
    }

    static ReactElement source() {
        return create("source");
    }

    static ReactElement source(String value) {
        return create("source", value);
    }

    static ReactElement source(ReactElement child) {
        return create("source", child);
    }

    static ReactElement source(ReactElement... children) {
        return create("source", children);
    }

    static ReactElement source(StyleProps style) {
        return create("source", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement source(StyleProps style, String text) {
        return create("source", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement source(StyleProps style, ReactElement child) {
        return create("source", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement source(StyleProps style, ReactElement... children) {
        return create("source", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement source(HTMLProps props) {
        return create("source", props);
    }

    static ReactElement source(HTMLProps props, String text) {
        return create("source", props, text);
    }

    static ReactElement source(HTMLProps props, ReactElement child) {
        return create("source", props, child);
    }

    static ReactElement source(HTMLProps props, ReactElement... children) {
        return create("source", props, children);
    }

    static ReactElement source(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("source", props, childrenCallback);
    }

    static ReactElement source(Func.Run1<HTMLProps> callback) {
        return create("source", callback);
    }

    static ReactElement source(Func.Run1<HTMLProps> callback, String text) {
        return create("source", callback, text);
    }

    static ReactElement source(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("source", callback, child);
    }

    static ReactElement source(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("source", callback, children);
    }

    static ReactElement source(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("source", callback, childrenCallback);
    }

    static ReactElement source(PropsAndChildren callback) {
        return create("source", callback);
    }

    static ReactElement span() {
        return create("span");
    }

    static ReactElement span(String value) {
        return create("span", value);
    }

    static ReactElement span(ReactElement child) {
        return create("span", child);
    }

    static ReactElement span(ReactElement... children) {
        return create("span", children);
    }

    static ReactElement span(StyleProps style) {
        return create("span", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement span(StyleProps style, String text) {
        return create("span", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement span(StyleProps style, ReactElement child) {
        return create("span", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement span(StyleProps style, ReactElement... children) {
        return create("span", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement span(HTMLProps props) {
        return create("span", props);
    }

    static ReactElement span(HTMLProps props, String text) {
        return create("span", props, text);
    }

    static ReactElement span(HTMLProps props, ReactElement child) {
        return create("span", props, child);
    }

    static ReactElement span(HTMLProps props, ReactElement... children) {
        return create("span", props, children);
    }

    static ReactElement span(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("span", props, childrenCallback);
    }

    static ReactElement span(Func.Run1<HTMLProps> callback) {
        return create("span", callback);
    }

    static ReactElement span(Func.Run1<HTMLProps> callback, String text) {
        return create("span", callback, text);
    }

    static ReactElement span(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("span", callback, child);
    }

    static ReactElement span(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("span", callback, children);
    }

    static ReactElement span(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("span", callback, childrenCallback);
    }

    static ReactElement span(PropsAndChildren callback) {
        return create("span", callback);
    }

    static ReactElement strong() {
        return create("strong");
    }

    static ReactElement strong(String value) {
        return create("strong", value);
    }

    static ReactElement strong(ReactElement child) {
        return create("strong", child);
    }

    static ReactElement strong(ReactElement... children) {
        return create("strong", children);
    }

    static ReactElement strong(StyleProps style) {
        return create("strong", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement strong(StyleProps style, String text) {
        return create("strong", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement strong(StyleProps style, ReactElement child) {
        return create("strong", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement strong(StyleProps style, ReactElement... children) {
        return create("strong", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement strong(HTMLProps props) {
        return create("strong", props);
    }

    static ReactElement strong(HTMLProps props, String text) {
        return create("strong", props, text);
    }

    static ReactElement strong(HTMLProps props, ReactElement child) {
        return create("strong", props, child);
    }

    static ReactElement strong(HTMLProps props, ReactElement... children) {
        return create("strong", props, children);
    }

    static ReactElement strong(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("strong", props, childrenCallback);
    }

    static ReactElement strong(Func.Run1<HTMLProps> callback) {
        return create("strong", callback);
    }

    static ReactElement strong(Func.Run1<HTMLProps> callback, String text) {
        return create("strong", callback, text);
    }

    static ReactElement strong(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("strong", callback, child);
    }

    static ReactElement strong(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("strong", callback, children);
    }

    static ReactElement strong(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("strong", callback, childrenCallback);
    }

    static ReactElement strong(PropsAndChildren callback) {
        return create("strong", callback);
    }

    static ReactElement style() {
        return create("style");
    }

    static ReactElement style(String value) {
        return create("style", value);
    }

    static ReactElement style(ReactElement child) {
        return create("style", child);
    }

    static ReactElement style(ReactElement... children) {
        return create("style", children);
    }

    static ReactElement style(StyleProps style) {
        return create("style", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement style(StyleProps style, String text) {
        return create("style", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement style(StyleProps style, ReactElement child) {
        return create("style", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement style(StyleProps style, ReactElement... children) {
        return create("style", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement style(HTMLProps props) {
        return create("style", props);
    }

    static ReactElement style(HTMLProps props, String text) {
        return create("style", props, text);
    }

    static ReactElement style(HTMLProps props, ReactElement child) {
        return create("style", props, child);
    }

    static ReactElement style(HTMLProps props, ReactElement... children) {
        return create("style", props, children);
    }

    static ReactElement style(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("style", props, childrenCallback);
    }

    static ReactElement style(Func.Run1<HTMLProps> callback) {
        return create("style", callback);
    }

    static ReactElement style(Func.Run1<HTMLProps> callback, String text) {
        return create("style", callback, text);
    }

    static ReactElement style(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("style", callback, child);
    }

    static ReactElement style(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("style", callback, children);
    }

    static ReactElement style(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("style", callback, childrenCallback);
    }

    static ReactElement style(PropsAndChildren callback) {
        return create("style", callback);
    }

    static ReactElement sub() {
        return create("sub");
    }

    static ReactElement sub(String value) {
        return create("sub", value);
    }

    static ReactElement sub(ReactElement child) {
        return create("sub", child);
    }

    static ReactElement sub(ReactElement... children) {
        return create("sub", children);
    }

    static ReactElement sub(StyleProps style) {
        return create("sub", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement sub(StyleProps style, String text) {
        return create("sub", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement sub(StyleProps style, ReactElement child) {
        return create("sub", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement sub(StyleProps style, ReactElement... children) {
        return create("sub", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement sub(HTMLProps props) {
        return create("sub", props);
    }

    static ReactElement sub(HTMLProps props, String text) {
        return create("sub", props, text);
    }

    static ReactElement sub(HTMLProps props, ReactElement child) {
        return create("sub", props, child);
    }

    static ReactElement sub(HTMLProps props, ReactElement... children) {
        return create("sub", props, children);
    }

    static ReactElement sub(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("sub", props, childrenCallback);
    }

    static ReactElement sub(Func.Run1<HTMLProps> callback) {
        return create("sub", callback);
    }

    static ReactElement sub(Func.Run1<HTMLProps> callback, String text) {
        return create("sub", callback, text);
    }

    static ReactElement sub(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("sub", callback, child);
    }

    static ReactElement sub(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("sub", callback, children);
    }

    static ReactElement sub(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("sub", callback, childrenCallback);
    }

    static ReactElement sub(PropsAndChildren callback) {
        return create("sub", callback);
    }

    static ReactElement summary() {
        return create("summary");
    }

    static ReactElement summary(String value) {
        return create("summary", value);
    }

    static ReactElement summary(ReactElement child) {
        return create("summary", child);
    }

    static ReactElement summary(ReactElement... children) {
        return create("summary", children);
    }

    static ReactElement summary(StyleProps style) {
        return create("summary", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement summary(StyleProps style, String text) {
        return create("summary", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement summary(StyleProps style, ReactElement child) {
        return create("summary", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement summary(StyleProps style, ReactElement... children) {
        return create("summary", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement summary(HTMLProps props) {
        return create("summary", props);
    }

    static ReactElement summary(HTMLProps props, String text) {
        return create("summary", props, text);
    }

    static ReactElement summary(HTMLProps props, ReactElement child) {
        return create("summary", props, child);
    }

    static ReactElement summary(HTMLProps props, ReactElement... children) {
        return create("summary", props, children);
    }

    static ReactElement summary(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("summary", props, childrenCallback);
    }

    static ReactElement summary(Func.Run1<HTMLProps> callback) {
        return create("summary", callback);
    }

    static ReactElement summary(Func.Run1<HTMLProps> callback, String text) {
        return create("summary", callback, text);
    }

    static ReactElement summary(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("summary", callback, child);
    }

    static ReactElement summary(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("summary", callback, children);
    }

    static ReactElement summary(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("summary", callback, childrenCallback);
    }

    static ReactElement summary(PropsAndChildren callback) {
        return create("summary", callback);
    }

    static ReactElement sup() {
        return create("sup");
    }

    static ReactElement sup(String value) {
        return create("sup", value);
    }

    static ReactElement sup(ReactElement child) {
        return create("sup", child);
    }

    static ReactElement sup(ReactElement... children) {
        return create("sup", children);
    }

    static ReactElement sup(StyleProps style) {
        return create("sup", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement sup(StyleProps style, String text) {
        return create("sup", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement sup(StyleProps style, ReactElement child) {
        return create("sup", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement sup(StyleProps style, ReactElement... children) {
        return create("sup", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement sup(HTMLProps props) {
        return create("sup", props);
    }

    static ReactElement sup(HTMLProps props, String text) {
        return create("sup", props, text);
    }

    static ReactElement sup(HTMLProps props, ReactElement child) {
        return create("sup", props, child);
    }

    static ReactElement sup(HTMLProps props, ReactElement... children) {
        return create("sup", props, children);
    }

    static ReactElement sup(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("sup", props, childrenCallback);
    }

    static ReactElement sup(Func.Run1<HTMLProps> callback) {
        return create("sup", callback);
    }

    static ReactElement sup(Func.Run1<HTMLProps> callback, String text) {
        return create("sup", callback, text);
    }

    static ReactElement sup(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("sup", callback, child);
    }

    static ReactElement sup(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("sup", callback, children);
    }

    static ReactElement sup(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("sup", callback, childrenCallback);
    }

    static ReactElement sup(PropsAndChildren callback) {
        return create("sup", callback);
    }

    static ReactElement table() {
        return create("table");
    }

    static ReactElement table(String value) {
        return create("table", value);
    }

    static ReactElement table(ReactElement child) {
        return create("table", child);
    }

    static ReactElement table(ReactElement... children) {
        return create("table", children);
    }

    static ReactElement table(StyleProps style) {
        return create("table", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement table(StyleProps style, String text) {
        return create("table", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement table(StyleProps style, ReactElement child) {
        return create("table", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement table(StyleProps style, ReactElement... children) {
        return create("table", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement table(HTMLProps props) {
        return create("table", props);
    }

    static ReactElement table(HTMLProps props, String text) {
        return create("table", props, text);
    }

    static ReactElement table(HTMLProps props, ReactElement child) {
        return create("table", props, child);
    }

    static ReactElement table(HTMLProps props, ReactElement... children) {
        return create("table", props, children);
    }

    static ReactElement table(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("table", props, childrenCallback);
    }

    static ReactElement table(Func.Run1<HTMLProps> callback) {
        return create("table", callback);
    }

    static ReactElement table(Func.Run1<HTMLProps> callback, String text) {
        return create("table", callback, text);
    }

    static ReactElement table(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("table", callback, child);
    }

    static ReactElement table(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("table", callback, children);
    }

    static ReactElement table(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("table", callback, childrenCallback);
    }

    static ReactElement table(PropsAndChildren callback) {
        return create("table", callback);
    }

    static ReactElement tbody() {
        return create("tbody");
    }

    static ReactElement tbody(String value) {
        return create("tbody", value);
    }

    static ReactElement tbody(ReactElement child) {
        return create("tbody", child);
    }

    static ReactElement tbody(ReactElement... children) {
        return create("tbody", children);
    }

    static ReactElement tbody(StyleProps style) {
        return create("tbody", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement tbody(StyleProps style, String text) {
        return create("tbody", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement tbody(StyleProps style, ReactElement child) {
        return create("tbody", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement tbody(StyleProps style, ReactElement... children) {
        return create("tbody", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement tbody(HTMLProps props) {
        return create("tbody", props);
    }

    static ReactElement tbody(HTMLProps props, String text) {
        return create("tbody", props, text);
    }

    static ReactElement tbody(HTMLProps props, ReactElement child) {
        return create("tbody", props, child);
    }

    static ReactElement tbody(HTMLProps props, ReactElement... children) {
        return create("tbody", props, children);
    }

    static ReactElement tbody(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("tbody", props, childrenCallback);
    }

    static ReactElement tbody(Func.Run1<HTMLProps> callback) {
        return create("tbody", callback);
    }

    static ReactElement tbody(Func.Run1<HTMLProps> callback, String text) {
        return create("tbody", callback, text);
    }

    static ReactElement tbody(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("tbody", callback, child);
    }

    static ReactElement tbody(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("tbody", callback, children);
    }

    static ReactElement tbody(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("tbody", callback, childrenCallback);
    }

    static ReactElement tbody(PropsAndChildren callback) {
        return create("tbody", callback);
    }

    static ReactElement td() {
        return create("td");
    }

    static ReactElement td(String value) {
        return create("td", value);
    }

    static ReactElement td(ReactElement child) {
        return create("td", child);
    }

    static ReactElement td(ReactElement... children) {
        return create("td", children);
    }

    static ReactElement td(StyleProps style) {
        return create("td", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement td(StyleProps style, String text) {
        return create("td", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement td(StyleProps style, ReactElement child) {
        return create("td", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement td(StyleProps style, ReactElement... children) {
        return create("td", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement td(HTMLProps props) {
        return create("td", props);
    }

    static ReactElement td(HTMLProps props, String text) {
        return create("td", props, text);
    }

    static ReactElement td(HTMLProps props, ReactElement child) {
        return create("td", props, child);
    }

    static ReactElement td(HTMLProps props, ReactElement... children) {
        return create("td", props, children);
    }

    static ReactElement td(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("td", props, childrenCallback);
    }

    static ReactElement td(Func.Run1<HTMLProps> callback) {
        return create("td", callback);
    }

    static ReactElement td(Func.Run1<HTMLProps> callback, String text) {
        return create("td", callback, text);
    }

    static ReactElement td(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("td", callback, child);
    }

    static ReactElement td(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("td", callback, children);
    }

    static ReactElement td(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("td", callback, childrenCallback);
    }

    static ReactElement td(PropsAndChildren callback) {
        return create("td", callback);
    }

    static ReactElement textarea() {
        return create("textarea");
    }

    static ReactElement textarea(String value) {
        return create("textarea", value);
    }

    static ReactElement textarea(ReactElement child) {
        return create("textarea", child);
    }

    static ReactElement textarea(ReactElement... children) {
        return create("textarea", children);
    }

    static ReactElement textarea(StyleProps style) {
        return create("textarea", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement textarea(StyleProps style, String text) {
        return create("textarea", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement textarea(StyleProps style, ReactElement child) {
        return create("textarea", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement textarea(StyleProps style, ReactElement... children) {
        return create("textarea", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement textarea(HTMLProps props) {
        return create("textarea", props);
    }

    static ReactElement textarea(HTMLProps props, String text) {
        return create("textarea", props, text);
    }

    static ReactElement textarea(HTMLProps props, ReactElement child) {
        return create("textarea", props, child);
    }

    static ReactElement textarea(HTMLProps props, ReactElement... children) {
        return create("textarea", props, children);
    }

    static ReactElement textarea(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("textarea", props, childrenCallback);
    }

    static ReactElement textarea(Func.Run1<HTMLProps> callback) {
        return create("textarea", callback);
    }

    static ReactElement textarea(Func.Run1<HTMLProps> callback, String text) {
        return create("textarea", callback, text);
    }

    static ReactElement textarea(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("textarea", callback, child);
    }

    static ReactElement textarea(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("textarea", callback, children);
    }

    static ReactElement textarea(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("textarea", callback, childrenCallback);
    }

    static ReactElement textarea(PropsAndChildren callback) {
        return create("textarea", callback);
    }

    static ReactElement tfoot() {
        return create("tfoot");
    }

    static ReactElement tfoot(String value) {
        return create("tfoot", value);
    }

    static ReactElement tfoot(ReactElement child) {
        return create("tfoot", child);
    }

    static ReactElement tfoot(ReactElement... children) {
        return create("tfoot", children);
    }

    static ReactElement tfoot(StyleProps style) {
        return create("tfoot", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement tfoot(StyleProps style, String text) {
        return create("tfoot", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement tfoot(StyleProps style, ReactElement child) {
        return create("tfoot", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement tfoot(StyleProps style, ReactElement... children) {
        return create("tfoot", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement tfoot(HTMLProps props) {
        return create("tfoot", props);
    }

    static ReactElement tfoot(HTMLProps props, String text) {
        return create("tfoot", props, text);
    }

    static ReactElement tfoot(HTMLProps props, ReactElement child) {
        return create("tfoot", props, child);
    }

    static ReactElement tfoot(HTMLProps props, ReactElement... children) {
        return create("tfoot", props, children);
    }

    static ReactElement tfoot(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("tfoot", props, childrenCallback);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps> callback) {
        return create("tfoot", callback);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps> callback, String text) {
        return create("tfoot", callback, text);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("tfoot", callback, child);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("tfoot", callback, children);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("tfoot", callback, childrenCallback);
    }

    static ReactElement tfoot(PropsAndChildren callback) {
        return create("tfoot", callback);
    }

    static ReactElement th() {
        return create("th");
    }

    static ReactElement th(String value) {
        return create("th", value);
    }

    static ReactElement th(ReactElement child) {
        return create("th", child);
    }

    static ReactElement th(ReactElement... children) {
        return create("th", children);
    }

    static ReactElement th(StyleProps style) {
        return create("th", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement th(StyleProps style, String text) {
        return create("th", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement th(StyleProps style, ReactElement child) {
        return create("th", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement th(StyleProps style, ReactElement... children) {
        return create("th", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement th(HTMLProps props) {
        return create("th", props);
    }

    static ReactElement th(HTMLProps props, String text) {
        return create("th", props, text);
    }

    static ReactElement th(HTMLProps props, ReactElement child) {
        return create("th", props, child);
    }

    static ReactElement th(HTMLProps props, ReactElement... children) {
        return create("th", props, children);
    }

    static ReactElement th(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("th", props, childrenCallback);
    }

    static ReactElement th(Func.Run1<HTMLProps> callback) {
        return create("th", callback);
    }

    static ReactElement th(Func.Run1<HTMLProps> callback, String text) {
        return create("th", callback, text);
    }

    static ReactElement th(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("th", callback, child);
    }

    static ReactElement th(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("th", callback, children);
    }

    static ReactElement th(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("th", callback, childrenCallback);
    }

    static ReactElement th(PropsAndChildren callback) {
        return create("th", callback);
    }

    static ReactElement thead() {
        return create("thead");
    }

    static ReactElement thead(String value) {
        return create("thead", value);
    }

    static ReactElement thead(ReactElement child) {
        return create("thead", child);
    }

    static ReactElement thead(ReactElement... children) {
        return create("thead", children);
    }

    static ReactElement thead(StyleProps style) {
        return create("thead", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement thead(StyleProps style, String text) {
        return create("thead", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement thead(StyleProps style, ReactElement child) {
        return create("thead", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement thead(StyleProps style, ReactElement... children) {
        return create("thead", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement thead(HTMLProps props) {
        return create("thead", props);
    }

    static ReactElement thead(HTMLProps props, String text) {
        return create("thead", props, text);
    }

    static ReactElement thead(HTMLProps props, ReactElement child) {
        return create("thead", props, child);
    }

    static ReactElement thead(HTMLProps props, ReactElement... children) {
        return create("thead", props, children);
    }

    static ReactElement thead(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("thead", props, childrenCallback);
    }

    static ReactElement thead(Func.Run1<HTMLProps> callback) {
        return create("thead", callback);
    }

    static ReactElement thead(Func.Run1<HTMLProps> callback, String text) {
        return create("thead", callback, text);
    }

    static ReactElement thead(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("thead", callback, child);
    }

    static ReactElement thead(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("thead", callback, children);
    }

    static ReactElement thead(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("thead", callback, childrenCallback);
    }

    static ReactElement thead(PropsAndChildren callback) {
        return create("thead", callback);
    }

    static ReactElement time() {
        return create("time");
    }

    static ReactElement time(String value) {
        return create("time", value);
    }

    static ReactElement time(ReactElement child) {
        return create("time", child);
    }

    static ReactElement time(ReactElement... children) {
        return create("time", children);
    }

    static ReactElement time(StyleProps style) {
        return create("time", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement time(StyleProps style, String text) {
        return create("time", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement time(StyleProps style, ReactElement child) {
        return create("time", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement time(StyleProps style, ReactElement... children) {
        return create("time", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement time(HTMLProps props) {
        return create("time", props);
    }

    static ReactElement time(HTMLProps props, String text) {
        return create("time", props, text);
    }

    static ReactElement time(HTMLProps props, ReactElement child) {
        return create("time", props, child);
    }

    static ReactElement time(HTMLProps props, ReactElement... children) {
        return create("time", props, children);
    }

    static ReactElement time(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("time", props, childrenCallback);
    }

    static ReactElement time(Func.Run1<HTMLProps> callback) {
        return create("time", callback);
    }

    static ReactElement time(Func.Run1<HTMLProps> callback, String text) {
        return create("time", callback, text);
    }

    static ReactElement time(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("time", callback, child);
    }

    static ReactElement time(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("time", callback, children);
    }

    static ReactElement time(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("time", callback, childrenCallback);
    }

    static ReactElement time(PropsAndChildren callback) {
        return create("time", callback);
    }

    static ReactElement title() {
        return create("title");
    }

    static ReactElement title(String value) {
        return create("title", value);
    }

    static ReactElement title(ReactElement child) {
        return create("title", child);
    }

    static ReactElement title(ReactElement... children) {
        return create("title", children);
    }

    static ReactElement title(StyleProps style) {
        return create("title", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement title(StyleProps style, String text) {
        return create("title", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement title(StyleProps style, ReactElement child) {
        return create("title", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement title(StyleProps style, ReactElement... children) {
        return create("title", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement title(HTMLProps props) {
        return create("title", props);
    }

    static ReactElement title(HTMLProps props, String text) {
        return create("title", props, text);
    }

    static ReactElement title(HTMLProps props, ReactElement child) {
        return create("title", props, child);
    }

    static ReactElement title(HTMLProps props, ReactElement... children) {
        return create("title", props, children);
    }

    static ReactElement title(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("title", props, childrenCallback);
    }

    static ReactElement title(Func.Run1<HTMLProps> callback) {
        return create("title", callback);
    }

    static ReactElement title(Func.Run1<HTMLProps> callback, String text) {
        return create("title", callback, text);
    }

    static ReactElement title(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("title", callback, child);
    }

    static ReactElement title(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("title", callback, children);
    }

    static ReactElement title(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("title", callback, childrenCallback);
    }

    static ReactElement title(PropsAndChildren callback) {
        return create("title", callback);
    }

    static ReactElement tr() {
        return create("tr");
    }

    static ReactElement tr(String value) {
        return create("tr", value);
    }

    static ReactElement tr(ReactElement child) {
        return create("tr", child);
    }

    static ReactElement tr(ReactElement... children) {
        return create("tr", children);
    }

    static ReactElement tr(StyleProps style) {
        return create("tr", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement tr(StyleProps style, String text) {
        return create("tr", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement tr(StyleProps style, ReactElement child) {
        return create("tr", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement tr(StyleProps style, ReactElement... children) {
        return create("tr", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement tr(HTMLProps props) {
        return create("tr", props);
    }

    static ReactElement tr(HTMLProps props, String text) {
        return create("tr", props, text);
    }

    static ReactElement tr(HTMLProps props, ReactElement child) {
        return create("tr", props, child);
    }

    static ReactElement tr(HTMLProps props, ReactElement... children) {
        return create("tr", props, children);
    }

    static ReactElement tr(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("tr", props, childrenCallback);
    }

    static ReactElement tr(Func.Run1<HTMLProps> callback) {
        return create("tr", callback);
    }

    static ReactElement tr(Func.Run1<HTMLProps> callback, String text) {
        return create("tr", callback, text);
    }

    static ReactElement tr(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("tr", callback, child);
    }

    static ReactElement tr(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("tr", callback, children);
    }

    static ReactElement tr(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("tr", callback, childrenCallback);
    }

    static ReactElement tr(PropsAndChildren callback) {
        return create("tr", callback);
    }

    static ReactElement track() {
        return create("track");
    }

    static ReactElement track(String value) {
        return create("track", value);
    }

    static ReactElement track(ReactElement child) {
        return create("track", child);
    }

    static ReactElement track(ReactElement... children) {
        return create("track", children);
    }

    static ReactElement track(StyleProps style) {
        return create("track", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement track(StyleProps style, String text) {
        return create("track", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement track(StyleProps style, ReactElement child) {
        return create("track", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement track(StyleProps style, ReactElement... children) {
        return create("track", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement track(HTMLProps props) {
        return create("track", props);
    }

    static ReactElement track(HTMLProps props, String text) {
        return create("track", props, text);
    }

    static ReactElement track(HTMLProps props, ReactElement child) {
        return create("track", props, child);
    }

    static ReactElement track(HTMLProps props, ReactElement... children) {
        return create("track", props, children);
    }

    static ReactElement track(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("track", props, childrenCallback);
    }

    static ReactElement track(Func.Run1<HTMLProps> callback) {
        return create("track", callback);
    }

    static ReactElement track(Func.Run1<HTMLProps> callback, String text) {
        return create("track", callback, text);
    }

    static ReactElement track(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("track", callback, child);
    }

    static ReactElement track(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("track", callback, children);
    }

    static ReactElement track(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("track", callback, childrenCallback);
    }

    static ReactElement track(PropsAndChildren callback) {
        return create("track", callback);
    }

    static ReactElement u() {
        return create("u");
    }

    static ReactElement u(String value) {
        return create("u", value);
    }

    static ReactElement u(ReactElement child) {
        return create("u", child);
    }

    static ReactElement u(ReactElement... children) {
        return create("u", children);
    }

    static ReactElement u(StyleProps style) {
        return create("u", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement u(StyleProps style, String text) {
        return create("u", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement u(StyleProps style, ReactElement child) {
        return create("u", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement u(StyleProps style, ReactElement... children) {
        return create("u", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement u(HTMLProps props) {
        return create("u", props);
    }

    static ReactElement u(HTMLProps props, String text) {
        return create("u", props, text);
    }

    static ReactElement u(HTMLProps props, ReactElement child) {
        return create("u", props, child);
    }

    static ReactElement u(HTMLProps props, ReactElement... children) {
        return create("u", props, children);
    }

    static ReactElement u(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("u", props, childrenCallback);
    }

    static ReactElement u(Func.Run1<HTMLProps> callback) {
        return create("u", callback);
    }

    static ReactElement u(Func.Run1<HTMLProps> callback, String text) {
        return create("u", callback, text);
    }

    static ReactElement u(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("u", callback, child);
    }

    static ReactElement u(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("u", callback, children);
    }

    static ReactElement u(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("u", callback, childrenCallback);
    }

    static ReactElement u(PropsAndChildren callback) {
        return create("u", callback);
    }

    static ReactElement ul() {
        return create("ul");
    }

    static ReactElement ul(String value) {
        return create("ul", value);
    }

    static ReactElement ul(ReactElement child) {
        return create("ul", child);
    }

    static ReactElement ul(ReactElement... children) {
        return create("ul", children);
    }

    static ReactElement ul(StyleProps style) {
        return create("ul", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement ul(StyleProps style, String text) {
        return create("ul", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement ul(StyleProps style, ReactElement child) {
        return create("ul", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement ul(StyleProps style, ReactElement... children) {
        return create("ul", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement ul(HTMLProps props) {
        return create("ul", props);
    }

    static ReactElement ul(HTMLProps props, String text) {
        return create("ul", props, text);
    }

    static ReactElement ul(HTMLProps props, ReactElement child) {
        return create("ul", props, child);
    }

    static ReactElement ul(HTMLProps props, ReactElement... children) {
        return create("ul", props, children);
    }

    static ReactElement ul(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("ul", props, childrenCallback);
    }

    static ReactElement ul(Func.Run1<HTMLProps> callback) {
        return create("ul", callback);
    }

    static ReactElement ul(Func.Run1<HTMLProps> callback, String text) {
        return create("ul", callback, text);
    }

    static ReactElement ul(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("ul", callback, child);
    }

    static ReactElement ul(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("ul", callback, children);
    }

    static ReactElement ul(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("ul", callback, childrenCallback);
    }

    static ReactElement ul(PropsAndChildren callback) {
        return create("ul", callback);
    }

    static ReactElement use() {
        return create("use");
    }

    static ReactElement use(String value) {
        return create("use", value);
    }

    static ReactElement use(ReactElement child) {
        return create("use", child);
    }

    static ReactElement use(ReactElement... children) {
        return create("use", children);
    }

    static ReactElement use(StyleProps style) {
        return create("use", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement use(StyleProps style, String text) {
        return create("use", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement use(StyleProps style, ReactElement child) {
        return create("use", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement use(StyleProps style, ReactElement... children) {
        return create("use", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement use(HTMLProps props) {
        return create("use", props);
    }

    static ReactElement use(HTMLProps props, String text) {
        return create("use", props, text);
    }

    static ReactElement use(HTMLProps props, ReactElement child) {
        return create("use", props, child);
    }

    static ReactElement use(HTMLProps props, ReactElement... children) {
        return create("use", props, children);
    }

    static ReactElement use(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("use", props, childrenCallback);
    }

    static ReactElement use(Func.Run1<HTMLProps> callback) {
        return create("use", callback);
    }

    static ReactElement use(Func.Run1<HTMLProps> callback, String text) {
        return create("use", callback, text);
    }

    static ReactElement use(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("use", callback, child);
    }

    static ReactElement use(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("use", callback, children);
    }

    static ReactElement use(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("use", callback, childrenCallback);
    }

    static ReactElement use(PropsAndChildren callback) {
        return create("use", callback);
    }

    static ReactElement var() {
        return create("var");
    }

    static ReactElement var(String value) {
        return create("var", value);
    }

    static ReactElement var(ReactElement child) {
        return create("var", child);
    }

    static ReactElement var(ReactElement... children) {
        return create("var", children);
    }

    static ReactElement var(StyleProps style) {
        return create("var", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement var(StyleProps style, String text) {
        return create("var", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement var(StyleProps style, ReactElement child) {
        return create("var", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement var(StyleProps style, ReactElement... children) {
        return create("var", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement var(HTMLProps props) {
        return create("var", props);
    }

    static ReactElement var(HTMLProps props, String text) {
        return create("var", props, text);
    }

    static ReactElement var(HTMLProps props, ReactElement child) {
        return create("var", props, child);
    }

    static ReactElement var(HTMLProps props, ReactElement... children) {
        return create("var", props, children);
    }

    static ReactElement var(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("var", props, childrenCallback);
    }

    static ReactElement var(Func.Run1<HTMLProps> callback) {
        return create("var", callback);
    }

    static ReactElement var(Func.Run1<HTMLProps> callback, String text) {
        return create("var", callback, text);
    }

    static ReactElement var(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("var", callback, child);
    }

    static ReactElement var(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("var", callback, children);
    }

    static ReactElement var(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("var", callback, childrenCallback);
    }

    static ReactElement var(PropsAndChildren callback) {
        return create("var", callback);
    }

    static ReactElement video() {
        return create("video");
    }

    static ReactElement video(String value) {
        return create("video", value);
    }

    static ReactElement video(ReactElement child) {
        return create("video", child);
    }

    static ReactElement video(ReactElement... children) {
        return create("video", children);
    }

    static ReactElement video(StyleProps style) {
        return create("video", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement video(StyleProps style, String text) {
        return create("video", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement video(StyleProps style, ReactElement child) {
        return create("video", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement video(StyleProps style, ReactElement... children) {
        return create("video", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement video(HTMLProps props) {
        return create("video", props);
    }

    static ReactElement video(HTMLProps props, String text) {
        return create("video", props, text);
    }

    static ReactElement video(HTMLProps props, ReactElement child) {
        return create("video", props, child);
    }

    static ReactElement video(HTMLProps props, ReactElement... children) {
        return create("video", props, children);
    }

    static ReactElement video(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("video", props, childrenCallback);
    }

    static ReactElement video(Func.Run1<HTMLProps> callback) {
        return create("video", callback);
    }

    static ReactElement video(Func.Run1<HTMLProps> callback, String text) {
        return create("video", callback, text);
    }

    static ReactElement video(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("video", callback, child);
    }

    static ReactElement video(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("video", callback, children);
    }

    static ReactElement video(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("video", callback, childrenCallback);
    }

    static ReactElement video(PropsAndChildren callback) {
        return create("video", callback);
    }

    static ReactElement wbr() {
        return create("wbr");
    }

    static ReactElement wbr(String value) {
        return create("wbr", value);
    }

    static ReactElement wbr(ReactElement child) {
        return create("wbr", child);
    }

    static ReactElement wbr(ReactElement... children) {
        return create("wbr", children);
    }

    static ReactElement wbr(StyleProps style) {
        return create("wbr", style != null ? style.lift() : new HTMLProps());
    }

    static ReactElement wbr(StyleProps style, String text) {
        return create("wbr", style != null ? style.lift() : new HTMLProps(), text);
    }

    static ReactElement wbr(StyleProps style, ReactElement child) {
        return create("wbr", style != null ? style.lift() : new HTMLProps(), child);
    }

    static ReactElement wbr(StyleProps style, ReactElement... children) {
        return create("wbr", style != null ? style.lift() : new HTMLProps(), children);
    }

    static ReactElement wbr(HTMLProps props) {
        return create("wbr", props);
    }

    static ReactElement wbr(HTMLProps props, String text) {
        return create("wbr", props, text);
    }

    static ReactElement wbr(HTMLProps props, ReactElement child) {
        return create("wbr", props, child);
    }

    static ReactElement wbr(HTMLProps props, ReactElement... children) {
        return create("wbr", props, children);
    }

    static ReactElement wbr(HTMLProps props, Func.Run1<Children> childrenCallback) {
        return create("wbr", props, childrenCallback);
    }

    static ReactElement wbr(Func.Run1<HTMLProps> callback) {
        return create("wbr", callback);
    }

    static ReactElement wbr(Func.Run1<HTMLProps> callback, String text) {
        return create("wbr", callback, text);
    }

    static ReactElement wbr(Func.Run1<HTMLProps> callback, ReactElement child) {
        return create("wbr", callback, child);
    }

    static ReactElement wbr(Func.Run1<HTMLProps> callback, ReactElement... children) {
        return create("wbr", callback, children);
    }

    static ReactElement wbr(Func.Run1<HTMLProps> callback, Func.Run1<Children> childrenCallback) {
        return create("wbr", callback, childrenCallback);
    }

    static ReactElement wbr(PropsAndChildren callback) {
        return create("wbr", callback);
    }

    @JsFunction
    interface PropsAndChildren {
        void run(HTMLProps props, Children children);
    }
}
