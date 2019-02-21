package fantasyAdventure.fighter;

import fantasyAdventure.Player;

public class Dwarves extends Player {

    public Dwarves(int health, boolean isDeath) {
        super(health, isDeath);
    }

    @Override
    public int attach() {
        return 0;
    }

}
