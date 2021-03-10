package creational.prototype;

import java.util.Objects;

public abstract class Animal {
    public int eyes;
    public int legs;
    public String color;

    public Animal() {
    }

    public Animal(Animal target) {
        if (target != null) {
            this.eyes = target.eyes;
            this.legs = target.legs;
            this.color = target.color;
        }
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return eyes == animal.eyes &&
                legs == animal.legs &&
                color.equals(animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyes, legs, color);
    }
}
