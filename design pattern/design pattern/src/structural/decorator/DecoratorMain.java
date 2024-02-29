package structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Weapon m4 = new ExtendedMagazine(new Suppressor(new Scope (new M4())));

        System.out.println(m4.fire());

    }
}
