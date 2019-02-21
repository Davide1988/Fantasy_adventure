import fantasyAdventure.Player;
import fantasyAdventure.fighter.Dwarve;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarveTest {

    private Player dwarve;


    @Before
    public void before(){
        dwarve = new Dwarve(Weapon.DAGGER);
    }


    @Test
    public void canGetHeath(){
        assertEquals(80, dwarve.getHealth());
    }

    @Test
    public void canGetDeathStatus(){
        assertEquals(false, dwarve.isDeath());
    }

    @Test
    public void canTakeDamage(){
        dwarve.takeDamage(3);
        assertEquals(77, dwarve.getHealth());
    }

    @Test
    public void canGainHeath(){
        dwarve.gainHealth(3);
        assertEquals(83, dwarve.getHealth());
    }

    @Test
    public void canAttachWithHisWeapon(){
        assertEquals(3, dwarve.attack());
    }

    @Test
    public void canAttachWithHisWeaponTwiceWhenLowHeath(){
        dwarve = new Dwarve(Weapon.DAGGER);
        dwarve.takeDamage(77);
        assertEquals(6, dwarve.attack());
    }




}
