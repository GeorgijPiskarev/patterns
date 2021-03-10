package creational.abstractFactory.factories;

import creational.abstractFactory.animals.Animal;
import creational.abstractFactory.cages.Cage;

public interface Factory {
    Animal createAnimal();

    Cage createCage();
}
