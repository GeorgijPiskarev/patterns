package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

//Создаем воинов, а затем переиспользуем их с разными цветами.
public class Main {
    public static void main(String[] args) {
        UnitFactory unitFactory = new UnitFactory();
        List<Unit> units = new ArrayList<>();
        units.add(unitFactory.getUnit("лучник"));
        units.add(unitFactory.getUnit("лучник"));
        units.add(unitFactory.getUnit("мечник"));
        units.add(unitFactory.getUnit("мечник"));

        for (int i = 0; i < units.size(); i++) {
            if (i % 2 == 0) {
                units.get(i).create("Голубой");
            } else {
                units.get(i).create("Розовый");
            }
        }
    }
}
