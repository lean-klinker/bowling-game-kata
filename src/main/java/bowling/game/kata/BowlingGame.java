package bowling.game.kata;

public class BowlingGame {
    private int[] rolls = new int[21];
    private int currentRoll;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            if (rolls[rollIndex] + rolls[rollIndex + 1] == 10) {
                score += 10 + rolls[rollIndex + 2];
            } else  {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
            }

            rollIndex += 2;
        }
        return score;
    }
}
