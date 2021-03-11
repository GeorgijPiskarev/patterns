package behavioral.observer.subscribers;

public class Subscriber implements Observer {
    @Override
    public void getArticle(String message) {
        System.out.println("Подписчик получает новую статью");
        System.out.println(message);
    }
}
