package fantasyAdventure.fighter;

import fantasyAdventure.Player;
import items.Weapon;

public class Dwarve extends Player {

    private Weapon weapon;

    public Dwarve(Weapon weapon) {
        this.setHealth(80);
        this.weapon = weapon;
    }

    @Override
    public int attach() {
        return weapon.getDamage();
    }



}
