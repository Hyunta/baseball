package baseballv3;

import java.util.List;

public class Referee {
    public String compareNumbers(List<Integer> computer, List<Integer> player) {
        // 몇 개의 숫자가 같은지 알아낸 뒤
        // 스트라이크의 개수를 구해서 뺀다.
        // 남은 수는 볼의 개수 이다.
        Judge judge = new Judge();
        int correctCount = judge.correctCount(computer, player);
        if (correctCount == 0) {
            return "아웃!";
        }

        int strike = 0;

        for (int i = 0; i < computer.size(); i++) {
            if (judge.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }
        int ball = correctCount - strike;
        return ball + "볼 " + strike + "스트라이크";
    }
}
