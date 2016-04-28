package io.clickhandler.reactGwt.generator;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 */
public class Utils {
    public static void main(String[] args) throws IOException {
        // DOMProps
//        generateProps("DOMProps", true, "/Users/clay/Repos/untraceable/untraceable/io.clickhandler.web/src/main/java/move/generator/DOMAttributes.txt");
        // HTMLAttributes
        generateProps("VoidHTMLProps", true, "/Users/clay/Repos/untraceable/untraceable/io.clickhandler.web/src/main/java/move/generator/HTMLAttributes.txt");

        // SVGAttributes
//        generateProps("SVGProps", true, "/Users/clay/Repos/untraceable/untraceable/io.clickhandler.web/src/main/java/move/generator/SVGAttributes.txt");
//        generateProps("StyleProps", false, "/Users/clay/Repos/untraceable/untraceable/io.clickhandler.web/src/main/java/move/generator/CSSProperties.txt");
    }

    public static void generateProps(String className, boolean isGeneric, String file) throws IOException {
        final List<String> lines = Files.readLines(new File(file), Charset.defaultCharset());

        List<PropDef> list = new ArrayList<>();

        boolean longComment = false;

        for (String line : lines) {
            line = line.trim();

            if (line.startsWith("//")) {
                continue;
            }

            if (!longComment && line.startsWith("/*")) {
                longComment = true;
                continue;
            }

            if (longComment) {
                if (line.endsWith("*/")) {
                    longComment = false;
                }
                continue;
            }

            int commentIndex = line.indexOf("//");

            if (commentIndex > -1) {
                line = line.substring(0, commentIndex);
            }

            line = line.trim();

            if (line.isEmpty()) {
                continue;
            }

            final PropDef def = parse(line);

            if (def != null) {
                list.add(def);
            }
        }

        System.out.println(generateJavaProps(className, isGeneric, list));
    }

    public static String generateJavaProps(String className, boolean isGeneric, List<PropDef> defs) {
        final StringBuilder sb = new StringBuilder();

        for (PropDef def : defs) {
            String javaType = def.getJavaType();
            if (def.isArray()) {
                javaType += "[]";
            }

            sb.append("\n");
            String varName = def.getName();
            if (def.keyword) {
                varName = "_" + varName;
                sb.append("@JsProperty(name = \"").append(def.getName()).append("\")\n");
            } else {
                sb.append("@JsProperty\n");
            }
            sb.append("public ").append(javaType).append(" ").append(varName).append(";");
        }

        sb.append("\n");

        for (PropDef def : defs) {
            String javaType = def.getJavaType();
            if (def.isArray()) {
                javaType += "[]";
            }

            String setterName = "";
//            setterName += Character.toUpperCase(def.getName().charAt(0));
//            setterName += def.getName().substring(1);
            setterName = def.getName();

            sb.append("@JsIgnore\n");
            sb.append("public ").append(className).append(isGeneric ? "<T> " : " ").append(setterName).append("(").append(javaType).append(" value) {\n");
            sb.append("this.").append(def.getVarName()).append(" = value;\n");
            sb.append("return this;\n");
            sb.append("}\n");

        }
        return sb.toString();
    }

    public static String generateInterfaceBody(List<PropDef> defs) {
        final StringBuilder sb = new StringBuilder();

        for (PropDef def : defs) {
            String javaType = def.getJavaType();
            if (def.isArray()) {
                javaType += "[]";
            }

            String getterName = "";
            if (def.getType().equals("boolean")) {
                getterName = "is";
            } else {
                getterName = "get";
            }
            getterName += Character.toUpperCase(def.getName().charAt(0));
            getterName += def.getName().substring(1);

            sb.append("@JsProperty");
            sb.append("\n");
            sb.append(javaType).append(" ").append(getterName).append("();");
            sb.append("\n");
        }
        return sb.toString();
    }

    public static PropDef parse(String line) {
        line = line.replace(";", "");
        final String[] parts = line.trim().split(":");

        String name = parts[0].trim();

        if (name.contains("?")) {
            name = name.replace("?", "");
        }

        PropDef def = new PropDef();
        def.setName(name);

        if (parts.length < 2) {
            return null;
        }

        String typeSpec = parts[1].trim();

        if (typeSpec.contains("|")) {
            final HashSet<String> set = new HashSet<>();
            boolean arr = false;

            final String[] multiSpecs = typeSpec.split("|");

            for (String s : multiSpecs) {
                if (s.contains("[]")) {
                    arr = true;
                    s = s.replace("[]", "");
                }

                set.add(s);
            }

            def.setArray(arr);

            if (set.size() == 1) {
                def.setType(set.iterator().next());
            } else {
                def.setType("any");
            }
        } else {
            if (typeSpec.contains("[]")) {
                typeSpec = typeSpec.replace("[]", "");
                def.setArray(true);
            }
            def.setType(typeSpec);
        }

        return def;
    }

    public static boolean isKeyword(String value) {
        switch (value.trim().toLowerCase()) {
            case "default":
            case "float":
                return true;
        }
        return false;
    }

    public static class PropDef {
        public String javaType;
        private String name;
        private String type;
        private boolean array;
        private String varName;
        private boolean keyword;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;

            if (name == null) {
                varName = null;
                return;
            }

            if (isKeyword(name)) {
                keyword = true;
                varName = "_" + name;
            } else {
                varName = name;
            }
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;

            if (type == null) {
                javaType = null;
                return;
            }

            switch (type.toLowerCase()) {
                case "boolean":
                    javaType = "boolean";
                    break;
                case "string":
                    javaType = "String";
                    break;
                case "number":
                    javaType = "Number";
                    break;
                case "any":
                    javaType = "Object";
                    break;
                default:
                    javaType = type;
                    break;
            }
        }

        public boolean isArray() {
            return array;
        }

        public void setArray(boolean array) {
            this.array = array;
        }

        public String getVarName() {
            return varName;
        }

        public void setVarName(String varName) {
            this.varName = varName;
        }

        public String getJavaType() {
            return javaType;
        }

        public void setJavaType(String javaType) {
            this.javaType = javaType;
        }
    }
}
