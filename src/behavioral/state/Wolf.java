package behavioral.state;

public class Wolf {
    Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSmth() {
        System.out.print("Волк ");
        state.doSmth(this);
    }
}
