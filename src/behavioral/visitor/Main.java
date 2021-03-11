package behavioral.visitor;

import behavioral.visitor.elements.Plate;
import behavioral.visitor.elements.Waiter;
import behavioral.visitor.visitors.BadVisitor;
import behavioral.visitor.visitors.GoodVisitor;
import behavioral.visitor.visitors.Visitor;

//Посетители по разному взаимодействуют с элементами кафе.
public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();
        Waiter waiter = new Waiter();

        Visitor badVisitor = new BadVisitor();
        Visitor goodVisitor = new GoodVisitor();

        goodVisitor.doSmth(plate);
        badVisitor.doSmth(plate);
        goodVisitor.doSmth(waiter);
        badVisitor.doSmth(waiter);
    }
}
