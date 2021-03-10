package creational.abstractFactory;

import creational.abstractFactory.factories.DeerFactory;
import creational.abstractFactory.factories.Factory;

//Зоопарк закупает животных вместе с подходящими клетками. Необходимо узнать цену животного и соответствующей клетки для него.
public class Main {
    public static void main(String[] args) {
        Factory factory = new DeerFactory();
        Application application = new Application(factory);
        application.cost();
    }
}