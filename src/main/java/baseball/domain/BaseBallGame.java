package baseball.domain;

import baseball.common.Message;
import baseball.value.BaseBallGameResult;
import baseball.view.BaseBallGameView;

import java.util.ArrayList;
import java.util.List;
// game <-/-> baseBall
// game <-> playable (baseball, basketball, soccer, elden ring)

public class BaseBallGame {
    public void play(BaseBallAnswerGenerator answerBaseballs) {
        boolean isAnswer;
        do {
            List<Integer> inputBaseballs = BaseBallGameView.inputNum();
            isAnswer = isMatchedAnswer(answerBaseballs, inputBaseballs);
        } while(!isAnswer);
        System.out.println(Message.GAME_WIN);
    }

    // 정답 맞췄는지 체크하는 여부
    private boolean isMatchedAnswer(BaseBallAnswerGenerator answer, List<Integer> input) {
        ArrayList<Integer> answerList = new ArrayList<>(answer.generatedBaseBalls);
        BaseballReferee baseballReferee = new BaseballReferee(answerList);

        BaseBallGameResult result = baseballReferee.matchBalls(input);
        result.printGameResult();
        if (result.getStrikeCount() == BaseBallAnswerGenerator.BASEBALL_SIZE) {
            return true;
        }
        return false;
    }

}
