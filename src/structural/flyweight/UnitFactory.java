package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitFactory {
    private static final Map<String, Unit> units = new HashMap<>();

    public Unit getUnit(String name) {
        Unit unit = units.get(name);
        if (unit == null) {
            switch (name) {
                case "лучник":
                    unit = new Archer();
                    break;
                case "мечник":
                    unit = new Swordsman();
                    break;
            }
            units.put(name, unit);
        }
        return unit;
    }
}
