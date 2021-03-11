package behavioral.state;

public class Hunting implements Activity {
    @Override
    public void doSmth(Wolf context) {
        System.out.println("охотится");
        context.setState(new Sleep());
    }
}
