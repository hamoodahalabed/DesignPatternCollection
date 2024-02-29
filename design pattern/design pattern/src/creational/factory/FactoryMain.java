package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.create();
    }
}
