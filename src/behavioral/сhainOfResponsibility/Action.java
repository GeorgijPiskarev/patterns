package behavioral.сhainOfResponsibility;

public abstract class Action {
    int priority;
    Action next;

    public Action(int priority) {
        this.priority = priority;
    }

    public void setNext(Action next) {
        this.next = next;
    }

    abstract void info(int level);
}
