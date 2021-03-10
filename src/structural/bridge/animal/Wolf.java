package structural.bridge.animal;

import structural.bridge.color.Color;

public class Wolf extends Animal {
    public Wolf(Color color) {
        super(color);
    }

    @Override
    public void showDetails() {
        color.printColor();
        System.out.println("волк.");
    }
}
