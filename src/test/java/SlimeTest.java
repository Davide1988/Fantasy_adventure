import beasts.Slime;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SlimeTest {

    Slime slime;
    @Before
    public void before(){
        slime = new Slime(2,2, 100);
    }

    @Test
    public void canGetSlimeDefence(){
        assertEquals(2, slime.getDefence());
    }
}

