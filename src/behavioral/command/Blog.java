package behavioral.command;

public class Blog {
    public void comment() {
        System.out.println("Оставить комментарий");
    }

    public void editMainText() {
        System.out.println("Изменить текст основной публикации");
    }

    public void editComment() {
        System.out.println("Изменить комментарий");
    }

    public void blockSubscriber() {
        System.out.println("Заблокировать подписчика");
    }
}
