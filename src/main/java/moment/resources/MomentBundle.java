package moment.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface MomentBundle extends ClientBundle {
    MomentBundle INSTANCE = GWT.create(MomentBundle.class);

    @Source("moment-with-locales.min.js")
    TextResource momentWithLocales();

    @Source("moment-timezone-with-data.min.js")
    TextResource momentTimezoneWithData();
}