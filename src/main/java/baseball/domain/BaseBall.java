package baseball.domain;

import java.util.List;

public class BaseBall {
    private final List<Integer> baseballs;

    public BaseBall(List<Integer> baseballs) {
        this.baseballs = baseballs;
    }

    @Override
    public String toString() {
        return "BaseBall{" +
                "baseballs=" + baseballs +
                '}';
    }

    public static BaseBall of(List<Integer> balls) {
        return new BaseBall(balls);
    }
}
