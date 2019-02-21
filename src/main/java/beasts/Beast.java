package beasts;

public abstract class Beast {

    protected int defence;
    protected int attack;
    protected int health;

    protected boolean isDead;

    Beast (int defence, int attack, int health){
        this.defence = defence;
        this.attack = attack;
        this.health = health;
        this.isDead = false;
    }

    public int getDefence() {
        return defence;
    }

    public int attack(){
        return attack;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        if (this.health <= 0){this.isDead = true;}
    }

    public boolean isDead() {
        return isDead;
    }

    public int getHealth() {
        return health;
    }
}


