package behavioral.mediator.airports;

import behavioral.mediator.pilots.Pilot;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAirControl implements AirControl {
    List<Pilot> pilots = new ArrayList<>();

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    @Override
    public void sendMessage(String message, Pilot concretePilot) {
        for (Pilot pilot : pilots) {
            if (pilot!=concretePilot) {
                pilot.getMessage("Диспетчер информирует пилотов, что " + message);
            }
        }
    }
}
