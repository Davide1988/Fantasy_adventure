package beasts;

public class Jabberwocky extends Beast {

    public Jabberwocky(int defence, int attack, int health) {
        super(defence, attack, health);
    }

    @Override
    public int attack() {
        return 0;
    }
}