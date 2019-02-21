import beasts.Beast;
import beasts.Dragon;

import characters.Player;
import characters.fighter.Dwarve;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import room.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;
    Beast beast;
    Player player;
    @Before
    public void before(){
        player = new Dwarve(Weapon.FLAIL);
        beast = new Dragon(3,3,100);
        room = new Room(player, beast, 5);
    }

    @Test
    public void roomHasPlayer(){
        assertEquals(player, room.getPlayer());
    }

    @Test
    public void roomHasBeast(){
        assertEquals(beast, room.getBeast());
    }

    @Test
    public void roomHasLoot(){
        assertEquals(5, room.getLoot());
    }

    @Test
    public void playerCanTakeTurn(){
        room.playerTurn();
        assertEquals(96, room.getBeast().getHealth());
    }

    @Test
    public void dwarfspecialplayerCanTakeTurn(){
        room.getPlayer().takeDamage(75);
        room.playerTurn();
        assertEquals(92, room.getBeast().getHealth());
    }

    @Test
    public void beastCanTakeTurn(){
        room.beastTurn();
        assertEquals(77, room.getPlayer().getHealth());
    }

}
