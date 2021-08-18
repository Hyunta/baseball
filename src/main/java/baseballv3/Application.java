package baseballv3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> randomNumber = generator.createRandomNumber();
        System.out.println("randomNumber = " + randomNumber);

    }
}
