package behavioral.mediator.pilots;

import behavioral.mediator.airports.AirControl;

public class SecondPilot implements Pilot {
    AirControl airControl;

    public SecondPilot(AirControl airControl) {
        this.airControl = airControl;
    }

    @Override
    public void sendMessage(String message) {
        airControl.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Второй пилот получает сообщение: " + message);
    }
}
