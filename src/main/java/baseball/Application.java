package baseball;

import baseball.view.GameView;

public class Application {
    public static void main(String[] args) {
        do {
            GameView.inputNum();
        } while(GameView.isKeepGoingGame());
    }
}
