import interfaces.IPublisher;
import interfaces.ISubscriber;

import java.util.ArrayList;

public class Tavern {
    private final IPublisher eventManager;
    private final ArrayList<String> events;

    public Tavern() {
        this.eventManager = new EventManager();
        this.events = new ArrayList<>();
    }

    public void subscribe(ISubscriber subscriber) {
        eventManager.subscribe(subscriber);
    }

    public void unSubscribe(ISubscriber subscriber) {
        eventManager.unSubscribe(subscriber);
    }

    public void addEvent(String event) {
        events.add(event);
        eventManager.notifySubscribers("New event!!, " + event);
    }

    public void deleteEvent(String event) {
        events.remove(event);
        eventManager.notifySubscribers(event + ", has ended");
    }
}
