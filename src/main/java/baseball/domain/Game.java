package baseball.domain;

import baseball.common.Message;
import baseball.view.GameView;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void play(BaseBall answerBaseballs) {
        boolean isAnswer;
        do {
            List<Integer> inputBaseballs = GameView.inputNum();
            isAnswer = isMatchedAnswer(answerBaseballs, inputBaseballs);
        } while(!isAnswer);
        System.out.println(Message.GAME_WIN);
    }

    // 정답 맞췄는지 체크하는 여부
    private static boolean isMatchedAnswer(BaseBall answer, List<Integer> input) {
        ArrayList<Integer> answerList = new ArrayList<>(answer.pickedBalls);
        CompareBall compareBall = new CompareBall(answerList);

        GameResult result = compareBall.matchBalls(input);
        result.printGameResult();
        if (result.getStrikeCount() == BaseBall.BASEBALL_SIZE) {
            return true;
        }
        return false;
    }

}
