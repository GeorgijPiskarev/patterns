package creational.abstractFactory.cages;

public class WolfCage implements Cage {
    @Override
    public void cost() {
        System.out.println("Клетка стоит 400$");
    }
}
