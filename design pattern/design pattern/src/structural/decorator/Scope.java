package structural.decorator;

public class Scope extends WeaponDecorator{
    public Scope(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String fire() {
        return super.fire() + " With scope";
    }
}
