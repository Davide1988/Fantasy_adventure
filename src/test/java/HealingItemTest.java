import items.HealingItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingItemTest {
    @Test
    public void canGetDamage(){
        assertEquals(7, HealingItem.CURELIGHTWOUNDS.getHealingPower());
    }
}
