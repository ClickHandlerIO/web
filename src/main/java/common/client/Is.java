package common.client;

import com.google.gwt.core.client.GWT;

/**
 *
 */
// TODO rename / reorganize utils
public class Is {
    public static boolean devMode() {
        return ((SuperDevModeIndicator) GWT.create(SuperDevModeIndicator.class)).isSuperDevMode();
    }
}
