package StringCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringCalculator cal = new StringCalculator();
        System.out.println("수식을 입력하세요.");
        String[] values = sc.nextLine().split(" ");

        int first = Integer.parseInt(values[0]);
        System.out.println("first = " + first);
        String symbol = values[1];
        System.out.println("symbol = " + symbol);
        int second = Integer.parseInt(values[2]);
        System.out.println("second = " + second);




    }



}
