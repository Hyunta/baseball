package baseballv4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class AnswerTest {
    RandomNumbers answer = new RandomNumbers();

    @Test
    void isUnique() {
        answer.makeAnswer();
        int[] answer = this.answer.getAnswer();
        assertThat(Arrays.stream(answer).distinct().count()).isEqualTo(3);
    }
}