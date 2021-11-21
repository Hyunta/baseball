package baseballv4;

import utils.RandomUtils;

import java.util.Arrays;

public class Answer {
    private static int answerLength = 3;
    private int[] answer = new int[answerLength];
    private static boolean[] used = new boolean[10];

    public void makeAnswer() {
        for (int i = 0; i < answerLength; i++) {
            int uniqueNumber = getUniqueNumber();
            used[uniqueNumber] = true;
            answer[i] = uniqueNumber;
        }
        System.out.println(Arrays.toString(answer));
    }

    private static int getUniqueNumber() {
        int tempNum = RandomUtils.nextInt(1, 9);
        while (true) {
            if (!used[tempNum]) {
                break;
            }
            tempNum = RandomUtils.nextInt(1, 9);
        }
        return tempNum;
    }
}
