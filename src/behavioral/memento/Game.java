package behavioral.memento;

public class Game {
    String lvl;
    int min;

    public void setState(String lvl, int min) {
        this.lvl = lvl;
        this.min = min;
    }

    public Save save() {
        return new Save(lvl, min);
    }

    public void load(Save save) {
        lvl = save.getLvl();
        min = save.getMin();
    }

    @Override
    public String toString() {
        return "Game{" +
                "lvl='" + lvl + '\'' +
                ", min=" + min +
                '}';
    }
}
