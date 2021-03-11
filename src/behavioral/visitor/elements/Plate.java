package behavioral.visitor.elements;

import behavioral.visitor.visitors.Visitor;

public class Plate implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.doSmth(this);
    }
}
