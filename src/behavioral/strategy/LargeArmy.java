package behavioral.strategy;

public class LargeArmy implements Strategy {
    @Override
    public void defence() {
        System.out.println("Армия идет в атаку");
    }
}
