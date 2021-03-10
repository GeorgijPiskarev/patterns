package behavioral.iterator;

public interface Iterator {
    Object first();

    Object next();

    Object getCurrentElement();

    boolean hasMoreElements();
}
