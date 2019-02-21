import items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    @Before

    public void before(){

    }
    @Test
    public void canGetDamage(){
       assertEquals(7, Spell.FIREBALL.getDamage());
    }
}
