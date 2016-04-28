package common.client;

import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

import java.util.ArrayList;

/**
 * Keeps track of local subscriptions which may be removed all at once.
 * Useful for synchronizing to an Object's Lifecycle. (e.g. Component)
 *
 * @author Clay Molocznik
 */
public class BusDelegate implements HandlerRegistration {
    private final Bus delegate;
    private ArrayList<HandlerRegistration> registrations;

    public BusDelegate(Bus delegate) {
        this.delegate = delegate;
    }

    private ArrayList<HandlerRegistration> getRegistrations() {
        if (registrations == null)
            registrations = new ArrayList<>();
        return registrations;
    }

    /**
     * @return
     */
    public EventBus getEventBus() {
        return delegate.getEventBus();
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @return
     */
    public <T> HandlerRegistration subscribe(Class<T> eventClass, EventCallback<T> callback) {
        return register(delegate.subscribe(eventClass, callback));
    }

    /**
     * @param named
     * @param callback
     * @param <T>
     * @return
     */
    public <T> HandlerRegistration subscribe(Bus.TypeName<T> named, EventCallback<T> callback) {
        return register(delegate.subscribe(named, callback));
    }

    /**
     * @param name
     * @param callback
     * @param <T>
     * @return
     */
    public <T> HandlerRegistration subscribe(String name, EventCallback<T> callback) {
        return register(delegate.subscribe(name, callback));
    }

    /**
     * @param registration
     * @return
     */
    public HandlerRegistration register(HandlerRegistration registration) {
        if (registration == null) return null;

        final HandlerRegistration r = new HandlerRegistration() {
            @Override
            public void removeHandler() {
                registrations.remove(this);
                registration.removeHandler();
            }
        };
        getRegistrations().add(r);
        return r;
    }

    @Override
    public void removeHandler() {
        clear();
    }

    /**
     *
     */
    public void clear() {
        if (registrations == null) return;
        for (HandlerRegistration registration : registrations) {
            Try.silent(registration::removeHandler);
        }
        registrations.clear();
        registrations = null;
    }

    /**
     * @param event
     * @param <T>
     */
    public <T> void publish(T event) {
        delegate.publish(event);
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    public <T> void publish(Bus.TypeName<T> name, T event) {
        delegate.publish(name, event);
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    public <T> void publish(String name, T event) {
        delegate.publish(name, event);
    }
}
