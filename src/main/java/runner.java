import beasts.Beast;
import beasts.Dragon;
import fantasyAdventure.Player;
import fantasyAdventure.fighter.Dwarve;
import items.Weapon;
import room.Room;

public class runner {
    public static void main(String[] args) throws InterruptedException {
        Beast beast = new Dragon(5, 2, 100);
        Player player = new Dwarve(Weapon.FLAIL);
        Room room = new Room(player, beast, 10);

        while ((!player.isDeath()) && (!beast.isDead())) {
            Thread.sleep(300);
            room.playerTurn();
            System.out.println("Player strikes!");
            System.out.println("Beast health: " + room.getBeast().getHealth());
            System.out.println("Player health: " + room.getPlayer().getHealth());
            Thread.sleep(300);
            room.beastTurn();
            System.out.println("Beast strikes!");
            System.out.println("Beast health: " + room.getBeast().getHealth());
            System.out.println("Player health: " + room.getPlayer().getHealth());
        }
        if (player.isDeath()) {
            System.out.println("Game over");
        } else {
            System.out.println("A winner is you. Advance to the next room...");
        }
    }
}
