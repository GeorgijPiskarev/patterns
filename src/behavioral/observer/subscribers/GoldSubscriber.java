package behavioral.observer.subscribers;

public class GoldSubscriber implements Observer {
    @Override
    public void getArticle(String message) {
        System.out.println("Золотой подписчик получает новую статью");
        System.out.println(message);
    }
}
