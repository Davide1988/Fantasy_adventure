package fantasyAdventure.fighter;

import fantasyAdventure.Player;
import items.Weapon;

public class Knights extends Player {

    private Weapon weapon;

    public Knights(Weapon weapon) {
       this.setHealth(120);
       this.weapon = weapon;


    }

    @Override
    public int attach() {
        return 0;
    }
}
