package baseball.util;

import baseball.domain.BaseBallAnswerGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallUtilTest {
    @Test
    @DisplayName("문자열 Array로 변경")
    void addStringToArray() {
        String numStr = "326";
        List<Integer> integerList = StringUtil.toArray(numStr);
        assertThat(integerList.size()).isEqualTo(BaseBallAnswerGenerator.BASEBALL_SIZE);
    }

}
