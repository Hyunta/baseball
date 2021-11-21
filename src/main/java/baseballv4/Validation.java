package baseballv4;

public class Validation {
    public static boolean isValidInput(String number) {
        return isInteger(number) && isLengthOk(number) && isNotDuplicate(number) && isRangeOk(number);
    }

    private static boolean isRangeOk(String number) {
        for (int i = 0; i < 3; i++) {
            int eachDigit = Character.getNumericValue(number.charAt(i));
            if (eachDigit == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotDuplicate(String number) {
        boolean[] used = new boolean[10];
        for (int i = 0; i < 3; i++) {
            int eachDigit = Character.getNumericValue(number.charAt(i));

            if (used[eachDigit]) {
                return false;
            } else {
                used[eachDigit] = true;
            }
        }
        return true;
    }

    private static boolean isLengthOk(String number) {
        return number.length() == 3;
    }

    private static boolean isInteger(String number) {
        for (int i = 0; i < 3; i++) {
            char eachDigit = number.charAt(i);

            if (!Character.isDigit(eachDigit)) {
                return false;
            }
        }
        return true;
    }
}
