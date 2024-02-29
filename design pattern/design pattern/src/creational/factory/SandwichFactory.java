package creational.factory;

public class SandwichFactory {
    public static final int CHEESE_BURGER=1;
    public static final int CLASSIC_BURGER=2;

    public static Sandwich createSandwich (int SandwichId) {
        switch (SandwichId) {
            case CHEESE_BURGER -> {
                return new CheeseBurger();
            }
            case CLASSIC_BURGER ->
            {
                return new ClassicBurger();
            }
            default -> {
                return null;
            }
        }

    }
}
