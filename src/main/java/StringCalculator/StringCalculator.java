package StringCalculator;

public class StringCalculator {

    public static void main(String[] args) {
        String[] values = Input.getStrings();
        int result = Calculator.CalculateStrings(values);
        System.out.println("result = " + result);
    }
}
