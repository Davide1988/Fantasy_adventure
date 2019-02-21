import characters.Player;
import characters.fighter.Undeath;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UndeathTest {



    private Player undeath;


    @Before
    public void before(){
        undeath = new Undeath(Weapon.BONECLUB);
    }


    @Test
    public void canGetHeath(){
        assertEquals(50, undeath.getHealth());
    }

    @Test
    public void canGetDeathStatus(){
        assertEquals(false, undeath.isDeath());
    }

    @Test
    public void canTakeDamage(){
        undeath.takeDamage(3);
        assertEquals(47, undeath.getHealth());
    }

    @Test
    public void canGainHeath(){
        undeath.gainHealth(3);
        assertEquals(53, undeath.getHealth());
    }

    @Test
    public void canAttachWithHisWeaponSuper(){
        assertEquals(3, undeath.attack());
    }

    @Test
    public void shouldAttackNormallyWhenCondition(){
        undeath.takeDamage(30);
        assertEquals(2, undeath.attack());
    }

    @Test
    public void shouldDie(){
        undeath.takeDamage(51);
        assertEquals(true, undeath.isDeath());
    }




}
