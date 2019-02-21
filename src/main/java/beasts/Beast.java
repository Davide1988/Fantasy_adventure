package beasts;

public abstract class Beast {

    protected int defence;
    protected int attack;
    protected int health;

    Beast (int defence, int attack, int health){
        this.defence = defence;
        this.attack = attack;
        this.health = health;
    }

    public int getDefence() {
        return defence;
    }

    public abstract int attack();
}


