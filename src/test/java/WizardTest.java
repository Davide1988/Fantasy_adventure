import beasts.Beast;
import beasts.Dragon;
import characters.Player;
import characters.spellCasters.Wizard;
import items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Beast dragon;
    private Player wizard;


    @Before
    public void before(){

        dragon = new Dragon(10, 10,10);
        wizard = new Wizard(Spell.FIREBALL, dragon);

    }

    @Test
    public void dragonShouldTakeDamage(){
        wizard.takeDamage(2);
        assertEquals(40, wizard.getHealth());
        assertEquals(8, dragon.getHealth());
    }

    @Test
    public void wizardTakeDamageWhenDragonDie(){
        wizard.takeDamage(10);
        assertEquals(40, wizard.getHealth());
        assertEquals(0, dragon.getHealth());
        wizard.takeDamage(10);
        assertEquals(30, wizard.getHealth());

    }




}
