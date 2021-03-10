package creational.builder;

import creational.builder.builders.Builder;
import creational.builder.houses.BuildingType;

public class Director {
    public void constructBlockHouse(Builder builder) {
        builder.setFloors(12);
        builder.setWindows(120);
        builder.setType(BuildingType.BLOCK);
    }

    public void constructBrickMonolithicHouse(Builder builder) {
        builder.setFloors(20);
        builder.setWindows(240);
        builder.setType(BuildingType.BRICK_MONOLITHIC);
    }

    public void constructPanelHouse(Builder builder) {
        builder.setFloors(10);
        builder.setType(BuildingType.PANEL);
    }
}
