package behavioral.visitor.elements;

import behavioral.visitor.visitors.Visitor;

public class Waiter implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.doSmth(this);
    }
}
