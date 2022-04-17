package baseball.domain;

import baseball.value.BaseBallGameResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


class BaseBallRefereeTest {
    private BaseBallReferee baseballReferee;

    @BeforeEach
    void setUp() {
        baseballReferee = new BaseBallReferee(Arrays.asList(3,9,6));
    }

    @Test
    @DisplayName("낫싱 테스트")
    void countNothing() {
        BaseBallGameResult baseBallGameResult = baseballReferee.match(Arrays.asList(1,2,7));

        assertThat(baseBallGameResult.getStrike()).isEqualTo(0);
        assertThat(baseBallGameResult.getBall()).isEqualTo(0);
    }

    @Test
    @DisplayName("볼 테스트")
    void countBall() {
        BaseBallGameResult baseBallGameResult = baseballReferee.match(Arrays.asList(9,2,3));

        assertThat(baseBallGameResult.getStrike()).isEqualTo(0);
        assertThat(baseBallGameResult.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("스트라이크 테스트")
    void countStrike() {
        BaseBallGameResult baseBallGameResult = baseballReferee.match(Arrays.asList(5,9,3));

        assertThat(baseBallGameResult.getStrike()).isEqualTo(1);
        assertThat(baseBallGameResult.getBall()).isEqualTo(1);
    }
}
