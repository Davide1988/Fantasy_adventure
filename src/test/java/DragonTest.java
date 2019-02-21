import beasts.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DragonTest {

    Dragon dragon;
    @Before
    public void before(){
        dragon = new Dragon(3,3,100);
    }

    @Test
    public void canGetDragonDefence(){
        assertEquals(3, dragon.getDefence());
    }

    @Test
    public void dragonStartsAlive(){
      assertFalse(dragon.isDead());
    }

    @Test
    public void dragonCanTakeDamage(){
        dragon.takeDamage(10);
        assertEquals(90, dragon.getHealth());
    }

   @Test public void dragonCanBeKilled(){
        dragon.takeDamage(101);
        assertTrue(dragon.isDead());
   }

    @Test public void dragonCanAttack(){
        assertEquals(3, dragon.attack());
    }

}
