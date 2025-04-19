package ObserverPattern.Observer.implementations;

import ObserverPattern.Observable.ProductStock;
import ObserverPattern.Observer.UserNotification;

public class EmailUserNotification implements UserNotification {
    String email;
    ProductStock productStock;

    public EmailUserNotification(String email, ProductStock productStock){
        this.email=email;
        this.productStock=productStock;
    }

    @Override
    public  void update(){
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Email sent to "+ this.email + " now the product count is " + productStock.getData());
    }
}
