package characters.fighter;

import characters.Player;
import items.Weapon;

public class Knight extends Player {

    private Weapon weapon;

    public Knight(Weapon weapon) {
       this.setHealth(120);
       this.weapon = weapon;


    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }

    @Override
    public void takeDamage(int damage) {
        if (health <= 10 && this.weapon == Weapon.GREATSWORDOFKNIGHT) {
            int newDamage = damage / 2;
            this.health -= newDamage;
        } else {
            this.health -= damage;
        }
    }
}
