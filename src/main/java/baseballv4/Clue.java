package baseballv4;

public class Clue {
    private int strike;
    private int ball;

    public int[] countHint(int[] answer, int[] userNumber) {
        initCount();
        for (int i = 0; i < 3; i++) {
            countStrike(answer[i], userNumber[i]);
            countBall(answer, userNumber[i], i);
        }
        int[] result = new int[]{this.strike, this.ball};
        return result;
    }

    private void countBall(int[] answer, int user, int userIdx) {
        for (int i = 0; i < 3; i++) {
            if (i != userIdx && answer[i] == user) {
                this.ball++;
            }
        }
    }

    private void initCount() {
        this.strike = 0;
        this.ball = 0;
    }

    private void countStrike(int answer, int user) {
        if (answer == user) {
            this.strike++;
        }
    }

    public void printResult() {
        StringBuilder sb = new StringBuilder();
        if (this.ball > 0) {
            sb.append(this.ball + "볼 ");
        }
        if (this.strike > 0) {
            sb.append(this.strike + "스트라이크");
        }
        if (this.ball == 0 && this.strike == 0) {
            sb.append("낫싱");
        }
        System.out.println(sb);
    }

    public int getStrike() {
        return strike;
    }
}
