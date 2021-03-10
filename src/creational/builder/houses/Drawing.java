package creational.builder.houses;

public class Drawing {
    private final int floors;
    private final int windows;
    private final BuildingType type;

    public Drawing(int floors, int windows, BuildingType type) {
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

    public String print() {
        StringBuilder builder = new StringBuilder();
        builder.append("У здания ");
        if (floors != 0) {
            builder.append(floors).append(" этажей").append(System.lineSeparator());
        }
        if (windows != 0) {
            builder.append(windows).append(" окон").append(System.lineSeparator());
        }
        if (type != null) {
            builder.append("Тип постройки ").append(type).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
