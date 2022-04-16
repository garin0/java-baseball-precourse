package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;

public class BaseBallAnswerGenerator {
    public static final int BASEBALL_SIZE = 3;
    public static final int BASEBALL_MAX_NUM = 9;
    public static final int BASEBALL_MIN_NUM = 1;
    public LinkedHashSet<Integer> generatedBaseBalls;

    public BaseBallAnswerGenerator() {
        this.generatedBaseBalls = new LinkedHashSet<>();
        while(this.generatedBaseBalls.size() != BASEBALL_SIZE) {
            int randomNum = Randoms.pickNumberInRange(BASEBALL_MIN_NUM, BASEBALL_MAX_NUM);
            this.generatedBaseBalls.add(randomNum);
        }
    }
}
