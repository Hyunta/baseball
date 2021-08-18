package baseballv3;

import java.util.List;

public class Judge {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < computer.size(); i++) {
            Integer playerNum = player.get(i);
            if (computer.contains(playerNum)) {
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeIdx, int number) {
        return computer.get(placeIdx) == number;
    }
}
