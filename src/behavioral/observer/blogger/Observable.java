package behavioral.observer.blogger;

import behavioral.observer.subscribers.Observer;

public interface Observable {
    void addSubscriber(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);

    void addArticle(String article);
}
