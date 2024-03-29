package structural.adapter;

public class BicycleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.pedal();
    }

    @Override
    public void breaking() {
        this.bicycle.stop();
    }

    @Override
    public void horn() {
        this.bicycle.ringBell();
    }
}
