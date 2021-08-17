package StringCalculator;

import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수식을 입력하세요.");
        String[] values = sc.nextLine().split(" ");

        int first = Integer.parseInt(values[0]);
        int answer = first;

        int i = 1;
        while (i < values.length) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]);
            answer = calculate(answer, symbol, second);
            i += 2;
        }

        System.out.println("answer = " + answer);
    }

    private static int calculate(int first, String symbol, int second) {
        if (symbol.equals("+")) {
            return (first + second);
        } else if (symbol.equals("-")) {
            return (first - second);
        } else if (symbol.equals("*")) {
            return (first * second);
        } else if (symbol.equals("/")) {
            return (first / second);
        } else {
            return 0;
        }
    }

}
