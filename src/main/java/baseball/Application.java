package baseball;

import baseball.domain.BaseBallAnswerGenerator;
import baseball.domain.BaseBallGame;
import baseball.view.BaseBallGameView;

public class Application {
    public static void main(String[] args) {
        do {
            BaseBallGame baseBallGame = new BaseBallGame();
            baseBallGame.play(new BaseBallAnswerGenerator());
        } while(BaseBallGameView.isKeepGoingGame());

    }
}
