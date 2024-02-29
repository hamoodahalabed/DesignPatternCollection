package behavioral.templatemethod;

public class Truck extends VehicleTemplate {
    @Override
    protected void installGearbox() {
        System.out.println("installing 11 speed automatic gearbox.");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("Adding extra truck container.");
    }
}
