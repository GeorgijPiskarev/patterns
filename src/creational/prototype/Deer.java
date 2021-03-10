package creational.prototype;

import java.util.Objects;

public class Deer extends Animal {
    public int age;

    public Deer() {

    }

    public Deer(Deer target) {
        super(target);
        if (target != null) {
            this.age = target.age;
        }
    }

    @Override
    public Animal clone() {
        return new Deer(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deer)) return false;
        if (!super.equals(o)) return false;
        Deer deer = (Deer) o;
        return age == deer.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }
}
