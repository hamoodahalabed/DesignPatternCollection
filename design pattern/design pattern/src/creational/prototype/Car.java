package creational.prototype;

public class Car implements Prototype {
    private int id;
    private String brand;
    private String model;
    private int topSpeed;

    public Car () { }

    public Car(Car car) {
        this.id = car.id;
        this.brand = car.brand;
        this.model = car.model;
        this.topSpeed = car.topSpeed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public Prototype clone() {
        return new Car(this);
    }
}
