package characters.spellCasters;

import beasts.Beast;
import characters.Player;
import items.Spell;

public class Warlocks extends Player {


    private Spell spell;
    private Beast beast;

    public Warlocks(Spell spell, Beast beast) {
        this.setHealth(40);
        this.spell = spell;
        this.beast = beast;
    }

    @Override
    public void takeDamage(int damage) {
        if (beast.isDead() == true) {
            this.health -= damage;
        } else if (beast.isDead() == false) {
            beast.takeDamage(damage);
        }

    }

    @Override
    public int attack() {
        return this.spell.getDamage();
    }
}
