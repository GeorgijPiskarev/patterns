package creational.abstractFactory.cages;

public class DeerCage implements Cage {
    @Override
    public void cost() {
        System.out.println("Клетка стоит 300$");
    }
}
