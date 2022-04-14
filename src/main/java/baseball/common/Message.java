package baseball.common;

import baseball.domain.BaseBall;

public class Message {
    public final static String GAME_START = "숫자를 입력해주세요 : ";
    public final static String GAME_END = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public final static String GAME_WIN = BaseBall.BASEBALL_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public final static String STRIKE_MESSAGE = "스트라이크";
    public final static String BALL_MESSAGE = "볼";
    public final static String NOTHING = "낫싱";
    public final static String ERROR_DUPLICATED = "중복된 숫자가 존재합니다.";
    public final static String ERROR_INPUT_COUNT = BaseBall.BASEBALL_SIZE + "자리로 입력해주세요.";
}
