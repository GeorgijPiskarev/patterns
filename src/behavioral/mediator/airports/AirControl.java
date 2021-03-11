package behavioral.mediator.airports;

import behavioral.mediator.pilots.Pilot;

public interface AirControl {
    void addPilot(Pilot pilot);

    void sendMessage(String message, Pilot pilot);
}
