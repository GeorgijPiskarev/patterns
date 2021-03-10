package structural.decorator;

public class Meat extends Decorator {
    public Meat(Diet diet) {
        super(diet);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ест мясо");
    }
}
