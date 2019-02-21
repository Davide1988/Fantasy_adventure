package characters.fighter;

import characters.Player;
import items.Weapon;

public class Undeath extends Player {

    private Weapon weapon;

    public Undeath(Weapon weapon) {
        this.setHealth(50);
        this.weapon = weapon;
    }


    @Override
    public int attack() {
        if (health > 45 && this.weapon == Weapon.BONECLUB) {
            return this.weapon.getDamage() + 1;
        }
        return this.weapon.getDamage();
    }




}
