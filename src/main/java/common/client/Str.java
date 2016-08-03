package common.client;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Str {
    public static boolean startsWith(String str, String val) {
        if (str == null || val == null)
            return false;

        if (str.length() < val.length())
            return false;

        if (str.isEmpty() || val.isEmpty())
            return false;

        for (int i = 0; i < val.length(); i++) {
            if (str.charAt(i) != val.charAt(i))
                return false;
        }

        return true;
    }

    public static boolean endsWith(String str, String val) {
        if (str == null || val == null)
            return false;

        if (str.length() < val.length())
            return false;

        if (str.isEmpty() || val.isEmpty())
            return false;

        int offset = str.length() - val.length();
        for (int i = 0; i < val.length(); i++) {
            if (str.charAt(offset + i) != val.charAt(i))
                return false;
        }

        return true;
    }

    public static List<String> split(String str, double splitter) {
        final List<String> list = new LinkedList<>();
        if (str == null || str.isEmpty())
            return list;

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == splitter) {
                list.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }

        if (sb.length() > 0)
            list.add(sb.toString());

        return list;
    }
}
