package creational.factoryMethod.factory;

import creational.factoryMethod.animals.Animal;

public abstract class Dinner {
    public abstract Animal createAnimal();

    public void feed() {
        System.out.println("Кинули еду");
        Animal animal = createAnimal();
        animal.eat();
    }
}
