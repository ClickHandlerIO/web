package ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface CamberResourceBundle extends ClientBundle {
    CamberResourceBundle INSTANCE = GWT.create(CamberResourceBundle.class);

    @Source("jquery-2.2.1.min.js")
    TextResource jQuery();

    @Source("select2.full.js")
    TextResource Select2();

    @Source("fullcalendar.min.js")
    TextResource FullCalendar();
}
