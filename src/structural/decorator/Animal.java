package structural.decorator;

public class Animal implements Diet {
    String value;

    public Animal(String value) {
        this.value = value;
    }

    @Override
    public void info() {
        System.out.println(value);
    }
}
