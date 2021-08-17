package StringCalculator;

public class Calculator {

    static int Calculate(int first, String symbol, int second) {
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

    static int CalculateStrings(String[] values) {
        int initValue = Integer.parseInt(values[0]);
        int i = 1;
        while (i < values.length) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]);
            initValue = Calculate(initValue, symbol, second);
            i += 2;
        }
        int result = initValue;
        return result;
    }
}
