package creational.factoryMethod.animals;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Кот ест рыбу");
    }
}
