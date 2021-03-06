package baseballv2;

import java.util.Objects;

public class Ball {
    private final int position;
    private final int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = value;
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (value == ball.value)
            return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && value == ball.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, value);
    }
}
