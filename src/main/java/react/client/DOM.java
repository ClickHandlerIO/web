package react.client;

import common.client.Func;
import elemental.dom.Element;
import elemental.html.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public interface DOM {
    static <T> HTMLProps<T> props(String tagName) {
        final HTMLProps<T> props = new HTMLProps<>();

//        props.key(ChildCounter.get().newKey());

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

    static ReactElement create(String tagName, Object... children) {
//        if (children != null)
//            Try.silent(() -> Jso.set(children, "key", ChildCounter.get().newKey()));
        return React.createElement(
            tagName,
            props(tagName),
            children
        );
    }

    static <E extends Element> ReactElement create(String tagName, Func.Run1<HTMLProps<E>> callback, String html) {
        final HTMLProps props = props(tagName);
        callback.run(props);
        return React.createElement(
            tagName,
            props,
            html
        );
    }

    static <E extends Element> ReactElement create(String tagName, Func.Run1<HTMLProps<E>> callback) {
        final HTMLProps<E> props = props(tagName);
        callback.run(props);
        return React.createElement(
            tagName,
            props
        );
    }

    static <E extends Element> ReactElement create(String tagName, Func.Run1<HTMLProps<E>> callback, Object... children) {
        final HTMLProps<E> props = props(tagName);
        callback.run(props);
        return React.createElement(
            tagName,
            props,
            children
        );
    }

    static <E extends Element> ReactElement create(String tagName,
                                                   Func.Run1<HTMLProps<E>> callback,
                                                   Func.Run1<ChildList> childrenCallback) {
        final HTMLProps<E> props = props(tagName);
        callback.run(props);
        final ChildList components = new ChildList();
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

    static ReactElement create(String tagName, HTMLProps props, ReactElement... components) {
        return React.createElement(
            tagName,
            props,
            components
        );
    }

    static <P extends BaseProps, S> ReactElement el(ReactComponent component, P props, Object... children) {
        return React.createElement(component, props, children);
    }

    static ReactElement a() {
        return create("a");
    }

    static ReactElement a(String value) {
        return create("a", value);
    }

    static ReactElement a(Object... children) {
        return create("a", children);
    }

    static ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback, String html) {
        return create("a", callback, html);
    }

    static ReactElement a(HTMLProps<AnchorElement> props) {
        return create("a", props);
    }

    static ReactElement a(HTMLProps<AnchorElement> props, String html) {
        return create("a", props, html);
    }

    static ReactElement a(HTMLProps<AnchorElement> props, Object... children) {
        return create("a", props, children);
    }

    static ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("a", callback, childrenCallback);
    }

    static ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback) {
        return create("a", callback);
    }

    static ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback, Object... children) {
        return create("a", callback, children);
    }

    static ReactElement abbr() {
        return create("abbr");
    }

    static ReactElement abbr(String value) {
        return create("abbr", value);
    }

    static ReactElement abbr(Object... children) {
        return create("abbr", children);
    }

    static ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback, String html) {
        return create("abbr", callback, html);
    }

    static ReactElement abbr(HTMLProps<AnchorElement> props) {
        return create("abbr", props);
    }

    static ReactElement abbr(HTMLProps<AnchorElement> props, String html) {
        return create("abbr", props, html);
    }

    static ReactElement abbr(HTMLProps<AnchorElement> props, Object... children) {
        return create("abbr", props, children);
    }

    static ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("abbr", callback, childrenCallback);
    }

    static ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback) {
        return create("abbr", callback);
    }

    static ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback, Object... children) {
        return create("abbr", callback, children);
    }

    static ReactElement address() {
        return create("address");
    }

    static ReactElement address(String value) {
        return create("address", value);
    }

    static ReactElement address(Object... children) {
        return create("address", children);
    }

    static ReactElement address(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("address", callback, html);
    }

    static ReactElement address(HTMLProps<Element> props) {
        return create("address", props);
    }

    static ReactElement address(HTMLProps<Element> props, String html) {
        return create("address", props, html);
    }

    static ReactElement address(HTMLProps<Element> props, Object... children) {
        return create("address", props, children);
    }

    static ReactElement address(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("address", callback, childrenCallback);
    }

    static ReactElement address(Func.Run1<HTMLProps<Element>> callback) {
        return create("address", callback);
    }

    static ReactElement address(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("address", callback, children);
    }

    static ReactElement area() {
        return create("area");
    }

    static ReactElement area(String value) {
        return create("area", value);
    }

    static ReactElement area(Object... children) {
        return create("area", children);
    }

    static ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback, String html) {
        return create("area", callback, html);
    }

    static ReactElement area(HTMLProps<AreaElement> props) {
        return create("area", props);
    }

    static ReactElement area(HTMLProps<AreaElement> props, String html) {
        return create("area", props, html);
    }

    static ReactElement area(HTMLProps<AreaElement> props, Object... children) {
        return create("area", props, children);
    }

    static ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("area", callback, childrenCallback);
    }

    static ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback) {
        return create("area", callback);
    }

    static ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback, Object... children) {
        return create("area", callback, children);
    }

    static ReactElement article() {
        return create("article");
    }

    static ReactElement article(String value) {
        return create("article", value);
    }

    static ReactElement article(Object... children) {
        return create("article", children);
    }

    static ReactElement article(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("article", callback, html);
    }

    static ReactElement article(HTMLProps<Element> props) {
        return create("article", props);
    }

    static ReactElement article(HTMLProps<Element> props, String html) {
        return create("article", props, html);
    }

    static ReactElement article(HTMLProps<Element> props, Object... children) {
        return create("article", props, children);
    }

    static ReactElement article(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("article", callback, childrenCallback);
    }

    static ReactElement article(Func.Run1<HTMLProps<Element>> callback) {
        return create("article", callback);
    }

    static ReactElement article(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("article", callback, children);
    }

    static ReactElement aside() {
        return create("aside");
    }

    static ReactElement aside(String value) {
        return create("aside", value);
    }

    static ReactElement aside(Object... children) {
        return create("aside", children);
    }

    static ReactElement aside(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("aside", callback, html);
    }

    static ReactElement aside(HTMLProps<Element> props) {
        return create("aside", props);
    }

    static ReactElement aside(HTMLProps<Element> props, String html) {
        return create("aside", props, html);
    }

    static ReactElement aside(HTMLProps<Element> props, Object... children) {
        return create("aside", props, children);
    }

    static ReactElement aside(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("aside", callback, childrenCallback);
    }

    static ReactElement aside(Func.Run1<HTMLProps<Element>> callback) {
        return create("aside", callback);
    }

    static ReactElement aside(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("aside", callback, children);
    }

    static ReactElement audio() {
        return create("audio");
    }

    static ReactElement audio(String value) {
        return create("audio", value);
    }

    static ReactElement audio(Object... children) {
        return create("audio", children);
    }

    static ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback, String html) {
        return create("audio", callback, html);
    }

    static ReactElement audio(HTMLProps<AudioElement> props) {
        return create("audio", props);
    }

    static ReactElement audio(HTMLProps<AudioElement> props, String html) {
        return create("audio", props, html);
    }

    static ReactElement audio(HTMLProps<AudioElement> props, Object... children) {
        return create("audio", props, children);
    }

    static ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("audio", callback, childrenCallback);
    }

    static ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback) {
        return create("audio", callback);
    }

    static ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback, Object... children) {
        return create("audio", callback, children);
    }

    static ReactElement b() {
        return create("b");
    }

    static ReactElement b(String value) {
        return create("b", value);
    }

    static ReactElement b(Object... children) {
        return create("b", children);
    }

    static ReactElement b(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("b", callback, html);
    }

    static ReactElement b(HTMLProps<Element> props) {
        return create("b", props);
    }

    static ReactElement b(HTMLProps<Element> props, String html) {
        return create("b", props, html);
    }

    static ReactElement b(HTMLProps<Element> props, Object... children) {
        return create("b", props, children);
    }

    static ReactElement b(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("b", callback, childrenCallback);
    }

    static ReactElement b(Func.Run1<HTMLProps<Element>> callback) {
        return create("b", callback);
    }

    static ReactElement b(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("b", callback, children);
    }

    static ReactElement base() {
        return create("base");
    }

    static ReactElement base(String value) {
        return create("base", value);
    }

    static ReactElement base(Object... children) {
        return create("base", children);
    }

    static ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback, String html) {
        return create("base", callback, html);
    }

    static ReactElement base(HTMLProps<BaseElement> props) {
        return create("base", props);
    }

    static ReactElement base(HTMLProps<BaseElement> props, String html) {
        return create("base", props, html);
    }

    static ReactElement base(HTMLProps<BaseElement> props, Object... children) {
        return create("base", props, children);
    }

    static ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("base", callback, childrenCallback);
    }

    static ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback) {
        return create("base", callback);
    }

    static ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback, Object... children) {
        return create("base", callback, children);
    }

    static ReactElement bdi() {
        return create("bdi");
    }

    static ReactElement bdi(String value) {
        return create("bdi", value);
    }

    static ReactElement bdi(Object... children) {
        return create("bdi", children);
    }

    static ReactElement bdi(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("bdi", callback, html);
    }

    static ReactElement bdi(HTMLProps<Element> props) {
        return create("bdi", props);
    }

    static ReactElement bdi(HTMLProps<Element> props, String html) {
        return create("bdi", props, html);
    }

    static ReactElement bdi(HTMLProps<Element> props, Object... children) {
        return create("bdi", props, children);
    }

    static ReactElement bdi(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("bdi", callback, childrenCallback);
    }

    static ReactElement bdi(Func.Run1<HTMLProps<Element>> callback) {
        return create("bdi", callback);
    }

    static ReactElement bdi(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("bdi", callback, children);
    }

    static ReactElement bdo() {
        return create("bdo");
    }

    static ReactElement bdo(String value) {
        return create("bdo", value);
    }

    static ReactElement bdo(Object... children) {
        return create("bdo", children);
    }

    static ReactElement bdo(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("bdo", callback, html);
    }

    static ReactElement bdo(HTMLProps<Element> props) {
        return create("bdo", props);
    }

    static ReactElement bdo(HTMLProps<Element> props, String html) {
        return create("bdo", props, html);
    }

    static ReactElement bdo(HTMLProps<Element> props, Object... children) {
        return create("bdo", props, children);
    }

    static ReactElement bdo(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("bdo", callback, childrenCallback);
    }

    static ReactElement bdo(Func.Run1<HTMLProps<Element>> callback) {
        return create("bdo", callback);
    }

    static ReactElement bdo(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("bdo", callback, children);
    }

    static ReactElement big() {
        return create("big");
    }

    static ReactElement big(String value) {
        return create("big", value);
    }

    static ReactElement big(Object... children) {
        return create("big", children);
    }

    static ReactElement big(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("big", callback, html);
    }

    static ReactElement big(HTMLProps<Element> props) {
        return create("big", props);
    }

    static ReactElement big(HTMLProps<Element> props, String html) {
        return create("big", props, html);
    }

    static ReactElement big(HTMLProps<Element> props, Object... children) {
        return create("big", props, children);
    }

    static ReactElement big(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("big", callback, childrenCallback);
    }

    static ReactElement big(Func.Run1<HTMLProps<Element>> callback) {
        return create("big", callback);
    }

    static ReactElement big(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("big", callback, children);
    }

    static ReactElement blockquote() {
        return create("blockquote");
    }

    static ReactElement blockquote(String value) {
        return create("blockquote", value);
    }

    static ReactElement blockquote(Object... children) {
        return create("blockquote", children);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("blockquote", callback, html);
    }

    static ReactElement blockquote(HTMLProps<Element> props) {
        return create("blockquote", props);
    }

    static ReactElement blockquote(HTMLProps<Element> props, String html) {
        return create("blockquote", props, html);
    }

    static ReactElement blockquote(HTMLProps<Element> props, Object... children) {
        return create("blockquote", props, children);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("blockquote", callback, childrenCallback);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback) {
        return create("blockquote", callback);
    }

    static ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("blockquote", callback, children);
    }

    static ReactElement body() {
        return create("body");
    }

    static ReactElement body(String value) {
        return create("body", value);
    }

    static ReactElement body(Object... children) {
        return create("body", children);
    }

    static ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback, String html) {
        return create("body", callback, html);
    }

    static ReactElement body(HTMLProps<BodyElement> props) {
        return create("body", props);
    }

    static ReactElement body(HTMLProps<BodyElement> props, String html) {
        return create("body", props, html);
    }

    static ReactElement body(HTMLProps<BodyElement> props, Object... children) {
        return create("body", props, children);
    }

    static ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("body", callback, childrenCallback);
    }

    static ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback) {
        return create("body", callback);
    }

    static ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback, Object... children) {
        return create("body", callback, children);
    }

    static ReactElement br() {
        return create("br");
    }

    static ReactElement br(String value) {
        return create("br", value);
    }

    static ReactElement br(Object... children) {
        return create("br", children);
    }

    static ReactElement br(Func.Run1<HTMLProps<BRElement>> callback, String html) {
        return create("br", callback, html);
    }

    static ReactElement br(HTMLProps<BRElement> props) {
        return create("br", props);
    }

    static ReactElement br(HTMLProps<BRElement> props, String html) {
        return create("br", props, html);
    }

    static ReactElement br(HTMLProps<BRElement> props, Object... children) {
        return create("br", props, children);
    }

    static ReactElement br(Func.Run1<HTMLProps<BRElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("br", callback, childrenCallback);
    }

    static ReactElement br(Func.Run1<HTMLProps<BRElement>> callback) {
        return create("br", callback);
    }

    static ReactElement br(Func.Run1<HTMLProps<BRElement>> callback, Object... children) {
        return create("br", callback, children);
    }

    static ReactElement button() {
        return create("button");
    }

    static ReactElement button(String value) {
        return create("button", value);
    }

    static ReactElement button(Object... children) {
        return create("button", children);
    }

    static ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback, String html) {
        return create("button", callback, html);
    }

    static ReactElement button(HTMLProps<ButtonElement> props) {
        return create("button", props);
    }

    static ReactElement button(HTMLProps<ButtonElement> props, String html) {
        return create("button", props, html);
    }

    static ReactElement button(HTMLProps<ButtonElement> props, Object... children) {
        return create("button", props, children);
    }

    static ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("button", callback, childrenCallback);
    }

    static ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback) {
        return create("button", callback);
    }

    static ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback, Object... children) {
        return create("button", callback, children);
    }

    static ReactElement canvas() {
        return create("canvas");
    }

    static ReactElement canvas(String value) {
        return create("canvas", value);
    }

    static ReactElement canvas(Object... children) {
        return create("canvas", children);
    }

    static ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback, String html) {
        return create("canvas", callback, html);
    }

    static ReactElement canvas(HTMLProps<CanvasElement> props) {
        return create("canvas", props);
    }

    static ReactElement canvas(HTMLProps<CanvasElement> props, String html) {
        return create("canvas", props, html);
    }

    static ReactElement canvas(HTMLProps<CanvasElement> props, Object... children) {
        return create("canvas", props, children);
    }

    static ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("canvas", callback, childrenCallback);
    }

    static ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback) {
        return create("canvas", callback);
    }

    static ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback, Object... children) {
        return create("canvas", callback, children);
    }

    static ReactElement caption() {
        return create("caption");
    }

    static ReactElement caption(String value) {
        return create("caption", value);
    }

    static ReactElement caption(Object... children) {
        return create("caption", children);
    }

    static ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback, String html) {
        return create("caption", callback, html);
    }

    static ReactElement caption(HTMLProps<TableCaptionElement> props) {
        return create("caption", props);
    }

    static ReactElement caption(HTMLProps<TableCaptionElement> props, String html) {
        return create("caption", props, html);
    }

    static ReactElement caption(HTMLProps<TableCaptionElement> props, Object... children) {
        return create("caption", props, children);
    }

    static ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("caption", callback, childrenCallback);
    }

    static ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback) {
        return create("caption", callback);
    }

    static ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback, Object... children) {
        return create("caption", callback, children);
    }

    static ReactElement cite() {
        return create("cite");
    }

    static ReactElement cite(String value) {
        return create("cite", value);
    }

    static ReactElement cite(Object... children) {
        return create("cite", children);
    }

    static ReactElement cite(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("cite", callback, html);
    }

    static ReactElement cite(HTMLProps<Element> props) {
        return create("cite", props);
    }

    static ReactElement cite(HTMLProps<Element> props, String html) {
        return create("cite", props, html);
    }

    static ReactElement cite(HTMLProps<Element> props, Object... children) {
        return create("cite", props, children);
    }

    static ReactElement cite(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("cite", callback, childrenCallback);
    }

    static ReactElement cite(Func.Run1<HTMLProps<Element>> callback) {
        return create("cite", callback);
    }

    static ReactElement cite(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("cite", callback, children);
    }

    static ReactElement code() {
        return create("code");
    }

    static ReactElement code(String value) {
        return create("code", value);
    }

    static ReactElement code(Object... children) {
        return create("code", children);
    }

    static ReactElement code(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("code", callback, html);
    }

    static ReactElement code(HTMLProps<Element> props) {
        return create("code", props);
    }

    static ReactElement code(HTMLProps<Element> props, String html) {
        return create("code", props, html);
    }

    static ReactElement code(HTMLProps<Element> props, Object... children) {
        return create("code", props, children);
    }

    static ReactElement code(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("code", callback, childrenCallback);
    }

    static ReactElement code(Func.Run1<HTMLProps<Element>> callback) {
        return create("code", callback);
    }

    static ReactElement code(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("code", callback, children);
    }

    static ReactElement col() {
        return create("col");
    }

    static ReactElement col(String value) {
        return create("col", value);
    }

    static ReactElement col(Object... children) {
        return create("col", children);
    }

    static ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback, String html) {
        return create("col", callback, html);
    }

    static ReactElement col(HTMLProps<TableColElement> props) {
        return create("col", props);
    }

    static ReactElement col(HTMLProps<TableColElement> props, String html) {
        return create("col", props, html);
    }

    static ReactElement col(HTMLProps<TableColElement> props, Object... children) {
        return create("col", props, children);
    }

    static ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("col", callback, childrenCallback);
    }

    static ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback) {
        return create("col", callback);
    }

    static ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback, Object... children) {
        return create("col", callback, children);
    }

    static ReactElement colgroup() {
        return create("colgroup");
    }

    static ReactElement colgroup(String value) {
        return create("colgroup", value);
    }

    static ReactElement colgroup(Object... children) {
        return create("colgroup", children);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("colgroup", callback, html);
    }

    static ReactElement colgroup(HTMLProps<Element> props) {
        return create("colgroup", props);
    }

    static ReactElement colgroup(HTMLProps<Element> props, String html) {
        return create("colgroup", props, html);
    }

    static ReactElement colgroup(HTMLProps<Element> props, Object... children) {
        return create("colgroup", props, children);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("colgroup", callback, childrenCallback);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback) {
        return create("colgroup", callback);
    }

    static ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("colgroup", callback, children);
    }

    static ReactElement data() {
        return create("data");
    }

    static ReactElement data(String value) {
        return create("data", value);
    }

    static ReactElement data(Object... children) {
        return create("data", children);
    }

    static ReactElement data(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("data", callback, html);
    }

    static ReactElement data(HTMLProps<Element> props) {
        return create("data", props);
    }

    static ReactElement data(HTMLProps<Element> props, String html) {
        return create("data", props, html);
    }

    static ReactElement data(HTMLProps<Element> props, Object... children) {
        return create("data", props, children);
    }

    static ReactElement data(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("data", callback, childrenCallback);
    }

    static ReactElement data(Func.Run1<HTMLProps<Element>> callback) {
        return create("data", callback);
    }

    static ReactElement data(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("data", callback, children);
    }

    static ReactElement datalist() {
        return create("datalist");
    }

    static ReactElement datalist(String value) {
        return create("datalist", value);
    }

    static ReactElement datalist(Object... children) {
        return create("datalist", children);
    }

    static ReactElement datalist(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("datalist", callback, html);
    }

    static ReactElement datalist(HTMLProps<Element> props) {
        return create("datalist", props);
    }

    static ReactElement datalist(HTMLProps<Element> props, String html) {
        return create("datalist", props, html);
    }

    static ReactElement datalist(HTMLProps<Element> props, Object... children) {
        return create("datalist", props, children);
    }

    static ReactElement datalist(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("datalist", callback, childrenCallback);
    }

    static ReactElement datalist(Func.Run1<HTMLProps<Element>> callback) {
        return create("datalist", callback);
    }

    static ReactElement datalist(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("datalist", callback, children);
    }

    static ReactElement dd() {
        return create("dd");
    }

    static ReactElement dd(String value) {
        return create("dd", value);
    }

    static ReactElement dd(Object... children) {
        return create("dd", children);
    }

    static ReactElement dd(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dd", callback, html);
    }

    static ReactElement dd(HTMLProps<Element> props) {
        return create("dd", props);
    }

    static ReactElement dd(HTMLProps<Element> props, String html) {
        return create("dd", props, html);
    }

    static ReactElement dd(HTMLProps<Element> props, Object... children) {
        return create("dd", props, children);
    }

    static ReactElement dd(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dd", callback, childrenCallback);
    }

    static ReactElement dd(Func.Run1<HTMLProps<Element>> callback) {
        return create("dd", callback);
    }

    static ReactElement dd(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dd", callback, children);
    }

    static ReactElement del() {
        return create("del");
    }

    static ReactElement del(String value) {
        return create("del", value);
    }

    static ReactElement del(Object... children) {
        return create("del", children);
    }

    static ReactElement del(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("del", callback, html);
    }

    static ReactElement del(HTMLProps<Element> props) {
        return create("del", props);
    }

    static ReactElement del(HTMLProps<Element> props, String html) {
        return create("del", props, html);
    }

    static ReactElement del(HTMLProps<Element> props, Object... children) {
        return create("del", props, children);
    }

    static ReactElement del(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("del", callback, childrenCallback);
    }

    static ReactElement del(Func.Run1<HTMLProps<Element>> callback) {
        return create("del", callback);
    }

    static ReactElement del(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("del", callback, children);
    }

    static ReactElement details() {
        return create("details");
    }

    static ReactElement details(String value) {
        return create("details", value);
    }

    static ReactElement details(Object... children) {
        return create("details", children);
    }

    static ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback, String html) {
        return create("details", callback, html);
    }

    static ReactElement details(HTMLProps<DetailsElement> props) {
        return create("details", props);
    }

    static ReactElement details(HTMLProps<DetailsElement> props, String html) {
        return create("details", props, html);
    }

    static ReactElement details(HTMLProps<DetailsElement> props, Object... children) {
        return create("details", props, children);
    }

    static ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("details", callback, childrenCallback);
    }

    static ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback) {
        return create("details", callback);
    }

    static ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback, Object... children) {
        return create("details", callback, children);
    }

    static ReactElement dfn() {
        return create("dfn");
    }

    static ReactElement dfn(String value) {
        return create("dfn", value);
    }

    static ReactElement dfn(Object... children) {
        return create("dfn", children);
    }

    static ReactElement dfn(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dfn", callback, html);
    }

    static ReactElement dfn(HTMLProps<Element> props) {
        return create("dfn", props);
    }

    static ReactElement dfn(HTMLProps<Element> props, String html) {
        return create("dfn", props, html);
    }

    static ReactElement dfn(HTMLProps<Element> props, Object... children) {
        return create("dfn", props, children);
    }

    static ReactElement dfn(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dfn", callback, childrenCallback);
    }

    static ReactElement dfn(Func.Run1<HTMLProps<Element>> callback) {
        return create("dfn", callback);
    }

    static ReactElement dfn(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dfn", callback, children);
    }

    static ReactElement dialog() {
        return create("dialog");
    }

    static ReactElement dialog(String value) {
        return create("dialog", value);
    }

    static ReactElement dialog(Object... children) {
        return create("dialog", children);
    }

    static ReactElement dialog(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dialog", callback, html);
    }

    static ReactElement dialog(HTMLProps<Element> props) {
        return create("dialog", props);
    }

    static ReactElement dialog(HTMLProps<Element> props, String html) {
        return create("dialog", props, html);
    }

    static ReactElement dialog(HTMLProps<Element> props, Object... children) {
        return create("dialog", props, children);
    }

    static ReactElement dialog(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dialog", callback, childrenCallback);
    }

    static ReactElement dialog(Func.Run1<HTMLProps<Element>> callback) {
        return create("dialog", callback);
    }

    static ReactElement dialog(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dialog", callback, children);
    }

    static ReactElement div() {
        return create("div");
    }

    static ReactElement div(String value) {
        return create("div", value);
    }

    static ReactElement div(Object... children) {
        return create("div", children);
    }

    static ReactElement div(Func.Run1<HTMLProps<DivElement>> callback, String html) {
        return create("div", callback, html);
    }

    static ReactElement div(HTMLProps<DivElement> props) {
        return create("div", props);
    }

    static ReactElement div(HTMLProps<DivElement> props, String html) {
        return create("div", props, html);
    }

    static ReactElement div(HTMLProps<DivElement> props, Object... children) {
        return create("div", props, children);
    }

    static ReactElement div(Func.Run1<HTMLProps<DivElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("div", callback, childrenCallback);
    }

    static ReactElement div(Func.Run1<HTMLProps<DivElement>> callback) {
        return create("div", callback);
    }

    static ReactElement div(Func.Run1<HTMLProps<DivElement>> callback, Object... children) {
        return create("div", callback, children);
    }

    static ReactElement dl() {
        return create("dl");
    }

    static ReactElement dl(String value) {
        return create("dl", value);
    }

    static ReactElement dl(Object... children) {
        return create("dl", children);
    }

    static ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback, String html) {
        return create("dl", callback, html);
    }

    static ReactElement dl(HTMLProps<DListElement> props) {
        return create("dl", props);
    }

    static ReactElement dl(HTMLProps<DListElement> props, String html) {
        return create("dl", props, html);
    }

    static ReactElement dl(HTMLProps<DListElement> props, Object... children) {
        return create("dl", props, children);
    }

    static ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dl", callback, childrenCallback);
    }

    static ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback) {
        return create("dl", callback);
    }

    static ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback, Object... children) {
        return create("dl", callback, children);
    }

    static ReactElement dt() {
        return create("dt");
    }

    static ReactElement dt(String value) {
        return create("dt", value);
    }

    static ReactElement dt(Object... children) {
        return create("dt", children);
    }

    static ReactElement dt(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dt", callback, html);
    }

    static ReactElement dt(HTMLProps<Element> props) {
        return create("dt", props);
    }

    static ReactElement dt(HTMLProps<Element> props, String html) {
        return create("dt", props, html);
    }

    static ReactElement dt(HTMLProps<Element> props, Object... children) {
        return create("dt", props, children);
    }

    static ReactElement dt(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dt", callback, childrenCallback);
    }

    static ReactElement dt(Func.Run1<HTMLProps<Element>> callback) {
        return create("dt", callback);
    }

    static ReactElement dt(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dt", callback, children);
    }

    static ReactElement em() {
        return create("em");
    }

    static ReactElement em(String value) {
        return create("em", value);
    }

    static ReactElement em(Object... children) {
        return create("em", children);
    }

    static ReactElement em(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("em", callback, html);
    }

    static ReactElement em(HTMLProps<Element> props) {
        return create("em", props);
    }

    static ReactElement em(HTMLProps<Element> props, String html) {
        return create("em", props, html);
    }

    static ReactElement em(HTMLProps<Element> props, Object... children) {
        return create("em", props, children);
    }

    static ReactElement em(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("em", callback, childrenCallback);
    }

    static ReactElement em(Func.Run1<HTMLProps<Element>> callback) {
        return create("em", callback);
    }

    static ReactElement em(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("em", callback, children);
    }

    static ReactElement embed() {
        return create("embed");
    }

    static ReactElement embed(String value) {
        return create("embed", value);
    }

    static ReactElement embed(Object... children) {
        return create("embed", children);
    }

    static ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback, String html) {
        return create("embed", callback, html);
    }

    static ReactElement embed(HTMLProps<EmbedElement> props) {
        return create("embed", props);
    }

    static ReactElement embed(HTMLProps<EmbedElement> props, String html) {
        return create("embed", props, html);
    }

    static ReactElement embed(HTMLProps<EmbedElement> props, Object... children) {
        return create("embed", props, children);
    }

    static ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("embed", callback, childrenCallback);
    }

    static ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback) {
        return create("embed", callback);
    }

    static ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback, Object... children) {
        return create("embed", callback, children);
    }

    static ReactElement fieldset() {
        return create("fieldset");
    }

    static ReactElement fieldset(String value) {
        return create("fieldset", value);
    }

    static ReactElement fieldset(Object... children) {
        return create("fieldset", children);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback, String html) {
        return create("fieldset", callback, html);
    }

    static ReactElement fieldset(HTMLProps<FieldSetElement> props) {
        return create("fieldset", props);
    }

    static ReactElement fieldset(HTMLProps<FieldSetElement> props, String html) {
        return create("fieldset", props, html);
    }

    static ReactElement fieldset(HTMLProps<FieldSetElement> props, Object... children) {
        return create("fieldset", props, children);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("fieldset", callback, childrenCallback);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback) {
        return create("fieldset", callback);
    }

    static ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback, Object... children) {
        return create("fieldset", callback, children);
    }

    static ReactElement figcaption() {
        return create("figcaption");
    }

    static ReactElement figcaption(String value) {
        return create("figcaption", value);
    }

    static ReactElement figcaption(Object... children) {
        return create("figcaption", children);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("figcaption", callback, html);
    }

    static ReactElement figcaption(HTMLProps<Element> props) {
        return create("figcaption", props);
    }

    static ReactElement figcaption(HTMLProps<Element> props, String html) {
        return create("figcaption", props, html);
    }

    static ReactElement figcaption(HTMLProps<Element> props, Object... children) {
        return create("figcaption", props, children);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("figcaption", callback, childrenCallback);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback) {
        return create("figcaption", callback);
    }

    static ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("figcaption", callback, children);
    }

    static ReactElement figure() {
        return create("figure");
    }

    static ReactElement figure(String value) {
        return create("figure", value);
    }

    static ReactElement figure(Object... children) {
        return create("figure", children);
    }

    static ReactElement figure(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("figure", callback, html);
    }

    static ReactElement figure(HTMLProps<Element> props) {
        return create("figure", props);
    }

    static ReactElement figure(HTMLProps<Element> props, String html) {
        return create("figure", props, html);
    }

    static ReactElement figure(HTMLProps<Element> props, Object... children) {
        return create("figure", props, children);
    }

    static ReactElement figure(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("figure", callback, childrenCallback);
    }

    static ReactElement figure(Func.Run1<HTMLProps<Element>> callback) {
        return create("figure", callback);
    }

    static ReactElement figure(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("figure", callback, children);
    }

    static ReactElement footer() {
        return create("footer");
    }

    static ReactElement footer(String value) {
        return create("footer", value);
    }

    static ReactElement footer(Object... children) {
        return create("footer", children);
    }

    static ReactElement footer(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("footer", callback, html);
    }

    static ReactElement footer(HTMLProps<Element> props) {
        return create("footer", props);
    }

    static ReactElement footer(HTMLProps<Element> props, String html) {
        return create("footer", props, html);
    }

    static ReactElement footer(HTMLProps<Element> props, Object... children) {
        return create("footer", props, children);
    }

    static ReactElement footer(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("footer", callback, childrenCallback);
    }

    static ReactElement footer(Func.Run1<HTMLProps<Element>> callback) {
        return create("footer", callback);
    }

    static ReactElement footer(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("footer", callback, children);
    }

    static ReactElement form() {
        return create("form");
    }

    static ReactElement form(String value) {
        return create("form", value);
    }

    static ReactElement form(Object... children) {
        return create("form", children);
    }

    static ReactElement form(Func.Run1<HTMLProps<FormElement>> callback, String html) {
        return create("form", callback, html);
    }

    static ReactElement form(HTMLProps<FormElement> props) {
        return create("form", props);
    }

    static ReactElement form(HTMLProps<FormElement> props, String html) {
        return create("form", props, html);
    }

    static ReactElement form(HTMLProps<FormElement> props, Object... children) {
        return create("form", props, children);
    }

    static ReactElement form(Func.Run1<HTMLProps<FormElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("form", callback, childrenCallback);
    }

    static ReactElement form(Func.Run1<HTMLProps<FormElement>> callback) {
        return create("form", callback);
    }

    static ReactElement form(Func.Run1<HTMLProps<FormElement>> callback, Object... children) {
        return create("form", callback, children);
    }

    static ReactElement h1() {
        return create("h1");
    }

    static ReactElement h1(String value) {
        return create("h1", value);
    }

    static ReactElement h1(Object... children) {
        return create("h1", children);
    }

    static ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h1", callback, html);
    }

    static ReactElement h1(HTMLProps<HeadingElement> props) {
        return create("h1", props);
    }

    static ReactElement h1(HTMLProps<HeadingElement> props, String html) {
        return create("h1", props, html);
    }

    static ReactElement h1(HTMLProps<HeadingElement> props, Object... children) {
        return create("h1", props, children);
    }

    static ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h1", callback, childrenCallback);
    }

    static ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h1", callback);
    }

    static ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h1", callback, children);
    }

    static ReactElement h2() {
        return create("h2");
    }

    static ReactElement h2(String value) {
        return create("h2", value);
    }

    static ReactElement h2(Object... children) {
        return create("h2", children);
    }

    static ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h2", callback, html);
    }

    static ReactElement h2(HTMLProps<HeadingElement> props) {
        return create("h2", props);
    }

    static ReactElement h2(HTMLProps<HeadingElement> props, String html) {
        return create("h2", props, html);
    }

    static ReactElement h2(HTMLProps<HeadingElement> props, Object... children) {
        return create("h2", props, children);
    }

    static ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h2", callback, childrenCallback);
    }

    static ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h2", callback);
    }

    static ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h2", callback, children);
    }

    static ReactElement h3() {
        return create("h3");
    }

    static ReactElement h3(String value) {
        return create("h3", value);
    }

    static ReactElement h3(Object... children) {
        return create("h3", children);
    }

    static ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h3", callback, html);
    }

    static ReactElement h3(HTMLProps<HeadingElement> props) {
        return create("h3", props);
    }

    static ReactElement h3(HTMLProps<HeadingElement> props, String html) {
        return create("h3", props, html);
    }

    static ReactElement h3(HTMLProps<HeadingElement> props, Object... children) {
        return create("h3", props, children);
    }

    static ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h3", callback, childrenCallback);
    }

    static ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h3", callback);
    }

    static ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h3", callback, children);
    }

    static ReactElement h4() {
        return create("h4");
    }

    static ReactElement h4(String value) {
        return create("h4", value);
    }

    static ReactElement h4(Object... children) {
        return create("h4", children);
    }

    static ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h4", callback, html);
    }

    static ReactElement h4(HTMLProps<HeadingElement> props) {
        return create("h4", props);
    }

    static ReactElement h4(HTMLProps<HeadingElement> props, String html) {
        return create("h4", props, html);
    }

    static ReactElement h4(HTMLProps<HeadingElement> props, Object... children) {
        return create("h4", props, children);
    }

    static ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h4", callback, childrenCallback);
    }

    static ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h4", callback);
    }

    static ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h4", callback, children);
    }

    static ReactElement h5() {
        return create("h5");
    }

    static ReactElement h5(String value) {
        return create("h5", value);
    }

    static ReactElement h5(Object... children) {
        return create("h5", children);
    }

    static ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h5", callback, html);
    }

    static ReactElement h5(HTMLProps<HeadingElement> props) {
        return create("h5", props);
    }

    static ReactElement h5(HTMLProps<HeadingElement> props, String html) {
        return create("h5", props, html);
    }

    static ReactElement h5(HTMLProps<HeadingElement> props, Object... children) {
        return create("h5", props, children);
    }

    static ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h5", callback, childrenCallback);
    }

    static ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h5", callback);
    }

    static ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h5", callback, children);
    }

    static ReactElement h6() {
        return create("h6");
    }

    static ReactElement h6(String value) {
        return create("h6", value);
    }

    static ReactElement h6(Object... children) {
        return create("h6", children);
    }

    static ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h6", callback, html);
    }

    static ReactElement h6(HTMLProps<HeadingElement> props) {
        return create("h6", props);
    }

    static ReactElement h6(HTMLProps<HeadingElement> props, String html) {
        return create("h6", props, html);
    }

    static ReactElement h6(HTMLProps<HeadingElement> props, Object... children) {
        return create("h6", props, children);
    }

    static ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h6", callback, childrenCallback);
    }

    static ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h6", callback);
    }

    static ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h6", callback, children);
    }

    static ReactElement head() {
        return create("head");
    }

    static ReactElement head(String value) {
        return create("head", value);
    }

    static ReactElement head(Object... children) {
        return create("head", children);
    }

    static ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback, String html) {
        return create("head", callback, html);
    }

    static ReactElement head(HTMLProps<HeadElement> props) {
        return create("head", props);
    }

    static ReactElement head(HTMLProps<HeadElement> props, String html) {
        return create("head", props, html);
    }

    static ReactElement head(HTMLProps<HeadElement> props, Object... children) {
        return create("head", props, children);
    }

    static ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("head", callback, childrenCallback);
    }

    static ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback) {
        return create("head", callback);
    }

    static ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback, Object... children) {
        return create("head", callback, children);
    }

    static ReactElement header() {
        return create("header");
    }

    static ReactElement header(String value) {
        return create("header", value);
    }

    static ReactElement header(Object... children) {
        return create("header", children);
    }

    static ReactElement header(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("header", callback, html);
    }

    static ReactElement header(HTMLProps<Element> props) {
        return create("header", props);
    }

    static ReactElement header(HTMLProps<Element> props, String html) {
        return create("header", props, html);
    }

    static ReactElement header(HTMLProps<Element> props, Object... children) {
        return create("header", props, children);
    }

    static ReactElement header(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("header", callback, childrenCallback);
    }

    static ReactElement header(Func.Run1<HTMLProps<Element>> callback) {
        return create("header", callback);
    }

    static ReactElement header(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("header", callback, children);
    }

    static ReactElement hr() {
        return create("hr");
    }

    static ReactElement hr(String value) {
        return create("hr", value);
    }

    static ReactElement hr(Object... children) {
        return create("hr", children);
    }

    static ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback, String html) {
        return create("hr", callback, html);
    }

    static ReactElement hr(HTMLProps<HRElement> props) {
        return create("hr", props);
    }

    static ReactElement hr(HTMLProps<HRElement> props, String html) {
        return create("hr", props, html);
    }

    static ReactElement hr(HTMLProps<HRElement> props, Object... children) {
        return create("hr", props, children);
    }

    static ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("hr", callback, childrenCallback);
    }

    static ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback) {
        return create("hr", callback);
    }

    static ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback, Object... children) {
        return create("hr", callback, children);
    }

    static ReactElement html() {
        return create("html");
    }

    static ReactElement html(String value) {
        return create("html", value);
    }

    static ReactElement html(Object... children) {
        return create("html", children);
    }

    static ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback, String html) {
        return create("html", callback, html);
    }

    static ReactElement html(HTMLProps<HtmlElement> props) {
        return create("html", props);
    }

    static ReactElement html(HTMLProps<HtmlElement> props, String html) {
        return create("html", props, html);
    }

    static ReactElement html(HTMLProps<HtmlElement> props, Object... children) {
        return create("html", props, children);
    }

    static ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("html", callback, childrenCallback);
    }

    static ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback) {
        return create("html", callback);
    }

    static ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback, Object... children) {
        return create("html", callback, children);
    }

    static ReactElement i() {
        return create("i");
    }

    static ReactElement i(String value) {
        return create("i", value);
    }

    static ReactElement i(Object... children) {
        return create("i", children);
    }

    static ReactElement i(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("i", callback, html);
    }

    static ReactElement i(HTMLProps<Element> props) {
        return create("i", props);
    }

    static ReactElement i(HTMLProps<Element> props, String html) {
        return create("i", props, html);
    }

    static ReactElement i(HTMLProps<Element> props, Object... children) {
        return create("i", props, children);
    }

    static ReactElement i(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("i", callback, childrenCallback);
    }

    static ReactElement i(Func.Run1<HTMLProps<Element>> callback) {
        return create("i", callback);
    }

    static ReactElement i(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("i", callback, children);
    }

    static ReactElement iframe() {
        return create("iframe");
    }

    static ReactElement iframe(String value) {
        return create("iframe", value);
    }

    static ReactElement iframe(Object... children) {
        return create("iframe", children);
    }

    static ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback, String html) {
        return create("iframe", callback, html);
    }

    static ReactElement iframe(HTMLProps<IFrameElement> props) {
        return create("iframe", props);
    }

    static ReactElement iframe(HTMLProps<IFrameElement> props, String html) {
        return create("iframe", props, html);
    }

    static ReactElement iframe(HTMLProps<IFrameElement> props, Object... children) {
        return create("iframe", props, children);
    }

    static ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("iframe", callback, childrenCallback);
    }

    static ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback) {
        return create("iframe", callback);
    }

    static ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback, Object... children) {
        return create("iframe", callback, children);
    }

    static ReactElement img() {
        return create("img");
    }

    static ReactElement img(String value) {
        return create("img", value);
    }

    static ReactElement img(Object... children) {
        return create("img", children);
    }

    static ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback, String html) {
        return create("img", callback, html);
    }

    static ReactElement img(HTMLProps<ImageElement> props) {
        return create("img", props);
    }

    static ReactElement img(HTMLProps<ImageElement> props, String html) {
        return create("img", props, html);
    }

    static ReactElement img(HTMLProps<ImageElement> props, Object... children) {
        return create("img", props, children);
    }

    static ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("img", callback, childrenCallback);
    }

    static ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback) {
        return create("img", callback);
    }

    static ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback, Object... children) {
        return create("img", callback, children);
    }

    static ReactElement input() {
        return create("input");
    }

    static ReactElement input(String value) {
        return create("input", value);
    }

    static ReactElement input(Object... children) {
        return create("input", children);
    }

    static ReactElement input(Func.Run1<HTMLProps<InputElement>> callback, String html) {
        return create("input", callback, html);
    }

    static ReactElement input(HTMLProps<InputElement> props) {
        return create("input", props);
    }

    static ReactElement input(HTMLProps<InputElement> props, String html) {
        return create("input", props, html);
    }

    static ReactElement input(HTMLProps<InputElement> props, Object... children) {
        return create("input", props, children);
    }

    static ReactElement input(Func.Run1<HTMLProps<InputElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("input", callback, childrenCallback);
    }

    static ReactElement input(Func.Run1<HTMLProps<InputElement>> callback) {
        return create("input", callback);
    }

    static ReactElement input(Func.Run1<HTMLProps<InputElement>> callback, Object... children) {
        return create("input", callback, children);
    }

    static ReactElement ins() {
        return create("ins");
    }

    static ReactElement ins(String value) {
        return create("ins", value);
    }

    static ReactElement ins(Object... children) {
        return create("ins", children);
    }

    static ReactElement ins(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("ins", callback, html);
    }

    static ReactElement ins(HTMLProps<Element> props) {
        return create("ins", props);
    }

    static ReactElement ins(HTMLProps<Element> props, String html) {
        return create("ins", props, html);
    }

    static ReactElement ins(HTMLProps<Element> props, Object... children) {
        return create("ins", props, children);
    }

    static ReactElement ins(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ins", callback, childrenCallback);
    }

    static ReactElement ins(Func.Run1<HTMLProps<Element>> callback) {
        return create("ins", callback);
    }

    static ReactElement ins(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("ins", callback, children);
    }

    static ReactElement kbd() {
        return create("kbd");
    }

    static ReactElement kbd(String value) {
        return create("kbd", value);
    }

    static ReactElement kbd(Object... children) {
        return create("kbd", children);
    }

    static ReactElement kbd(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("kbd", callback, html);
    }

    static ReactElement kbd(HTMLProps<Element> props) {
        return create("kbd", props);
    }

    static ReactElement kbd(HTMLProps<Element> props, String html) {
        return create("kbd", props, html);
    }

    static ReactElement kbd(HTMLProps<Element> props, Object... children) {
        return create("kbd", props, children);
    }

    static ReactElement kbd(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("kbd", callback, childrenCallback);
    }

    static ReactElement kbd(Func.Run1<HTMLProps<Element>> callback) {
        return create("kbd", callback);
    }

    static ReactElement kbd(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("kbd", callback, children);
    }

    static ReactElement keygen() {
        return create("keygen");
    }

    static ReactElement keygen(String value) {
        return create("keygen", value);
    }

    static ReactElement keygen(Object... children) {
        return create("keygen", children);
    }

    static ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback, String html) {
        return create("keygen", callback, html);
    }

    static ReactElement keygen(HTMLProps<KeygenElement> props) {
        return create("keygen", props);
    }

    static ReactElement keygen(HTMLProps<KeygenElement> props, String html) {
        return create("keygen", props, html);
    }

    static ReactElement keygen(HTMLProps<KeygenElement> props, Object... children) {
        return create("keygen", props, children);
    }

    static ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("keygen", callback, childrenCallback);
    }

    static ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback) {
        return create("keygen", callback);
    }

    static ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback, Object... children) {
        return create("keygen", callback, children);
    }

    static ReactElement label() {
        return create("label");
    }

    static ReactElement label(String value) {
        return create("label", value);
    }

    static ReactElement label(Object... children) {
        return create("label", children);
    }

    static ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback, String html) {
        return create("label", callback, html);
    }

    static ReactElement label(HTMLProps<LabelElement> props) {
        return create("label", props);
    }

    static ReactElement label(HTMLProps<LabelElement> props, String html) {
        return create("label", props, html);
    }

    static ReactElement label(HTMLProps<LabelElement> props, Object... children) {
        return create("label", props, children);
    }

    static ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("label", callback, childrenCallback);
    }

    static ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback) {
        return create("label", callback);
    }

    static ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback, Object... children) {
        return create("label", callback, children);
    }

    static ReactElement legend() {
        return create("legend");
    }

    static ReactElement legend(String value) {
        return create("legend", value);
    }

    static ReactElement legend(Object... children) {
        return create("legend", children);
    }

    static ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback, String html) {
        return create("legend", callback, html);
    }

    static ReactElement legend(HTMLProps<LegendElement> props) {
        return create("legend", props);
    }

    static ReactElement legend(HTMLProps<LegendElement> props, String html) {
        return create("legend", props, html);
    }

    static ReactElement legend(HTMLProps<LegendElement> props, Object... children) {
        return create("legend", props, children);
    }

    static ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("legend", callback, childrenCallback);
    }

    static ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback) {
        return create("legend", callback);
    }

    static ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback, Object... children) {
        return create("legend", callback, children);
    }

    static ReactElement li() {
        return create("li");
    }

    static ReactElement li(String value) {
        return create("li", value);
    }

    static ReactElement li(Object... children) {
        return create("li", children);
    }

    static ReactElement li(Func.Run1<HTMLProps<LIElement>> callback, String html) {
        return create("li", callback, html);
    }

    static ReactElement li(HTMLProps<LIElement> props) {
        return create("li", props);
    }

    static ReactElement li(HTMLProps<LIElement> props, String html) {
        return create("li", props, html);
    }

    static ReactElement li(HTMLProps<LIElement> props, Object... children) {
        return create("li", props, children);
    }

    static ReactElement li(Func.Run1<HTMLProps<LIElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("li", callback, childrenCallback);
    }

    static ReactElement li(Func.Run1<HTMLProps<LIElement>> callback) {
        return create("li", callback);
    }

    static ReactElement li(Func.Run1<HTMLProps<LIElement>> callback, Object... children) {
        return create("li", callback, children);
    }

    static ReactElement link() {
        return create("link");
    }

    static ReactElement link(String value) {
        return create("link", value);
    }

    static ReactElement link(Object... children) {
        return create("link", children);
    }

    static ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback, String html) {
        return create("link", callback, html);
    }

    static ReactElement link(HTMLProps<LinkElement> props) {
        return create("link", props);
    }

    static ReactElement link(HTMLProps<LinkElement> props, String html) {
        return create("link", props, html);
    }

    static ReactElement link(HTMLProps<LinkElement> props, Object... children) {
        return create("link", props, children);
    }

    static ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("link", callback, childrenCallback);
    }

    static ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback) {
        return create("link", callback);
    }

    static ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback, Object... children) {
        return create("link", callback, children);
    }

    static ReactElement main() {
        return create("main");
    }

    static ReactElement main(String value) {
        return create("main", value);
    }

    static ReactElement main(Object... children) {
        return create("main", children);
    }

    static ReactElement main(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("main", callback, html);
    }

    static ReactElement main(HTMLProps<Element> props) {
        return create("main", props);
    }

    static ReactElement main(HTMLProps<Element> props, String html) {
        return create("main", props, html);
    }

    static ReactElement main(HTMLProps<Element> props, Object... children) {
        return create("main", props, children);
    }

    static ReactElement main(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("main", callback, childrenCallback);
    }

    static ReactElement main(Func.Run1<HTMLProps<Element>> callback) {
        return create("main", callback);
    }

    static ReactElement main(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("main", callback, children);
    }

    static ReactElement map() {
        return create("map");
    }

    static ReactElement map(String value) {
        return create("map", value);
    }

    static ReactElement map(Object... children) {
        return create("map", children);
    }

    static ReactElement map(Func.Run1<HTMLProps<MapElement>> callback, String html) {
        return create("map", callback, html);
    }

    static ReactElement map(HTMLProps<MapElement> props) {
        return create("map", props);
    }

    static ReactElement map(HTMLProps<MapElement> props, String html) {
        return create("map", props, html);
    }

    static ReactElement map(HTMLProps<MapElement> props, Object... children) {
        return create("map", props, children);
    }

    static ReactElement map(Func.Run1<HTMLProps<MapElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("map", callback, childrenCallback);
    }

    static ReactElement map(Func.Run1<HTMLProps<MapElement>> callback) {
        return create("map", callback);
    }

    static ReactElement map(Func.Run1<HTMLProps<MapElement>> callback, Object... children) {
        return create("map", callback, children);
    }

    static ReactElement mark() {
        return create("mark");
    }

    static ReactElement mark(String value) {
        return create("mark", value);
    }

    static ReactElement mark(Object... children) {
        return create("mark", children);
    }

    static ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback, String html) {
        return create("mark", callback, html);
    }

    static ReactElement mark(HTMLProps<MapElement> props) {
        return create("mark", props);
    }

    static ReactElement mark(HTMLProps<MapElement> props, String html) {
        return create("mark", props, html);
    }

    static ReactElement mark(HTMLProps<MapElement> props, Object... children) {
        return create("mark", props, children);
    }

    static ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("mark", callback, childrenCallback);
    }

    static ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback) {
        return create("mark", callback);
    }

    static ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback, Object... children) {
        return create("mark", callback, children);
    }

    static ReactElement menu() {
        return create("menu");
    }

    static ReactElement menu(String value) {
        return create("menu", value);
    }

    static ReactElement menu(Object... children) {
        return create("menu", children);
    }

    static ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback, String html) {
        return create("menu", callback, html);
    }

    static ReactElement menu(HTMLProps<MenuElement> props) {
        return create("menu", props);
    }

    static ReactElement menu(HTMLProps<MenuElement> props, String html) {
        return create("menu", props, html);
    }

    static ReactElement menu(HTMLProps<MenuElement> props, Object... children) {
        return create("menu", props, children);
    }

    static ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("menu", callback, childrenCallback);
    }

    static ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback) {
        return create("menu", callback);
    }

    static ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback, Object... children) {
        return create("menu", callback, children);
    }

    static ReactElement menuitem() {
        return create("menuitem");
    }

    static ReactElement menuitem(String value) {
        return create("menuitem", value);
    }

    static ReactElement menuitem(Object... children) {
        return create("menuitem", children);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("menuitem", callback, html);
    }

    static ReactElement menuitem(HTMLProps<Element> props) {
        return create("menuitem", props);
    }

    static ReactElement menuitem(HTMLProps<Element> props, String html) {
        return create("menuitem", props, html);
    }

    static ReactElement menuitem(HTMLProps<Element> props, Object... children) {
        return create("menuitem", props, children);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("menuitem", callback, childrenCallback);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback) {
        return create("menuitem", callback);
    }

    static ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("menuitem", callback, children);
    }

    static ReactElement meta() {
        return create("meta");
    }

    static ReactElement meta(String value) {
        return create("meta", value);
    }

    static ReactElement meta(Object... children) {
        return create("meta", children);
    }

    static ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback, String html) {
        return create("meta", callback, html);
    }

    static ReactElement meta(HTMLProps<MetaElement> props) {
        return create("meta", props);
    }

    static ReactElement meta(HTMLProps<MetaElement> props, String html) {
        return create("meta", props, html);
    }

    static ReactElement meta(HTMLProps<MetaElement> props, Object... children) {
        return create("meta", props, children);
    }

    static ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("meta", callback, childrenCallback);
    }

    static ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback) {
        return create("meta", callback);
    }

    static ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback, Object... children) {
        return create("meta", callback, children);
    }

    static ReactElement meter() {
        return create("meter");
    }

    static ReactElement meter(String value) {
        return create("meter", value);
    }

    static ReactElement meter(Object... children) {
        return create("meter", children);
    }

    static ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback, String html) {
        return create("meter", callback, html);
    }

    static ReactElement meter(HTMLProps<MeterElement> props) {
        return create("meter", props);
    }

    static ReactElement meter(HTMLProps<MeterElement> props, String html) {
        return create("meter", props, html);
    }

    static ReactElement meter(HTMLProps<MeterElement> props, Object... children) {
        return create("meter", props, children);
    }

    static ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("meter", callback, childrenCallback);
    }

    static ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback) {
        return create("meter", callback);
    }

    static ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback, Object... children) {
        return create("meter", callback, children);
    }

    static ReactElement nav() {
        return create("nav");
    }

    static ReactElement nav(String value) {
        return create("nav", value);
    }

    static ReactElement nav(Object... children) {
        return create("nav", children);
    }

    static ReactElement nav(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("nav", callback, html);
    }

    static ReactElement nav(HTMLProps<Element> props) {
        return create("nav", props);
    }

    static ReactElement nav(HTMLProps<Element> props, String html) {
        return create("nav", props, html);
    }

    static ReactElement nav(HTMLProps<Element> props, Object... children) {
        return create("nav", props, children);
    }

    static ReactElement nav(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("nav", callback, childrenCallback);
    }

    static ReactElement nav(Func.Run1<HTMLProps<Element>> callback) {
        return create("nav", callback);
    }

    static ReactElement nav(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("nav", callback, children);
    }

    static ReactElement noscript() {
        return create("noscript");
    }

    static ReactElement noscript(String value) {
        return create("noscript", value);
    }

    static ReactElement noscript(Object... children) {
        return create("noscript", children);
    }

    static ReactElement noscript(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("noscript", callback, html);
    }

    static ReactElement noscript(HTMLProps<Element> props) {
        return create("noscript", props);
    }

    static ReactElement noscript(HTMLProps<Element> props, String html) {
        return create("noscript", props, html);
    }

    static ReactElement noscript(HTMLProps<Element> props, Object... children) {
        return create("noscript", props, children);
    }

    static ReactElement noscript(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("noscript", callback, childrenCallback);
    }

    static ReactElement noscript(Func.Run1<HTMLProps<Element>> callback) {
        return create("noscript", callback);
    }

    static ReactElement noscript(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("noscript", callback, children);
    }

    static ReactElement object() {
        return create("object");
    }

    static ReactElement object(String value) {
        return create("object", value);
    }

    static ReactElement object(Object... children) {
        return create("object", children);
    }

    static ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback, String html) {
        return create("object", callback, html);
    }

    static ReactElement object(HTMLProps<ObjectElement> props) {
        return create("object", props);
    }

    static ReactElement object(HTMLProps<ObjectElement> props, String html) {
        return create("object", props, html);
    }

    static ReactElement object(HTMLProps<ObjectElement> props, Object... children) {
        return create("object", props, children);
    }

    static ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("object", callback, childrenCallback);
    }

    static ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback) {
        return create("object", callback);
    }

    static ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback, Object... children) {
        return create("object", callback, children);
    }

    static ReactElement ol() {
        return create("ol");
    }

    static ReactElement ol(String value) {
        return create("ol", value);
    }

    static ReactElement ol(Object... children) {
        return create("ol", children);
    }

    static ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback, String html) {
        return create("ol", callback, html);
    }

    static ReactElement ol(HTMLProps<OListElement> props) {
        return create("ol", props);
    }

    static ReactElement ol(HTMLProps<OListElement> props, String html) {
        return create("ol", props, html);
    }

    static ReactElement ol(HTMLProps<OListElement> props, Object... children) {
        return create("ol", props, children);
    }

    static ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ol", callback, childrenCallback);
    }

    static ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback) {
        return create("ol", callback);
    }

    static ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback, Object... children) {
        return create("ol", callback, children);
    }

    static ReactElement optgroup() {
        return create("optgroup");
    }

    static ReactElement optgroup(String value) {
        return create("optgroup", value);
    }

    static ReactElement optgroup(Object... children) {
        return create("optgroup", children);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback, String html) {
        return create("optgroup", callback, html);
    }

    static ReactElement optgroup(HTMLProps<OptGroupElement> props) {
        return create("optgroup", props);
    }

    static ReactElement optgroup(HTMLProps<OptGroupElement> props, String html) {
        return create("optgroup", props, html);
    }

    static ReactElement optgroup(HTMLProps<OptGroupElement> props, Object... children) {
        return create("optgroup", props, children);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("optgroup", callback, childrenCallback);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback) {
        return create("optgroup", callback);
    }

    static ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback, Object... children) {
        return create("optgroup", callback, children);
    }

    static ReactElement option() {
        return create("option");
    }

    static ReactElement option(String value) {
        return create("option", value);
    }

    static ReactElement option(Object... children) {
        return create("option", children);
    }

    static ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback, String html) {
        return create("option", callback, html);
    }

    static ReactElement option(HTMLProps<OptionElement> props) {
        return create("option", props);
    }

    static ReactElement option(HTMLProps<OptionElement> props, String html) {
        return create("option", props, html);
    }

    static ReactElement option(HTMLProps<OptionElement> props, Object... children) {
        return create("option", props, children);
    }

    static ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("option", callback, childrenCallback);
    }

    static ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback) {
        return create("option", callback);
    }

    static ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback, Object... children) {
        return create("option", callback, children);
    }

    static ReactElement output() {
        return create("output");
    }

    static ReactElement output(String value) {
        return create("output", value);
    }

    static ReactElement output(Object... children) {
        return create("output", children);
    }

    static ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback, String html) {
        return create("output", callback, html);
    }

    static ReactElement output(HTMLProps<OutputElement> props) {
        return create("output", props);
    }

    static ReactElement output(HTMLProps<OutputElement> props, String html) {
        return create("output", props, html);
    }

    static ReactElement output(HTMLProps<OutputElement> props, Object... children) {
        return create("output", props, children);
    }

    static ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("output", callback, childrenCallback);
    }

    static ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback) {
        return create("output", callback);
    }

    static ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback, Object... children) {
        return create("output", callback, children);
    }

    static ReactElement p() {
        return create("p");
    }

    static ReactElement p(String value) {
        return create("p", value);
    }

    static ReactElement p(Object... children) {
        return create("p", children);
    }

    static ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback, String html) {
        return create("p", callback, html);
    }

    static ReactElement p(HTMLProps<ParagraphElement> props) {
        return create("p", props);
    }

    static ReactElement p(HTMLProps<ParagraphElement> props, String html) {
        return create("p", props, html);
    }

    static ReactElement p(HTMLProps<ParagraphElement> props, Object... children) {
        return create("p", props, children);
    }

    static ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("p", callback, childrenCallback);
    }

    static ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback) {
        return create("p", callback);
    }

    static ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback, Object... children) {
        return create("p", callback, children);
    }

    static ReactElement param() {
        return create("param");
    }

    static ReactElement param(String value) {
        return create("param", value);
    }

    static ReactElement param(Object... children) {
        return create("param", children);
    }

    static ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback, String html) {
        return create("param", callback, html);
    }

    static ReactElement param(HTMLProps<ParamElement> props) {
        return create("param", props);
    }

    static ReactElement param(HTMLProps<ParamElement> props, String html) {
        return create("param", props, html);
    }

    static ReactElement param(HTMLProps<ParamElement> props, Object... children) {
        return create("param", props, children);
    }

    static ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("param", callback, childrenCallback);
    }

    static ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback) {
        return create("param", callback);
    }

    static ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback, Object... children) {
        return create("param", callback, children);
    }

    static ReactElement picture() {
        return create("picture");
    }

    static ReactElement picture(String value) {
        return create("picture", value);
    }

    static ReactElement picture(Object... children) {
        return create("picture", children);
    }

    static ReactElement picture(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("picture", callback, html);
    }

    static ReactElement picture(HTMLProps<Element> props) {
        return create("picture", props);
    }

    static ReactElement picture(HTMLProps<Element> props, String html) {
        return create("picture", props, html);
    }

    static ReactElement picture(HTMLProps<Element> props, Object... children) {
        return create("picture", props, children);
    }

    static ReactElement picture(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("picture", callback, childrenCallback);
    }

    static ReactElement picture(Func.Run1<HTMLProps<Element>> callback) {
        return create("picture", callback);
    }

    static ReactElement picture(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("picture", callback, children);
    }

    static ReactElement pre() {
        return create("pre");
    }

    static ReactElement pre(String value) {
        return create("pre", value);
    }

    static ReactElement pre(Object... children) {
        return create("pre", children);
    }

    static ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback, String html) {
        return create("pre", callback, html);
    }

    static ReactElement pre(HTMLProps<PreElement> props) {
        return create("pre", props);
    }

    static ReactElement pre(HTMLProps<PreElement> props, String html) {
        return create("pre", props, html);
    }

    static ReactElement pre(HTMLProps<PreElement> props, Object... children) {
        return create("pre", props, children);
    }

    static ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("pre", callback, childrenCallback);
    }

    static ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback) {
        return create("pre", callback);
    }

    static ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback, Object... children) {
        return create("pre", callback, children);
    }

    static ReactElement progress() {
        return create("progress");
    }

    static ReactElement progress(String value) {
        return create("progress", value);
    }

    static ReactElement progress(Object... children) {
        return create("progress", children);
    }

    static ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback, String html) {
        return create("progress", callback, html);
    }

    static ReactElement progress(HTMLProps<ProgressElement> props) {
        return create("progress", props);
    }

    static ReactElement progress(HTMLProps<ProgressElement> props, String html) {
        return create("progress", props, html);
    }

    static ReactElement progress(HTMLProps<ProgressElement> props, Object... children) {
        return create("progress", props, children);
    }

    static ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("progress", callback, childrenCallback);
    }

    static ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback) {
        return create("progress", callback);
    }

    static ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback, Object... children) {
        return create("progress", callback, children);
    }

    static ReactElement q() {
        return create("q");
    }

    static ReactElement q(String value) {
        return create("q", value);
    }

    static ReactElement q(Object... children) {
        return create("q", children);
    }

    static ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback, String html) {
        return create("q", callback, html);
    }

    static ReactElement q(HTMLProps<QuoteElement> props) {
        return create("q", props);
    }

    static ReactElement q(HTMLProps<QuoteElement> props, String html) {
        return create("q", props, html);
    }

    static ReactElement q(HTMLProps<QuoteElement> props, Object... children) {
        return create("q", props, children);
    }

    static ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("q", callback, childrenCallback);
    }

    static ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback) {
        return create("q", callback);
    }

    static ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback, Object... children) {
        return create("q", callback, children);
    }

    static ReactElement rp() {
        return create("rp");
    }

    static ReactElement rp(String value) {
        return create("rp", value);
    }

    static ReactElement rp(Object... children) {
        return create("rp", children);
    }

    static ReactElement rp(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("rp", callback, html);
    }

    static ReactElement rp(HTMLProps<Element> props) {
        return create("rp", props);
    }

    static ReactElement rp(HTMLProps<Element> props, String html) {
        return create("rp", props, html);
    }

    static ReactElement rp(HTMLProps<Element> props, Object... children) {
        return create("rp", props, children);
    }

    static ReactElement rp(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("rp", callback, childrenCallback);
    }

    static ReactElement rp(Func.Run1<HTMLProps<Element>> callback) {
        return create("rp", callback);
    }

    static ReactElement rp(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("rp", callback, children);
    }

    static ReactElement rt() {
        return create("rt");
    }

    static ReactElement rt(String value) {
        return create("rt", value);
    }

    static ReactElement rt(Object... children) {
        return create("rt", children);
    }

    static ReactElement rt(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("rt", callback, html);
    }

    static ReactElement rt(HTMLProps<Element> props) {
        return create("rt", props);
    }

    static ReactElement rt(HTMLProps<Element> props, String html) {
        return create("rt", props, html);
    }

    static ReactElement rt(HTMLProps<Element> props, Object... children) {
        return create("rt", props, children);
    }

    static ReactElement rt(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("rt", callback, childrenCallback);
    }

    static ReactElement rt(Func.Run1<HTMLProps<Element>> callback) {
        return create("rt", callback);
    }

    static ReactElement rt(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("rt", callback, children);
    }

    static ReactElement ruby() {
        return create("ruby");
    }

    static ReactElement ruby(String value) {
        return create("ruby", value);
    }

    static ReactElement ruby(Object... children) {
        return create("ruby", children);
    }

    static ReactElement ruby(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("ruby", callback, html);
    }

    static ReactElement ruby(HTMLProps<Element> props) {
        return create("ruby", props);
    }

    static ReactElement ruby(HTMLProps<Element> props, String html) {
        return create("ruby", props, html);
    }

    static ReactElement ruby(HTMLProps<Element> props, Object... children) {
        return create("ruby", props, children);
    }

    static ReactElement ruby(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ruby", callback, childrenCallback);
    }

    static ReactElement ruby(Func.Run1<HTMLProps<Element>> callback) {
        return create("ruby", callback);
    }

    static ReactElement ruby(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("ruby", callback, children);
    }

    static ReactElement s() {
        return create("s");
    }

    static ReactElement s(String value) {
        return create("s", value);
    }

    static ReactElement s(Object... children) {
        return create("s", children);
    }

    static ReactElement s(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("s", callback, html);
    }

    static ReactElement s(HTMLProps<Element> props) {
        return create("s", props);
    }

    static ReactElement s(HTMLProps<Element> props, String html) {
        return create("s", props, html);
    }

    static ReactElement s(HTMLProps<Element> props, Object... children) {
        return create("s", props, children);
    }

    static ReactElement s(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("s", callback, childrenCallback);
    }

    static ReactElement s(Func.Run1<HTMLProps<Element>> callback) {
        return create("s", callback);
    }

    static ReactElement s(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("s", callback, children);
    }

    static ReactElement samp() {
        return create("samp");
    }

    static ReactElement samp(String value) {
        return create("samp", value);
    }

    static ReactElement samp(Object... children) {
        return create("samp", children);
    }

    static ReactElement samp(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("samp", callback, html);
    }

    static ReactElement samp(HTMLProps<Element> props) {
        return create("samp", props);
    }

    static ReactElement samp(HTMLProps<Element> props, String html) {
        return create("samp", props, html);
    }

    static ReactElement samp(HTMLProps<Element> props, Object... children) {
        return create("samp", props, children);
    }

    static ReactElement samp(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("samp", callback, childrenCallback);
    }

    static ReactElement samp(Func.Run1<HTMLProps<Element>> callback) {
        return create("samp", callback);
    }

    static ReactElement samp(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("samp", callback, children);
    }

    static ReactElement script() {
        return create("script");
    }

    static ReactElement script(String value) {
        return create("script", value);
    }

    static ReactElement script(Object... children) {
        return create("script", children);
    }

    static ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback, String html) {
        return create("script", callback, html);
    }

    static ReactElement script(HTMLProps<ScriptElement> props) {
        return create("script", props);
    }

    static ReactElement script(HTMLProps<ScriptElement> props, String html) {
        return create("script", props, html);
    }

    static ReactElement script(HTMLProps<ScriptElement> props, Object... children) {
        return create("script", props, children);
    }

    static ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("script", callback, childrenCallback);
    }

    static ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback) {
        return create("script", callback);
    }

    static ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback, Object... children) {
        return create("script", callback, children);
    }

    static ReactElement section() {
        return create("section");
    }

    static ReactElement section(String value) {
        return create("section", value);
    }

    static ReactElement section(Object... children) {
        return create("section", children);
    }

    static ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback, String html) {
        return create("section", callback, html);
    }

    static ReactElement section(HTMLProps<TableSectionElement> props) {
        return create("section", props);
    }

    static ReactElement section(HTMLProps<TableSectionElement> props, String html) {
        return create("section", props, html);
    }

    static ReactElement section(HTMLProps<TableSectionElement> props, Object... children) {
        return create("section", props, children);
    }

    static ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("section", callback, childrenCallback);
    }

    static ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback) {
        return create("section", callback);
    }

    static ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback, Object... children) {
        return create("section", callback, children);
    }

    static ReactElement select() {
        return create("select");
    }

    static ReactElement select(String value) {
        return create("select", value);
    }

    static ReactElement select(Object... children) {
        return create("select", children);
    }

    static ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback, String html) {
        return create("select", callback, html);
    }

    static ReactElement select(HTMLProps<SelectElement> props) {
        return create("select", props);
    }

    static ReactElement select(HTMLProps<SelectElement> props, String html) {
        return create("select", props, html);
    }

    static ReactElement select(HTMLProps<SelectElement> props, Object... children) {
        return create("select", props, children);
    }

    static ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("select", callback, childrenCallback);
    }

    static ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback) {
        return create("select", callback);
    }

    static ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback, Object... children) {
        return create("select", callback, children);
    }

    static ReactElement small() {
        return create("small");
    }

    static ReactElement small(String value) {
        return create("small", value);
    }

    static ReactElement small(Object... children) {
        return create("small", children);
    }

    static ReactElement small(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("small", callback, html);
    }

    static ReactElement small(HTMLProps<Element> props) {
        return create("small", props);
    }

    static ReactElement small(HTMLProps<Element> props, String html) {
        return create("small", props, html);
    }

    static ReactElement small(HTMLProps<Element> props, Object... children) {
        return create("small", props, children);
    }

    static ReactElement small(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("small", callback, childrenCallback);
    }

    static ReactElement small(Func.Run1<HTMLProps<Element>> callback) {
        return create("small", callback);
    }

    static ReactElement small(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("small", callback, children);
    }

    static ReactElement source() {
        return create("source");
    }

    static ReactElement source(String value) {
        return create("source", value);
    }

    static ReactElement source(Object... children) {
        return create("source", children);
    }

    static ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback, String html) {
        return create("source", callback, html);
    }

    static ReactElement source(HTMLProps<SourceElement> props) {
        return create("source", props);
    }

    static ReactElement source(HTMLProps<SourceElement> props, String html) {
        return create("source", props, html);
    }

    static ReactElement source(HTMLProps<SourceElement> props, Object... children) {
        return create("source", props, children);
    }

    static ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("source", callback, childrenCallback);
    }

    static ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback) {
        return create("source", callback);
    }

    static ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback, Object... children) {
        return create("source", callback, children);
    }

    static ReactElement span() {
        return create("span");
    }

    static ReactElement span(String value) {
        return create("span", value);
    }

    static ReactElement span(Object... children) {
        return create("span", children);
    }

    static ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback, String html) {
        return create("span", callback, html);
    }

    static ReactElement span(HTMLProps<SpanElement> props) {
        return create("span", props);
    }

    static ReactElement span(HTMLProps<SpanElement> props, String html) {
        return create("span", props, html);
    }

    static ReactElement span(HTMLProps<SpanElement> props, Object... children) {
        return create("span", props, children);
    }

    static ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("span", callback, childrenCallback);
    }

    static ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback) {
        return create("span", callback);
    }

    static ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback, Object... children) {
        return create("span", callback, children);
    }

    static ReactElement strong() {
        return create("strong");
    }

    static ReactElement strong(String value) {
        return create("strong", value);
    }

    static ReactElement strong(Object... children) {
        return create("strong", children);
    }

    static ReactElement strong(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("strong", callback, html);
    }

    static ReactElement strong(HTMLProps<Element> props) {
        return create("strong", props);
    }

    static ReactElement strong(HTMLProps<Element> props, String html) {
        return create("strong", props, html);
    }

    static ReactElement strong(HTMLProps<Element> props, Object... children) {
        return create("strong", props, children);
    }

    static ReactElement strong(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("strong", callback, childrenCallback);
    }

    static ReactElement strong(Func.Run1<HTMLProps<Element>> callback) {
        return create("strong", callback);
    }

    static ReactElement strong(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("strong", callback, children);
    }

    static ReactElement style() {
        return create("style");
    }

    static ReactElement style(String value) {
        return create("style", value);
    }

    static ReactElement style(Object... children) {
        return create("style", children);
    }

    static ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback, String html) {
        return create("style", callback, html);
    }

    static ReactElement style(HTMLProps<StyleElement> props) {
        return create("style", props);
    }

    static ReactElement style(HTMLProps<StyleElement> props, String html) {
        return create("style", props, html);
    }

    static ReactElement style(HTMLProps<StyleElement> props, Object... children) {
        return create("style", props, children);
    }

    static ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("style", callback, childrenCallback);
    }

    static ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback) {
        return create("style", callback);
    }

    static ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback, Object... children) {
        return create("style", callback, children);
    }

    static ReactElement sub() {
        return create("sub");
    }

    static ReactElement sub(String value) {
        return create("sub", value);
    }

    static ReactElement sub(Object... children) {
        return create("sub", children);
    }

    static ReactElement sub(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("sub", callback, html);
    }

    static ReactElement sub(HTMLProps<Element> props) {
        return create("sub", props);
    }

    static ReactElement sub(HTMLProps<Element> props, String html) {
        return create("sub", props, html);
    }

    static ReactElement sub(HTMLProps<Element> props, Object... children) {
        return create("sub", props, children);
    }

    static ReactElement sub(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("sub", callback, childrenCallback);
    }

    static ReactElement sub(Func.Run1<HTMLProps<Element>> callback) {
        return create("sub", callback);
    }

    static ReactElement sub(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("sub", callback, children);
    }

    static ReactElement summary() {
        return create("summary");
    }

    static ReactElement summary(String value) {
        return create("summary", value);
    }

    static ReactElement summary(Object... children) {
        return create("summary", children);
    }

    static ReactElement summary(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("summary", callback, html);
    }

    static ReactElement summary(HTMLProps<Element> props) {
        return create("summary", props);
    }

    static ReactElement summary(HTMLProps<Element> props, String html) {
        return create("summary", props, html);
    }

    static ReactElement summary(HTMLProps<Element> props, Object... children) {
        return create("summary", props, children);
    }

    static ReactElement summary(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("summary", callback, childrenCallback);
    }

    static ReactElement summary(Func.Run1<HTMLProps<Element>> callback) {
        return create("summary", callback);
    }

    static ReactElement summary(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("summary", callback, children);
    }

    static ReactElement sup() {
        return create("sup");
    }

    static ReactElement sup(String value) {
        return create("sup", value);
    }

    static ReactElement sup(Object... children) {
        return create("sup", children);
    }

    static ReactElement sup(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("sup", callback, html);
    }

    static ReactElement sup(HTMLProps<Element> props) {
        return create("sup", props);
    }

    static ReactElement sup(HTMLProps<Element> props, String html) {
        return create("sup", props, html);
    }

    static ReactElement sup(HTMLProps<Element> props, Object... children) {
        return create("sup", props, children);
    }

    static ReactElement sup(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("sup", callback, childrenCallback);
    }

    static ReactElement sup(Func.Run1<HTMLProps<Element>> callback) {
        return create("sup", callback);
    }

    static ReactElement sup(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("sup", callback, children);
    }

    static ReactElement table() {
        return create("table");
    }

    static ReactElement table(String value) {
        return create("table", value);
    }

    static ReactElement table(Object... children) {
        return create("table", children);
    }

    static ReactElement table(Func.Run1<HTMLProps<TableElement>> callback, String html) {
        return create("table", callback, html);
    }

    static ReactElement table(HTMLProps<TableElement> props) {
        return create("table", props);
    }

    static ReactElement table(HTMLProps<TableElement> props, String html) {
        return create("table", props, html);
    }

    static ReactElement table(HTMLProps<TableElement> props, Object... children) {
        return create("table", props, children);
    }

    static ReactElement table(Func.Run1<HTMLProps<TableElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("table", callback, childrenCallback);
    }

    static ReactElement table(Func.Run1<HTMLProps<TableElement>> callback) {
        return create("table", callback);
    }

    static ReactElement table(Func.Run1<HTMLProps<TableElement>> callback, Object... children) {
        return create("table", callback, children);
    }

    static ReactElement tbody() {
        return create("tbody");
    }

    static ReactElement tbody(String value) {
        return create("tbody", value);
    }

    static ReactElement tbody(Object... children) {
        return create("tbody", children);
    }

    static ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback, String html) {
        return create("tbody", callback, html);
    }

    static ReactElement tbody(HTMLProps<TableSectionElement> props) {
        return create("tbody", props);
    }

    static ReactElement tbody(HTMLProps<TableSectionElement> props, String html) {
        return create("tbody", props, html);
    }

    static ReactElement tbody(HTMLProps<TableSectionElement> props, Object... children) {
        return create("tbody", props, children);
    }

    static ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("tbody", callback, childrenCallback);
    }

    static ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback) {
        return create("tbody", callback);
    }

    static ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback, Object... children) {
        return create("tbody", callback, children);
    }

    static ReactElement td() {
        return create("td");
    }

    static ReactElement td(String value) {
        return create("td", value);
    }

    static ReactElement td(Object... children) {
        return create("td", children);
    }

    static ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback, String html) {
        return create("td", callback, html);
    }

    static ReactElement td(HTMLProps<TableCellElement> props) {
        return create("td", props);
    }

    static ReactElement td(HTMLProps<TableCellElement> props, String html) {
        return create("td", props, html);
    }

    static ReactElement td(HTMLProps<TableCellElement> props, Object... children) {
        return create("td", props, children);
    }

    static ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("td", callback, childrenCallback);
    }

    static ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback) {
        return create("td", callback);
    }

    static ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback, Object... children) {
        return create("td", callback, children);
    }

    static ReactElement textarea() {
        return create("textarea");
    }

    static ReactElement textarea(String value) {
        return create("textarea", value);
    }

    static ReactElement textarea(Object... children) {
        return create("textarea", children);
    }

    static ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback, String html) {
        return create("textarea", callback, html);
    }

    static ReactElement textarea(HTMLProps<TextAreaElement> props) {
        return create("textarea", props);
    }

    static ReactElement textarea(HTMLProps<TextAreaElement> props, String html) {
        return create("textarea", props, html);
    }

    static ReactElement textarea(HTMLProps<TextAreaElement> props, Object... children) {
        return create("textarea", props, children);
    }

    static ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("textarea", callback, childrenCallback);
    }

    static ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback) {
        return create("textarea", callback);
    }

    static ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback, Object... children) {
        return create("textarea", callback, children);
    }

    static ReactElement tfoot() {
        return create("tfoot");
    }

    static ReactElement tfoot(String value) {
        return create("tfoot", value);
    }

    static ReactElement tfoot(Object... children) {
        return create("tfoot", children);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("tfoot", callback, html);
    }

    static ReactElement tfoot(HTMLProps<Element> props) {
        return create("tfoot", props);
    }

    static ReactElement tfoot(HTMLProps<Element> props, String html) {
        return create("tfoot", props, html);
    }

    static ReactElement tfoot(HTMLProps<Element> props, Object... children) {
        return create("tfoot", props, children);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("tfoot", callback, childrenCallback);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback) {
        return create("tfoot", callback);
    }

    static ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("tfoot", callback, children);
    }

    static ReactElement th() {
        return create("th");
    }

    static ReactElement th(String value) {
        return create("th", value);
    }

    static ReactElement th(Object... children) {
        return create("th", children);
    }

    static ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback, String html) {
        return create("th", callback, html);
    }

    static ReactElement th(HTMLProps<TableCellElement> props) {
        return create("th", props);
    }

    static ReactElement th(HTMLProps<TableCellElement> props, String html) {
        return create("th", props, html);
    }

    static ReactElement th(HTMLProps<TableCellElement> props, Object... children) {
        return create("th", props, children);
    }

    static ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("th", callback, childrenCallback);
    }

    static ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback) {
        return create("th", callback);
    }

    static ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback, Object... children) {
        return create("th", callback, children);
    }

    static ReactElement thead() {
        return create("thead");
    }

    static ReactElement thead(String value) {
        return create("thead", value);
    }

    static ReactElement thead(Object... children) {
        return create("thead", children);
    }

    static ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback, String html) {
        return create("thead", callback, html);
    }

    static ReactElement thead(HTMLProps<TableSectionElement> props) {
        return create("thead", props);
    }

    static ReactElement thead(HTMLProps<TableSectionElement> props, String html) {
        return create("thead", props, html);
    }

    static ReactElement thead(HTMLProps<TableSectionElement> props, Object... children) {
        return create("thead", props, children);
    }

    static ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("thead", callback, childrenCallback);
    }

    static ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback) {
        return create("thead", callback);
    }

    static ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback, Object... children) {
        return create("thead", callback, children);
    }

    static ReactElement time() {
        return create("time");
    }

    static ReactElement time(String value) {
        return create("time", value);
    }

    static ReactElement time(Object... children) {
        return create("time", children);
    }

    static ReactElement time(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("time", callback, html);
    }

    static ReactElement time(HTMLProps<Element> props) {
        return create("time", props);
    }

    static ReactElement time(HTMLProps<Element> props, String html) {
        return create("time", props, html);
    }

    static ReactElement time(HTMLProps<Element> props, Object... children) {
        return create("time", props, children);
    }

    static ReactElement time(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("time", callback, childrenCallback);
    }

    static ReactElement time(Func.Run1<HTMLProps<Element>> callback) {
        return create("time", callback);
    }

    static ReactElement time(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("time", callback, children);
    }

    static ReactElement title() {
        return create("title");
    }

    static ReactElement title(String value) {
        return create("title", value);
    }

    static ReactElement title(Object... children) {
        return create("title", children);
    }

    static ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback, String html) {
        return create("title", callback, html);
    }

    static ReactElement title(HTMLProps<TitleElement> props) {
        return create("title", props);
    }

    static ReactElement title(HTMLProps<TitleElement> props, String html) {
        return create("title", props, html);
    }

    static ReactElement title(HTMLProps<TitleElement> props, Object... children) {
        return create("title", props, children);
    }

    static ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("title", callback, childrenCallback);
    }

    static ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback) {
        return create("title", callback);
    }

    static ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback, Object... children) {
        return create("title", callback, children);
    }

    static ReactElement tr() {
        return create("tr");
    }

    static ReactElement tr(String value) {
        return create("tr", value);
    }

    static ReactElement tr(Object... children) {
        return create("tr", children);
    }

    static ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback, String html) {
        return create("tr", callback, html);
    }

    static ReactElement tr(HTMLProps<TableRowElement> props) {
        return create("tr", props);
    }

    static ReactElement tr(HTMLProps<TableRowElement> props, String html) {
        return create("tr", props, html);
    }

    static ReactElement tr(HTMLProps<TableRowElement> props, Object... children) {
        return create("tr", props, children);
    }

    static ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("tr", callback, childrenCallback);
    }

    static ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback) {
        return create("tr", callback);
    }

    static ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback, Object... children) {
        return create("tr", callback, children);
    }

    static ReactElement track() {
        return create("track");
    }

    static ReactElement track(String value) {
        return create("track", value);
    }

    static ReactElement track(Object... children) {
        return create("track", children);
    }

    static ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback, String html) {
        return create("track", callback, html);
    }

    static ReactElement track(HTMLProps<TrackElement> props) {
        return create("track", props);
    }

    static ReactElement track(HTMLProps<TrackElement> props, String html) {
        return create("track", props, html);
    }

    static ReactElement track(HTMLProps<TrackElement> props, Object... children) {
        return create("track", props, children);
    }

    static ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("track", callback, childrenCallback);
    }

    static ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback) {
        return create("track", callback);
    }

    static ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback, Object... children) {
        return create("track", callback, children);
    }

    static ReactElement u() {
        return create("u");
    }

    static ReactElement u(String value) {
        return create("u", value);
    }

    static ReactElement u(Object... children) {
        return create("u", children);
    }

    static ReactElement u(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("u", callback, html);
    }

    static ReactElement u(HTMLProps<Element> props) {
        return create("u", props);
    }

    static ReactElement u(HTMLProps<Element> props, String html) {
        return create("u", props, html);
    }

    static ReactElement u(HTMLProps<Element> props, Object... children) {
        return create("u", props, children);
    }

    static ReactElement u(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("u", callback, childrenCallback);
    }

    static ReactElement u(Func.Run1<HTMLProps<Element>> callback) {
        return create("u", callback);
    }

    static ReactElement u(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("u", callback, children);
    }

    static ReactElement ul() {
        return create("ul");
    }

    static ReactElement ul(String value) {
        return create("ul", value);
    }

    static ReactElement ul(Object... children) {
        return create("ul", children);
    }

    static ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback, String html) {
        return create("ul", callback, html);
    }

    static ReactElement ul(HTMLProps<UListElement> props) {
        return create("ul", props);
    }

    static ReactElement ul(HTMLProps<UListElement> props, String html) {
        return create("ul", props, html);
    }

    static ReactElement ul(HTMLProps<UListElement> props, Object... children) {
        return create("ul", props, children);
    }

    static ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ul", callback, childrenCallback);
    }

    static ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback) {
        return create("ul", callback);
    }

    static ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback, Object... children) {
        return create("ul", callback, children);
    }

    static ReactElement var() {
        return create("var");
    }

    static ReactElement var(String value) {
        return create("var", value);
    }

    static ReactElement var(Object... children) {
        return create("var", children);
    }

    static ReactElement var(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("var", callback, html);
    }

    static ReactElement var(HTMLProps<Element> props) {
        return create("var", props);
    }

    static ReactElement var(HTMLProps<Element> props, String html) {
        return create("var", props, html);
    }

    static ReactElement var(HTMLProps<Element> props, Object... children) {
        return create("var", props, children);
    }

    static ReactElement var(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("var", callback, childrenCallback);
    }

    static ReactElement var(Func.Run1<HTMLProps<Element>> callback) {
        return create("var", callback);
    }

    static ReactElement var(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("var", callback, children);
    }

    static ReactElement video() {
        return create("video");
    }

    static ReactElement video(String value) {
        return create("video", value);
    }

    static ReactElement video(Object... children) {
        return create("video", children);
    }

    static ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback, String html) {
        return create("video", callback, html);
    }

    static ReactElement video(HTMLProps<VideoElement> props) {
        return create("video", props);
    }

    static ReactElement video(HTMLProps<VideoElement> props, String html) {
        return create("video", props, html);
    }

    static ReactElement video(HTMLProps<VideoElement> props, Object... children) {
        return create("video", props, children);
    }

    static ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("video", callback, childrenCallback);
    }

    static ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback) {
        return create("video", callback);
    }

    static ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback, Object... children) {
        return create("video", callback, children);
    }

    static ReactElement wbr() {
        return create("wbr");
    }

    static ReactElement wbr(String value) {
        return create("wbr", value);
    }

    static ReactElement wbr(Object... children) {
        return create("wbr", children);
    }

    static ReactElement wbr(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("wbr", callback, html);
    }

    static ReactElement wbr(HTMLProps<Element> props) {
        return create("wbr", props);
    }

    static ReactElement wbr(HTMLProps<Element> props, String html) {
        return create("wbr", props, html);
    }

    static ReactElement wbr(HTMLProps<Element> props, Object... children) {
        return create("wbr", props, children);
    }

    static ReactElement wbr(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("wbr", callback, childrenCallback);
    }

    static ReactElement wbr(Func.Run1<HTMLProps<Element>> callback) {
        return create("wbr", callback);
    }

    static ReactElement wbr(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("wbr", callback, children);
    }

    class ChildList {
        private ArrayList<Object> list = new ArrayList<>();

        public ArrayList<Object> getList() {
            return list;
        }

        public Object[] toArray() {
            return toObjectArray(list);
        }

        public ChildList add(Number... nums) {
            if (nums == null) {
                return this;
            }
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            return this;
        }

        public ChildList add(String... children) {
            if (children == null) {
                return this;
            }
            for (int i = 0; i < children.length; i++) {
                list.add(children[i]);
            }
            return this;
        }

        public ChildList add(ReactElement... children) {
            if (children == null) {
                return this;
            }
            for (int i = 0; i < children.length; i++) {
                list.add(children[i]);
            }
            return this;
        }
    }
}
