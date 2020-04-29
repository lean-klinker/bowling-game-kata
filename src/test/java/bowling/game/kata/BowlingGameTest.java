package bowling.game.kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {
    @Test
    public void whenRollingAllGutterBallsThenScoreIsZero() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}
