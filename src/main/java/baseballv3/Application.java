package baseballv3;

import java.io.IOException;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {

        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> computer = numberGenerator.createRandomNumber();

        Referee referee = new Referee();

        String result = "";
        while (!result.equals("0볼 3스트라이크")) {
            result = referee.compareNumbers(computer, askNumbers());
            System.out.println("result = " + result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");


    }

    public static List<Integer> askNumbers() throws IOException {
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> inputNumbers = new ArrayList<>();
        for (String number:input.split("")) {
            inputNumbers.add(Integer.valueOf(number));
        }
        return inputNumbers;
    }
}
