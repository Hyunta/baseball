package baseballv3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    private Referee referee;
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,0볼 3스트라이크", "4,5,6,아웃!", "3,1,2,3볼 0스트라이크"})
    void compareNumbers(int num1, int num2, int num3, String expected) {
        String actual = referee.compareNumbers(ANSWER, Arrays.asList(num1,num2,num3));
        assertThat(actual).isEqualTo(expected);
    }
}