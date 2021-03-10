package behavioral.сhainOfResponsibility;

//Мы используем только обьект первого действия и, в зависимости от ситуации, выполняем действия по очереди или сразу
//передаем выполнение следующему.(Информацию о необходимых действиях выдает гаджет или другое устройство).
public class Main {
    public static void main(String[] args) {
        Action firstAction = new FirstAction(Level.LOW);
        Action secondAction = new SecondAction(Level.MEDIUM);
        Action thirdAction = new ThirdAction(Level.HIGH);
        firstAction.setNext(secondAction);
        secondAction.setNext(thirdAction);

        firstAction.info(Level.LOW);
    }
}
