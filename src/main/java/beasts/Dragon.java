package beasts;

public class Dragon extends Beast {

    public Dragon(int defence, int attack, int health){
        super(defence,attack,health);
    }

    @Override
    public int attack() {
        return 0;
    }
}
