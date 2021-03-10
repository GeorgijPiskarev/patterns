package creational.prototype;

import java.util.Objects;

public class Wolf extends Animal {
    public int weight;
    public int height;

    public Wolf() {

    }

    public Wolf(Wolf target) {
        super(target);
        if (target != null) {
            this.weight = target.weight;
            this.height = target.height;
        }
    }

    @Override
    public Animal clone() {
        return new Wolf(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        if (!super.equals(o)) return false;
        Wolf wolf = (Wolf) o;
        return weight == wolf.weight &&
                height == wolf.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, height);
    }
}
