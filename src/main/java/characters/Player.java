package characters;

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
        if (this.health <= 0 ){
            this.isDeath = true;
        }
    }

    public void gainHealth(int recover){
        this.health += recover;
    }

    public abstract int attack();
}
