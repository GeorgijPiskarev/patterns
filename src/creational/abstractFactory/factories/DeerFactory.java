package creational.abstractFactory.factories;


import creational.abstractFactory.animals.Animal;
import creational.abstractFactory.animals.Deer;
import creational.abstractFactory.cages.Cage;
import creational.abstractFactory.cages.DeerCage;

public class DeerFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Deer();
    }

    @Override
    public Cage createCage() {
        return new DeerCage();
    }
}
