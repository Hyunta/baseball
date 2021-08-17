package StringCalculator;

import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수식을 입력하세요.");
        String[] values = sc.nextLine().split(" ");

        int result = Integer.parseInt(values[0]);
        int i = 1;
        while (i < values.length) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]);
            result = calculate(result, symbol, second);
            i += 2;
        }

        System.out.println("answer = " + result);
    }

    static int calculate(int first, String symbol, int second) {
        int result = 0;
        if (symbol.equals("+")) {
            result = (first + second);
        } else if (symbol.equals("-")) {
            result = (first - second);
        } else if (symbol.equals("*")) {
            result = (first * second);
        } else if (symbol.equals("/")) {
            result = (first / second);
        } else {
            System.out.println("사칙연산 기호가 아닙니다");
        }
        return result;
    }

}
