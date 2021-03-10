package structural.composite;

//Нужно положить все игрушки в коробки, корбки в другую коробку и вывести названия всех игрушек, которые находятся в самой большой коробке.
public class Main {
    public static void main(String[] args) {
        Bear bear1 = new Bear();
        Bear bear2 = new Bear();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Unicorn unicorn1 = new Unicorn();
        Unicorn unicorn2 = new Unicorn();

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.addToys(bear1);
        box1.addToys(bear2);

        box2.addToys(cat1);
        box2.addToys(cat2);
        box2.addToys(unicorn1);
        box2.addToys(unicorn2);

        box3.addToys(box1);
        box3.addToys(box2);

        box3.print();
    }
}
