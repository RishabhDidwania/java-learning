package ObserverPattern.Observable.Implementations;

import ObserverPattern.Observable.ProductStock;
import ObserverPattern.Observer.UserNotification;

import java.util.ArrayList;
import java.util.List;

public class ProductStockImp implements ProductStock {

    int count;
    List<UserNotification> subscribersList = new ArrayList<>();

    @Override
    public void subscribe(UserNotification userNotification){
        subscribersList.add(userNotification);

    };
    public ProductStockImp(int count){
        this.count = count;
    }
    @Override
    public void unSubscribe(UserNotification userNotification){
        subscribersList.remove(userNotification);
    };

    @Override
    public void notifySubscribers(){
        for(UserNotification subscribers : subscribersList){
            subscribers.update();
        }

    };
    @Override
    public int getData(){
        return this.count;
    }
    @Override
    public void setData(int val) {
        if(this.count==0 ){
            this.count += val;
            notifySubscribers();
        }
        else this.count+=val;

    }
}
