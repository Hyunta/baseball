package baseballv2;

public class Ball {
    private final int position;
    private final int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = value;
    }

    public BallStatus play(Ball ball) {
        if (position == ball.position && value == ball.value) {
            return BallStatus.STRIKE;
        }
        if (value == ball.value)
            return BallStatus.BALL;
        return BallStatus.NOTHING;
    }
}
