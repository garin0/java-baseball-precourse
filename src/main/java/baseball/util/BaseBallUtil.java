package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class BaseBallUtil {
    // 문자열을 Array로 변경
    public static List<Integer> addStringToArray(String numStr) {
        ArrayList<Integer> inputBaseballs = new ArrayList<>();
        for (String number : numStr.split("")) {
            inputBaseballs.add(Integer.parseInt(number));
        }
        return inputBaseballs;
    }

    // 문자열 사이 공백 추가
    public static String addWhiteSpace(String message) {
        if (!message.isEmpty()) {
            return " ";
        }
        return "";
    }
}
