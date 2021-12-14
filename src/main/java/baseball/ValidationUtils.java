package baseball;

public class ValidationUtils {
    // 1~9 사이인지 체크
    public static boolean isValidNum(int userNumber) {
        return userNumber > 0 && userNumber < 10;
    }
}
