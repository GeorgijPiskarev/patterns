package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("A");
        Singleton singleton1 = Singleton.getInstance("B");
        System.out.println(singleton.getValue() + " = " + singleton1.getValue());

//        Thread thread = new Thread(() -> {
//            Singleton singleton = Singleton.getInstance("A");
//            System.out.println(singleton.getValue());
//        });
//        Thread thread1 = new Thread(() -> {
//            Singleton singleton = Singleton.getInstance("B");
//            System.out.println(singleton.getValue());
//        });
//        thread.start();
//        thread1.start();
    }
}
