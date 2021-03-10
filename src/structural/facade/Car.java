package structural.facade;

public class Car {
    Engine engine = new Engine();
    Navigator navigator = new Navigator();
    Radio radio = new Radio();

    void start() {
        engine.startEngine();
        navigator.turnOnNavigator();
        radio.turnOnRadio();
    }
}
