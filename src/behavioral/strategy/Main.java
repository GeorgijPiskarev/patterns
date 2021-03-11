package behavioral.strategy;

//Армия самостоятельно выбирает способ обороны при команде от игрока.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setStrategy(new SmallArmy());
        player.defence();
    }
}
