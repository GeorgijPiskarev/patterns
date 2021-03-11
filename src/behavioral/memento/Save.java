package behavioral.memento;

public class Save {
    private final String lvl;
    private final int min;

    public Save(String lvl, int min) {
        this.lvl = lvl;
        this.min = min;
    }

    public String getLvl() {
        return lvl;
    }

    public int getMin() {
        return min;
    }
}
