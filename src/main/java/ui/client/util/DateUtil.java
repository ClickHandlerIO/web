package ui.client.util;

import com.google.gwt.i18n.client.DateTimeFormat;
import io.clickhandler.momentGwt.client.Moment;

import java.util.Date;

public class DateUtil {

    // For handling Java dates going in / out of DateBox controls

    private static Double browserOffset = null;

    public static Date toBrowserAdjustedDate(Moment moment) {
        Double millis = moment.valueOf() + (moment.utcOffset() - getBrowserOffset()) * 1000. * 60.;
        return new Date(millis.longValue());
    }

    public static Moment fromBrowserAdjustedDate(Date date) {
        Moment m = Moment.moment(date.getTime());
        return Moment.moment(m.valueOf() - ((m.utcOffset() - getBrowserOffset()) * 1000. * 60.));
    }

    private static double getBrowserOffset() {
        if (browserOffset == null) {
            try {
                String[] strings = DateTimeFormat.getFormat("ZZZ").format(new Date()).split(":"); // Date time format -07:00
                if (strings.length != 2) {
                    return 0.;
                }

                double hour = Integer.parseInt(strings[0]);
                double minutes = Integer.parseInt(strings[1]);
                minutes += (hour * 60.);

                browserOffset = minutes;
            } catch (Exception e) {
                browserOffset = 0.;
            }
        }
        return browserOffset;
    }
}
