package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class BaseBallAnswerGenerator {
    public static final int BASEBALL_SIZE = 3;
    public static final int BASEBALL_MAX_NUM = 9;
    public static final int BASEBALL_MIN_NUM = 1;

    public static List<Integer> generate() {
        LinkedHashSet<Integer> generatedBaseBalls = new LinkedHashSet<>();
        while (generatedBaseBalls.size() != BASEBALL_SIZE) {
            // 랜덤 생성
            int randomNum = Randoms.pickNumberInRange(BASEBALL_MIN_NUM, BASEBALL_MAX_NUM);
            generatedBaseBalls.add(randomNum);
        }
        return new ArrayList<>(generatedBaseBalls);
    }
}
