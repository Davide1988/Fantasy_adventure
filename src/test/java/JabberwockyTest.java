import beasts.Jabberwocky;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JabberwockyTest {

    Jabberwocky jabberwocky;
    @Before
    public void before(){
        jabberwocky = new Jabberwocky();
    }

    @Test
    public void canGetJabberwockyDefence(){
        assertEquals(4, jabberwocky.getDefence());
    }
}


