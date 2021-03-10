package creational.singleton;

public final class Singleton {
    private static Singleton instance;
    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
    //Многопоточная среда
//    private static volatile Singleton instance;
//    private final String value;
//
//    private Singleton(String value) {
//        this.value = value;
//    }
//
//    public static Singleton getInstance(String value) {
//        Singleton result = instance;
//        if (result != null) {
//            return result;
//        }
//        synchronized (Singleton.class) {
//            if (instance == null) {
//                instance = new Singleton(value);
//            }
//            return instance;
//        }
//    }
//
//    public String getValue() {
//        return value;
//    }
}
