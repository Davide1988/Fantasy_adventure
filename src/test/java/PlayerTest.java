import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    private Player player;

    @Before
    public void before(){
        player = new Player(20, false);
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, player.getHealth());
    }

    @Test
    public void canGetIsDeathStatus(){
        assertEquals(false, player.isDeath());
    }

    @Test
    public void canTakeDamage(){
        player.takeDamage(3);
        assertEquals(17, player.getHealth());
    }

    @Test
    public void canGainHealth(){
        player.gainHealth(4);
        assertEquals(24, player.getHealth());
    }


}
