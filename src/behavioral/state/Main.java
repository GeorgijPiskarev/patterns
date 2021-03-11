package behavioral.state;

//Волк меняет свое состояние с охоты на сон (выступает в роли контекста)
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Wolf wolf = new Wolf();
        wolf.setState(new Hunting());
        for (int i = 0; i < 10; i++) {
            wolf.doSmth();
            Thread.sleep(1000);
        }
    }
}
