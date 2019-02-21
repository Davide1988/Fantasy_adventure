package beasts;

public class Slime extends Beast {

    public Slime(int defence, int attack, int health) {
        super(defence, attack, health);
    }

    @Override
    public int attack() {
        return 0;
    }

}
