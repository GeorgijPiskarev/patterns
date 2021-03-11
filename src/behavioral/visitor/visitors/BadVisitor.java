package behavioral.visitor.visitors;

import behavioral.visitor.elements.Plate;
import behavioral.visitor.elements.Waiter;

public class BadVisitor implements Visitor {
    @Override
    public void doSmth(Plate plate) {
        System.out.println("Посетитель разбил тарелку");
    }

    @Override
    public void doSmth(Waiter waiter) {
        System.out.println("Посетитель нагрубил официанту");
    }
}
