package NumBaseball;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String ex = "123";
        System.out.println("nums = " + nums.charAt(0));
        checkBS(nums, ex);
    }

    private static void checkBS(String nums, String ex) {
        int Ball = 0;
        int Strike = 0;
        for (int i = 0; i < 3; i++) {
            if (nums.charAt(i) == ex.charAt(i)) {
                Strike += 1;
                continue;
            }
            if (ex.indexOf(nums.charAt(i))!= -1) {
                Ball += 1;
            }
        }
        System.out.println("Strike = " + Strike);
        System.out.println("Ball = " + Ball);
    }
}
