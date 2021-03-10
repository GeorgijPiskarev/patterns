package behavioral.сhainOfResponsibility;

public class FirstAction extends Action {

    public FirstAction(int priority) {
        super(priority);
    }

    @Override
    void info(int level) {
        if (level <= priority) {
            System.out.println("Одеваемся");
        }
        if (next != null) {
            next.info(level);
        }
    }
}
