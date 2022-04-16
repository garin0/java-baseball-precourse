package baseball.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseBallViewTest {
    private BaseBallGameView view;

    @BeforeEach
    void setUp() {
        view = new BaseBallGameView();
    }

    @Test
    @DisplayName("게임 시작 옵션 여부 테스트")
    void newGameStart() {
        assertThat(view.getSelectedMenu("1")).isEqualTo(BaseBallGameView.NEW_GAME);
    }

    @Test
    @DisplayName("게임 종료 여부 테스트")
    void GameEnd() {
        assertThat(view.getSelectedMenu("2")).isEqualTo(BaseBallGameView.QUIT);
    }

    @Test
    @DisplayName("게임 여부 테스트 예외 (1,2 이외)")
    void GameSelectMenuException() {
        assertThatThrownBy(() -> view.getSelectedMenu("3"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
