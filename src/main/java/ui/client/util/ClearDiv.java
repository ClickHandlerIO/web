package ui.client.util;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;

public class ClearDiv {
    private static DivElement divEl;

    public static void show() {
        if (divEl == null) {
            divEl = Document.get().createDivElement();
            divEl.setClassName("clear-div");
        }

        if (!divEl.hasParentElement()) {
            Document.get().getBody().appendChild(divEl);
        }
    }

    public static void hide() {
        if (divEl != null && divEl.hasParentElement()) {
            divEl.removeFromParent();
        }
    }
}
