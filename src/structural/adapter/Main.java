package structural.adapter;

//Есть волки, которые были приручены и выполняют роль юнита, а есть дикие волки. Нужно сделать так, чтобы у волка и юнита была общая функциональность,
// но дикие волки имели возможность остаться при своей функциональности.
public class Main {
    public static void main(String[] args) {
        UnitAdapterFromWolf adapter = new UnitAdapterFromWolf();
        adapter.attack();

//        UnitAdapterFromWolf2 adapter2 = new UnitAdapterFromWolf2();
//        adapter2.attack();
    }
}
