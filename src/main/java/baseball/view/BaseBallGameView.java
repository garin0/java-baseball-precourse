package baseball.view;

import baseball.common.Message;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BaseBallGameView {
    private static final int NEW_GAME = 1;
    private static final int QUIT = 2;
    private static final int BASEBALL_SIZE = 3;

    public static ArrayList<Integer> inputNum() {
        System.out.print(Message.GAME_START);
        String inputStr = Console.readLine();
        ArrayList<Integer> inputBaseballs = new ArrayList<>();
        for (String number : inputStr.split("")) {
            inputBaseballs.add(Integer.parseInt(number));
        }
        validateInput(inputBaseballs);
        return inputBaseballs;
    }

    // 게임 계속 진행할지 여부
    public static boolean isKeepGoingGame() {
        int selectedMenu = getSelectedMenu();
        return selectedMenu == NEW_GAME;
    }

    // 인풋 숫자 validation
    private static void validateInput(ArrayList<Integer> baseballs) {
        if (baseballs.size() < BASEBALL_SIZE || baseballs.size() > BASEBALL_SIZE) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_COUNT);
        }

        Set<Integer> baseBallSet = new HashSet<>(baseballs);
        if (baseballs.size() != baseBallSet.size()) {
            throw new IllegalArgumentException(Message.ERROR_DUPLICATED);
        }
    }

    // 메뉴 선정
    private static int getSelectedMenu() {
        System.out.println(Message.GAME_END);
        String selectedNum =  Console.readLine();
        int userSelectedMenuNum = Integer.parseInt(selectedNum);
        validateMenuInput(userSelectedMenuNum);
        return userSelectedMenuNum;
    }

    // 메뉴 input validation
    private static void validateMenuInput(int userSelectedMenuNum) {
        if (userSelectedMenuNum != NEW_GAME && userSelectedMenuNum != QUIT) {
            throw new IllegalArgumentException();
        }
    }
}
