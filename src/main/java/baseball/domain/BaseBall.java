package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;

public class BaseBall {
    public static final int BASEBALL_SIZE = 3;
    public static final int BASEBALL_MAX_NUM = 9;
    public static final int BASEBALL_MIN_NUM = 1;
    public LinkedHashSet<Integer> pickedBalls;

    public BaseBall() {
        this.pickedBalls = new LinkedHashSet<>();
        while(this.pickedBalls.size() != BASEBALL_SIZE) {
            int randomNum = Randoms.pickNumberInRange(BASEBALL_MIN_NUM, BASEBALL_MAX_NUM);
            this.pickedBalls.add(randomNum);
        }
    }

    @Override
    public String toString() {
        return "BaseBall{" +
                "pickedBalls=" + pickedBalls +
                '}';
    }
}
