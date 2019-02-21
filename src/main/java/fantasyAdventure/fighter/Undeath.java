package fantasyAdventure.fighter;

import fantasyAdventure.Player;
import items.Weapon;

public class Undeath extends Player {

    private Weapon weapon;

    public Undeath(Weapon weapon) {
        this.setHealth(50);
        this.weapon = weapon;
    }



    @Override
    public int attach() {
        return 0;
    }


}
