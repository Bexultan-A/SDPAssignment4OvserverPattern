package interfaces;

public interface IPublisher {
    void subscribe(ISubscriber subscriber);
    void unSubscribe(ISubscriber subscriber);
    void notifySubscribers(String event);
}
