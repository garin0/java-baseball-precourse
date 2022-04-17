package baseball.domain;

import baseball.value.BaseBallGameResult;
import baseball.view.BaseBallGameView;

import java.util.List;

public class BaseBallGame {
    private BaseBallGameView view;
    private BaseBallReferee referee;

    public BaseBallGame(BaseBallGameView view, BaseBallReferee referee) {
        this.view = view;
        this.referee = referee;
    }

    // 게임 시작
    public void play() {
        boolean isEnd;
        do {
            List<Integer> userInputBalls = view.getUserInputNumber();
            BaseBallGameResult result = referee.match(userInputBalls);
            view.printGameResult(result);
            isEnd = result.isEndGame();
        } while(!isEnd); // 종료할때까지 게임 반복 실행
        view.printEndGame();
    }
}
