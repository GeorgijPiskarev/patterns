package behavioral.сhainOfResponsibility;

public class ThirdAction extends Action {
    public ThirdAction(int priority) {
        super(priority);
    }

    @Override
    void info(int level) {
        if (level <= priority) {
            System.out.println("Выходим на улицу");
        }
        if (next != null) {
            next.info(level);
        }
    }
}
