package structural.adapter;

//способ через наследование
public class UnitAdapterFromWolf extends Wolf implements Unit {

    @Override
    public void attack() {
        run();
        bite();
    }

    @Override
    public void move() {
        run();
    }
}
