package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GameView {
    private static final int NEW_GAME = 1;
    private static final int QUIT = 2;
    private static final int BASEBALL_SIZE = 3;

    public static ArrayList<Integer> inputNum() {
        System.out.print("숫자를 입력해주세요 : ");
        String inputStr = Console.readLine();
        ArrayList<Integer> baseballs = new ArrayList<>();
        for (String number : inputStr.split("")) {
            baseballs.add(Integer.parseInt(number));
        }
        validateInput(baseballs);
        return baseballs;
    }

    public static boolean isKeepGoingGame() {
        int selectedMenu = getSelectedMenu();
        return selectedMenu == NEW_GAME;
    }

    private static void validateInput(ArrayList<Integer> baseballs) {
        if (baseballs.size() < BASEBALL_SIZE || baseballs.size() > BASEBALL_SIZE) {
            throw new IllegalArgumentException("세자리로 입력해주세요.");
        }
        Set<Integer> baseBallSet = new HashSet<>(baseballs);
        if (baseballs.size() != baseBallSet.size()) {
            throw new IllegalArgumentException("중복된 숫자가 존재합니다.");
        }
    }

    private static int getSelectedMenu() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String selectedNum =  Console.readLine();
        int userSelectedMenuNum = Integer.parseInt(selectedNum);

        if (userSelectedMenuNum != NEW_GAME && userSelectedMenuNum != QUIT) {
            throw new IllegalArgumentException();
        }
        return userSelectedMenuNum;
    }
}
