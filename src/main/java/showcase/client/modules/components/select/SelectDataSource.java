package showcase.client.modules.components.select;

import common.client.Func;
import ui.client.util.UUID;

import java.util.ArrayList;
import java.util.List;

public class SelectDataSource {
    public static void fetchData(String state, String search, Func.Run1<SnowResort[]> callback) {
        if (callback == null) {
            return;
        }

        List<SnowResort> data = new ArrayList<>();
        if (state == null) {
            data.add(new SnowResort("Deer Valley", "UT"));
            data.add(new SnowResort("Park City", "UT"));
            data.add(new SnowResort("Snowbird", "UT"));
            data.add(new SnowResort("Squaw Valley", "CA"));
        }else {
            data.add(new SnowResort("Deer Valley", "UT"));
            data.add(new SnowResort("Park City", "UT"));
            data.add(new SnowResort("Snowbird", "UT"));
        }
        callback.run(data.toArray(new SnowResort[data.size()]));
    }

    public static class SnowResort {
        private String id;
        private String name;
        private String state;

        public SnowResort(String name, String state) {
            this.id = name;
            this.name = name;
            this.state = state;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getState() {
            return state;
        }
    }
}
