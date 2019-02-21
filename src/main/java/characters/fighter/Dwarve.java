package characters.fighter;

import characters.Player;
import items.Weapon;

public class Dwarve extends Player {

    private Weapon weapon;

    public Dwarve(Weapon weapon) {
        this.setHealth(80);
        this.weapon = weapon;
    }

    @Override
    public int attack() {
        if (health <= 10) {
            return weapon.getDamage() * 2;
        }
        return weapon.getDamage();
    }


}
