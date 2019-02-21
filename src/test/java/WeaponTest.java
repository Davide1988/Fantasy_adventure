import items.Spell;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    @Before

    public void before(){

    }
    @Test
    public void canGetDamage(){
        assertEquals(5, Weapon.GREATSWORD.getDamage());
    }
}
