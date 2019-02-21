package characters.healer;

import characters.Player;
import items.HealingItem;

public class Priest extends Player {

    private HealingItem item;

    public Priest(HealingItem item) {
        this.setHealth(60);
        this.item = item;
    }

    @Override
    public int attack() {
        return 5;
    }

    public void heal(){
        health += item.getHealingPower();
    }

}
