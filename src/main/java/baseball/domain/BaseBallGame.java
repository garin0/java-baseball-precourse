package baseball.domain;

import baseball.common.Message;
import baseball.value.BaseBallGameResult;
import baseball.view.BaseBallGameView;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    // 게임 시작
    public void play(BaseBallAnswerGenerator answerBaseballs) {
        boolean isAnswer;
        do {
            BaseBallGameView view = new BaseBallGameView();
            List<Integer> inputBaseballs = view.getUserInputNumber();
            isAnswer = isMatchedAnswer(answerBaseballs, inputBaseballs);
        } while(!isAnswer); // 종료할때까지 게임 반복 실행
        System.out.println(Message.GAME_WIN);
    }

    // 정답 맞췄는지 체크하는 여부
    private boolean isMatchedAnswer(BaseBallAnswerGenerator answer, List<Integer> input) {
        ArrayList<Integer> answerList = new ArrayList<>(answer.generatedBaseBalls);
        BaseballReferee baseballReferee = new BaseballReferee(answerList);

        // 정답 체크
        BaseBallGameResult result = baseballReferee.matchBalls(input);
        result.printGameResult();
        if (result.getStrikeCount() == BaseBallAnswerGenerator.BASEBALL_SIZE) { // 모두 맞춘 경우: 3스트라이크
            return true;
        }
        return false;
    }

}
