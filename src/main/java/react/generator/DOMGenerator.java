package io.clickhandler.reactGwt.generator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class DOMGenerator {
    public static void main(String[] args) {
        final List<Tag> tags = new ArrayList<>();
        tags.add(new Tag("a", "AnchorElement"));
        tags.add(new Tag("abbr", "AnchorElement"));
        tags.add(new Tag("address", "Element"));
        tags.add(new Tag("area", "AreaElement"));
        tags.add(new Tag("article", "Element"));
        tags.add(new Tag("aside", "Element"));
        tags.add(new Tag("audio", "AudioElement"));
        tags.add(new Tag("b", "Element"));
        tags.add(new Tag("base", "BaseElement"));
        tags.add(new Tag("bdi", "Element"));
        tags.add(new Tag("bdo", "Element"));
        tags.add(new Tag("big", "Element"));
        tags.add(new Tag("blockquote", "Element"));
        tags.add(new Tag("body", "BodyElement"));
        tags.add(new Tag("br", "BRElement"));
        tags.add(new Tag("button", "ButtonElement"));
        tags.add(new Tag("canvas", "CanvasElement"));
        tags.add(new Tag("caption", "TableCaptionElement"));
        tags.add(new Tag("cite", "Element"));
        tags.add(new Tag("code", "Element"));
        tags.add(new Tag("col", "TableColElement"));
        tags.add(new Tag("colgroup", "Element"));
        tags.add(new Tag("data", "Element"));
        tags.add(new Tag("datalist", "Element"));
        tags.add(new Tag("dd", "Element"));
        tags.add(new Tag("del", "Element"));
        tags.add(new Tag("details", "DetailsElement"));
        tags.add(new Tag("dfn", "Element"));
        tags.add(new Tag("dialog", "Element"));
        tags.add(new Tag("div", "DivElement"));
        tags.add(new Tag("dl", "DListElement"));
        tags.add(new Tag("dt", "Element"));
        tags.add(new Tag("em", "Element"));
        tags.add(new Tag("embed", "EmbedElement"));
        tags.add(new Tag("fieldset", "FieldSetElement"));
        tags.add(new Tag("figcaption", "Element"));
        tags.add(new Tag("figure", "Element"));
        tags.add(new Tag("footer", "Element"));
        tags.add(new Tag("form", "FormElement"));
        tags.add(new Tag("h1", "HeadingElement"));
        tags.add(new Tag("h2", "HeadingElement"));
        tags.add(new Tag("h3", "HeadingElement"));
        tags.add(new Tag("h4", "HeadingElement"));
        tags.add(new Tag("h5", "HeadingElement"));
        tags.add(new Tag("h6", "HeadingElement"));
        tags.add(new Tag("head", "HeadElement"));
        tags.add(new Tag("header", "Element"));
        tags.add(new Tag("hr", "HRElement"));
        tags.add(new Tag("html", "HtmlElement"));
        tags.add(new Tag("i", "Element"));
        tags.add(new Tag("iframe", "IFrameElement"));
        tags.add(new Tag("img", "ImageElement"));
        tags.add(new Tag("input", "InputElement"));
        tags.add(new Tag("ins", "Element"));
        tags.add(new Tag("kbd", "Element"));
        tags.add(new Tag("keygen", "KeygenElement"));
        tags.add(new Tag("label", "LabelElement"));
        tags.add(new Tag("legend", "LegendElement"));
        tags.add(new Tag("li", "LIElement"));
        tags.add(new Tag("link", "LinkElement"));
        tags.add(new Tag("main", "Element"));
        tags.add(new Tag("map", "MapElement"));
        tags.add(new Tag("mark", "MapElement"));
        tags.add(new Tag("menu", "MenuElement"));
        tags.add(new Tag("menuitem", "Element"));
        tags.add(new Tag("meta", "MetaElement"));
        tags.add(new Tag("meter", "MeterElement"));
        tags.add(new Tag("nav", "Element"));
        tags.add(new Tag("noscript", "Element"));
        tags.add(new Tag("object", "ObjectElement"));
        tags.add(new Tag("ol", "OListElement"));
        tags.add(new Tag("optgroup", "OptGroupElement"));
        tags.add(new Tag("option", "OptionElement"));
        tags.add(new Tag("output", "OutputElement"));
        tags.add(new Tag("p", "ParagraphElement"));
        tags.add(new Tag("param", "ParamElement"));
        tags.add(new Tag("picture", "Element"));
        tags.add(new Tag("pre", "PreElement"));
        tags.add(new Tag("progress", "ProgressElement"));
        tags.add(new Tag("q", "QuoteElement"));
        tags.add(new Tag("rp", "Element"));
        tags.add(new Tag("rt", "Element"));
        tags.add(new Tag("ruby", "Element"));
        tags.add(new Tag("s", "Element"));
        tags.add(new Tag("samp", "Element"));
        tags.add(new Tag("script", "ScriptElement"));
        tags.add(new Tag("section", "TableSectionElement"));
        tags.add(new Tag("select", "SelectElement"));
        tags.add(new Tag("small", "Element"));
        tags.add(new Tag("source", "SourceElement"));
        tags.add(new Tag("span", "SpanElement"));
        tags.add(new Tag("strong", "Element"));
        tags.add(new Tag("style", "StyleElement"));
        tags.add(new Tag("sub", "Element"));
        tags.add(new Tag("summary", "Element"));
        tags.add(new Tag("sup", "Element"));
        tags.add(new Tag("table", "TableElement"));
        tags.add(new Tag("tbody", "TableSectionElement"));
        tags.add(new Tag("td", "TableCellElement"));
        tags.add(new Tag("textarea", "TextAreaElement"));
        tags.add(new Tag("tfoot", "Element"));
        tags.add(new Tag("th", "TableCellElement"));
        tags.add(new Tag("thead", "TableSectionElement"));
        tags.add(new Tag("time", "Element"));
        tags.add(new Tag("title", "TitleElement"));
        tags.add(new Tag("tr", "TableRowElement"));
        tags.add(new Tag("track", "TrackElement"));
        tags.add(new Tag("u", "Element"));
        tags.add(new Tag("ul", "UListElement"));
        tags.add(new Tag("var", "Element"));
        tags.add(new Tag("video", "VideoElement"));
        tags.add(new Tag("wbr", "Element"));

        final StringBuilder sb = new StringBuilder();
        for (Tag tag : tags) {
//            tag.generateDefault(sb);
            tag.generate(sb);
        }

        System.out.println(sb.toString());
    }

    public static class Tag {
        public String name;
        public String elementClassName;

        public Tag(String name, String elementClassName) {
            this.name = name;
            this.elementClassName = elementClassName;
        }

        public void generate(StringBuilder sb) {
            sb.append("static ReactElement ").append(name).append("() {\n");
            sb.append("return create(\"").append(name).append("\");\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(String value) {\n");
            sb.append("return create(\"").append(name).append("\", value);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(Object... children) {\n");
            sb.append("return create(\"").append(name).append("\", children);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback, String html) {\n");
            sb.append("return create(\"").append(name).append("\", callback, html);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(HTMLProps<").append(elementClassName).append("> props) {\n");
            sb.append("return create(\"").append(name).append("\", props);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(HTMLProps<").append(elementClassName).append("> props, String html) {\n");
            sb.append("return create(\"").append(name).append("\", props, html);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(HTMLProps<").append(elementClassName).append("> props, Object... children) {\n");
            sb.append("return create(\"").append(name).append("\", props, children);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback, Func.Run1<ChildList> childrenCallback) {\n");
            sb.append("return create(\"").append(name).append("\", callback, childrenCallback);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback) {\n");
            sb.append("return create(\"").append(name).append("\", callback);\n");
            sb.append("}\n");

            sb.append("static ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback, Object... children) {\n");
            sb.append("return create(\"").append(name).append("\", callback, children);\n");
            sb.append("}\n");
        }

        public void generateDefault(StringBuilder sb) {
            sb.append("default ReactElement ").append(name).append("(String value) {\n");
            sb.append("return create(\"").append(name).append("\", value);\n");
            sb.append("}\n");

            sb.append("default ReactElement ").append(name).append("(Object... children) {\n");
            sb.append("return create(\"").append(name).append("\", children);\n");
            sb.append("}\n");

            sb.append("default ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback, String html) {\n");
            sb.append("return create(\"").append(name).append("\", callback, html);\n");
            sb.append("}\n");

            sb.append("default ReactElement ").append(name).append("(HTMLProps<").append(elementClassName).append("> props, String html) {\n");
            sb.append("return create(\"").append(name).append("\", props, html);\n");
            sb.append("}\n");

            sb.append("default ReactElement ").append(name).append("(HTMLProps<").append(elementClassName).append("> props, Object... children) {\n");
            sb.append("return create(\"").append(name).append("\", props, children);\n");
            sb.append("}\n");

            sb.append("default ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback, Func.Run1<List<Object>> childrenCallback) {\n");
            sb.append("return create(\"").append(name).append("\", callback, childrenCallback);\n");
            sb.append("}\n");

            sb.append("default ReactElement ").append(name).append("(Func.Run1<HTMLProps<").append(elementClassName).append(">> callback, Object... children) {\n");
            sb.append("return create(\"").append(name).append("\", callback, children);\n");
            sb.append("}\n");
        }
    }
}
