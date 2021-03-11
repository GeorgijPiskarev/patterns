package behavioral.state;

public class Sleep implements Activity {
    @Override
    public void doSmth(Wolf context) {
        System.out.println("спит");
        context.setState(new Hunting());
    }
}
