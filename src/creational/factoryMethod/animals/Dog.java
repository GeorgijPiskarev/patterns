package creational.factoryMethod.animals;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
}
