package common.client;

import com.google.gwt.event.shared.GwtEvent;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.web.bindery.event.shared.SimpleEventBus;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 */
@Singleton
public class Bus {
    private final Map<String, GwtEvent.Type> map = new HashMap<>();
    private final EventBus eventBus = new SimpleEventBus();

    @Inject
    public Bus() {
    }

    /**
     * @param <T>
     * @return
     */
    public static <T> TypeName<T> newName() {
        return new TypeName<>();
    }

    @Deprecated
    public static <T> TypeName<T> scoped(TypeName<T> typeName, String context) {
        if (typeName == null) return context == null ? new TypeName<>() : new TypeName<>();
        if (context == null) return typeName;
        return new TypeName<>(typeName.name + "|" + context);
    }

    /**
     * @return
     */
    public EventBus getEventBus() {
        return eventBus;
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @return
     */
    public <T> HandlerRegistration subscribe(Class<T> eventClass, EventCallback<T> callback) {
        if (eventClass == null) return null;
        GwtEvent.Type<EventCallback<InternalEvent<T>>> type = getType(eventClass.getName());
        return eventBus.addHandler(type, (event) -> {
            if (callback != null) {
                callback.call(event.message);
            }
        });
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @return
     */
    public <T extends MessageProvider<M>, M> HandlerRegistration listen(Class<T> eventClass, Consumer<M> callback) {
        if (eventClass == null) return null;
        GwtEvent.Type<EventCallback<InternalEvent<T>>> type = getType(eventClass.getName());
        return eventBus.addHandler(type, (event) -> {
            if (callback != null) {
                callback.accept(event.message != null ? event.message.get() : null);
            }
        });
    }

    /**
     * @param type
     * @param callback
     * @param <T>
     * @return
     */
    public <T extends HasBusName<T>> HandlerRegistration subscribe(T type, EventCallback<T> callback) {
        if (type == null) return null;
        final TypeName<T> name;
        try {
            name = Jso.call(type, "$busName$");
        } catch (Throwable e) {
            return null;
        }

        return subscribe(name, callback);
    }

    /**
     * @param named
     * @param callback
     * @param <T>
     * @return
     */
    public <T> HandlerRegistration subscribe(TypeName<T> named, EventCallback<T> callback) {
        if (named == null) return null;
        GwtEvent.Type<EventCallback<InternalEvent<T>>> type = getType(named.name);
        return eventBus.addHandler(type, (event) -> {
            if (callback != null) {
                callback.call(event.message);
            }
        });
    }

    /**
     * @param name
     * @param callback
     * @param <T>
     * @return
     */
    public <T> HandlerRegistration subscribe(String name, EventCallback<T> callback) {
        if (name == null) return null;
        GwtEvent.Type<EventCallback<InternalEvent<T>>> type = getType(name);
        return eventBus.addHandler(type, (event) -> {
            if (callback != null) {
                callback.call(event.message);
            }
        });
    }

    /**
     * @param event
     * @param <T>
     */
    public <T> void publish(T event) {
        eventBus.fireEvent(new InternalEvent<>(event, getType(event.getClass().getName())));
    }

    public <T extends HasBusName> void publish(T event) {
        final TypeName<T> name;
        try {
            name = Jso.call(event, "$busName$");
        } catch (Throwable e) {
            return;
        }
        if (name != null)
            publish(name, event);
    }

    public <T> void publish(TypeName<T> name, T event) {
        eventBus.fireEvent(new InternalEvent<>(event, getType(name.name)));
    }

    public <T> void publish(String name, T event) {
        eventBus.fireEvent(new InternalEvent<>(event, getType(name)));
    }

    /**
     * Internal GwtEvent.Type locator and factory.
     *
     * @param key
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <T> GwtEvent.Type<EventCallback<T>> getType(String key) {
        return (GwtEvent.Type<EventCallback<T>>) map.computeIfAbsent(key, k -> new GwtEvent.Type<>());
    }

    /**
     * @param <T>
     */
    public static class TypeName<T> {
        private static int counter = 0;
        private String name;

        public TypeName() {
            name = "" + (++counter);
        }

        protected TypeName(String name) {
            this.name = name;
        }
    }

    /**
     * @param <T>
     */
    private static final class InternalEvent<T> extends GwtEvent<EventCallback<InternalEvent<T>>> {
        private final T message;
        private final Type<EventCallback<InternalEvent<T>>> type;

        public InternalEvent(T message, Type<EventCallback<InternalEvent<T>>> type) {
            this.message = message;
            this.type = type;
        }

        @Override
        public Type<EventCallback<InternalEvent<T>>> getAssociatedType() {
            return type;
        }

        @Override
        protected void dispatch(EventCallback<InternalEvent<T>> handler) {
            handler.call(this);
        }
    }
}
