package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Toy {
    private List<Toy> components = new ArrayList<>();

    public void addToys(Toy toy) {
        components.add(toy);
    }

    @Override
    public void print() {
        for (Toy toy : components) {
            toy.print();
        }
    }
}
