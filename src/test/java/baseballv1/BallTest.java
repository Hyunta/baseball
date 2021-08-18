package baseballv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {

    private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 4);
    }

    @Test
    void nothing() {
        BallStatus ballStatus = com.play(new Ball(2, 5));
        Assertions.assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        BallStatus ballStatus = com.play(new Ball(2, 4));
        Assertions.assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        BallStatus ballStatus = com.play(new Ball(1, 4));
        Assertions.assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }


}
