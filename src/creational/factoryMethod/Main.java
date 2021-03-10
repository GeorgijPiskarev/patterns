package creational.factoryMethod;

import creational.factoryMethod.factory.CatDinner;
import creational.factoryMethod.factory.Dinner;
import creational.factoryMethod.factory.DogDinner;

import java.time.LocalTime;

//Кормим определенное животно в соответствии со временем.
public class Main {
    private static Dinner dinner;

    public static void main(String[] args) {
        findOutTheTime();
        dinner.feed();
    }

    static void findOutTheTime() {
        if (LocalTime.now().isAfter(LocalTime.of(5, 0))) {
            dinner = new CatDinner();
        } else {
            dinner = new DogDinner();
        }
    }
}
