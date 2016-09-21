package remoting.client;

import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 *
 */
public interface PresenceSubscription extends HandlerRegistration {
    Presence presence();

    PresenceOccupant me();

    PresenceListener listener();

    void leave();
}
