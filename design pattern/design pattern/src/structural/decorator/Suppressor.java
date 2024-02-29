package structural.decorator;

public class Suppressor extends WeaponDecorator {

    public Suppressor(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String fire() {
        return super.fire() + " with suppressor";
    }
}
