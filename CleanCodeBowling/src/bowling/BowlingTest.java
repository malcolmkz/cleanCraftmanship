package bowling;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BowlingTest {
    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i< n; i++){
            g.roll(pins);
        }
    }

    @Test
    public void gutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void oneSpare() throws Exception{
        rollSpare();
        g.roll(7);
        rollMany(17,0);
        assertEquals(24, g.score());
    }

    @Test
    public void oneStrike() throws Exception {
        g.roll(10);
        g.roll(2);
        g.roll(3);
        rollMany(16,0);
        assertEquals(20, g.score());
    }

    private void rollSpare() {
        rollMany(2,5);
    }

    @Test
    public void perfectGame() throws Exception{
        rollMany(12, 10);
        assertEquals(300, g.score());
    }
}
