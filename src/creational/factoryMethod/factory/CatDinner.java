package creational.factoryMethod.factory;

import creational.factoryMethod.animals.Animal;
import creational.factoryMethod.animals.Cat;

public class CatDinner extends Dinner {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
