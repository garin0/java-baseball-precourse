package baseball.domain;

import baseball.view.GameView;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void play(BaseBall answerBaseballs) {
        boolean isAnswer = false;
        do {
            List<Integer> inputBaseballs = GameView.inputNum();
            isAnswer = isMatchedAnswer(answerBaseballs, inputBaseballs);
        } while(!isAnswer);
    }

    private static boolean isMatchedAnswer(BaseBall answer, List<Integer> input) {
        System.out.println(answer.toString());
        System.out.println(input.toString());
        ArrayList<Integer> answerList = new ArrayList<>(answer.pickedBalls);
        return true;
    }
}
