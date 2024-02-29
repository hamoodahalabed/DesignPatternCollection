package behavioral.Mediator;

public class MediatorMain {
    public static void main(String[] args) {
        AirTrafficControl atc = new ATC();

        Plane plane1 = new CommercialPlane(atc, "Delta 123");
        Plane plane2 = new CommercialPlane(atc, "United 456");
        Plane plane3 = new CommercialPlane(atc, "American 789");

        ((ATC) atc).addPlane(plane1);
        ((ATC) atc).addPlane(plane2);
        ((ATC) atc).addPlane(plane3);

        plane1.sendMessage("Flight path clear.");
        plane2.sendMessage("Roger that.");
        plane3.sendMessage("Maintaining altitude.");
    }
}
