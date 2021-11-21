package baseballv4;

import utils.RandomUtils;

public class RandomNumbers {
    private static int answerLength = 3;
    private int[] answer = new int[answerLength];
    private static boolean[] used = new boolean[10];

    public void makeAnswer() {
        for (int i = 0; i < answerLength; i++) {
            int uniqueNumber = getUniqueNumber();
            used[uniqueNumber] = true;
            answer[i] = uniqueNumber;
        }
    }

    public int[] getAnswer() {
        return answer;
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
