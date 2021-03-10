package structural.flyweight;

public class Archer implements Unit {
    String weapon = "Лук";

    @Override
    public void create(String color) {
        System.out.println(color + " лучник. У него в руках " + weapon + ".");
    }
}
