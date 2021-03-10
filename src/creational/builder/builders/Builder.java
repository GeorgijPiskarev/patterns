package creational.builder.builders;

import creational.builder.houses.BuildingType;

public interface Builder {
    void setFloors(int floors);

    void setWindows(int windows);

    void setType(BuildingType type);
}
