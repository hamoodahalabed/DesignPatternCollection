package behavioral.Mediator;

abstract class Plane {
    protected AirTrafficControl atc;
    protected String callSign;

    public Plane(AirTrafficControl atc, String callSign) {
        this.atc = atc;
        this.callSign = callSign;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}