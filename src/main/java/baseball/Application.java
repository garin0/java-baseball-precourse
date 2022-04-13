package baseball;

import baseball.domain.BaseBall;
import baseball.domain.Game;
import baseball.view.GameView;

public class Application {
    public static void main(String[] args) {
        do {
            BaseBall answerBaseballs = Game.generateBaseballs();
            Game.play(answerBaseballs);
        } while(GameView.isKeepGoingGame());
    }
}
