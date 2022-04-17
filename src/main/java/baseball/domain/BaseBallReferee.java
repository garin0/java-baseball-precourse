package baseball.domain;

import baseball.value.BaseBallGameResult;

import java.util.List;

public class BaseBallReferee {
    private final List<Integer> answer;

    public BaseBallReferee(List<Integer> answer) {
        this.answer = answer;
    }

    // 각각 자릿수의 정답 여부 체크
    public BaseBallGameResult match(List<Integer> userInputBalls) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < userInputBalls.size(); i++) {
            strike += countStrike(userInputBalls, i);
            ball += countBall(userInputBalls, i);
        }
        return new BaseBallGameResult(strike, ball);
    }

    // 볼 갯수 세기
    private int countBall(List<Integer> userInputBalls, int idx) {
        if (answer.contains(userInputBalls.get(idx)) && countStrike(userInputBalls, idx) == 0) {
            return 1;
        }
        return 0;
    }

    // 같은 자리에 일치하는 숫자인지 체크 - strike
    private int countStrike(List<Integer> userInputBalls, int idx) {
        if (userInputBalls.get(idx).equals(answer.get(idx))) {
            return 1;
        }
        return 0;
    }
}
