package behavioral.mediator.pilots;

import behavioral.mediator.airports.AirControl;

public class FirstPilot implements Pilot {
    AirControl airControl;

    public FirstPilot(AirControl airControl) {
        this.airControl = airControl;
    }

    @Override
    public void sendMessage(String message) {
        airControl.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Первый пилот получает сообщение: " + message);
    }
}
