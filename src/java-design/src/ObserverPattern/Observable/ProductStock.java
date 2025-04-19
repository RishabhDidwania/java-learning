package ObserverPattern.Observable;

import ObserverPattern.Observer.UserNotification;

public interface ProductStock {
     void subscribe(UserNotification userNotification);
    void unSubscribe(UserNotification userNotification);
    void notifySubscribers();
    int getData();
    void setData(int count);
}


