import beasts.Jabberwocky;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JabberwockyTest {

    Jabberwocky jabberwocky;
    @Before
    public void before(){
        jabberwocky = new Jabberwocky(4,4,100);
    }

    @Test
    public void canGetJabberwockyDefence(){
        assertEquals(4, jabberwocky.getDefence());
    }
}


