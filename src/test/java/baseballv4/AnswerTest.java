package baseballv4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {
    Answer answer = new Answer();

    @Test
    void isUnique() {
        answer.makeAnswer();
        int[] answer = this.answer.getAnswer();
        assertThat(Arrays.stream(answer).distinct().count()).isEqualTo(3);
    }
}