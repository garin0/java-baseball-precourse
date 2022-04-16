package baseball.domain;

import baseball.value.BaseBallGameResult;
import baseball.view.BaseBallGameView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


class BaseBallRefereeTest {
    private BaseballReferee baseballReferee;
    private BaseBallGameView view;

    @BeforeEach
    void setUp() {
        baseballReferee = new BaseballReferee(Arrays.asList(3,9,6));
        view = new BaseBallGameView();
    }

    @Test
    void 낫싱_테스트() {
        BaseBallGameResult baseBallGameResult = baseballReferee.matchBalls(Arrays.asList(1,2,3));

        assertThat(baseBallGameResult.getStrikeCount()).isEqualTo(0);
        assertThat(baseBallGameResult.getBallCount()).isEqualTo(0);
    }

    @Test
    void 볼_테스트() {
        BaseBallGameResult baseBallGameResult = baseballReferee.matchBalls(Arrays.asList(9,2,3));

        assertThat(baseBallGameResult.getStrikeCount()).isEqualTo(0);
        assertThat(baseBallGameResult.getBallCount()).isEqualTo(2);
    }

    @Test
    void 스트라이크_테스트() {
        BaseBallGameResult baseBallGameResult = baseballReferee.matchBalls(Arrays.asList(5,9,3));

        assertThat(baseBallGameResult.getStrikeCount()).isEqualTo(1);
        assertThat(baseBallGameResult.getBallCount()).isEqualTo(1);
    }
}
