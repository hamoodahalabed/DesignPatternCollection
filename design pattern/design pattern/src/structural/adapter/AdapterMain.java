package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {

        Vehicle car = new Car();
        useVehicle(car);

        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);
    }

    private static void useVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.horn();
        vehicle.breaking();
        System.out.println("------------------------");
    }
}
