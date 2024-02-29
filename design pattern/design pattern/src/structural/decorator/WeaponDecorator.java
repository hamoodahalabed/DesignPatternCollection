package structural.decorator;

public class WeaponDecorator implements Weapon{
    protected Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String fire() {
        return weapon.fire();
    }
}
