package structural.decorator;

//Определяем рацион для разных животных
public class Main {
    public static void main(String[] args) {
        Diet diet = new Fish(new Meat(new Vegetables(new Animal("Волк"))));
        diet.info();

        System.out.println();

        Diet diet1 = new Vegetables(new Animal("Олень"));
        diet1.info();
    }
}
