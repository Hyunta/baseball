package baseballv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    public void strike() {
        Ball com = new Ball(1, 4);
        BallStatus ballstatus = com.play(new Ball(1,4));
        Assertions.assertThat(ballstatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    public void ball() {
        Ball com = new Ball(1, 4);
        BallStatus ballstatus = com.play(new Ball(2,4));
        Assertions.assertThat(ballstatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void nothing() {
        Ball com = new Ball(1, 4);
        BallStatus ballstatus = com.play(new Ball(2,3));
        Assertions.assertThat(ballstatus).isEqualTo(BallStatus.NOTHING);
    }

}
