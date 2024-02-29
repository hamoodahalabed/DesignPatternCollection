package structural.adapter;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("The car speed is increase!");
    }

    @Override
    public void breaking() {
        System.out.println("The car is breaking.");
    }

    @Override
    public void horn() {
        System.out.println("Beeb beeb...");
    }
}
