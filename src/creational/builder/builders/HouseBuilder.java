package creational.builder.builders;

import creational.builder.houses.BuildingType;
import creational.builder.houses.House;

public class HouseBuilder implements Builder {
    private int floors;
    private int windows;
    private BuildingType type;

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setType(BuildingType type) {
        this.type = type;
    }

    public House getResult() {
        return new House(floors, windows, type);
    }
}
