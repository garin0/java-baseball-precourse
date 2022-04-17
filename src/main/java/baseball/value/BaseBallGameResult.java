package baseball.value;

import baseball.common.Message;
import baseball.domain.BaseBallAnswerGenerator;
import baseball.util.BaseBallUtil;

public class BaseBallGameResult {
    private int strikeCount;
    private int ballCount;

    public BaseBallGameResult(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    // 게임 결과 프린트
    public void printGameResult() {
        printAllStrike();
        printNothing();
        String message = "";
        message = printBall(message);
        message = printStrike(message);
        System.out.println(message);
        return;
    }

    private void printAllStrike() {
        if (strikeCount == BaseBallAnswerGenerator.BASEBALL_SIZE) {
            System.out.println(strikeCount + Message.STRIKE_MESSAGE);
            return;
        }
    }

    private void printNothing() {
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println(Message.NOTHING);
            return;
        }
    }

    private String printBall(String message) {
        if (ballCount > 0) {
            message += ballCount + Message.BALL_MESSAGE;
        }
        return message;
    }

    private String printStrike(String message) {
        if (strikeCount > 0) {
            message += BaseBallUtil.addWhiteSpace(message) + strikeCount + Message.STRIKE_MESSAGE;
        }
        return message;
    }
}
