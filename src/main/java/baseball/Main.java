package baseball;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = RandomNumber();


        while (true) {
            System.out.print("숫자를 입력해 주세요 :");
            String nums = sc.nextLine();
            System.out.println(nums);
            checkBS(nums, ex);
        }
    }

    private static String RandomNumber() {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        while (sb.length() != 3) {
            int num = 0;
            num = (int) (Math.random() * 9) + 1;
            if (set.contains(num)) {
                continue;
            } else {
                sb.append(num);
                set.add(num);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    private static void checkBS(String nums, String ex) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (nums.charAt(i) == ex.charAt(i)) {
                strike += 1;
                continue;
            }
            if (ex.indexOf(nums.charAt(i))!= -1) {
                ball += 1;
            }
        }
        System.out.println(CallScore(ball, strike));
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.exit(0);
        }
    }

    private static String CallScore(int ball, int strike) {
        if (strike == 0 && ball == 0) {
            return "OUT!";
        }
        if (strike == 0 && ball != 0) {
            return (ball + "볼");
        }
        if (strike != 0 && ball == 0) {
            return (strike + "스트라이크");
        }

        if (strike != 0 && ball != 0) {
            return (ball + "볼 " + strike + "스트라이크");
        }
        return null;
        }
    }
