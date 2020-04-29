package bowling.game.kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {
    @Test
    public void testSomething() {
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.score());
    }
}
