package common.client;

import com.google.gwt.http.client.URL;
import elemental.client.Browser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class URLUtils {
    public static Map<String, String> parse() {
        final Map<String, String> map = new HashMap<>();

        String search = Browser.getWindow().getLocation().getSearch();
        if (search != null && !search.isEmpty()) {
            parse(search.startsWith("?") ? search : "?" + search, map);
        }

        final String hash = Browser.getWindow().getLocation().getHash();
        if (hash != null) {
            parse(hash, map);
        }

        return map;
    }

    public static Map<String, String> parse(String part) {
        final Map<String, String> map = new HashMap<>();
        parse(part, map);
        return map;
    }

    private static void parse(String search, final Map<String, String> map) {
        if (search == null) {
            return;
        }

        final int indexOf = search.indexOf("?");

        if (indexOf < 0) {
            return;
        }

        search = search.substring(indexOf + 1);

        Arrays
            .stream(search.split("[&]"))
            .map(QueryPart::create)
            .filter($ -> $.key != null && !$.key.isEmpty())
            .forEach(p -> map.put(p.key, p.value));
    }

    private static class QueryPart {
        public String key;
        public String value;

        public QueryPart(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public static QueryPart create(String part) {
            final String[] parts = part.split("=");

            String key = parts[0].trim();
            String value = parts.length > 1 ? parts[1].trim() : "";

            key = URL.decodeQueryString(key);
            value = URL.decodeQueryString(value);

            return new QueryPart(key, value);
        }
    }
}
