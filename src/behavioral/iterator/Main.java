package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAgregate();
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasMoreElements()) {
            System.out.println(iterator.next());
        }
    }
}
