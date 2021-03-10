package structural.decorator;

public class Fish extends Decorator {
    public Fish(Diet diet) {
        super(diet);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ест рыбу");
    }
}
