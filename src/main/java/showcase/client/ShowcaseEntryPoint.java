package showcase.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import showcase.resources.ShowcaseResourceBundle;
import ui.resources.CamberResourceBundle;

import java.util.LinkedList;


public class ShowcaseEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        split("this is a bunch of words", ' ').isEmpty();
//        Logger.setLogLevel(Logger.Level.TRACE);

        // inject Moment javascript
//        ScriptInjector.fromString(MomentBundle.INSTANCE.momentWithLocales().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        ScriptInjector.fromString(MomentBundle.INSTANCE.momentTimezoneWithData().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // inject webpack js
        ScriptInjector.fromString(ShowcaseResourceBundle.INSTANCE.webpackOutputJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // inject 3rd party js
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.jQuery().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.Select2().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.FullCalendar().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // Wire up the App.
        final App app = App.get();

        // Start AppModule and initialize theme.
        app.bootstrap().start("app");

//        app.routes().getComponents().getGridPage().go();
    }

    public static LinkedList<String> split(String str, double splitter) {
        final LinkedList<String> list = new LinkedList<>();
        if (str == null || str.isEmpty()) {
            return list;
        }

        char[] chars = str.toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == splitter) {
                list.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        return list;
    }
}
