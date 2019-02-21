package items;

public enum Spell {

    MAGICMISSILE(5),
    FIREBALL(7),
    CHAINLIGHTNING(8),
    SHOCKINGGRASP(7),
    METEORS(9),
    POWERWORDDEATH(999);

    int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
