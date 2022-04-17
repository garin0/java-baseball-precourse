package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class BaseBallAnswerGeneratorTest {

    private BaseBallAnswerGenerator baseBallAnswerGenerator;

    @Test
    @DisplayName("랜덤 생성한 숫자가 3자리인지 체크")
    public void generateRandomNumber() {
        baseBallAnswerGenerator = new BaseBallAnswerGenerator();
        ArrayList<Integer> answerList = new ArrayList<>(baseBallAnswerGenerator.generatedBaseBalls);
        assertThat(answerList.size()).isEqualTo(3);
    }
}
