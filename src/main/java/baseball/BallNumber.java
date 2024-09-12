package baseball;

public class BallNumber {
<<<<<<< HEAD
    private final int MAX_NUM = 9;
    private final int MIN_NUM = 1;

    private int num;

    public BallNumber(int num) {
        if (num > MAX_NUM || num < MIN_NUM) {
            throw new IllegalArgumentException("정의된 숫자 범위가 아닙니다.");
        }
        this.num = num;
=======
    public static final int MAX_NUM = 9;
    public static final int MIN_NUM = 1;

    public BallNumber(int number) {
        if (number > MAX_NUM || number < MIN_NUM) {
            throw new IllegalArgumentException("숫자 범위 오류");
        }
>>>>>>> 347becb651617049db525914544030977768a6c2
    }
}
