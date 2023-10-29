import interfaces.IPublisher;
import interfaces.ISubscriber;

import java.util.ArrayList;

public class EventManager implements IPublisher {
    private final ArrayList<ISubscriber> subscribers;

    public EventManager() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String event) {
        for(ISubscriber subscriber : subscribers) {
            subscriber.update(event);
        }
    }
}
