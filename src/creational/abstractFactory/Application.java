package creational.abstractFactory;

import creational.abstractFactory.animals.Animal;
import creational.abstractFactory.cages.Cage;
import creational.abstractFactory.factories.Factory;

public class Application {
    private Animal animal;
    private Cage cage;

    public Application(Factory factory) {
        animal = factory.createAnimal();
        cage = factory.createCage();
    }

    public void cost() {
        animal.cost();
        cage.cost();
    }
}
