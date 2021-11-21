package baseballv4;

import java.util.Scanner;

public class BaseballGame {
    private RandomNumbers randomNumbers;
    private User user;
    private Clue clue;
    private boolean running;
    private Scanner scanner;

    public BaseballGame(Scanner scanner) {
        this.randomNumbers = new RandomNumbers();
        this.user = new User();
        this.clue = new Clue();
        this.running = true;
        this.scanner = scanner;
    }

    public void start() {
        do {
            randomNumbers.makeAnswer();
            startGame();
        } while (isRestart());
    }

    private boolean isRestart() {
        System.out.println(Message.REQUEST_COMMAND_TYPE_INPUT);

        int restart = scanner.nextInt();

        if (restart == 2) {
            System.out.println(Message.EXIT_GAME);
            return false;
        }

        if (restart == 1) {
            this.running = true;
            return true;
        } else {
            throw new IllegalArgumentException(Message.REQUEST_COMMAND_TYPE_ERROR);
        }

    }

    private void startGame() {
        while (running) {
            user.enterNumber(scanner);
            clue.countHint(randomNumbers.getAnswer(), user.getUserNumber());
            clue.printResult();

            if (clue.getStrike() == 3) {
                System.out.println(Message.GAME_CLEAR);
                running = false;
            }
        }
    }
}
