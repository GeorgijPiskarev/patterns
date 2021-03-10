package structural.adapter;

//способ через композицию
public class UnitAdapterFromWolf2 implements Unit {
    private final Wolf wolf = new Wolf();

    @Override
    public void attack() {
        wolf.run();
        wolf.bite();
    }

    @Override
    public void move() {
        wolf.run();
    }
}
