package creational.abstractFactory.factories;

import creational.abstractFactory.animals.Animal;
import creational.abstractFactory.animals.Wolf;
import creational.abstractFactory.cages.Cage;
import creational.abstractFactory.cages.WolfCage;

public class WolfFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Wolf();
    }

    @Override
    public Cage createCage() {
        return new WolfCage();
    }
}
