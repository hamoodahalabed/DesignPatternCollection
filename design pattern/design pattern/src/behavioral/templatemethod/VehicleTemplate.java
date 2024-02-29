package behavioral.templatemethod;

public abstract class VehicleTemplate {

    public final void buildVehicle() {
        collectComponent();
        assembleComponent();
        installGearbox();
        startVehicle();
        System.out.println("Vehicle is ready.");
    }

    private void startVehicle() {
        System.out.println("Engine is powering up.");
    }

    protected abstract void installGearbox();

    protected abstract void assembleComponent();

    private void collectComponent() {
        System.out.println("Bring front and rear light, tiers and chairs.");
    }
}
