package behavioral.templatemethod;

public class Car extends VehicleTemplate{
    @Override
    protected void installGearbox() {
        System.out.println("installing 5 speed manual gearbox.");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("Adding mirrors, windows, join the parts in a car body.");
    }
}
