package StringCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {

    int add(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(text);
    }

    String[] split(String text) {
        return text.split(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringCalculator cal = new StringCalculator();

        String value = sc.nextLine();
        System.out.println(Arrays.toString(cal.split(value)));

    }



}
