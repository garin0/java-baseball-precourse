package baseball.domain;

import baseball.common.Message;

public class GameResult {
    private int strikeCount;
    private int ballCount;

    public GameResult(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    // 게임 결과 프린트
    public void printGameResult() {
        if (strikeCount == BaseBall.BASEBALL_SIZE) {
            System.out.println(strikeCount + Message.STRIKE_MESSAGE);
            return;
        }

        if (strikeCount == 0 && ballCount == 0) {
            System.out.println(Message.NOTHING);
            return;
        }

        String message = "";
        if (ballCount > 0) {
            message += ballCount + Message.BALL_MESSAGE;
        }
        if (strikeCount > 0) {
            message += addWhiteSpace(message) + strikeCount + Message.STRIKE_MESSAGE;
        }

        System.out.println(message);
        return;
    }

    private String addWhiteSpace(String message) {
        if (!message.isEmpty()) {
            return " ";
        }
        return "";
    }
}
