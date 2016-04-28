package action.client;

import common.client.Bus;
import common.client.JSON;
import common.client.Jso;
import common.client.Try;

import javax.inject.Inject;
import java.util.Date;

/**
 * Actions provide a command pattern and a standard Request/Reply
 * asynchronous messaging pattern for virtually any sort of task.
 *
 * @author Clay Molocznik
 */
public abstract class AbstractAction<IN, OUT> {
    private Bus bus;
    private long started;
    private int timeoutMillis = 10000;
    private ActionCall<IN, OUT> call;

    public AbstractAction() {
    }

    public int timeoutMillis() {
        return timeoutMillis;
    }

    @Inject
    void setBus(Bus bus) {
        this.bus = bus;
    }

    protected ActionCall<IN, OUT> build() {
        return call = new ActionCall<IN, OUT>(in -> {
            beforeDispatch(in);
        }, this::createIn);
    }

    /**
     * @param request
     */
    protected void beforeDispatch(IN request) {
        started = new Date().getTime();
        this.timeoutMillis = call.timeoutMillis();
        bus.publish(request);
        dispatch(request);
    }

    protected IN createIn() {
        return Jso.create();
    }

    protected OUT createOut() {
        return Jso.create();
    }

    /**
     * @param request
     */
    protected void dispatch(IN request) {
        Try.later(() -> handle(request));
    }

    /**
     * @param request
     */
    protected abstract void handle(IN request);

    /**
     * @param e
     */
    protected void error(Throwable e) {
        call.onError(e);
    }

    /**
     * @param response
     */
    protected void respond(OUT response) {
        call.onResponse(response);
    }

    /**
     * @param callback
     */
    protected void respond(ResponseCallback<OUT> callback) {
        final OUT out = createOut();
        try {
            if (callback != null) {
                callback.call(out);
            }
            call.onResponse(out);
        } catch (Throwable e) {
            call.failed(e);
        }
    }

    /**
     * @param json
     * @return
     */
    protected IN parseIn(String json) {
        final IN in = JSON.parse(json);
        if (in == null) {
            return null;
        }
        return JSON.parse(json, in);
    }

    /**
     * @param json
     * @return
     */
    protected OUT parseOut(String json) {
        final OUT out = JSON.parse(json);
        if (out == null) {
            return null;
        }
        return JSON.parse(json, out);
    }
}
