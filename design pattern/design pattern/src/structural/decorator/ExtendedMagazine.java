package structural.decorator;

public class ExtendedMagazine extends WeaponDecorator{
    public ExtendedMagazine(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String fire() {
        return super.fire() + " with extended magazine";
    }
}
