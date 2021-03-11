package behavioral.templateMethod;

//Одинкаовые действия животных вынесены в метод абстрактного класса, а разные действия описаны в переопределенном
//абстрактном методе каждого класса, который является наследником абстрактного класса.
public class Main {
    public static void main(String[] args) {
        Animal deer = new Deer();
        deer.eat();
        Animal wolf = new Wolf();
        wolf.eat();
    }
}
