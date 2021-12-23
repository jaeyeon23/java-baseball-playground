package baseball;

public class BallNumber {
    public static final int MAX_NUM = 9;
    public static final int MIN_NUM = 1;

    public BallNumber(int number) {
        if (number > MAX_NUM || number < MIN_NUM) {
            throw new IllegalArgumentException("숫자 범위 오류");
        }
    }
}
