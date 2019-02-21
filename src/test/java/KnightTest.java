import fantasyAdventure.Player;
import fantasyAdventure.fighter.Dwarve;
import fantasyAdventure.fighter.Knight;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Player knight;


    @Before
    public void before(){
        knight = new Knight(Weapon.GREATSWORDOFKNIGHT);
    }


    @Test
    public void canGetHeath(){
        assertEquals(120, knight.getHealth());
    }

    @Test
    public void canGetDeathStatus(){
        assertEquals(false, knight.isDeath());
    }

    @Test
    public void canTakeDamage(){
        knight.takeDamage(3);
        assertEquals(117, knight.getHealth());
    }

    @Test
    public void canGainHeath(){
        knight.gainHealth(3);
        assertEquals(123, knight.getHealth());
    }

    @Test
    public void canAttachWithHisWeapon(){
        assertEquals(5, knight.attack());
    }

    @Test
    public void canGetLessDamageWithCondition(){
        knight.takeDamage(115);
        assertEquals(5, knight.getHealth());
        knight.takeDamage(2);
        assertEquals(4, knight.getHealth());
    }



    @Test
    public void cantGetLessDamageBecauseDifferentWeapon(){
        knight = new Knight(Weapon.BASTARDSWORD);
        knight.takeDamage(115);
        assertEquals(5, knight.getHealth());
        knight.takeDamage(2);
        assertEquals(3, knight.getHealth());

    }




}

