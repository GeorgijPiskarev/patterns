package behavioral.mediator;

import behavioral.mediator.airports.AirControl;
import behavioral.mediator.airports.ConcreteAirControl;
import behavioral.mediator.pilots.FirstPilot;
import behavioral.mediator.pilots.Pilot;
import behavioral.mediator.pilots.SecondPilot;

//Пилот передает информацию диспетчеру, а диспетчер транслирует ее другим пилотам.
public class Main {
    public static void main(String[] args) {
        AirControl airControl = new ConcreteAirControl();
        Pilot pilot1 = new FirstPilot(airControl);
        Pilot pilot2 = new SecondPilot(airControl);
        airControl.addPilot(pilot1);
        airControl.addPilot(pilot2);

        pilot1.sendMessage("первый самолет терпит крушение.");
        System.out.println();
        pilot2.sendMessage("у второго самолета все хорошо.");
    }
}
