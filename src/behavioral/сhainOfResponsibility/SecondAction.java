package behavioral.сhainOfResponsibility;

public class SecondAction extends Action {

    public SecondAction(int priority) {
        super(priority);
    }

    @Override
    void info(int level) {
        if (level <= priority) {
            System.out.println("Берем сумку");
        }
        if (next != null) {
            next.info(level);
        }
    }
}
