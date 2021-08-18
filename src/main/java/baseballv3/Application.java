package baseballv3;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> randomNumber = generator.createRandomNumber();
        System.out.println("randomNumber = " + randomNumber);

        Judge judge = new Judge();
        int cnt = judge.correctCount(Arrays.asList(2, 8, 9), Arrays.asList(1, 2, 3));
        System.out.println("cnt = " + cnt);

        boolean place = judge.hasPlace(Arrays.asList(7, 8, 9), 1, 7);
        System.out.println("place = " + place);//true

        Referee referee = new Referee();
        String result = referee.compareNumbers(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2));
        System.out.println("result = " + result);


    }
}
