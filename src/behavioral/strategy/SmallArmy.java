package behavioral.strategy;

public class SmallArmy implements Strategy {
    @Override
    public void defence() {
        System.out.println("Армия патрулирует окрестности");
    }
}
