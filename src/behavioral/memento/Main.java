package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        //Запускаем игру и сохраняем через 20мин
        Game game = new Game();
        game.setState("3lvl", 20);
        File file = new File();
        file.setSave(game.save());

        //Продолжаем играть
        game.setState("5lvl", 2);
        System.out.println(game);

        //Загружаем сохранение
        game.load(file.getSave());
        System.out.println(game);
    }
}
