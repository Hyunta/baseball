package baseball;

public class ValidationUtils {
    public static final int MIN = 1;
    public static final int MAX = 9;

    public static boolean validNum(int num) {
        if (num >= MIN && num <= MAX) {
            return true;
        }
        return false;
    }
}
