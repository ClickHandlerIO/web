package remoting.client;

import action.client.AbstractAction;
import action.client.TimedOutException;
import common.client.Bus;
import common.client.JSON;

import javax.inject.Inject;

/**
 *
 */
public abstract class WsAction<IN, OUT> extends AbstractAction<IN, OUT> {
    @Inject
    Bus bus;
    @Inject
    WsDispatcher dispatcher;

    public Bus getBus() {
        return bus;
    }

    public WsDispatcher getDispatcher() {
        return dispatcher;
    }

    public Bus.TypeName<IN> inTypeName() {
        return null;
    }

    public Bus.TypeName<OUT> outTypeName() {
        return null;
    }

    /**
     * @return
     */
    protected abstract String path();

    /**
     * @param in
     * @param out
     * @return
     */
    protected ResponseEvent<IN, OUT> responseEvent(IN in, OUT out) {
        return new ResponseEvent<>(in, out);
    }

    /**
     * @param request
     * @return
     */
    protected String stringify(IN request) {
        return JSON.stringify(request);
    }

    @Override
    protected void handle(IN request) {
        final Bus.TypeName<IN> inTypeName = inTypeName();
        if (inTypeName != null) {
            bus.publish(inTypeName(), request);
        }
        dispatcher.request(
            // In TypeName for Bus.
            inTypeName(),
            // Out TypeName for Bus.
            outTypeName(),
            // Timeout Millis.
            timeoutMillis(),
            // Action name.
            path(),
            // Serialize request.
            stringify(request),
            // Handle response.
            envelope -> {
                if (envelope == null) {
                    return;
                }
                if (envelope.code() != 200) {
                    error(new StatusCodeException((int) envelope.code()));
                } else {
                    OUT out = parseOut(envelope.body());
                    try {
                        respond(out);
                    } finally {
                        try {
                            final Bus.TypeName<OUT> outTypeName = outTypeName();
                            if (outTypeName != null)
                                bus.publish(outTypeName, out);
                        } finally {
                            final ResponseEvent<IN, OUT> responseEvent = responseEvent(request, out);
                            if (responseEvent != null)
                                bus.publish(responseEvent);
                        }
                    }
                }
            },
            // Handle timeout.
            () -> error(new TimedOutException())
        );
    }
}
