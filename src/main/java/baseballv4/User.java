package baseballv4;

import java.util.Scanner;

public class User {
    private int[] userNumber = new int[3];

    public void enterNumber(Scanner scanner) {
        System.out.println(Message.REQUEST_NUMBER_INPUT);

        String number = scanner.next();

        if (Validation.isValidInput(number)) {
            setUserNumber(number);
        } else {
            throw new IllegalArgumentException(Message.INPUT_ERROR);
        }
    }

    public int[] getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String number) {
        for (int i = 0; i < 3; i++) {
            userNumber[i] = Character.getNumericValue(number.charAt(i));
        }
    }
}
