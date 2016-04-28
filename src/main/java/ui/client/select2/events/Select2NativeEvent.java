package ui.client.select2.events;

import com.google.gwt.dom.client.NativeEvent;

public class Select2NativeEvent<P> extends NativeEvent {

    protected Select2NativeEvent() {
    }

    public native final P getParams() /*-{
        return this.params;
    }-*/;
}
