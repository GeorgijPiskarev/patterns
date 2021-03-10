package creational.factoryMethod.factory;

import creational.factoryMethod.animals.Animal;
import creational.factoryMethod.animals.Dog;

public class DogDinner extends Dinner {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
