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
        for (int i = 0; i < 21; i++) {
            if (rolls[i] + rolls[i + 1] == 10) {
                score += 10 + rolls[i + 2];
            } else {
                score += rolls[i];
            }
        }
        return score;
    }
}
