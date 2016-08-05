package showcase.client.modules.components.grid;

import com.google.gwt.user.client.Timer;
import common.client.Func;
import ui.client.util.UUID;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GridDataSource {
    private static int callcount = 0;

    public static void fetchData(Sort sort, String lastRecordId, double pageSize, final Func.Run1<List<SnowReport>> callback) {
        if (callback == null) {
            return;
        }
        callcount++;

        final List<SnowReport> data = new ArrayList<>();

//        for (int i = 0; i < (callcount == 3 ? 2 : pageSize); ++i) {
        for (int i = 0; i < pageSize; ++i) {
            data.add(new SnowReport(new Date(), "Park City Mountain Resort", i + 1.4));
        }

        Timer t = new Timer() {
            @Override
            public void run() {
                callback.run(null);
//                callback.run(data);
            }
        };

        // Schedule the timer to run once in 5 seconds.
        t.schedule(2000);

//        callback.run(data);
    }

    public static class SnowReport {
        private String id;
        private Date date;
        private String resortName;
        private Double snowfall;

        public SnowReport(Date date, String resortName, Double snowfall) {
            this.id = UUID.uuid();
            this.date = date;
            this.resortName = resortName;
            this.snowfall = snowfall;
        }

        public String getId() {
            return id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getResortName() {
            return resortName;
        }

        public void setResortName(String resortName) {
            this.resortName = resortName;
        }

        public Double getSnowfall() {
            return snowfall;
        }

        public void setSnowfall(Double snowfall) {
            this.snowfall = snowfall;
        }
    }

    public enum Sort {
        DATE,
        RESORT,
        SNOWFALL
    }
}
