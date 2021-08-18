package baseballv2;

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
    public void strike() {
        BallStatus ballstatus = com.play(new Ball(1,4));
        Assertions.assertThat(ballstatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    public void ball() {
        BallStatus ballstatus = com.play(new Ball(2,4));
        Assertions.assertThat(ballstatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void nothing() {
        BallStatus ballstatus = com.play(new Ball(2,3));
        Assertions.assertThat(ballstatus).isEqualTo(BallStatus.NOTHING);
    }

}
