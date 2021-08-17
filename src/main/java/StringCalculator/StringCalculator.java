package StringCalculator;

public class StringCalculator {

    public static void main(String[] args) {
        String[] values = Input.getStrings();
        int result = Integer.parseInt(values[0]);
        result = Calculator.CalculateStrings(values, result);

        System.out.println("answer = " + result);
    }




}
