package behavioral.observer.blogger;

import behavioral.observer.subscribers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements Observable {
    List<Observer> observers = new ArrayList<>();


    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.getArticle(message);
        }
    }

    @Override
    public void addArticle(String article) {
        notifyObservers(article);
    }
}
