package structural.bridge;

import structural.bridge.animal.Animal;
import structural.bridge.animal.Bear;
import structural.bridge.animal.Wolf;
import structural.bridge.color.Brown;
import structural.bridge.color.Grey;
import structural.bridge.color.White;

//Существует несколько классов животных. Необходимо классифицировать их по цвету, не допуская разрастания дерева классов.
public class Main {
    public static void main(String[] args) {
        Animal wolf = new Wolf(new Grey());
        wolf.showDetails();

        Animal bear = new Bear(new White());
        bear.showDetails();

        Animal anotherBear = new Bear(new Brown());
        anotherBear.showDetails();
    }
}
