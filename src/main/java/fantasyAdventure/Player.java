package fantasyAdventure;

public abstract class Player {


    protected int health;
    private boolean isDeath;



    public Player(){
        this.isDeath = false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDeath() {
        return isDeath;
    }

    public void setDeath(boolean status) {
        isDeath = status;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void gainHealth(int recover){
        this.health += recover;
    }

    public abstract int attach();
}
