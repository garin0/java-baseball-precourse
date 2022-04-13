package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import baseball.view.GameView;
import camp.nextstep.edu.missionutils.Randoms;

public class Game {
    private static final int BASEBALL_SIZE = 3;
    private static final int BASEBALL_MAX_NUM = 9;
    private static final int BASEBALL_MIN_NUM = 1;

    public static BaseBall generateBaseballs() {
        List<Integer> baseballs = new ArrayList<>();
        for (int i = 0; i < BASEBALL_SIZE; i++) {
            int randomNum = Randoms.pickNumberInRange(BASEBALL_MIN_NUM, BASEBALL_MAX_NUM);
            baseballs.add(randomNum);
        }
        return BaseBall.of(baseballs);
    }

    public static void play(BaseBall answerBaseballs) {
        boolean isAnswer = false;
        do {
            List<Integer> inputBaseballs = GameView.inputNum();
            isAnswer = isMatchedAnswer(answerBaseballs, inputBaseballs);
        } while(!isAnswer);
    }

    private static boolean isMatchedAnswer(BaseBall answer, List<Integer> input) {

        return true;
    }
}
