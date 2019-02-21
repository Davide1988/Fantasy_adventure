package fantasyAdventure.fighter;

import fantasyAdventure.Player;

public class Knights extends Player {

    public Knights(int health, boolean isDeath) {
        super(health, isDeath);
    }

    @Override
    public int attach() {
        return 0;
    }
}
