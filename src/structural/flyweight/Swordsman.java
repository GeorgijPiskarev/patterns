package structural.flyweight;

public class Swordsman implements Unit {
    String weapon = "меч";

    @Override
    public void create(String color) {
        System.out.println(color + " мечник. У него в руках " + weapon + ".");
    }
}
