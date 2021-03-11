package behavioral.templateMethod;

public abstract class Animal {
    void eat() {
        System.out.println("Животное проголодалось");
        differ();
    }

    abstract void differ();
}
