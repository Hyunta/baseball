package baseballv2;

public class ValidateTool {

    public static boolean validation(int num) {
        if (num >= 1 && num <= 9) {
            return true;
        }
        return false;
    }
}
