package remoting.client;

import common.client.Bus;
import dagger.Module;
import dagger.Provides;

/**
 *
 */
public interface WsModule<T> {
    T root();

    WsDispatcher dispatcher();

    @Module
    class M {
        private String url;

        public M(String url) {
            this.url = url;
        }

        @Provides
        WsDispatcher dispatcher(Bus bus) {
            WsDispatcher dispatcher = new WsDispatcher(bus, url);
            dispatcher.start();
            return dispatcher;
        }
    }
}
