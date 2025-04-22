package ObserverPattern;

import ObserverPattern.Observable.Implementations.ProductStockImp;
import ObserverPattern.Observer.UserNotification;
import ObserverPattern.Observer.implementations.EmailUserNotification;

public class Main {
    public static void main(String[] args) {

        // The example we are taking here is the notify feature when the product
        // goes out of stock
        ProductStockImp p1 = new ProductStockImp(0);

        UserNotification u1 = new EmailUserNotification("r2@gmail.com", p1);
        p1.subscribe(u1);

        p1.setData(5);
        p1.setData(-5);
        p1.setData(9);
    }

}