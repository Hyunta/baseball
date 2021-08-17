package StringCalculator;

import java.util.Scanner;

public class Input {
    static String[] getStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수식을 입력하세요.");
        String[] values = sc.nextLine().split(" ");
        return values;
    }
}
