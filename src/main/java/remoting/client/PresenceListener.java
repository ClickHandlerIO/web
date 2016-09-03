package remoting.client;

/**
 *
 */
public interface PresenceListener {
    void onJoin(PresenceJoined joined);

    void onChange(PresenceChange change, Presence presence);

    void onLeave(Presence presence, PresenceOccupant me);
}
