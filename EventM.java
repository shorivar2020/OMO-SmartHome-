import Event.Event;

public interface EventM {
    void registerEvent(Event event);
    void removeEvent(Event event);
    void notifyEvent();
}