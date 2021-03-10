package structural.decorator;

public abstract class Decorator implements Diet {
    Diet diet;

    public Decorator(Diet diet) {
        this.diet = diet;
    }

    @Override
    public void info() {
        diet.info();
    }
}
