package behavioral.visitor.visitors;

import behavioral.visitor.elements.Plate;
import behavioral.visitor.elements.Waiter;

public interface Visitor {
    void doSmth(Plate plate);

    void doSmth(Waiter waiter);
}
