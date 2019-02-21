import beasts.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
