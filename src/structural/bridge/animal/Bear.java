package structural.bridge.animal;

import structural.bridge.color.Color;

public class Bear extends Animal {
    public Bear(Color color) {
        super(color);
    }

    @Override
    public void showDetails() {
        color.printColor();
        System.out.println("медведь.");
    }
}
