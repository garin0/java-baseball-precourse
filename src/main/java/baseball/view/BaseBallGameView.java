package baseball.view;

import baseball.common.Message;
import baseball.util.BaseBallUtil;
import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseBallGameView {
    public static final int NEW_GAME = 1;
    public static final int QUIT = 2;
    public static final int BASEBALL_SIZE = 3;

    // 사용자의 인풋 받기
    public List<Integer> getUserInputNumber() {
        System.out.print(Message.GAME_START);
        String numStr = Console.readLine();
        List<Integer> inputBaseballs = BaseBallUtil.addStringToArray(numStr);
        validateInput(inputBaseballs);
        return inputBaseballs;
    }

    // 게임 계속 진행할지 여부
    public boolean isKeepGoingGame() {
        System.out.println(Message.GAME_END);
        String selectedNum =  Console.readLine();
        return getSelectedMenu(selectedNum) == NEW_GAME;
    }

    // 인풋 숫자 validation
    public void validateInput(List<Integer> baseballs) {
        // 3개 미만, 초과로 들어오는 경우
        if (baseballs.size() < BASEBALL_SIZE || baseballs.size() > BASEBALL_SIZE) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_COUNT);
        }
        // 중복으로 숫자를 입력한 경우
        Set<Integer> baseBallSet = new HashSet<>(baseballs);
        if (baseballs.size() != baseBallSet.size()) {
            throw new IllegalArgumentException(Message.ERROR_DUPLICATED);
        }
    }

    // 메뉴 선정
    public int getSelectedMenu(String selectedNum) {
        int userSelectedMenuNum = Integer.parseInt(selectedNum);
        validateMenuInput(userSelectedMenuNum);
        return userSelectedMenuNum;
    }

    // 메뉴 input validation
    private void validateMenuInput(int userSelectedMenuNum) {
        if (userSelectedMenuNum != NEW_GAME && userSelectedMenuNum != QUIT) {
            throw new IllegalArgumentException();
        }
    }
}
