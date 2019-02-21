package fantasyAdventure.fighter;

import fantasyAdventure.Player;

public class Undeath extends Player {

    public Undeath(int health, boolean isDeath) {
        super(health, isDeath);
    }

    @Override
    public int attach() {
        return 0;
    }


}
