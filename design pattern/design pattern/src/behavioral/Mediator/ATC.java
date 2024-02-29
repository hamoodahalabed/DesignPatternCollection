package behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// concrete mediator that manages communication between planes.
class ATC implements AirTrafficControl {
    private List<Plane> planes;

    public ATC() {
        this.planes = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void sendMessage(String message, Plane sender) {
        for (Plane plane : planes) {
            // Send message to all planes except the sender
            if (plane != sender) {
                plane.receiveMessage(message);
            }
        }
    }
}