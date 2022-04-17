package baseball.value;

import baseball.domain.BaseBallAnswerGenerator;

public class BaseBallGameResult {
    private final int strike;
    private final int ball;

    public BaseBallGameResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isEndGame() {
        return strike == BaseBallAnswerGenerator.BASEBALL_SIZE;
    }
}
