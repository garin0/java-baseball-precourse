package baseball.domain;

import baseball.value.BaseBallGameResult;

import java.util.List;

// 사용자 입력과 answer 비교
public class BaseballReferee {
    private final List<Integer> computer;

    public BaseballReferee(List<Integer> computer) {
        this.computer = computer;
    }

    // 각각 자릿수의 정답 여부 체크
    public BaseBallGameResult matchBalls(List<Integer> user) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < BaseBallAnswerGenerator.BASEBALL_SIZE; i++) {
            strike += countStrike(user, i);
            ball += countBall(user, i);
        }
        return new BaseBallGameResult(strike, ball);
    }

    // 볼 갯수 세기
    public int countBall(List<Integer> user, int idx) {
        if (computer.contains(user.get(idx)) && countStrike(user, idx) == 0) {
            return 1;
        }
        return 0;
    }

    // 같은 자리에 일치하는 숫자인지 체크 - strike
    private int countStrike(List<Integer> user, int idx) {
        if (user.get(idx).equals(computer.get(idx))) {
            return 1;
        }
        return 0;
    }
}
