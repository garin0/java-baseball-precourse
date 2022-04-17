package baseball;

import baseball.domain.BaseBallAnswerGenerator;
import baseball.domain.BaseBallGame;
import baseball.domain.BaseBallReferee;
import baseball.view.BaseBallGameView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BaseBallGameView view = new BaseBallGameView();
        do {
            List<Integer> answer = BaseBallAnswerGenerator.generate();
            BaseBallReferee referee = new BaseBallReferee(answer);
            BaseBallGame baseBallGame = new BaseBallGame(view, referee);
            baseBallGame.play();
        } while (view.askContinue());
    }
}
