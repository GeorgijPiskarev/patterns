package creational.builder.houses;

public class House {
    private final int floors;
    private final int windows;
    private final BuildingType type;

    public House(int floors, int windows, BuildingType type) {
        this.floors = floors;
        this.windows = windows;
        this.type = type;
    }

    public int getFloors() {
        return floors;
    }

    public int getWindows() {
        return windows;
    }

    public BuildingType getType() {
        return type;
    }
}
