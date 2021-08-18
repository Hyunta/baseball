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


    }
}
