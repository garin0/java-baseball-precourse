package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    // 문자열을 Array로 변경
    public static List<Integer> toArray(String numStr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String number : numStr.split("")) {
            result.add(Integer.parseInt(number));
        }
        return result;
    }

    public static String getWhiteSpaceIfNotEmpty(String message) {
        if (!message.isEmpty()) {
            return " ";
        }
        return "";
    }
}
