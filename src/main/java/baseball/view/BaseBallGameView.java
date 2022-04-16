package baseball.view;

import baseball.common.Message;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseBallGameView {
    public static final int NEW_GAME = 1;
    public static final int QUIT = 2;
    public static final int BASEBALL_SIZE = 3;

    public ArrayList<Integer> getUserInputNumber() {
        System.out.print(Message.GAME_START);
        String numStr = Console.readLine();
        ArrayList<Integer> inputBaseballs = addNumberToArray(numStr);
        validateInput(inputBaseballs);
        return inputBaseballs;
    }

    public ArrayList<Integer> addNumberToArray(String numStr) {
        ArrayList<Integer> inputBaseballs = new ArrayList<>();
        for (String number : numStr.split("")) {
            inputBaseballs.add(Integer.parseInt(number));
        }
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
        if (baseballs.size() < BASEBALL_SIZE || baseballs.size() > BASEBALL_SIZE) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_COUNT);
        }

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
