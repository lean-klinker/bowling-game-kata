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
            if (isStrike(rollIndex)) {
                score += calculateStrikeScore(rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += calculateSpareScore(rollIndex);
                rollIndex += 2;
            } else  {
                score += calculateOpenFrameScore(rollIndex);
                rollIndex += 2;
            }
        }
        return score;
    }

    private int calculateStrikeScore(int rollIndex) {
        return 10 + rolls[rollIndex + 1] + rolls[rollIndex + 2];
    }

    private boolean isStrike(int rollIndex) {
        return rolls[rollIndex] == 10;
    }

    private int calculateOpenFrameScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    }

    private int calculateSpareScore(int rollIndex) {
        return 10 + rolls[rollIndex + 2];
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }
}
