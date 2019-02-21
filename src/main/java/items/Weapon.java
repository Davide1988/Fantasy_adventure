package items;

public enum Weapon {
    BASTARDSWORD(4),
    FLAIL(4),
    GREATSWORDOFKNIGHT(5),
    MORNINGSTAR(4),
    BONECLUB(2),
    WOODENSTICK(1),
    DAGGER(3);

    int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
