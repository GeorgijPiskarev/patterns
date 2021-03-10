package behavioral.iterator;

public class ConcreteAgregate implements Aggregate {
    String[] strings = {"Первый", "Второй", "Третий", "Четвертый"};

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        int index = 0;

        @Override
        public Object first() {
            return strings[0];
        }

        @Override
        public Object next() {
            return strings[index++];
        }

        @Override
        public Object getCurrentElement() {
            return strings[index];
        }

        @Override
        public boolean hasMoreElements() {
            return index < strings.length;
        }
    }
}
