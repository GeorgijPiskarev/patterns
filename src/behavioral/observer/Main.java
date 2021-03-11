package behavioral.observer;

import behavioral.observer.blogger.Blogger;
import behavioral.observer.blogger.Observable;
import behavioral.observer.subscribers.GoldSubscriber;
import behavioral.observer.subscribers.Observer;
import behavioral.observer.subscribers.Subscriber;

public class Main {
    public static void main(String[] args) {
        Observable blogger = new Blogger();
        Observer subscriber = new Subscriber();
        Observer goldSubscriber = new GoldSubscriber();

        blogger.addSubscriber(subscriber);
        blogger.addSubscriber(goldSubscriber);

        blogger.addArticle("Сегодня я хотел бы вам рассказать...");
    }
}
