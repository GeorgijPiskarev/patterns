package behavioral.visitor.elements;

import behavioral.visitor.visitors.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
