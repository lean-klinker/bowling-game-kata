package bowling.game.kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    private final BowlingGame game = new BowlingGame();

    @Test
    public void whenRollingAllGutterBallsThenScoreIsZero() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void whenKnockingDownOnePinPerRollThenScoreIsTwenty() {
        rollMany(20, 1);

        assertEquals(20, game.score());
    }

    @Test
    public void whenRollingASpareTheScoreIsTenPlusTheNextRoll() {
        game.roll(6);
        game.roll(4);

        game.roll(3);
        rollMany(17, 0);

        assertEquals(16, game.score());
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }
}
