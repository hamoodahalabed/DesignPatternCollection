package creational.prototype;

//Reusable Objects: When you need to create multiple instances of
// objects that share similar properties, instead of creating each object
// from scratch, you can create one prototype object and clone it whenever needed.

public class PrototypeMain {
    public static void main(String[] args) {
        // Create a prototype car
        Car prototypeCar = new Car();
        prototypeCar.setId(1);
        prototypeCar.setBrand("Toyota");
        prototypeCar.setModel("Corolla");
        prototypeCar.setTopSpeed(180);

        // Clone the prototype car
        Car clonedCar = (Car) prototypeCar.clone();

        // Output details of the original and cloned cars
        System.out.println("Original Car:");
        System.out.println(prototypeCar);

        System.out.println("Cloned Car:");
        System.out.println(clonedCar);
    }
}

