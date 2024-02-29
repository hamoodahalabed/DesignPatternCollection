package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setId(123)
                .setBrand("Toyota")
                .setColor("Blue")
                .setModel("Corolla")
                .build();

        System.out.println(car);

    }
}
