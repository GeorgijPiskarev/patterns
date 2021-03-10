package creational.prototype;

import java.util.ArrayList;
import java.util.List;

//Клонируем животных, проверяем и меняем цвет оленя.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Animal> animals = new ArrayList<>();
        List<Animal> animalsCopy = new ArrayList<>();

        Deer deer = new Deer();
        deer.age = 10;
        deer.color = "brown";
        deer.eyes = 2;
        deer.legs = 4;
        animals.add(deer);

        Wolf wolf = new Wolf();
        wolf.height = 150;
        wolf.weight = 25;
        wolf.color = "grey";
        animals.add(wolf);

        cloneAndCompare(animals, animalsCopy);
    }

    private static void cloneAndCompare(List<Animal> animals, List<Animal> animalsCopy) throws InterruptedException {
        for (Animal animal : animals) {
            animalsCopy.add(animal.clone());
        }

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) != animalsCopy.get(i)) {
                System.out.print("Обьекты разные");
                if (animals.get(i).equals(animalsCopy.get(i))) {
                    System.out.println(", но они идентичны! ");
                }
            }
        }
        Thread.sleep(1000);

        animalsCopy.get(0).color = "white";

        System.out.println("Цвет клона изменен на " + animalsCopy.get(0).color);
        System.out.println("Цвет основного обьекта " + animals.get(0).color);
    }
}
