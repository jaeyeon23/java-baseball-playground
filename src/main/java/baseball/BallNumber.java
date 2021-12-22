package baseball;

public class BallNumber {
    private final int MAX_NUM = 9;
    private final int MIN_NUM = 1;

    private int num;

    public BallNumber(int num) {
        if (num > MAX_NUM || num < MIN_NUM) {
            throw new IllegalArgumentException("정의된 숫자 범위가 아닙니다.");
        }
        this.num = num;
    }
}
