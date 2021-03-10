package structural.decorator;

public class Vegetables extends Decorator {
    public Vegetables(Diet diet) {
        super(diet);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Eст овощи");
    }
}
