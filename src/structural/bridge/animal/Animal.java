package structural.bridge.animal;

import structural.bridge.color.Color;

public abstract class Animal {
    Color color;

    public Animal(Color color) {
        this.color = color;
    }

    public abstract void showDetails();
}
