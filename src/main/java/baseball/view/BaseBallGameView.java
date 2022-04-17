package baseball.view;

import baseball.common.Message;
import baseball.domain.BaseBallAnswerGenerator;
import baseball.util.StringUtil;
import baseball.value.BaseBallGameResult;
import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseBallGameView {
    public static final int NEW_GAME = 1;
    public static final int QUIT = 2;

    // 사용자의 인풋 받기
    public List<Integer> getUserInputNumber() {
        System.out.print(Message.GAME_START);
        String numStr = Console.readLine();
        List<Integer> inputBaseballs = StringUtil.toArray(numStr);
        validateInput(inputBaseballs);
        return inputBaseballs;
    }

    // 게임 계속 진행할지 여부
    public boolean askContinue() {
        System.out.println(Message.GAME_END);
        String selectedNum = Console.readLine();
        return parseSelectedMenu(selectedNum) == NEW_GAME;
    }

    // 인풋 숫자 validation
    public void validateInput(List<Integer> baseballs) {
        // 3개 미만, 초과로 들어오는 경우
        if (baseballs.size() < BaseBallAnswerGenerator.BASEBALL_SIZE || baseballs.size() > BaseBallAnswerGenerator.BASEBALL_SIZE) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_COUNT);
        }
        // 중복으로 숫자를 입력한 경우
        Set<Integer> baseBallSet = new HashSet<>(baseballs);
        if (baseballs.size() != baseBallSet.size()) {
            throw new IllegalArgumentException(Message.ERROR_DUPLICATED);
        }
    }

    public int parseSelectedMenu(String selectedNum) {
        int userSelectedMenuNum = Integer.parseInt(selectedNum);
        validateMenuInput(userSelectedMenuNum);
        return userSelectedMenuNum;
    }

    public void printEndGame() {
        System.out.println(Message.GAME_WIN);
    }

    // 게임 결과 프린트
    public void printGameResult(BaseBallGameResult result) {
        printAllStrike(result);
        printNothing(result);
        printBallOrStrike(result);
    }

    private void printAllStrike(BaseBallGameResult result) {
        if (result.getStrike() == BaseBallAnswerGenerator.BASEBALL_SIZE) {
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder.append(result.getStrike()).append(Message.STRIKE_MESSAGE));
        }
    }

    private void printNothing(BaseBallGameResult result) {
        if (result.getStrike() == 0 && result.getBall() == 0) {
            System.out.println(Message.NOTHING);
        }
    }

    private void printBallOrStrike(BaseBallGameResult result) {
        String message = getBallMessage(result);
        message += StringUtil.getWhiteSpaceIfNotEmpty(message);
        message += getStrikeMessage(result);
        System.out.println(message);
    }

    private String getBallMessage(BaseBallGameResult result) {
        if (result.getBall() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            return stringBuilder.append(result.getStrike()).append(Message.BALL_MESSAGE).toString();
        }
        return "";
    }

    private String getStrikeMessage(BaseBallGameResult result) {
        if (result.getStrike() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            return stringBuilder.append(result.getStrike()).append(Message.STRIKE_MESSAGE).toString();
        }
        return "";
    }

    // 메뉴 input validation
    private void validateMenuInput(int userSelectedMenuNum) {
        if (userSelectedMenuNum != NEW_GAME && userSelectedMenuNum != QUIT) {
            throw new IllegalArgumentException();
        }
    }
}
