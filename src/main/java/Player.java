public class Player {


    private int health;
    private boolean isDeath;



    public Player(int health, boolean isDeath){
        this.health = health;
        this.isDeath = isDeath;
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
}
