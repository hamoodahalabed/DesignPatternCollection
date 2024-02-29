package behavioral.Mediator;

class CommercialPlane extends Plane {
    public CommercialPlane(AirTrafficControl atc, String callSign) {
        super(atc, callSign);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(callSign + " sends: " + message);
        atc.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(callSign + " receives: " + message);
    }
}