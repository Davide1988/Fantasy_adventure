package room;

import beasts.Beast;
import fantasyAdventure.Player;

public class Room {
    Player player;
    Beast beast;
    int loot;

    public Room(Player player, Beast beast, int loot){
       this.player = player;
       this.beast = beast;
       this.loot = loot;
    }

    public int getLoot() {
        return loot;
    }

    public Player getPlayer() {
        return player;
    }

    public Beast getBeast() {
        return beast;
    }

    public void playerTurn(){
        this.beast.takeDamage(this.player.attack());
    }

    public void beastTurn(){
        this.player.takeDamage(this.beast.attack());
    }
}





